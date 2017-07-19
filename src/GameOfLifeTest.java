import org.junit.Assert;
import org.junit.Test;

/**
 * Created by badkass on 7/17/2017.
 */
public class GameOfLifeTest {
    @Test
    public void testGrid1(){
        GameOfLifeRevised gol = new GameOfLifeRevised();
        int[][] currentGeneration = {
                {1,0,1},
                {0,0,0},
                {1,0,1}
    };
        int[][] newGeneration =  gol.nextGeneration(currentGeneration);
        int[][] expectedOutput = {
                {1,0,1},
                {0,0,0},
                {1,0,1}
        };
        Assert.assertEquals("Incorrect next Generation", expectedOutput,newGeneration);
    }

    @Test
    public void testGrid2(){
        GameOfLifeRevised gol = new GameOfLifeRevised();
        int[][] currentGeneration = {
                {0,0,0,0,0},
                {0,0,1,0,0},
                {0,0,1,0,0},
                {0,0,1,0,0},
                {0,0,0,0,0}
        };
        int[][] newGeneration =  gol.nextGeneration(currentGeneration);
        int[][] expectedOutput = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        Assert.assertEquals("Incorrect next Generation", expectedOutput,newGeneration);
    }
}
