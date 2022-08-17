import java.util.ArrayList;

public class Game {

    //protected Player[] players = new Player[];
    protected ArrayList <Player> players = new ArrayList<>();

    public void register (Player player){
        players.add(player);
    }
    public Player findPlayer(String name){
        for (Player player : players){
            if (player.getName().equals(name)){
                return player;
            }
        }
        return null;
    }

    public int play (String name1, String name2){
        Player player1 = findPlayer(name1);
        Player player2 = findPlayer(name2);

        if (player1 == null) {
          throw new RuntimeException("Игрок" + name1 + "Не найден");
        }
        if (player2 == null) {
            throw new RuntimeException("Игрок" + name2 + "Не найден");
        }
        if (player1.getStrength() == player2.getStrength()) {
             return 0;
        }
        if (player1.getStrength() > player2.getStrength()) {
              return 1;
        } else {
              return 2;
        }
    }
}

