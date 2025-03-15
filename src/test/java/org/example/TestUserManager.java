package org.example;

import org.junit.jupiter.api.*;


class TestUserManager{

    private static UserManager userManager;

    @BeforeAll
    static void setupClass(){
        UserManager.openConnection();
        userManager = new UserManager();
    }

    @BeforeEach
    void setupMethod(){
        userManager. clearUsers();
    }

    @Test
    void testAddUser(){
        userManager.addUser("User 1");
        Assertions.assertTrue(userManager.userExist("User 1"), "The user doesn't exist or failed to add user");
        Assertions.assertEquals(1, userManager.getUserCount(), "The user failed to remove");
    }

    @Test
    void testremoveUser(){
        userManager.addUser("Test User");
        userManager.removeUser("Test User");
        Assertions.assertEquals(0, userManager.getUserCount(), "The user failed to remove");
    }

    @Test
    void testDuplicateUser(){
        userManager.addUser("Joko");
        userManager.addUser("Joko");
        Assertions.assertEquals(1, userManager.getUserCount(), "The user shouldn't be duplicate");
    }

    @AfterEach
    void tearDownTest(){
        System.out.println("The remaining users: " + userManager.getUserCount());
    }

    @AfterAll
    static void cleanup(){
        UserManager.closeConnection();
    }
}