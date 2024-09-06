class A {
    //main method...
    public static void main(String[] args) {
        
        B b = new B();
        
        System.out.println(b.f);
    }
}

//OUTPUT:222
/*pahle B.java ko compile kr lenge to B.class file generate hogi phir A.java ko compile
krke A class ko run kr denge to compiler B.class file ko direct access kr lega. 