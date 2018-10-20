public class Task4 {
    public static void main(String[] args4){
        RaidBoss bigBoss = new RaidBoss();
        bigBoss.hitPoint = 100000;
        bigBoss.regeneration = 156;
        bigBoss.percentOfRegeneration = 0.15;

        TeamGamers dreamTeam = new TeamGamers();
        dreamTeam.damage = 1753;

        for (double i = bigBoss.hitPoint / 10 ; i > dreamTeam.damage ; bigBoss.regeneration = bigBoss.regeneration * bigBoss.percentOfRegeneration , bigBoss.hitPoint = bigBoss.hitPoint - dreamTeam.damage){
            
        }
    }
}
