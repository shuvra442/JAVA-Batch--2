package opps;

/**
 * Inheritance :: whenever a class access another class then we called Inheritance
 *
 *1. single inheritance
 *2. Multilevel inheritance
 */

class SubBaseOne {

    void srilekha(){
        System.out.println("Hello");
    }
}

class SubBaseTwo extends SubBaseOne {


}

class SubBaseThree extends SubBaseOne {


}

public class InheritenceEx {

    public static void main(String[] args) {
        new SubBaseThree().srilekha();
    }
}




