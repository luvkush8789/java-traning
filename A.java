public class A {
    public static void main(String[] args) {
        c obj = new c();
        obj.fun();
    }
}

class b {
    void fun() {
        System.out.println("inside a b is fun() is call ");
    }
}

class c extends b {

}

