class J {
  public static void main(String[] args) {
    Teacher[] x = new Teacher[3];

    x[0] = new Teacher("Mallika", 30);
    x[1] = new Teacher("Zeba", 34);
    x[2] = new Teacher("Khushboo", 36);

    System.out.println(x[0].name);
    System.out.println(x[1].name);
    System.out.println(x[2].name);

    System.out.println("###########################################");

    System.out.println(x[0].age);
    System.out.println(x[1].age);
    System.out.println(x[2].age);
  }
}
/* OUTPUT
Mallika
Zeba
Khushboo
###########################################
30
34
36

(array of type teacher) object k andar teacher objects k members (name or age) ko direct access krke print kia h.
 */