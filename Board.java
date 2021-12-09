// this is a class that shows the board for the game

public class Board{
  
  private String [][] board;
  private boolean win;

// This is a method to print an empty board, it will add tokens to each slot based on user input while the win condition is false
  public Board(){
    board = new String [][]{{".", ".", ".", ".", ".", ".", ".",},
    {".", ".", ".", ".", ".", ".", ".",},
    {".", ".", ".", ".", ".", ".", ".",},
    {".", ".", ".", ".", ".", ".", ".",},
    {".", ".", ".", ".", ".", ".", ".",},
    {".", ".", ".", ".", ".", ".", ".",}};
    win = false;
  }
  
  //
  public void placeToken(int row, int col, String token){
    board[row][col] = token;
  }

  //This is an accessor for the win condition
  public boolean hasWon(){
    return win;
  }

  // 
  public String getPrintBoard(){
    String s = "";
    for(int i = 0; i<board.length; i++){
      s += (i+1 + " | ");
      for(int j=0; j<board[i].length; j++){
        s += (board [i][j] + " ");
      }
      s += "\n";
    }
    s += ("    " + "1 2 3 4 5 6 7" + "\n");

    return s;
  }

}