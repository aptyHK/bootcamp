package stonepaperscissors;

public enum GameOptions {
  STONE(1), //
  PAPER(2), //
  SCISSORS(3) //
  ; 

  int optionId;

  private GameOptions(int optionId) {
    this.optionId = optionId;
  }
  
}
