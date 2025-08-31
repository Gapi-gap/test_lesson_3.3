public class Main {
    public static void main(String[] args) {
        Bank service = new Bank();
        int price = 1_000_000;
        double percent = 9.99;
        int lifeTime = 1;

        int result = service.calculate(price, percent, lifeTime); // должно получиться 500
        System.out.println(result);

        lifeTime = 2;
        result = service.calculate(price, percent, lifeTime); // должно получиться 500
        System.out.println(result);

        lifeTime = 3;
        result = service.calculate(price, percent, lifeTime); // должно получиться 500
        System.out.println(result);
    }
}
