package checked;
// NameToLongException is not programmer fault, only know at runtime
// if indexOutOfBound, is run-time exeception but should be fix by programming
// should not use try catch
// for nullPointer, it should be always unchecked and never try to catch
// because (I think) user can never input null
// If null pointer error happen, should be coding fault
// which should just fix by change the coding

public class NameToLongException extends Exception {
  public NameToLongException(String message) {
    super(message);
  }
}
