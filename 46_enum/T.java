enum BartanSize {
    BIG, HUGE, SMALL 
}

enum GlassSize extends BartanSize {
    MEDIUM, LARGE       
}
/*OUTPUT:ik enum dusre enum ko extends nhi kr sakta,i.e, enum ka koi parent nhi hota h.
D:\javaprac\46_enum>javac T.java
T.java:5: error: '{' expected
enum GlassSize extends BartanSize {
              ^
T.java:5: error: enum constant expected here
enum GlassSize extends BartanSize {
               ^
T.java:6: error: <identifier> expected
    MEDIUM, LARGE
          ^
T.java:6: error: ';' expected
    MEDIUM, LARGE
                 ^
T.java:7: error: reached end of file while parsing
}
 ^
5 errors */