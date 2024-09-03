class Student extends Pen {

    //main method...
    public static void main(String[] args) {

        Student pen = new Student();

        pen.write();

    }
}

class Pen {

    void write() {
        System.out.println("HAVE A GOOD DAY");
    }
}
//is example m IS-A relationship h kyuki extends keyword likhne se Student class ne Pen class ki sari properties
//inherit kr li h to object Student class ka banega or Pen class ki method ko access kr lega lekin STUDENT IS A PEN
//YE SAHI SOUND NHI KR RHA H TO YE SOFTWARE LEGAL NHI H.
//extends keyword likhne se Student class Pen class ki sari properties inherit kr lega to Student class ka hi Object 
//banayenge or us object k through Pen class ki write() method ko Student class m access kr lenge.
//OUTPUT:HAVE A GOOD DAY