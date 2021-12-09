// this is a class for a human player

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HumanPlayer{

  private String token;
  private BufferedReader in;

  public HumanPlayer (String token){
    this.token = token;
    in = new BufferedReader(new InputStreamReader(System.in));
  }

  public Move getMove(){
    try{
      String row = in.readLine();
      String col = in.readLine();
      int r = Integer.parseInt(row);
      int c = Integer.parseInt(col);
      return new Move(r,c);
    }
    catch(Exception e){
      System.out.println("Please enter a number");
    }
    return null;
  }
  public String getToken(){
    return token;
  }

}