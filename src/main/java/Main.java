import ru.netology.javaqa.javaqamvn.services.CalculateResultService;

public class Main {
    public static void main(String[] arms) {
        CalculateResultService service = new CalculateResultService();
        int income;
        int expense;
        int threshold;
        int myResult = service.result(income = 10000, expense = 3000, threshold = 20000);
        System.out.println(myResult);

    }
}
