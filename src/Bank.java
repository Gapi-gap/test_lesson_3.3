public class Bank {
    int calculate(int price, double percent, int LifeTime) {
        double StafMother = percent / 100 / 12;
        int Mother = LifeTime * 12;
        double sum = price * (StafMother * Math.pow(1 + StafMother, Mother)) / (Math.pow(1 + StafMother, Mother) - 1);
        return (int) sum;
    }
}
