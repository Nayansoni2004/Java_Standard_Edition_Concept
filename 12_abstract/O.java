abstract class Y {

    //method members
    abstract void pro();
    abstract void info();

}

class O extends Y {

    void pro() {

    }

}
/* D:\javaprac\12_abstract>javac O.java
O.java:9: error: O is not abstract and does not implement abstract method info() in Y
class O extends Y {
^
1 error

compilation error aai kyuki jub compiler ne code gramatiaclly check kia to legal nhi h,kyuki abstract parent class
ki sari abstract methods child class ko implement krni padti h,matlab definition provide krni padti h,ya agar
child class abstract class ki sari methods ko definition provide nhi kr rha h,to child class ko abstract mark 
krna padta h.or O child class ne Y abstract parent class ki info method ko definition provide nhi ki h,or na hi
O class ne khud ko abstract mark kia h,isley error aai,ya to info method ko child O class m complete kr do,ya
O child class ko abstract mark kr do,to error nhi aaigi....
*/
