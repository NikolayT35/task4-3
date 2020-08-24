public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int EveryMonthTermPay = service.calculate(1_000_000, 12, 9.99);
        System.out.println(EveryMonthTermPay);

        int EveryMonthTermPay2 = service.calculate(1_000_000, 24, 9.99);
        System.out.println(EveryMonthTermPay2);

        int EveryMonthTermPay3 = service.calculate(1_000_000, 36, 9.99);
        System.out.println(EveryMonthTermPay3);
    }
}
