class N3 {

    final static int x;//variable declaration

    final static int y = 1010;//variable declaration cum initialization

    static {
        x = 00001;//Anonymous code block...................
    }
}

/* OUTPUT:happily compiled 

final static members ko constructor k andar initialization nhi kr sakte h,but anonymous code block k andar final 
static var. ko value se initialization kr sakte h.
*/