public class Main {
    public static void main(String[] args) {
    var boxer1Weight = 78.2;
    var boxer2Weight = 82.7;
    var totalWeight = boxer1Weight + boxer2Weight;
    System.out.println("Общий вес боксёров:" + totalWeight + "кг");
    var weightDifferenceWay1 = boxer2Weight - boxer1Weight;
    System.out.println("Разница в весе боксёров:" + weightDifferenceWay1 + "кг");
    var weightDifferenceWay2 = (boxer2Weight) % boxer1Weight;
    System.out.println("Разница в весе боксёров:" + weightDifferenceWay2 + "кг");

    }
}