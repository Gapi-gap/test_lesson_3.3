public class Bank {
    int calculate(int price, double percent, int lifeTime) {
        double stafMother = percent / 100 / 12;
        int mother = LifeTime * 12;
        double sum = price * (StafMother * Math.pow(1 + StafMother, Mother)) / (Math.pow(1 + StafMother, Mother) - 1);
        return (int) sum;
    }
}
