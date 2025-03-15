package org.example;

import org.junit.jupiter.api.*;

public class tansactionSystemTest {

    private static transactionSystem TransactionSystem;

    @BeforeAll
    static void setupClass(){
        transactionSystem.openConnection();
        TransactionSystem = new transactionSystem(50000);
    }

    @BeforeEach
    void setupMethod(){
        TransactionSystem.resetBalance(100000);
    }

    @Test
    void testDeposit(){
        TransactionSystem.deposit(500000);
        Assertions.assertEquals(600000, TransactionSystem.getBalance(), "Saldo seharusnya 550000");
    }

    @Test
    void testWithdraw(){
        TransactionSystem.withdraw(50000);
        Assertions.assertEquals(50000, TransactionSystem.getBalance(), "Saldo seharusnya 450000");
    }

    @AfterEach
    void tearDownTest(){
        System.out.println("Saldo akhir setelah test adalah " + TransactionSystem.getBalance());
    }

    @AfterAll
    static void cleanup(){
        transactionSystem.closeConnection();
    }

}
