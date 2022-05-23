package ru.netilogy.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void shouldCalc () {
        SQRService service = new SQRService();
        int actual = service.calculateSqr(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
}




