import java.util.LinkedList;
class E {
    //main method
    public static void main(String[] args) {
        //LinkedList as a Stack...
        LinkedList x = new LinkedList();

        x.push(34);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 0-index pe store hoga.
        x.push(56);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 1-index pe store hoga.
        x.push(78);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 2-index pe store hoga.
        x.push(12);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 3-index pe store hoga.
        x.push(8);//internally auto-boxing hogi,or Integer Object banega,uska ref.code 4-index pe store hoga.

        System.out.println(x);//internally Object class ki toString()method call hogi or string value return kregi,obj. ki.

        System.out.println(x.pop());//LinkedList as a Stack kam kr rhi h (LIFO).
        System.out.println(x.pop()); //this method works as a remove() or poll() method.
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());

        System.out.println(x);//internally Object class ki toString()method call nhi hogi kyuki,no record left.
    }
}
/*OUTPUT:LinkedList as a Stack means following (LI-FO Structure).
[8, 12, 78, 56, 34]
8
12
78
56
34
[] */