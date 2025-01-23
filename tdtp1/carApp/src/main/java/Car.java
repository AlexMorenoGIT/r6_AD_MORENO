public class Car {
    public static final int MAX_SPEED = 120;
    public static final int ACCELERATE = 10;
    public static final int LOWEST_SPEED = 0;
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (speed + ACCELERATE <= MAX_SPEED) {
            speed += ACCELERATE;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void slowDown() {
        if (speed - ACCELERATE >= LOWEST_SPEED) {
            speed -= ACCELERATE;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    public void startCar(Driver driver) {
        if (driver.isAdult()) {
            System.out.println(driver.getName() + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopCar(Driver driver) {
        System.out.println(driver.getName() + " arrête la voiture.");
    }

    public void changeGear(int newGear, Driver driver) {
        System.out.println(driver.getName() + " change la vitesse de la voiture à " + newGear);
        if (getSpeed() >= newGear) {
            while (getSpeed() > newGear) {
                slowDown();
            }
        } else  {
            while (getSpeed() < newGear) {
                accelerate();
            }
        }
    }
}

