import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.group1.SumMonthMoreAverage;

public class SumMonthMoreAverageTest {

@Test
    public void test() {
        SumMonthMoreAverage service = new SumMonthMoreAverage();
        int expected = 5;
        int [] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.MonthMoreAverage(month);
    Assertions.assertEquals(expected,actuall);

    }
}
