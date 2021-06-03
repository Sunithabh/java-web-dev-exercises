package exercises.technology;

//Class Implementation
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

//Try to add three JUnit tests per class!
public class Program {
    //Tests for Computer class
    Computer test_mac;
    @Before
    public void createComputerObject(){
        test_mac = new Laptop("Mac", "MacBook Air",1.1 ,2000, 13.3);
    }
    @Test
    public void testGetMake(){
        assertNotNull(test_mac.getMake());
    }
    @Test
    public void testGetModelName(){
        assertNotNull(test_mac.getModelName());
    }
    //cant have more storage than allowed size.
    @Test(expected = IllegalArgumentException.class)
    public void testAddStorageSize(){
        test_mac.addStorageSize(1);
        fail("Exceeding the maximum storage limit");
    }

    //cant have more processor speed than provided limit.
    @Test(expected = IllegalArgumentException.class)
    public void testAddProcessorSpeed(){
        test_mac.increaseProcessorSpeed(0.1);
        fail("exceeding speed limit");
    }
    public void fail(String s){}

    //Tests for Laptop Class
    Laptop test_lenovo;
    @Before
    public void createLaptopObject(){
        test_lenovo = new Laptop("Lenovo", "IdeaPad 5 15ITL05",2.8,500,15.6);
    }
    @Test
    public void testGetLaptopMake(){
        assertNotNull(test_lenovo.getMake());
    }
    @Test
    public void testGetLaptopModelName(){
        assertNotNull(test_lenovo.getModelName());
    }
    @Test
    public void testDisplay(){
       assertEquals(15.6 ,test_lenovo.getScreenSize(),.001);
    }

    //Tests for Smartphone
    SmartPhone test_phone;
    @Before
    public void createSmartphoneObject(){
        test_phone = new SmartPhone("iPhone", "iPhone 11 Pro Max",2.66 ,64,226);
    }
    @Test
    public void testGetSmartphoneMake(){
        assertNotNull(test_phone.getMake());
    }
    @Test
    public void testGetSmartphoneModelName(){
        assertNotNull(test_phone.getModelName());
    }
    @Test
    public void testGetWeight(){
        assertNotNull(test_phone.getWeight());
    }

    @Test
    public void testIsHeavy(){
        assertEquals(226,test_phone.getWeight(),.001);
    }
}
