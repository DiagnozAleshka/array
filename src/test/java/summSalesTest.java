import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.group1.summSales;

public class summSalesTest {

    @Test
    public void test() {
        summSales service = new summSales();
        int expected = 180;
        int [] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.summ(month);
        Assertions.assertEquals(expected,actuall);

    }
}
