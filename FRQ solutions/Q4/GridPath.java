import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

   public Location getNextLoc(int row, int col) {
    Location l = new Location(row+1, col);
    Location r = new Location(row, col+1);

     if (row > grid.length-2) {
       return r;
     }
     if (col > grid[0].length-2){
       return l;
     }

     if (grid[row+1][col] < grid[row][col+1]) {
       return l;
     } else {
       return r;
     }
   }

  
   public int sumPath(int row, int col) {
    int sum = 0;
    Location curr = new Location(row, col);
    while(curr.getRow() < grid.length && curr.getCol() < grid[0].length) {
      sum += grid[curr.getRow()][curr.getCol()];
      curr = getNextLoc(curr.getRow(), curr.getCol());
    } 
     return sum;
   }

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
