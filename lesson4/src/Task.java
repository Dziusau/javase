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
            String nickname[] = {"Trololoshka", "Amway921", "Strike", "Near_You", "LeBwa", "Jove", "Desertod", "Yusha", "Shamanenok", "Evil_GrannY"};
            String email[] = {"Trololo@gmail.com", "921Amway@gamil.com", "Strike01@mail.ru", "NEAR_YOU@gmail.com", "LeBwa007@mail.ru", "PAPA_JOWE@mail.ru", "DeSeRtOd@gamil.com", "Yusha_228@gmail.com", "Shamanenok8800555@gamil.com", "Evil_GRANI3535@mail.ru"};
            double winrate[] = {55.5, 67.8, 71.3, 63.7, 70.4, 61.2, 59.9, 64.1, 57.6, 65.9};
            int rating[] = {666, 129, 21, 54, 35, 28, 24, 10, 67, 15};
            int dateLastGame[] = {};
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
        Task4 pupel[] = new Student[];
        
    }
}