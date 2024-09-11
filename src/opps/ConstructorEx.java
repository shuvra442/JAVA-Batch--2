package opps;
/**
 * constructor: when declare a methods as a class name then we called constructor
 * ** don't contain any return type
 *
 * type: 1. Default 2. parameterized 3. copy constructor
 */

public class ConstructorEx {

    // default
    ConstructorEx(){
        System.out.println("Hello, I'm a Default constructor ");
    }

    // 2. parameterized
    ConstructorEx(int i, int j){
        System.out.println("Hello, I'm a parameterized constructor "+ i + j);
    }

    ConstructorEx(int p, double q){
        System.out.println("Hello, I'm a parameterized constructor "+ p + q);
    }

    public static void main(String[] args) {
        ConstructorEx constructorEx = new ConstructorEx();

        ConstructorEx constructorEx1 = new ConstructorEx(10,20);

        ConstructorEx constructorEx2 = new ConstructorEx(10, 20.0);

    }

}
