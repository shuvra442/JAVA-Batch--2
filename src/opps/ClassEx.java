package opps;

/**
 * class basic ::
 */

public class ClassEx {

    void srilekha() {

        int a = 20;
        int b = 30;

        System.out.println(a+b);
    }

    public static void main(String[] args) {
        new ClassEx()
                .srilekha();
    }


}

/**
 * Object basic ::
 */

class ObjectEx {

    public static void main(String[] args) {
        ClassEx classEx = new ClassEx();
        classEx.srilekha();
    }

}