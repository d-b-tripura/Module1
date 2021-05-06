package testing;
import static org.junit.jupiter.api.Assertions.*;  
import org.junit.jupiter.api.Test;  

public class TestLogic { 
  
    @Test  
    public void testFindSum(){  
    	Arithmetic obj = new Arithmetic();
    	int actual = obj.findSum(5, 6);
        assertEquals(11, actual); 
    } 
    
    @Test  
    public void testGetSecondSmallest(){  
    	ArraysOne obj = new ArraysOne();
    	int[] a = {5, 6, 7, 3, 2, 1};
    	int actual = obj.getSecondSmallest(a);
        assertEquals(2, actual); 
    }
    
    @Test  
    public void testMirrorImage(){  
    	Exercise2 obj = new Exercise2();
    	String s = "Earth";
    	String actual = Exercise2.mirrorImage(s);
        assertEquals("Earth|htraE", actual); 
    }
}  