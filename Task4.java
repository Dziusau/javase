class Task4{
    public static void main(String[] args4){
        int damage = 123;
        switch (){
            case 1:
                damage = damage * 3 / 2;
                System.out.println("Damage on Zombie : " + damage);
            case 2:
                damage = damage * 3 / 2;
                System.out.println("Damage on Undead : " + damage);
                break;
        }
        switch (){
            case 1:
                damage = damage / 2;
                System.out.println("Damage on Saint : " + damage);
                break;
        }
        switch (){
            case 1:
                System.out.println("Damage on Humanoid : " + damage);
            case 2:
                System.out.println("Damage on Ghost : " + damage);
            case 3:
                System.out.println("Damage on Plant : " + damage);
        }
    }
}
