public class Zoo<T> {
  T animal;

  public Zoo (T animal) {
    this.animal = animal;
  }

  // Zoo<T> -> return type
  // T -> input parameter
  // <T> -> the range of T
  // <T extends Dog> -> now declared T can only accept Dog or any child class of Dog
  // <T extends Animal> -> can accept new Animal() or any child class 
  // of (T animal) -> the T here is different than the T on public static <T extends Animal>
  // The T of of (T animal) is refer to the T on public class Zoo<T>
  // public static <T>, do not mention = all range, all range still mean a range so is valid
  public static <T extends Animal> Zoo<T> of (T animal) { 
    // if input parameter have T / return type have T, you have to add an extra <T> between static and return type Zoo<T>
    // Only static method need to describe <T extends Animal> on return type because it cannot confirm by the object
    return new Zoo<>(animal);
  }

  public T getAnimal() {
    return this.animal;
  }

  public void setAnimal(T animal) {
    this.animal = animal;
  }
}
