package ch06;

// 나중에 T가 test한 코드의 자료형으로 다 바뀌어서 컴파일이 된다.
public class GenericPrinter<T> {
  
  private T material;

  public T getMaterial() {
    return this.material;
  }

  public void setMaterial(T material) {
    this.material = material;
  }

  public String toString() {
    return material.toString();
  }
}
