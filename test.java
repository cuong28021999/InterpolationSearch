import java.lang.reflect.Array;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Searches.InterpolationSearch;
import sun.nio.cs.Surrogate;
import java.util.Arrays;

/**
 *
 * @author black
 */
public class test {
    @Test
    public void case1() {
        InterpolationSearch is= new InterpolationSearch();
        int[] array = {1,2,3,4,5,6,7};
        int key = 1;
        int result = is.InterpolationSearch.find(array, key);
        int expect = 0;
        assertEquals(result, expect);
    }
     @Test
    public void case2() {
        InterpolationSearch is= new InterpolationSearch();
        int[] array = {1,2,3,4,5,6,7};
        int key = 4;
        int result = is.InterpolationSearch.find(array, key);
        int expect = 3;
        assertEquals(result, expect);
    }
     @Test
    public void case3() {
        InterpolationSearch is= new InterpolationSearch();
        int[] array = {1,2,3,4,5,6,7};
        int key = 7;
        int result = is.InterpolationSearch.find(array, key);
        int expect = 6;
        assertEquals(result, expect);
    }
     @Test
    public void case4() {
        InterpolationSearch is= new InterpolationSearch();
        int[] array = {1,2,3,4,5,6,7};
        int key = -5;
        int result = is.InterpolationSearch.find(array, key);
        int expect = -1;
        assertEquals(result, expect);
    }
     @Test
    public void case5() {
        InterpolationSearch is= new InterpolationSearch();
        int[] array = {1,2,3,4,5,6,7};
        int key = 9;
        int result = is.InterpolationSearch.find(array, key);
        int expect = -1;
        assertEquals(result, expect);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
}