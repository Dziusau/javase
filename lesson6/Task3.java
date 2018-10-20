public class Task3 {
    public static void main(String[] args3){
        RaidBoss megaBoss = new RaidBoss();
        megaBoss.hitPoint = 1000;
        megaBoss.numberHoursExistence = 50;

        for (int i = 0 ; i < megaBoss.numberHoursExistence ; i++){
            megaBoss.hitPoint = megaBoss.hitPoint * 1.05;
        }
        System.out.printf("Raid Boss hit point %d : " + megaBoss.hitPoint);
    }
}
