public class CreditPaymentService {
    public double calculate(double kreditSum, double quantityMonth, double percent) {
        double koefficent = percent / 100 / 12 * ((1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12)) / (((1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12) * (1 + percent / 100 / 12)) - 1);

    double EveryMonthTermPay = kreditSum * koefficent;
        return EveryMonthTermPay;
}
}
