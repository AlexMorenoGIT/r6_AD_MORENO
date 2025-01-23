public class Application {
    public static void main(String[] args) {
        Car maCar = new Car("Sedan", "Bleu");
        Driver moi = new Driver("John", 20);

        maCar.startCar(moi);
        maCar.accelerate();
        maCar.changeGear(80, moi);
        maCar.slowDown();
        maCar.changeGear(30, moi);
        maCar.stopCar(moi);
        System.out.println("fini");
    }
}
