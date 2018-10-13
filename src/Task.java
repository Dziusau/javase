//Task1
class Task1 {
    public static void main(String[] args1){
        int position = 8;
        if (position <= 5){
            System.out.println("He's in the top of damage");
        } else {
            System.out.println("He's noob");
        }
    }
}
//Task2
class Task2 {
    public static void main(String[] args2){
        int countKillTanksFirstGamer = 7;
        int countKillTanksSecondGamer = 13;
        int countPointsFirstGamer = countKillTanksFirstGamer * 100;
        int countPointsSecondGamer = countKillTanksSecondGamer * 100;
        if (countKillTanksFirstGamer > countKillTanksSecondGamer){
            int countPointsFirstGamerBonus = countPointsFirstGamer + 1000;
            System.out.println("Points first gamer without bonus: " + countPointsFirstGamer + ";\n with bonus: " + countPointsFirstGamerBonus + ";\nPoints second gamer: " + countPointsSecondGamer);
        } else {
            int countPointsSecondGamerBonus = countPointsSecondGamer + 1000;
            System.out.println("Points second gamer without bonus: " + countPointsSecondGamer + ";\n with bonus:  " + countPointsSecondGamerBonus + ";\nPoints second gamer: " + countPointsFirstGamer);
        }
    }
}
//Task3
class Task3{
    public static void main(String[] args3){
        double hpLevel = 47;
        if (hpLevel<=100 | 75<hpLevel){
                System.out.println("Green");
        } else if (50<hpLevel | hpLevel<=75){
                System.out.println("Yellow");
        } else if (25<hpLevel | hpLevel<=50){
                System.out.println("Orange");
        } else if (hpLevel<=25){
                System.out.println("Red");
        }
    }
}
//Task4
class Task4{
    public static void main(String[] args4){
        int damage = 123;
        switch (damage){
            case 1:
                damage = damage * 3 / 2;
                System.out.println("Damage on zombie: " + damage);
                break;
        }

    }
}