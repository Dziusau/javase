class BatMobile extends Car{
    int countBullets;
    int speedShooting;
    double currentTimeWay;
    int damageOnePatron;

    public BatMobile(int maxSpeed, int countBullets, int speedShooting, int damageOnePatron) {
        super(maxSpeed);
        this.countBullets = countBullets;
        this.speedShooting = speedShooting;
        this.damageOnePatron = damageOnePatron;
    }

    @Override
    public void start() {
        System.out.println("BatMobile started");
    }

    @Override
    public void stop() {
        System.out.println("BatMobile stopped");
    }

    public void fly(int distance) {
        int batFlySpeed = 123;
        double time = distance / batFlySpeed * 60;
        System.out.println("BatMobile is better than the easy Car, because it can fly and overcome the same distance in " + time + " minutes");
    }

    @Override
    public void drive(int howLong) {
        currentTimeWay = howLong / this.maxSpeed;
        System.out.printf("Even BatMobiles' speed is higher than the Cars' speed; \nBatMobiles speed : %d km/h; \nCar speed : 60 km/h", this.maxSpeed);
    }

    public void shoot(){
        double timeShooting = this.countBullets / this.speedShooting;
        double damage;
        try {
            if (timeShooting < this.currentTimeWay){
                damage = timeShooting * this.speedShooting * this.damageOnePatron;
                throw new Exception("Your BatMobile can even shoot, but there is lack of bullets, and you couldn't drive shooting the whole way.\nYou drove and shot for : " + timeShooting + "\nYou have done " + damage + "hp damage;");
            } else {
                damage = this.damageOnePatron * this.speedShooting * this.currentTimeWay;
                System.out.println("\nYour BatMobile can even shoot!" + "You have done " + damage + "hp damage");
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
