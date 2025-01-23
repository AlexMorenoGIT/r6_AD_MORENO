public class Driver {
    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 10;
    }

    public void startCar(Car car) {
        if (isAdult()) {
            System.out.println(name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopCar(Car car) {
        System.out.println(name + " arrête la voiture.");
    }

    public void changeGear(Car car, int newGear) {
        System.out.println(name + " change la vitesse de la voiture à " + newGear);
        int vitesseActuelle;
        if (car.getSpeed() >= newGear) {
            while (car.getSpeed() > newGear) {
                car.slowDown();
            }
        } else  {
            while (car.getSpeed() < newGear) {
                car.accelerate();
            }
        }
    }
}
