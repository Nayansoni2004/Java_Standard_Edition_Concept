class P {
    //instance-level initialization block
    {
        pro();  //method call...
    }
    //instance-level method member
    void pro() {
        System.out.println("Hello");
    }
    //main method
    public static void main(String[] args) {
        new P();
    }
}
/* OUTPUT:  Hello
compilation pass hone k baad runtime environment create hua hoga or runtime pr class load hogi or pro();method
ko initialization block m access kia h to jaise hi new se object banega pro();instance-level method us object se
attach ho jayegi or turant constructor ka super(); call end hone k bad instance-initialization block us instance
pr run hoga to pro method call hogi or "Hello" print hoga,lekin us instance ka ref.code humne kisi var. m hold 
nhi kia,kyuki jarurat hi nhi h,jarurat isley nhi h kyuki pro();method to automatic hi call ho gyi jub instance-
initialization block run hua.or hum kisi object ka ref. code kyu hold krte h? ans-jis se ki hum us object tak
pauch sake or ref. code k through kisi member ko access kr sake,lekin P class ka member automatic access ho gya,
isley ref. code hold nhi kia POBJECT ka.....but it's not a good practice...kyuki jub object ko access hi nhi krna
to object banaya hi kyu!*/ 