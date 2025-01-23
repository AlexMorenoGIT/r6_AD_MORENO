public class Application {
    public static void main(String[] args) {
        Car maCar = new Car("Sedan", "Bleu");
        Driver moi = new Driver("John", 20);

        moi.startCar(maCar);
        maCar.accelerate();
        moi.changeGear(maCar, 80);
        maCar.slowDown();
        moi.changeGear(maCar,30);
        moi.stopCar(maCar);
        System.out.println("fini");
    }
}
