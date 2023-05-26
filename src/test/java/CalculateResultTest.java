import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.services.CalculateResultService;

public class CalculateResultTest {
    @Test
    public void test() {
        CalculateResultService service = new CalculateResultService();
        int income;
        int expense;
        int threshold;
        int myResult = service.result(income = 20000, expense = 5000, threshold = 50000);
        //System.out.println(myResult);

        Assertions.assertEquals(income, expense, threshold);
    }
}
