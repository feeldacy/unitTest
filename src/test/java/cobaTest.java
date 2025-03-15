import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class cobaTest {

    public Object val(){
        return "3";
    }

    public boolean bool(){
        return false;
    }

    @Test
    void testEquals(){
        Assertions.assertEquals(3, 4, "tidak equal");
    }

    @Test
    void testnotEquals(){
        Assertions.assertNotEquals(3,3, "Equals");
    }

    @Test
    void testSame(){
        Assertions.assertSame("4", val(), "Not same");
    }

    @Test
    void testNotNull(){
        Assertions.assertNotNull(val(), "Null");
    }

    @Test
    void testNull(){
        Assertions.assertNull(val(), "Tidak Null");
    }

    @Test
    void testTrue(){
        Assertions.assertTrue(bool(), "tidak true");
    }

    @Test
    void testFalse(){
        Assertions.assertFalse(bool(), "tidak false");
    }

}


