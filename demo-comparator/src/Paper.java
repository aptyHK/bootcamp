public abstract class Paper {
  int size;

  public Paper(int size) {
    this.size = size;
  }
}

// default Comparator<T> thenComparing(Comparator<? super T> other)
// the ? super T allow put the parent or any of its child but the child can get through to the parent attribute to compare
