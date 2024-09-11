class R1 {

    //main method 
    public static void main(String[] args) {

        final int x;  //uninitialized variable

        x = 101;
        x = 102;

        System.out.println(x);

    }
}
/* R1.java:9: error: variable x might already have been assigned
        x = 102;
        ^
1 error

kisi variable ko do values se initialization nhi kr sakte h,jaise isse miliye ye mera dost iska name nayan bhi h
or anshul bhi h,agar koi var. pahle koi value se initialize ho chuka h,to firse initialize nhi kr sakte ,agar
firse initialization krenge to error aa jayegi.
*/