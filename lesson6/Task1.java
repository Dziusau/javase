public class Task1 {
    public static void main(String[] args1) {
        int placeOfTheList = 0;
        String[] nickname = new String[]{"OLoLoshka", "GoodBoy", "Krasava"};
        int i = 0;
        for ( ; placeOfTheList < 4; placeOfTheList++) {
            for ( ; i < nickname.length; i++) {
                System.out.printf("CONGRATULATIONS %d\n", nickname[i]);
            }
        }
    }
}
