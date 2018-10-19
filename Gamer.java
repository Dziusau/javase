import java.util.StringTokenizer;

public class Gamer {
    String nickname;
    String email;
    double winrate;
    int rating;
    int dateLastGame;

    @Override
    public String toString() {
        return "Nickname : " + nickname  + "\nEmail : " + email + "\nWinrate : " + winrate + "\nRating : " + rating + "Date of the last day game : " + dateLastGame;
    }
}
