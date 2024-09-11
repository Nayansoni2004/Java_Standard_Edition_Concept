class M4 {
    
    final String name;//variable declaration

    void info() {
        name ="Drishti";
    }
}
/* M4.java:6: error: cannot assign a value to final variable name
        name ="Drishti";
        ^
1 error

CONCLUSION= it's too late to assign a value to a final variable name ,inside the method info().
            
            final var. ko method k andar initialization krna bohot late ho jayega,kyuki code ka execution line by
            line hota h or java dekhega ki final var. ko declare to kia h,but initialization method k andar kia h 
            jo ki bohot late h.
*/       