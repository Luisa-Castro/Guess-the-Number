import java.util.Scanner;
public class HumanPlayer extends Player{
    @Override
    public int makeGuess() {
        Scanner leer=new Scanner(System.in);
        System.out.print(getName()+" escribe un número entre 1 y 100: ");
        int humanGuess;
        humanGuess=leer.nextInt();
        return humanGuess;
    }
}
