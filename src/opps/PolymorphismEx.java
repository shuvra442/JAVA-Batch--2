package opps;

/**
 * Polymorphism ::: means is greek word. whose meaning is Ploy means "many" and morphism means "form"
 * whose meaning is same object having different behaviour.
 *
 * types :: 1. Runtime(method overriding) 2.Compile time (method overloading)
 *
 */


public class PolymorphismEx {

    void add(){
       int a = 10;
       int b = 20;

       System.out.println(a+b);
    }

    void add(int a, int b){
        System.out.println(a*b);
    }

    void add(int a, double b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        PolymorphismEx polymorphismEx = new PolymorphismEx();
        polymorphismEx.add();
        polymorphismEx.add(10,30);
        polymorphismEx.add(10,20.0);
    }
}
