import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GuessTheNumberGame {

    public static boolean checkGuess(Player player,int randomNum,ArrayList<Integer> guesses){
        int option= player.makeGuess();
        boolean guess=false;
        player.setGuesses(guesses);
        player.addGuess(option);
        if(option<randomNum){
            System.out.println("muy baja");
        }else if(option>randomNum){
            System.out.println("muy alta");
        }else{
            guess=true;
            System.out.println("Felicidades "+player.getName()+" el número es: "+option);
            System.out.print("Tus opciones fueron: "+player.getGuesses());

        }
        return (guess);
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner leer=new Scanner(System.in);

        System.out.println("¡Bienvenido al juego Adivina el Número!");

        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println("El número aleatorio es: "+randomNum);

        HumanPlayer player1=new HumanPlayer();
        System.out.println("Escribe tu nombre: ");
        player1.setName(leer.next());
        System.out.println("Hola "+player1.getName());

        ComputerPlayer playerComputer=new ComputerPlayer();
        playerComputer.setName("Computadora");

        boolean guessnumber;
        ArrayList<Integer> player1ArrayList = new ArrayList<>();
        ArrayList<Integer> playerComputerArrayList = new ArrayList<>();
        do{
            guessnumber = checkGuess(player1, randomNum, player1ArrayList);
            if (!guessnumber) {
                guessnumber=checkGuess(playerComputer,randomNum,playerComputerArrayList);
            }

        }while(!guessnumber);

    }
}