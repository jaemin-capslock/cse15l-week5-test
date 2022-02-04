import static org.junit.Assert.*;
import org.junit.*;


public class MultiTest{
    @Test
    public void TestMulti(){
        assertEquals(8, MyMulti.myMulti(2, 4));
    }
}