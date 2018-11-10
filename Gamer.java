public class Gamer {
    String nickname = "Trololo";
    int age = 16;
    int cash = 15;
    void buy (int a) {
        cash = cash - a;
    }
    Game[] library = new Game[5];
    {
        int i = 0;
        library[i] = new Game();
            library[i].name = "CS GO";
            library[i].ageLimit = 12;
            library[i].cost = 10;
            i++;

        library[i] = new Game();
            library[i].name = "World of tanks";
            library[i].ageLimit = 6;
            library[i].cost = 0;
            i++;

        library[i] = new Game();
            library[i].name = "OverWatch";
            library[i].ageLimit = 16;
            library[i].cost = 7;
            i++;

        library[i] = new Game();
            library[i].name = "Terraria";
            library[i].ageLimit = 8;
            library[i].cost = 5;
            i++;

        library[i] = new Game();
            library[i].name = "Minecraft";
            library[i].ageLimit = 6;
            library[i].cost = 3;
    }
}
