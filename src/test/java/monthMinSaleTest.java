import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.group1.monthMinSale;

public class monthMinSaleTest {
      @Test
    public void test(){
          monthMinSale service = new monthMinSale();
          int expected = 9;
          int [] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
          int actuall = service.maxSales(month);
          Assertions.assertEquals(expected,actuall);

    }
}
