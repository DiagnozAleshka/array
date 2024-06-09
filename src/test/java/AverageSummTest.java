import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.group1.AverageSumm;

public class AverageSummTest {

    @Test
    public void test() {
        AverageSumm service = new AverageSumm();
        int expected = 15;
        int [] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.summ(month);
        Assertions.assertEquals(expected,actuall);

    }
}
