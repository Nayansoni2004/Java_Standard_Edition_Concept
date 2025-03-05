interface Smart {

} 

interface Intelligent {

}

interface Beautiful {

}

class Human {

}

class American extends Human implements Smart, Intelligent, Beautiful {

}

/*
 * happily compiled...
 * 
 * any class can extends a class & a class can implements multiple interfaces.
 */