interface Smart {

}

interface Intelligent {

}

interface Beautiful {

}

class Human {

}

class American implements Smart, Intelligent, Beautiful {

}

/*
 * happily compiled...
 * 
 * Java does not support multiple inheritance with classes but allows multiple inheritance using interfaces.
 * A class can implements multiple interfaces.
 */