public class Bank {
    int calculate(int price, double percent, int lifeTime) {
        double stafMother = percent / 100 / 12;
        int mother = LifeTime * 12;
        double sum = price * (stafMother * Math.pow(1 + stafMother, mother)) / (Math.pow(1 + stafMother, mother) - 1);
        return (int) sum;
    }
}
