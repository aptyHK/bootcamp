import java.util.Objects;

public class Keyboard {
  
  private String buttonType;
  private int noOfButton;


  public Keyboard(String buttonType, int noOfButton) {
    this.buttonType = buttonType;
    this.noOfButton = noOfButton;
  }

  public void setButtonType(String buttonType) {
    this.buttonType = buttonType;
  }

  public void setNoOfButton(int noOfButton) {
    this.noOfButton = noOfButton;
  }

  public String getButtonType() {
    return this.buttonType;
  }

  public double getNoOfButton() {
    return this.noOfButton;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Keyboard))
      return false;
    Keyboard keyboard = (Keyboard) o;
    return Objects.equals(this.buttonType, keyboard.buttonType)
        && Objects.equals(this.noOfButton, keyboard.noOfButton);
  }
}
