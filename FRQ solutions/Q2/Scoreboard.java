public class Scoreboard {
  private int s1, s2, active;
  private String t1, t2;

  public Scoreboard(String t1, String t2) {
    this.t1 = t1;
    this.t2 = t2;
    active = 1;
    s1 = 0;
    s2 = 0;
  }

  public void recordPlay(int points) {
    if (active == 1) {
      s1 += points;
      if (points == 0) {
        active = 2;
      }
    } else{
      s2 += points;
      if (points == 0) {
        active = 1;
      }
    }
  }

  public String getScore() {
    String ret = s1 + "-" + s2 + "-";
    if (active == 1) {
      ret += t1;
    } else {
      ret += t2;
    }
    return ret;
  }
}
