class RRR {
    //programmer supplied constructor...
    private RRR() {

    }
  //non-instance method....
    static RRR createObject() {
        //step-1
        //step-2
        
        RRR r = new RRR();

        return r;//object ka ref. code method ko return krega ye return statement.
    }
}

class V {
    //main method
    public static void main(String[] args) {
              //classname.membername
        RRR x = RRR.createObject();//method call
        RRR y = RRR.createObject();

        System.out.println(x);
        System.out.println(y);
    }
}
/* RRR@36baf30c
   RRR@7a81197d 
RRR class ka constructor private mark h to V class m object nhi bana sakte,kyuki object banayenge to constructor 
call hoga,jo ki call nhi ho sakta to fail ho jayega,isley RRR class ki method k andar us class ka object bana 
lenge or us object ka ref. code r var. m jake hold ho jayega,fir us r var. ko return kr denge to method us Object
ka ref. code return kregi,fir kyuki method static h to classname.membername direct call kr lenge,to createObject
method call hoga or uska ref. code jake x var. m hold ho jayega,or jub ref. var. x ko print krenge to Object ka
ref. code print hoga,or jitni bar createObject method ko call krenge har bar wo method object ka ref. code return
kregi jo y ref. var. m hold ho jayega or jaise hi y ko print krenge to object ka ref. code print hoga.
*/