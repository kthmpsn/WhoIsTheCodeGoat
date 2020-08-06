
import org.junit.Assert;
import org.junit.Test;



public class Problem04Test {

    @Test
    public void testSolve(){
        //Given
        Problem04 problem04 = new Problem04();
        int[] input = {10, 3, 5, 6, 2};
        //When
        int[] expected = {180, 600, 360, 300, 900};
        int[] actual = problem04.solve(input, 5);

        //Then
        Assert.assertArrayEquals(expected, actual);

    }
}


