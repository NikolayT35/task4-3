public class CreditPaymentService {
    public int calculate(double creditSum, double quantityMonth, double percent) {

        double i = percent / 100 / 12;

        double formula = Math.pow(i + 1, quantityMonth);
        double coefficient = i * formula / (formula - 1);

        return (int) (creditSum * coefficient);

    }
}
