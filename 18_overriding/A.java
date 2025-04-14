class X1 {

    //overridden method member...
    void pro() {
        System.out.println("step~1");
        System.out.println("step~2");
    }
}

class A extends X1 {
    /* when you re-define/re-implement a parent class method in the child class,then such method re-definition
    is called method over-riding: but parameter body must match matlab(type,count,sequence) sub must match krna
    chahiye.  */
    /*  YOU CAN MODIFY AN EXISTING METHOD INHERITED FROM PARENT,IF REQUIRED...   */

    //over-riding method member...
    void pro() {
        System.out.println("step~1");
        System.out.println("step~2");
        System.out.println("step~3");
        System.out.println("step~4");
    }
    /*even you can add new methods....to create a modified version of an existing class.*/
    void info() {

    }
}
/* happily compiled...

superclass ki method ko sub-class re-define kr sakta h,but parameter body must match krna chahiye,or return type 
jese(void,int) bhi exact must match krna chahiye,tabhi method over-riding kahaliege.
*/