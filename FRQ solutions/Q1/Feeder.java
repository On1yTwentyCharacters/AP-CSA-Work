public class Feeder {
  private int currentFood;
  
  public Feeder(int currentFood) {
    this.currentFood = currentFood;
  }
  
  public void simulateOneDay(int numBirds) {
    int val = ((int) Math.random() * 100) + 1;

    if (val > 95) {
      currentFood = 0;
    } else {
      for (int i = 1; i <= numBirds; i++) {
        int foodEaten = ((int) Math.random() * 40) + 11;
        currentFood -= foodEaten;
        if (currentFood < 0) {currentFood = 0;}
      }
    }
  }

  public int simulateManyDays(int numBirds, int numDays) {
    int Days = 0;

    while (currentFood > 0 && Days <= numDays) {
      simulateOneDay(numBirds);
      if (currentFood == 0) {
        return Days;
      }
      Days++;
    }

    return Days;
  }
  
}
