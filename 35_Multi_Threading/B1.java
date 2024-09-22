class A1Thread extends Thread { 
   
}

class B2Thread extends Thread {

}

class C3Thread extends Thread {

}


class B1 {
    //main method
    public static void main(String[] args) {
        A1Thread x = new A1Thread();
        System.out.println(x.getName());

        B2Thread y = new B2Thread();
        System.out.println(y.getName());

        C3Thread z = new C3Thread();
        System.out.println(z.getName());

        Thread a = new Thread();
        System.out.println(a.getName());

        Thread p = Thread.currentThread();
        System.out.println(p.getName());

    }
}
/*OUTPUT:
Thread-0
Thread-1
Thread-2
Thread-3
main
 */