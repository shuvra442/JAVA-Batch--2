package opps;

class A {
    public int a = 30; // instance variable

    void draw(){
        int a = this.a; // local variable
        System.out.println(a);
        System.out.println("Class A");
    }
}

class B extends A{
   @Override
    void draw(){
       super.draw();
       System.out.println("Class B");

    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        B b = new B();
        b.draw();

    }
}
