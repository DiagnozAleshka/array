import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.group1.SumMonthLessAverage;

public class SumMonthLessAverageTest {

    @Test
    public void test() {
        SumMonthLessAverage service = new SumMonthLessAverage();
        int expected = 5;
        int [] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.MonthLessAverage(month);
        Assertions.assertEquals(expected,actuall);

    }
}
