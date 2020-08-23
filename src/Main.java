public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double EveryMonthTermPay = service.calculate(1_000_000, 12, 9.99);

        System.out.println(EveryMonthTermPay);
    }
}
