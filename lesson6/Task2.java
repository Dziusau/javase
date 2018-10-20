public class Task2 {
    public static void main(String[] args2) {
        Gamer[] player = new Gamer[5];
        player[0] = new Gamer();
        player[0].nickname = "LeBwa";
        player[0].countOfPoints = 1500;

        player[1] = new Gamer();
        player[1].nickname = "Jove";
        player[1].countOfPoints = 1300;

        player[2] = new Gamer();
        player[2].nickname = "LoL";
        player[2].countOfPoints = 1421;

        player[3] = new Gamer();
        player[3].nickname = "Granny";
        player[3].countOfPoints = 1234;

        player[4] = new Gamer();
        player[4].nickname = "Grut";
        player[4].countOfPoints = 1543;

        int gems = 322;
        int i = 0;
        for (; i < 5; i++) {
            for (int g = 0; g < player.length; g++) {
                if (player[g].countOfPoints < 1357) {
                }
                System.out.printf("Gamer %d get %d gems\n", player[g].nickname, gems);
            }
        }
    }
}
