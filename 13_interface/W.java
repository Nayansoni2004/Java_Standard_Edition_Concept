interface X {
    void info();
}

class A implements X {
    public void info() {

    }
}

class B extends A implements X {

}

/*
happily compiled...

"Explored interface inheritance. Class A implements X and provides an empty info() method. 
Class B extends A and also declares implements X, which is unnecessary since A already implements X. 
B should override info() if a different implementation is needed."
 */