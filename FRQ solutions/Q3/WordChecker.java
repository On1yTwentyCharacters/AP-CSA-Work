import java.util.*;

public class WordChecker {
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> words) {
    wordList = words;
  }

  public boolean isWordChain() {
    for(int i = 0; i<wordList.size() - 1; i++) {
      if(wordList.get(i+1).indexOf(wordList.get(i)) == -1) {
        return false;
      }
    }
    return true;
  }


  public ArrayList<String> createList(String target) {
    ArrayList<String> result = new ArrayList<String>();
    for(int i = 0; i < wordList.size(); i++) {
      String word = wordList.get(i);
      if(word.indexOf(target) > -1) {
        if (word.substring(0, target.length()).equals(target)) {
          result.add(word.substring(target.length()));
        }
      }
    }
    return result;             
  }
}
