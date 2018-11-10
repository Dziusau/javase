public class CarOwner {
    public static void main (String[] args){
        Car machine = new Car(60);
        machine.start();
        machine.drive(50);
        machine.stop();

        BatMobile supermachine = new BatMobile(95  );
        supermachine.start();
        supermachine.fly(30);
        supermachine.stop();
        supermachine.drive(50);
        supermachine.shoot();
    }
}