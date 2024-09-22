class E {
    //main method
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        System.out.println("~~~~~~Default Thread Details~~~~~~~~~");

        System.out.println("Thread Name: " + x.getName());
        System.out.println("Thread Id: " + x.getId());
        System.out.println("Thread Priority: " + x.getPriority());
    }
}
/*OUTPUT:
~~~~~~Default Thread Details~~~~~~~~~
Thread Name: main
Thread Id: 1
Thread Priority: 5
 */