public class ComputerPlayer extends Player{
    @Override
    public int makeGuess() {
        int computerGuess=(int)(Math.random() * 101);
        System.out.print(getName()+" un número entre 1 y 100: "+computerGuess+"\n");
        return computerGuess;
    }
}
