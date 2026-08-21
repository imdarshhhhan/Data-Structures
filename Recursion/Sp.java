

class Sp implements I {
    public void m1() {
        System.out.print("this is implementation");
    }

    public static void main(String args[]) {
        Sp obj = new Sp();
        obj.m1();
    }
}

interface I {
    public void m1();

    public static void main(String args[]) {
    }
}
