import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a word to score.");
    String userWord = myConsole.readLine();

    Scrabble scrabbleWord = new Scrabble();
    Integer scrabbleScore = scrabbleWord.runScrabble(userWord);
    System.out.println("Total score: " + scrabbleScore);
  }
}
