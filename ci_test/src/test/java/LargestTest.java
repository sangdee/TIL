import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-08 오후 2:23
 */
public class LargestTest {
    @Test
    public void test1() {
        assertEquals(4, Largest.largest(new int[]{2, 3, 4}));
        assertEquals(4, Largest.largest(new int[]{4, 3, 2}));
        assertEquals(4, Largest.largest(new int[]{3, 2, 4}));
    }

    @Test
    public void test2() {
        assertEquals(4, Largest.largest(new int[]{4}));
        assertEquals(3, Largest.largest(new int[]{3}));
        assertEquals(2, Largest.largest(new int[]{2}));
    }

    @Test
    public void test3() {
        assertEquals(4, Largest.largest(new int[]{4, 4, 3}));
        assertEquals(3, Largest.largest(new int[]{3, 3, 2}));
        assertEquals(2, Largest.largest(new int[]{2, 2, 1}));
    }

    @Test
    public void testEmpty() {
       try {
           assertNull(Largest.largest(new int[]{}));
       }catch (Exception e){

       }

    }
}
