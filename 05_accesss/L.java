class Student {

    //main method...
    public static void main(String[] args) {

        Pen pen = new Pen();

        pen.write();
    }
}

class Pen {

    void write() {
        System.out.println("HAVE A GOOD DAY");
    }
}
//HAS-A relationship because Student class has a pen means Student class has a object of Pen class through which
// method of Pen class can be accessed.
//Pen class ki method ko access krna h to uska object bana lenge jo ki reference code k through Student 
//class m Pen class ki method ko easily access kr lega.
//OUTPUT:HAVE A GOOD DAY