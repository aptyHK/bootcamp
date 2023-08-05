package stonepaperscissors;

public class Player {

  //private int healthPoint;
  private String playerName;
  private String playerType;
  private String playerOption;
  
  public Player(String playerName, String PlayerType) {
    //this.healthPoint = 2;
    this.playerName = playerName;
    this.playerType = PlayerType;
  }

  public String getPlayerName() {
    return this.playerName;
  }

  public String getPlayerType() {
    return this.playerType;
  }

  public String getPlayerOption() {
    return this.playerOption;
  }

  public void setPlayerOption(int randOption) {
    if (randOption == 1)
      this.playerOption = "stone";
    if (randOption == 2)
      this.playerOption = "paper";
    if (randOption == 3)
      this.playerOption = "scissors";
  }
  
  public void setPlayerOption(String pickOption) {
    this.playerOption = pickOption;
  }
}
