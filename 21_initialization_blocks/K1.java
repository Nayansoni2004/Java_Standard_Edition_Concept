class K1 {
    //static method member
    static void pro() {
        System.out.println(x);
    }
    //static var. member
    static int x = 9;
}
/* happily compiled....static var. ko static method m access kr sakte h,order matter nhi krta,chahe var. 
declaration method k pahle ho ya method k baad m declaration ho,lekin static initialization block m order matter
krta h,pahle var. declaration hi krna padega tabhi initialization block m us var. ko call/access kr payenge. */