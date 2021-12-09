
public class Connect4{
  
  private Board board;
  private HumanPlayer player1;
  private HumanPlayer player2;

  public Connect4(){
    board = new Board();
    player1 = new HumanPlayer("r");
    player2 = new HumanPlayer("y");
  }

  public void playConnect4(){
		System.out.println("Welcome to Connect 4");
		System.out.println("There are 2 players red and yellow");
		System.out.println("Player 1 is Red, Player 2 is Yellow");
		System.out.println("To play the game type in the number of the column you want to drop you counter in"); 
		System.out.println("A player wins by connecting 4 counters in a row - vertically, horizontally or diagonally");
		System.out.println("");
		System.out.println(board.getPrintBoard());
  

    HumanPlayer player = player1;
    while (!board.hasWon()){
      Move m = player.getMove();
      board.placeToken(m.getRow()-1, m.getCol()-1, player.getToken());
      String pb = board.getPrintBoard();
      System.out.println(pb);

      if(player.equals(player1)){
        player = player2;
      }
      else{
        player = player1;
      }
      
    }
  }
}