public class Car {
    int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void drive(int howLong) {
        double time = howLong / maxSpeed * 60;
        System.out.println("Car drove " + howLong + " km in " + time + " minutes");
    }
}
