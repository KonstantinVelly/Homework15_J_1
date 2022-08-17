import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class PlayTest {

    public Game game = new Game();

    Player player1 = new Player(11, "Martin", 10);
    Player player2 = new Player(222, "Nils", 2);
    Player player3 = new Player(33, "Feona", 2);
    Player player4 = new Player(4, "Natali", 14);
    Player player5 = new Player(52, "Laura", 77);

   @Test //Тестируем на победителя в паре
  public void whoIsStronger() {
       game.register(player1);
       game.register(player2);
       game.register(player3);
       game.register(player4);
       game.register(player5);

       int expected = 0; // Draw
       int actual = game.play("Nils", "Feona");

       Assertions.assertEquals(expected, actual);

       int expected1 = 1; // 1st one is stronger
       int actual1 = game.play("Martin", "Nils");

       Assertions.assertEquals(expected1, actual1);

       int expected2 = 2; // 2st one is stronger
       int actual2 = game.play("Natali", "Laura");

       Assertions.assertEquals(expected2, actual2);

   }
       @Test //Тестируем на наличие элемента в списке
    public void ifRegistered() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        Player expected = player1; //Элемент есть в списке
        Player actual = game.findPlayer("Martin");

        Assertions.assertEquals(expected, actual);

        Player expected1 = null; // Элемента в списке нет
        Player actual1 = game.findPlayer("Ivan");

        Assertions.assertEquals(expected1, actual1);


    }



}
