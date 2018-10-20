class Task6{
    public static void main(String[] args6){
        Point gamerPoint = new Point();
        gamerPoint.x = 22.25;
        gamerPoint.y = 56.05;
        Point npcPoint = new Point();
        npcPoint.x = 68.03;
        npcPoint.y = 136.87;
        double distance = Math.sqrt((gamerPoint.x - npcPoint.x) * (gamerPoint.x - npcPoint.x) + (gamerPoint.y - npcPoint.y) * (gamerPoint.y - npcPoint.y));
        System.out.println("Distance between NPC and Gamer : " + distance);
    }
}