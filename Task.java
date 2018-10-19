//Task1
class Task1 {
    public static void main(String[] args1) {
        String nickname[] = {"Trololoshka", "Amway921", "Strike", "Near_You", "LeBwa", "Jove", "Desertod", "Yusha", "Shamanenok", "Evil_GrannY"};
        System.out.println("Nickname : " + nickname[0] + "\nNickname : " + nickname[1] +
                            "\n : " + nickname[2] + "\nNickname : " + nickname[3] +
                            "\nNickname : " + nickname[4] + "\nNickname : " + nickname[5] +
                            "\nNickname : " + nickname[6] + "\nNickname : " + nickname[7] +
                            "\nNickname : " + nickname[8] + "\nNickname : " + nickname[9]);
    }
}
//TAsk2
class Task2 {
    public static void main(String[] args2){
            Gamer[] player = new Gamer[10];
                player[0] = new Gamer();
                player[0].nickname = "Trololoshka";
                player[0].email = "Trololo@gmail.com";
                player[0].winrate = 55.5;
                player[0].rating = 666;
                player[0].dateLastGame = 12;
                System.out.println(player[0]);

                player[1] = new Gamer();
                player[1].nickname = "Amway921";
                player[1].email = "921Amway@gamil.com";
                player[1].winrate = 67.8;
                player[1].rating = 129;
                player[1].dateLastGame = 13;
                System.out.println(player[1]);

                player[2] = new Gamer();
                player[2].nickname = "Strike";
                player[2].email = "Strike01@mail.ru";
                player[2].winrate = 71.3;
                player[2].rating = 21;
                player[2].dateLastGame = 14;
                System.out.println(player[2]);

                player[3] = new Gamer();
                player[3].nickname = "Near_You";
                player[3].email = "NEAR_YOU@gmail.com";
                player[3].winrate = 63.7;
                player[3].rating = 54;
                player[3].dateLastGame = 15;
                System.out.println(player[3]);

                player[4] = new Gamer();
                player[4].nickname = "LeBwa";
                player[4].email = "LeBwa007@mail.ru";
                player[4].winrate = 70.4;
                player[4].rating = 35;
                player[4].dateLastGame = 16;
                System.out.println(player[4]);

                player[5] = new Gamer();
                player[5].nickname = "Jove";
                player[5].email = "PAPA_JOWE@mail.ru";
                player[5].winrate = 61.2;
                player[5].rating = 28;
                player[5].dateLastGame = 17;
                System.out.println(player[5]);

                player[6] = new Gamer();
                player[6].nickname = "Desertod";
                player[6].email = "DeSeRtOd@gamil.com";
                player[6].winrate = 59.9;
                player[6].rating = 24;
                player[6].dateLastGame = 18;
                System.out.println(player[6]);

                player[7] = new Gamer();
                player[7].nickname = "Yusha";
                player[7].email = "Yusha_228@gmail.com";
                player[7].winrate = 64.1;
                player[7].rating = 10;
                player[7].dateLastGame = 19;
                System.out.println(player[7]);

                player[8] = new Gamer();
                player[8].nickname = "Shamanenok";
                player[8].email = "Shamanenok8800555@gamil.com";
                player[8].winrate = 57.6;
                player[8].rating = 67;
                player[8].dateLastGame = 20;
                System.out.println(player[8]);

                player[9] = new Gamer();
                player[9].nickname = "Evil_GrannY";
                player[9].email = "Evil_GRANI3535@mail.ru";
                player[9].winrate = 65.9;
                player[9].rating = 15;
                player[9].dateLastGame = 21;
                System.out.println(player[9]);

    }
}
//TAsk3
class Task3{
    public static void main(String[] args3){
        int mark[][] = new int[16][5];
        mark[0][0]= 10;         mark[0][1]= 10;         mark[0][2]= 10;         mark[0][3]= 10;         mark[0][4]=(mark[0][0]+mark[0][1]+mark[0][2]+mark[0][3])/4 ;
        mark[1][0]= 9;          mark[1][1]= 10;         mark[1][2]= 9;          mark[1][3]= 8;          mark[1][4]=(mark[1][0]+mark[1][1]+mark[1][2]+mark[1][3])/4 ;
        mark[2][0]= 8;          mark[2][1]= 10;         mark[2][2]= 10;         mark[2][3]= 9;          mark[2][4]=(mark[2][0]+mark[2][1]+mark[2][2]+mark[2][3])/4 ;
        mark[3][0]= 9;          mark[3][1]= 9;          mark[3][2]= 8;          mark[3][3]= 10;         mark[3][4]=(mark[3][0]+mark[3][1]+mark[3][2]+mark[3][3])/4 ;
        mark[4][0]= 10;         mark[4][1]= 10;         mark[4][2]= 9;          mark[4][3]= 10;         mark[4][4]=(mark[4][0]+mark[4][1]+mark[4][2]+mark[4][3])/4 ;
        mark[5][0]= 10;         mark[5][1]= 10;         mark[5][2]= 10;         mark[5][3]= 10;         mark[5][4]=(mark[5][0]+mark[5][1]+mark[5][2]+mark[5][3])/4 ;
        mark[6][0]= 10;         mark[6][1]= 8;          mark[6][2]= 9;          mark[6][3]= 7;          mark[6][4]=(mark[6][0]+mark[6][1]+mark[6][2]+mark[6][3])/4 ;
        mark[7][0]= 7;          mark[7][1]= 9;          mark[7][2]= 8;          mark[7][3]= 10;         mark[7][4]=(mark[7][0]+mark[7][1]+mark[7][2]+mark[7][3])/4 ;
        mark[8][0]= 9;          mark[8][1]= 8;          mark[8][2]= 10;         mark[8][3]= 8;          mark[8][4]=(mark[8][0]+mark[8][1]+mark[8][2]+mark[8][3])/4 ;
        mark[9][0]= 6;          mark[9][1]= 8;          mark[9][2]= 6;          mark[9][3]= 10;         mark[9][4]=(mark[9][0]+mark[9][1]+mark[9][2]+mark[9][3])/4 ;
        mark[10][0]= 10;        mark[10][1]= 10;        mark[10][2]= 10;        mark[10][3]= 11;        mark[10][4]=(mark[10][0]+mark[10][1]+mark[10][2]+mark[10][3])/4 ;
        mark[11][0]= 8;         mark[11][1]= 9;         mark[11][2]= 8;         mark[11][3]= 10;        mark[11][4]=(mark[11][0]+mark[11][1]+mark[11][2]+mark[11][3])/4 ;
        mark[12][0]= 10;        mark[12][1]= 10;        mark[12][2]= 10;        mark[12][3]= 8;         mark[12][4]=(mark[12][0]+mark[12][1]+mark[12][2]+mark[12][3])/4 ;
        mark[13][0]= 10;        mark[13][1]= 9;         mark[13][2]= 7;         mark[13][3]= 10;        mark[13][4]=(mark[13][0]+mark[13][1]+mark[13][2]+mark[13][3])/4 ;
        mark[14][0]= 9;         mark[14][1]= 10;        mark[14][2]= 8;         mark[14][3]= 8;         mark[14][4]=(mark[14][0]+mark[14][1]+mark[14][2]+mark[14][3])/4 ;
        mark[15][0]= 10;        mark[15][1]= 8;         mark[15][2]= 9;         mark[15][3]= 9;         mark[15][4]=(mark[15][0]+mark[15][1]+mark[15][2]+mark[15][3])/4 ;
        System.out.println("Mark for the first semester: " + mark[0][0] + "; Mark for the second semester: " + mark[0][1] + "; Mark for the third semester: " + mark[0][2] + "; Mark for the forth semester: " + mark[0][3] + "; Total mark: " + mark[0][4]
                            + "\nMark for the first semester: " + mark[1][0] + "; Mark for the second semester: " + mark[1][1] + "; Mark for the third semester: " + mark[1][2] + "; Mark for the forth semester: " + mark[1][3] + "; Mark for the first semester: " + mark[1][4]
                            + "\nMark for the first semester: " + mark[2][0] + "; Mark for the second semester: " + mark[2][1] + "; Mark for the third semester: " + mark[2][2] + "; Mark for the forth semester: " + mark[2][3] + "; Mark for the first semester: " + mark[2][4]
                            + "\nMark for the first semester: " + mark[3][0] + "; Mark for the second semester: " + mark[3][1] + "; Mark for the third semester: " + mark[3][2] + "; Mark for the forth semester: " + mark[3][3] + "; Mark for the first semester: " + mark[3][4]
                            + "\nMark for the first semester: " + mark[4][0] + "; Mark for the second semester: " + mark[4][1] + "; Mark for the third semester: " + mark[4][2] + "; Mark for the forth semester: " + mark[4][3] + "; Mark for the first semester: " + mark[4][4]
                            + "\nMark for the first semester: " + mark[5][0] + "; Mark for the second semester: " + mark[5][1] + "; Mark for the third semester: " + mark[5][2] + "; Mark for the forth semester: " + mark[5][3] + "; Mark for the first semester: " + mark[5][4]
                            + "\nMark for the first semester: " + mark[6][0] + "; Mark for the second semester: " + mark[6][1] + "; Mark for the third semester: " + mark[6][2] + "; Mark for the forth semester: " + mark[6][3] + "; Mark for the first semester: " + mark[6][4]
                            + "\nMark for the first semester: " + mark[7][0] + "; Mark for the second semester: " + mark[7][1] + "; Mark for the third semester: " + mark[7][2] + "; Mark for the forth semester: " + mark[7][3] + "; Mark for the first semester: " + mark[7][4]
                            + "\nMark for the first semester: " + mark[8][0] + "; Mark for the second semester: " + mark[8][1] + "; Mark for the third semester: " + mark[8][2] + "; Mark for the forth semester: " + mark[8][3] + "; Mark for the first semester: " + mark[8][4]
                            + "\nMark for the first semester: " + mark[8][0] + "; Mark for the second semester: " + mark[9][1] + "; Mark for the third semester: " + mark[9][2] + "; Mark for the forth semester: " + mark[9][3] + "; Mark for the first semester: " + mark[9][4]
                            + "\nMark for the first semester: " + mark[10][0] + "; Mark for the second semester: " + mark[10][1] + "; Mark for the third semester: " + mark[10][2] + "; Mark for the forth semester: " + mark[10][3] + "; Mark for the first semester: " + mark[10][4]
                            + "\nMnark for the first semester: " + mark[11][0] + "; Mark for the second semester: " + mark[11][1] + "; Mark for the third semester: " + mark[11][2] + "; Mark for the forth semester: " + mark[11][3] + "; Mark for the first semester: " + mark[11][4]
                            + "\nMark for the first semester: " + mark[12][0] + "; Mark for the second semester: " + mark[12][1] + "; Mark for the third semester: " + mark[12][2] + "; Mark for the forth semester: " + mark[12][3] + "; Mark for the first semester: " + mark[12][4]
                            + "\nMark for the first semester: " + mark[13][0] + "; Mark for the second semester: " + mark[13][1] + "; Mark for the third semester: " + mark[13][2] + "; Mark for the forth semester: " + mark[13][3] + "; Mark for the first semester: " + mark[13][4]
                            + "\nMark for the first semester: " + mark[14][0] + "; Mark for the second semester: " + mark[14][1] + "; Mark for the third semester: " + mark[14][2] + "; Mark for the forth semester: " + mark[14][3] + "; Mark for the first semester: " + mark[14][4]
                            + "\nMark for the first semester: " + mark[15][0] + "; Mark for the second semester: " + mark[15][1] + "; Mark for the third semester: " + mark[15][2] + "; Mark for the forth semester: " + mark[15][3] + "; Mark for the first semester: " + mark[15][4]);
    }
}
//Task4
class Task4{
    public static void main(String[] args4){
        Student[] pupel = new Student[5];
            pupel[0] = new Student();
            pupel[0].name = "Sasha";
            pupel[0].surname = "Dusov";
            pupel[0].email = "Alex2204@gmail.com";
            pupel[0].form = "11A";
            pupel[0].marksForSeptember[0][0] = 10;          pupel[0].marksForSeptember[0][1] = 10;          pupel[0].marksForSeptember[0][2] = 10;          pupel[0].marksForSeptember[0][3] = 10;          pupel[0].marksForSeptember[0][4] = 10;
            pupel[0].marksForSeptember[1][0] = 9;           pupel[0].marksForSeptember[1][1] = 10;          pupel[0].marksForSeptember[1][2] = 10;          pupel[0].marksForSeptember[1][3] = 5;           pupel[0].marksForSeptember[1][4] = 7;
            pupel[0].marksForSeptember[2][0] = 10;          pupel[0].marksForSeptember[2][1] = 7;           pupel[0].marksForSeptember[2][2] = 4;           pupel[0].marksForSeptember[2][3] = 7;           pupel[0].marksForSeptember[2][4] = 10;
            pupel[0].marksForSeptember[3][0] = 10;          pupel[0].marksForSeptember[3][1] = 10;          pupel[0].marksForSeptember[3][2] = 10;          pupel[0].marksForSeptember[3][3] = 10;          pupel[0].marksForSeptember[3][4] = 8;
            pupel[0].marksForSeptember[4][0] = 10;          pupel[0].marksForSeptember[4][1] = 8;           pupel[0].marksForSeptember[4][2] = 6;           pupel[0].marksForSeptember[4][3] = 8;           pupel[0].marksForSeptember[4][4] = 10;
            pupel[0].marksForSeptember[5][0] = 8;           pupel[0].marksForSeptember[5][1] = 9;           pupel[0].marksForSeptember[5][2] = 8;           pupel[0].marksForSeptember[5][3] = 10;          pupel[0].marksForSeptember[5][4] = 9;
            pupel[0].marksForSeptember[6][0] = 10;          pupel[0].marksForSeptember[6][1] = 10;          pupel[0].marksForSeptember[6][2] = 10;          pupel[0].marksForSeptember[6][3] = 10;          pupel[0].marksForSeptember[6][4] = 10;
            pupel[0].marksForSeptember[7][0] = 10;          pupel[0].marksForSeptember[7][1] = 7;           pupel[0].marksForSeptember[7][2] = 8;           pupel[0].marksForSeptember[7][3] = 8;           pupel[0].marksForSeptember[7][4] = 10;
            pupel[0].marksForSeptember[8][0] = 8;           pupel[0].marksForSeptember[8][1] = 10;          pupel[0].marksForSeptember[8][2] = 10;          pupel[0].marksForSeptember[8][3] = 9;           pupel[0].marksForSeptember[8][4] = 10;
            pupel[0].marksForSeptember[9][0] = 6;           pupel[0].marksForSeptember[9][1] = 9;           pupel[0].marksForSeptember[9][2] = 8;           pupel[0].marksForSeptember[9][3] = 10;          pupel[0].marksForSeptember[9][4] = 9;
            pupel[0].marksForSeptember[10][0] = 7;          pupel[0].marksForSeptember[10][1] = 10;         pupel[0].marksForSeptember[10][2] = 10;         pupel[0].marksForSeptember[10][3] = 9;          pupel[0].marksForSeptember[10][4] = 10;
            pupel[0].marksForSeptember[11][0] = 10;         pupel[0].marksForSeptember[11][1] = 10;         pupel[0].marksForSeptember[11][2] = 9;          pupel[0].marksForSeptember[11][3] = 10;         pupel[0].marksForSeptember[11][4] = 10;
            pupel[0].marksForSeptember[12][0] =8;           pupel[0].marksForSeptember[12][1] = 6;          pupel[0].marksForSeptember[12][2] = 10;         pupel[0].marksForSeptember[12][3] = 8;          pupel[0].marksForSeptember[12][4] = 9;
            pupel[0].marksForSeptember[13][0] = 10;         pupel[0].marksForSeptember[13][1] = 10;         pupel[0].marksForSeptember[13][2] = 6;          pupel[0].marksForSeptember[13][3] = 10;         pupel[0].marksForSeptember[13][4] = 10;
            pupel[0].marksForSeptember[14][0] = 9;          pupel[0].marksForSeptember[14][1] = 7;          pupel[0].marksForSeptember[14][2] = 10;         pupel[0].marksForSeptember[14][3] = 10;         pupel[0].marksForSeptember[14][4] = 8;
            pupel[0].marksForSeptember[15][0] = 10;         pupel[0].marksForSeptember[15][1] = 10;         pupel[0].marksForSeptember[15][2] = 8;          pupel[0].marksForSeptember[15][3] = 7;          pupel[0].marksForSeptember[15][4] = 10;
            System.out.println(pupel[0]);

            pupel[1] = new Student();
            pupel[1].name = "Danik";
            pupel[1].surname = "Poddubny";
            pupel[1].email = "Dan2404@gmail.com";
            pupel[1].form = "11A";
            pupel[1].marksForSeptember[0][0] = 10;          pupel[1].marksForSeptember[0][1] = 10;          pupel[1].marksForSeptember[0][2] = 10;          pupel[1].marksForSeptember[0][3] = 10;          pupel[1].marksForSeptember[0][4] = 10;
            pupel[1].marksForSeptember[1][0] = 9;           pupel[1].marksForSeptember[1][1] = 10;          pupel[1].marksForSeptember[1][2] = 10;          pupel[1].marksForSeptember[1][3] = 5;           pupel[1].marksForSeptember[1][4] = 7;
            pupel[1].marksForSeptember[2][0] = 10;          pupel[1].marksForSeptember[2][1] = 7;           pupel[1].marksForSeptember[2][2] = 4;           pupel[1].marksForSeptember[2][3] = 7;           pupel[1].marksForSeptember[2][4] = 10;
            pupel[1].marksForSeptember[3][0] = 10;          pupel[1].marksForSeptember[3][1] = 10;          pupel[1].marksForSeptember[3][2] = 10;          pupel[1].marksForSeptember[3][3] = 10;          pupel[1].marksForSeptember[3][4] = 8;
            pupel[1].marksForSeptember[4][0] = 10;          pupel[1].marksForSeptember[4][1] = 8;           pupel[1].marksForSeptember[4][2] = 6;           pupel[1].marksForSeptember[4][3] = 8;           pupel[1].marksForSeptember[4][4] = 10;
            pupel[1].marksForSeptember[5][0] = 8;           pupel[1].marksForSeptember[5][1] = 9;           pupel[1].marksForSeptember[5][2] = 8;           pupel[1].marksForSeptember[5][3] = 10;          pupel[1].marksForSeptember[5][4] = 9;
            pupel[1].marksForSeptember[6][0] = 10;          pupel[1].marksForSeptember[6][1] = 10;          pupel[1].marksForSeptember[6][2] = 10;          pupel[1].marksForSeptember[6][3] = 10;          pupel[1].marksForSeptember[6][4] = 10;
            pupel[1].marksForSeptember[7][0] = 10;          pupel[1].marksForSeptember[7][1] = 7;           pupel[1].marksForSeptember[7][2] = 8;           pupel[1].marksForSeptember[7][3] = 8;           pupel[1].marksForSeptember[7][4] = 10;
            pupel[1].marksForSeptember[8][0] = 8;           pupel[1].marksForSeptember[8][1] = 10;          pupel[1].marksForSeptember[8][2] = 10;          pupel[1].marksForSeptember[8][3] = 9;           pupel[1].marksForSeptember[8][4] = 10;
            pupel[1].marksForSeptember[9][0] = 6;           pupel[1].marksForSeptember[9][1] = 9;           pupel[1].marksForSeptember[9][2] = 8;           pupel[1].marksForSeptember[9][3] = 10;          pupel[1].marksForSeptember[9][4] = 9;
            pupel[1].marksForSeptember[10][0] = 7;          pupel[1].marksForSeptember[10][1] = 10;         pupel[1].marksForSeptember[10][2] = 10;         pupel[1].marksForSeptember[10][3] = 9;          pupel[1].marksForSeptember[10][4] = 10;
            pupel[1].marksForSeptember[11][0] = 10;         pupel[1].marksForSeptember[11][1] = 10;         pupel[1].marksForSeptember[11][2] = 9;          pupel[1].marksForSeptember[11][3] = 10;         pupel[1].marksForSeptember[11][4] = 10;
            pupel[1].marksForSeptember[12][0] =8;           pupel[1].marksForSeptember[12][1] = 6;          pupel[1].marksForSeptember[12][2] = 10;         pupel[1].marksForSeptember[12][3] = 8;          pupel[1].marksForSeptember[12][4] = 9;
            pupel[1].marksForSeptember[13][0] = 10;         pupel[1].marksForSeptember[13][1] = 10;         pupel[1].marksForSeptember[13][2] = 6;          pupel[1].marksForSeptember[13][3] = 10;         pupel[1].marksForSeptember[13][4] = 10;
            pupel[1].marksForSeptember[14][0] = 9;          pupel[1].marksForSeptember[14][1] = 7;          pupel[1].marksForSeptember[14][2] = 10;         pupel[1].marksForSeptember[14][3] = 10;         pupel[1].marksForSeptember[14][4] = 8;
            pupel[1].marksForSeptember[15][0] = 10;         pupel[1].marksForSeptember[15][1] = 10;         pupel[1].marksForSeptember[15][2] = 8;          pupel[1].marksForSeptember[15][3] = 7;          pupel[1].marksForSeptember[15][4] = 10;
            System.out.println(pupel[1]);

            pupel[2] = new Student();
            pupel[2].name = "Misha";
            pupel[2].surname = "Krishtapovic";
            pupel[2].email = "Miha001@gmail.com";
            pupel[2].form = "11A";
            pupel[2].marksForSeptember[0][0] = 10;          pupel[2].marksForSeptember[0][1] = 10;          pupel[2].marksForSeptember[0][2] = 10;          pupel[2].marksForSeptember[0][3] = 10;          pupel[2].marksForSeptember[0][4] = 10;
            pupel[2].marksForSeptember[1][0] = 9;           pupel[2].marksForSeptember[1][1] = 10;          pupel[2].marksForSeptember[1][2] = 10;          pupel[2].marksForSeptember[1][3] = 5;           pupel[2].marksForSeptember[1][4] = 7;
            pupel[2].marksForSeptember[2][0] = 10;          pupel[2].marksForSeptember[2][1] = 7;           pupel[2].marksForSeptember[2][2] = 4;           pupel[2].marksForSeptember[2][3] = 7;           pupel[2].marksForSeptember[2][4] = 10;
            pupel[2].marksForSeptember[3][0] = 10;          pupel[2].marksForSeptember[3][1] = 10;          pupel[2].marksForSeptember[3][2] = 10;          pupel[2].marksForSeptember[3][3] = 10;          pupel[2].marksForSeptember[3][4] = 8;
            pupel[2].marksForSeptember[4][0] = 10;          pupel[2].marksForSeptember[4][1] = 8;           pupel[2].marksForSeptember[4][2] = 6;           pupel[2].marksForSeptember[4][3] = 8;           pupel[2].marksForSeptember[4][4] = 10;
            pupel[2].marksForSeptember[5][0] = 8;           pupel[2].marksForSeptember[5][1] = 9;           pupel[2].marksForSeptember[5][2] = 8;           pupel[2].marksForSeptember[5][3] = 10;          pupel[2].marksForSeptember[5][4] = 9;
            pupel[2].marksForSeptember[6][0] = 10;          pupel[2].marksForSeptember[6][1] = 10;          pupel[2].marksForSeptember[6][2] = 10;          pupel[2].marksForSeptember[6][3] = 10;          pupel[2].marksForSeptember[6][4] = 10;
            pupel[2].marksForSeptember[7][0] = 10;          pupel[2].marksForSeptember[7][1] = 7;           pupel[2].marksForSeptember[7][2] = 8;           pupel[2].marksForSeptember[7][3] = 8;           pupel[2].marksForSeptember[7][4] = 10;
            pupel[2].marksForSeptember[8][0] = 8;           pupel[2].marksForSeptember[8][1] = 10;          pupel[2].marksForSeptember[8][2] = 10;          pupel[2].marksForSeptember[8][3] = 9;           pupel[2].marksForSeptember[8][4] = 10;
            pupel[2].marksForSeptember[9][0] = 6;           pupel[2].marksForSeptember[9][1] = 9;           pupel[2].marksForSeptember[9][2] = 8;           pupel[2].marksForSeptember[9][3] = 10;          pupel[2].marksForSeptember[9][4] = 9;
            pupel[2].marksForSeptember[10][0] = 7;          pupel[2].marksForSeptember[10][1] = 10;         pupel[2].marksForSeptember[10][2] = 10;         pupel[2].marksForSeptember[10][3] = 9;          pupel[2].marksForSeptember[10][4] = 10;
            pupel[2].marksForSeptember[11][0] = 10;         pupel[2].marksForSeptember[11][1] = 10;         pupel[2].marksForSeptember[11][2] = 9;          pupel[2].marksForSeptember[11][3] = 10;         pupel[2].marksForSeptember[11][4] = 10;
            pupel[2].marksForSeptember[12][0] =8;           pupel[2].marksForSeptember[12][1] = 6;          pupel[2].marksForSeptember[12][2] = 10;         pupel[2].marksForSeptember[12][3] = 8;          pupel[2].marksForSeptember[12][4] = 9;
            pupel[2].marksForSeptember[13][0] = 10;         pupel[2].marksForSeptember[13][1] = 10;         pupel[2].marksForSeptember[13][2] = 6;          pupel[2].marksForSeptember[13][3] = 10;         pupel[2].marksForSeptember[13][4] = 10;
            pupel[2].marksForSeptember[14][0] = 9;          pupel[2].marksForSeptember[14][1] = 7;          pupel[2].marksForSeptember[14][2] = 10;         pupel[2].marksForSeptember[14][3] = 10;         pupel[2].marksForSeptember[14][4] = 8;
            pupel[2].marksForSeptember[15][0] = 10;         pupel[2].marksForSeptember[15][1] = 10;         pupel[2].marksForSeptember[15][2] = 8;          pupel[2].marksForSeptember[15][3] = 7;          pupel[2].marksForSeptember[15][4] = 10;
            System.out.println(pupel[2]);

            pupel[3] = new Student();
            pupel[3].name = "Nikita";
            pupel[3].surname = "Steshic";
            pupel[3].email = "Loh228@gmail.com";
            pupel[3].form = "11A";
            pupel[3].marksForSeptember[0][0] = 10;          pupel[3].marksForSeptember[0][1] = 10;          pupel[3].marksForSeptember[0][2] = 10;          pupel[3].marksForSeptember[0][3] = 10;          pupel[3].marksForSeptember[0][4] = 10;
            pupel[3].marksForSeptember[1][0] = 9;           pupel[3].marksForSeptember[1][1] = 10;          pupel[3].marksForSeptember[1][2] = 10;          pupel[3].marksForSeptember[1][3] = 5;           pupel[3].marksForSeptember[1][4] = 7;
            pupel[3].marksForSeptember[2][0] = 10;          pupel[3].marksForSeptember[2][1] = 7;           pupel[3].marksForSeptember[2][2] = 4;           pupel[3].marksForSeptember[2][3] = 7;           pupel[3].marksForSeptember[2][4] = 10;
            pupel[3].marksForSeptember[3][0] = 10;          pupel[3].marksForSeptember[3][1] = 10;          pupel[3].marksForSeptember[3][2] = 10;          pupel[3].marksForSeptember[3][3] = 10;          pupel[3].marksForSeptember[3][4] = 8;
            pupel[3].marksForSeptember[4][0] = 10;          pupel[3].marksForSeptember[4][1] = 8;           pupel[3].marksForSeptember[4][2] = 6;           pupel[3].marksForSeptember[4][3] = 8;           pupel[3].marksForSeptember[4][4] = 10;
            pupel[3].marksForSeptember[5][0] = 8;           pupel[3].marksForSeptember[5][1] = 9;           pupel[3].marksForSeptember[5][2] = 8;           pupel[3].marksForSeptember[5][3] = 10;          pupel[3].marksForSeptember[5][4] = 9;
            pupel[3].marksForSeptember[6][0] = 10;          pupel[3].marksForSeptember[6][1] = 10;          pupel[3].marksForSeptember[6][2] = 10;          pupel[3].marksForSeptember[6][3] = 10;          pupel[3].marksForSeptember[6][4] = 10;
            pupel[3].marksForSeptember[7][0] = 10;          pupel[3].marksForSeptember[7][1] = 7;           pupel[3].marksForSeptember[7][2] = 8;           pupel[3].marksForSeptember[7][3] = 8;           pupel[3].marksForSeptember[7][4] = 10;
            pupel[3].marksForSeptember[8][0] = 8;           pupel[3].marksForSeptember[8][1] = 10;          pupel[3].marksForSeptember[8][2] = 10;          pupel[3].marksForSeptember[8][3] = 9;           pupel[3].marksForSeptember[8][4] = 10;
            pupel[3].marksForSeptember[9][0] = 6;           pupel[3].marksForSeptember[9][1] = 9;           pupel[3].marksForSeptember[9][2] = 8;           pupel[3].marksForSeptember[9][3] = 10;          pupel[3].marksForSeptember[9][4] = 9;
            pupel[3].marksForSeptember[10][0] = 7;          pupel[3].marksForSeptember[10][1] = 10;         pupel[3].marksForSeptember[10][2] = 10;         pupel[3].marksForSeptember[10][3] = 9;          pupel[3].marksForSeptember[10][4] = 10;
            pupel[3].marksForSeptember[11][0] = 10;         pupel[3].marksForSeptember[11][1] = 10;         pupel[3].marksForSeptember[11][2] = 9;          pupel[3].marksForSeptember[11][3] = 10;         pupel[3].marksForSeptember[11][4] = 10;
            pupel[3].marksForSeptember[12][0] =8;           pupel[3].marksForSeptember[12][1] = 6;          pupel[3].marksForSeptember[12][2] = 10;         pupel[3].marksForSeptember[12][3] = 8;          pupel[3].marksForSeptember[12][4] = 9;
            pupel[3].marksForSeptember[13][0] = 10;         pupel[3].marksForSeptember[13][1] = 10;         pupel[3].marksForSeptember[13][2] = 6;          pupel[3].marksForSeptember[13][3] = 10;         pupel[3].marksForSeptember[13][4] = 10;
            pupel[3].marksForSeptember[14][0] = 9;          pupel[3].marksForSeptember[14][1] = 7;          pupel[3].marksForSeptember[14][2] = 10;         pupel[3].marksForSeptember[14][3] = 10;         pupel[3].marksForSeptember[14][4] = 8;
            pupel[3].marksForSeptember[15][0] = 10;         pupel[3].marksForSeptember[15][1] = 10;         pupel[3].marksForSeptember[15][2] = 8;          pupel[3].marksForSeptember[15][3] = 7;          pupel[3].marksForSeptember[15][4] = 10;
            System.out.println(pupel[3]);

            pupel[4] = new Student();
            pupel[4].name = "Vanya";
            pupel[4].surname = "Baranovskiy";
            pupel[4].email = "VANYA@gmail.com";
            pupel[4].form = "11A";
            pupel[4].marksForSeptember[0][0] = 10;          pupel[4].marksForSeptember[0][1] = 10;          pupel[4].marksForSeptember[0][2] = 10;          pupel[4].marksForSeptember[0][3] = 10;          pupel[4].marksForSeptember[0][4] = 10;
            pupel[4].marksForSeptember[1][0] = 9;           pupel[4].marksForSeptember[1][1] = 10;          pupel[4].marksForSeptember[1][2] = 10;          pupel[4].marksForSeptember[1][3] = 5;           pupel[4].marksForSeptember[1][4] = 7;
            pupel[4].marksForSeptember[2][0] = 10;          pupel[4].marksForSeptember[2][1] = 7;           pupel[4].marksForSeptember[2][2] = 4;           pupel[4].marksForSeptember[2][3] = 7;           pupel[4].marksForSeptember[2][4] = 10;
            pupel[4].marksForSeptember[3][0] = 10;          pupel[4].marksForSeptember[3][1] = 10;          pupel[4].marksForSeptember[3][2] = 10;          pupel[4].marksForSeptember[3][3] = 10;          pupel[4].marksForSeptember[3][4] = 8;
            pupel[4].marksForSeptember[4][0] = 10;          pupel[4].marksForSeptember[4][1] = 8;           pupel[4].marksForSeptember[4][2] = 6;           pupel[4].marksForSeptember[4][3] = 8;           pupel[4].marksForSeptember[4][4] = 10;
            pupel[4].marksForSeptember[5][0] = 8;           pupel[4].marksForSeptember[5][1] = 9;           pupel[4].marksForSeptember[5][2] = 8;           pupel[4].marksForSeptember[5][3] = 10;          pupel[4].marksForSeptember[5][4] = 9;
            pupel[4].marksForSeptember[6][0] = 10;          pupel[4].marksForSeptember[6][1] = 10;          pupel[4].marksForSeptember[6][2] = 10;          pupel[4].marksForSeptember[6][3] = 10;          pupel[4].marksForSeptember[6][4] = 10;
            pupel[4].marksForSeptember[7][0] = 10;          pupel[4].marksForSeptember[7][1] = 7;           pupel[4].marksForSeptember[7][2] = 8;           pupel[4].marksForSeptember[7][3] = 8;           pupel[4].marksForSeptember[7][4] = 10;
            pupel[4].marksForSeptember[8][0] = 8;           pupel[4].marksForSeptember[8][1] = 10;          pupel[4].marksForSeptember[8][2] = 10;          pupel[4].marksForSeptember[8][3] = 9;           pupel[4].marksForSeptember[8][4] = 10;
            pupel[4].marksForSeptember[9][0] = 6;           pupel[4].marksForSeptember[9][1] = 9;           pupel[4].marksForSeptember[9][2] = 8;           pupel[4].marksForSeptember[9][3] = 10;          pupel[4].marksForSeptember[9][4] = 9;
            pupel[4].marksForSeptember[10][0] = 7;          pupel[4].marksForSeptember[10][1] = 10;         pupel[4].marksForSeptember[10][2] = 10;         pupel[4].marksForSeptember[10][3] = 9;          pupel[4].marksForSeptember[10][4] = 10;
            pupel[4].marksForSeptember[11][0] = 10;         pupel[4].marksForSeptember[11][1] = 10;         pupel[4].marksForSeptember[11][2] = 9;          pupel[4].marksForSeptember[11][3] = 10;         pupel[4].marksForSeptember[11][4] = 10;
            pupel[4].marksForSeptember[12][0] =8;           pupel[4].marksForSeptember[12][1] = 6;          pupel[4].marksForSeptember[12][2] = 10;         pupel[4].marksForSeptember[12][3] = 8;          pupel[4].marksForSeptember[12][4] = 9;
            pupel[4].marksForSeptember[13][0] = 10;         pupel[4].marksForSeptember[13][1] = 10;         pupel[4].marksForSeptember[13][2] = 6;          pupel[4].marksForSeptember[13][3] = 10;         pupel[4].marksForSeptember[13][4] = 10;
            pupel[4].marksForSeptember[14][0] = 9;          pupel[4].marksForSeptember[14][1] = 7;          pupel[4].marksForSeptember[14][2] = 10;         pupel[4].marksForSeptember[14][3] = 10;         pupel[4].marksForSeptember[14][4] = 8;
            pupel[4].marksForSeptember[15][0] = 10;         pupel[4].marksForSeptember[15][1] = 10;         pupel[4].marksForSeptember[15][2] = 8;          pupel[4].marksForSeptember[15][3] = 7;          pupel[4].marksForSeptember[15][4] = 10;
            System.out.println(pupel[4]);
    }
}