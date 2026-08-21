class Test2 {

    // static void m1(){
    //     m2();
    // }
    // static void m2(){
    //     m1();
    // }

    // public static void main(String[] args) {
    //     System.out.println("hello ");  //works fine
    //     m1();  //stack overflow error
    // }
    

    Test2(){
        this(10);
    }

        Test2(int i){  //recursive constructer invokation
            this();
        }
        public static void main(String[] args) {
            System.out.println("hello");
        }
}
