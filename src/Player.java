import java.util.ArrayList;

public abstract class Player {
    private String name;
    private ArrayList<Integer> guesses;

    public abstract int makeGuess();

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGuesses(){
        return guesses;
    }
    public void setName(String name) {
        this.name=name;
    }

    public void setGuesses(ArrayList<Integer> guesses) {
        this.guesses = guesses;
    }

    public void addGuess(int guess){
        guesses.add(guess);
        //System.out.println("método"+guesses);
    }

}
