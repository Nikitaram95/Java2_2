public class Main {
    public static void main(String[] args) {

        int refill = 1000;
        int balance = 100;

        int percent = 1;
        if (refill < 1000) {
            percent = 0;
        }
        int bonus = refill * percent / 100;
        int sum = bonus + balance + refill;
        System.out.println("Итоговая сумма: " + sum);

    }
}
