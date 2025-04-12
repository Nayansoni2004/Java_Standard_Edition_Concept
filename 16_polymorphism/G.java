class G {
    public static void main(String[] args) {
        Vehicle v = new SportsCar();
        FourWheeler fw = new SportsCar();
        Car cr = new SportsCar();
    }
}
/*
happily compiled...
class Vehicle is parent class.
class FourWheeler extends Vehicle.
class Car extends FourWheeler.
class SportsCar extends Car.
 */

 /*
Because Java supports polymorphism.

A SportsCar IS-A Vehicle, FourWheeler, and Car.
  */