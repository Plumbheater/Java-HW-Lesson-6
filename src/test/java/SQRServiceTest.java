import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {


    @Test
    public void countCalcSqrt() {
        SQRService service = new SQRService();
        int expect = 6;
        int actual = service.calcSqrt(10, 99);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void countCalcSqrt_1() {
        SQRService service = new SQRService();
        int expect = 7;
        int actual = service.calcSqrt(10, 100);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void countCalcSqrt_2() {
        SQRService service = new SQRService();
        int expect = 7;
        int actual = service.calcSqrt(9, 99);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void countCalcSqrt_3() {
        SQRService service = new SQRService();
        int expect = 0;
        int actual = service.calcSqrt(0, 0);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void countCalcSqrt_4() {
        SQRService service = new SQRService();
        int expect = 0;
        int actual = service.calcSqrt(1000, 1000);
        Assertions.assertEquals(expect, actual);
    }

}
