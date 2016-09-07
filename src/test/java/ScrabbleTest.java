import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.runScrabble("a"));
  }

  @Test
  public void calculateScore_returnsScoreForDifferentLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.runScrabble("d"));
  }
  @Test
  public void calculateScore_returnsScoreForTwoLetter_2() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.runScrabble("aa"));
  }
  @Test
  public void calculateScore_returnsScoreForTwoDifferentLetter_3() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.runScrabble("ad"));
  }
  @Test
  public void calculateScore_returnsScoreForDifferentLetters_4() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.runScrabble("aeil"));
  }
  @Test
  public void calculateScore_returnsScoreForCapitalLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.runScrabble("L"));
  }
  @Test
  public void calculateScore_returnsScoreForOneOfEachScore_33() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 33;
    assertEquals(expected, testScrabble.runScrabble("adbfkjq"));
  }
  @Test
  public void calculateScore_returnsScoreForNumberAndLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.runScrabble("a0"));
  }
}
