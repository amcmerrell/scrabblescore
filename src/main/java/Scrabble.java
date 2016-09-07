import java.util.ArrayList;
import java.util.List;

public class Scrabble {
  public Integer runScrabble(String letters) {
    String[] lettersArray = letters.split("");
    int result = 0;
    for (int i = 0; i < lettersArray.length; i++){
      if (lettersArray[i].matches("(?iu)a|e|i|o|u|l|n|r|s|t")) {
        result += 1;
      }
      if (lettersArray[i].matches("(?iu)d|g")){
        result += 2;
      }
      if (lettersArray[i].matches("(?iu)b|c|m|p")){
        result += 3;
      }
      if (lettersArray[i].matches("(?iu)f|h|v|w|y")){
        result += 4;
      }
      if (lettersArray[i].matches("(?iu)k")){
        result += 5;
      }
      if (lettersArray[i].matches("(?iu)j|x")){
        result += 8;
      }
      if (lettersArray[i].matches("(?iu)q|z")){
        result += 10;
      }
    }return result;
  }
}
