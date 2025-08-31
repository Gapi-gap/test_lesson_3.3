public class Main {
    public static void main(String[] args) {
        Bank service = new Bank();
        int price = 1_000_000;
        double percent = 9.99;
        int LifeTime = 1;

        int result = service.calculate(price, percent, LifeTime); // должно получиться 500
        System.out.println(result);

        LifeTime = 2;
        result = service.calculate(price, percent, LifeTime); // должно получиться 500
        System.out.println(result);

        LifeTime = 3;
        result = service.calculate(price, percent, LifeTime); // должно получиться 500
        System.out.println(result);
    }
}