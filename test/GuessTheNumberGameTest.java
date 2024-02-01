
import org.junit.jupiter.api.Test;

import java.rmi.server.RemoteServer;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GuessTheNumberGameTest {

    @Test
    public void checkGuess(){
        GuessTheNumberGame game=new GuessTheNumberGame();
        ComputerPlayer computer=new ComputerPlayer();
        ArrayList<Integer> guesses = new ArrayList<>();
        assertFalse(game.checkGuess(computer,150,guesses));
    }

    @Test
    public void checkGuessMessageLow(){
        GuessTheNumberGame game=new GuessTheNumberGame();
        HumanPlayer player = new HumanPlayer();
        int randomNum = 41;
        ArrayList<Integer> guesses = new ArrayList<>();
        boolean guess=game.checkGuess(player,randomNum,guesses);

    }


}