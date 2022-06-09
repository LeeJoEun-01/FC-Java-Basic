package ch07;

// T에 무작위 클래스가 들어갈 수 없게 특정 클래스를 상속해주어 클래스를 한정시킨다.
public class GenericPrinter<T extends Material> {
  
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
