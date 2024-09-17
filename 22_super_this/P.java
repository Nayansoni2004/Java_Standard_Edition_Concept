class P {
    //instance-level method pro() ka returntype classtype ka h
    P pro() {
        return this; //to ye method pro() Object ka ref. code return krega
    }
    //main method
    public static void main(String[] args) {
        P x = new P();
        P y = x.pro(); //x.pro() ka ref. code jake y var. m hold ho jayega

        System.out.println(x);
        System.out.println(y);
    }
}
/* OUTPUT: x var. k ref. code ki copy jake y var. m hold ho jayegi...
P@4617c264
P@4617c264
P()constructor call hoga or super();call complete hone k baad instance method run hoga or wo method object ka 
ref. code return kregi jo hum x var. m hold kr lenge then,x.pro(); method k ref. code ki copy jake y var. m hold
ho jayegi ,or x or y var. ko print krne pr same ref. code print hoga,kyuki y var. m x var. ki hi copy rakhi h. */