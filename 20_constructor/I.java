class AA extends CC {
    //programmer supplied constructor
    AA() {
        System.out.println("Golu");
    }
}

class BB extends AA {
    //programmer supplied constructor
    BB() {
        System.out.println("Bablu");
    }
}

class CC {
    //programmer supplied constructor
    CC() {
        System.out.println("Taplu");
    }
}

//test class
class I {
    //main method
    public static void main(String[] args) {
        System.out.println("chhotabheem");

        BB x = new BB();//<-bottom most child object..
        System.out.println("raji");
    }
}
/* PROCESS: this code is executed through stack and object creation in heap memory...
chhotabheem
Taplu
Golu
Bablu
raji
*/