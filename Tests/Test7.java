class A {
  String a;
  
  public A() {
    a = "A";
  }
}

class B extends A {
  String b;

  public B() {
    b = "B";
  }
}


public class Test7 {
  public static void main(String[] args) {
    B b = new B();
    
    System.out.println(b.a);
    System.out.println(b.b);
  
  }
}