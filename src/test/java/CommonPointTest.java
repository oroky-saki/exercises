import Stepik.SimpleExercises.CommonPoint.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CommonPointTest {

    Main main;

    @Before
    public void createMain() {
        main = new Main();
    }

    @Test
    public void test_111_441() {
        int x1 = 1;
        int y1 = 1;
        int r1 = 1;

        int x2 = 4;
        int y2 = 4;
        int r2 = 1;

        boolean res = main.checkCommonPoint(x1,y1,r1,x2,y2,r2);
        Assert.assertFalse(res);
    }

    @Test
    public void test_002_032() {
        int x1 = 0;
        int y1 = 0;
        int r1 = 2;

        int x2 = 0;
        int y2 = 3;
        int r2 = 2;

        boolean res = main.checkCommonPoint(x1,y1,r1,x2,y2,r2);
        Assert.assertTrue(res);
    }

    @Test
    public void test_002_002() {
        int x1 = 0;
        int y1 = 0;
        int r1 = 2;

        int x2 = 0;
        int y2 = 0;
        int r2 = 2;

        boolean res = main.checkCommonPoint(x1,y1,r1,x2,y2,r2);
        Assert.assertTrue(res);
    }

    @Test
    public void test_m101_101() {
        int x1 = -1;
        int y1 = 0;
        int r1 = 1;

        int x2 = 1;
        int y2 = 0;
        int r2 = 1;

        boolean res = main.checkCommonPoint(x1,y1,r1,x2,y2,r2);
        Assert.assertTrue(res);
    }

    @Test
    public void test_011_0m11() {
        int x1 = 0;
        int y1 = 1;
        int r1 = 1;

        int x2 = 0;
        int y2 = -1;
        int r2 = 1;

        boolean res = main.checkCommonPoint(x1,y1,r1,x2,y2,r2);
        Assert.assertTrue(res);
    }

}
