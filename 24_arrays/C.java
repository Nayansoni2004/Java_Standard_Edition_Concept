class C {
    public static void main(String[] args) {
        // super shortcut technique of array declaration cum instantiation cum initialization
        Teacher[] x = {
            new Teacher("om", 21),
            new Teacher("ram", 12),
            new Teacher("shyam", 23),
            new Teacher("sumit", 34)
        };

        //iterating array of type Teacher.
        for(Teacher next : x) {
            // System.out.println(next);
            System.out.println(next.age);
        }
    }
}
/* stored multiple teacher objects into a array of type teacher and printed its elements using enhanced-forloop(foreach-loop).
 OUTPUT
21
12
23
34
 */