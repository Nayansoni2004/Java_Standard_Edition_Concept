//Single Inheritance

class X1 {

}

class G extends X1 {

}

/* happily compiled....
Even without explicitly defining a constructor, Java provides a default constructor for both classes.

Class G can access any non-private members of Class X1 (if defined).

Demonstrated single inheritance with an empty parent class, successfully showcasing the concept of class inheritance in Java.
 */