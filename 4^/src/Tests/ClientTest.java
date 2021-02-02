package Tests;
import PlayRoom.MainPlayroom;
import org.junit.Assert;
import org.junit.Test;
public class ClientTest {
    @Test
    public void testClient() {
        MainPlayroom One = new MainPlayroom();
        Assert.assertEquals(5, One.PrintListToys(5,5,80));  ;
    };

    }
