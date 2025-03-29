class Plant {  }
class Machine {  }
class Human {  }

class C {
    public static void main(String[] args) {
        Object m = new Plant();
        Object n = new Machine();
        Object o = new Human();
    }
}
/*
happily compiled.... 

Note: kisi bhi object tak pochne ka ik hi rasta h wo h reference code.

This is called upcasting, where a subclass object is referenced using its superclass type (Object in this case).
 */