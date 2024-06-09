import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.group1.MonthSalePeak;

public class MonthSalePeakTest {

    @Test
    public void test() {
        MonthSalePeak service = new MonthSalePeak();
        int expected = 8;
        int [] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.maxSales(month);
        Assertions.assertEquals(expected,actuall);

    }
}
