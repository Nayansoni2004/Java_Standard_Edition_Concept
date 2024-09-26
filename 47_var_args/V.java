class V {
    //main method
    public static void main(String[] args) {
        try {

        } catch(Exception... x) {

        }
    }
}
/*OUTPUT: if/ else/ switch/ for/ catch ki parameter body m var_args allowed nhi h compilation fail ho jayega.
D:\javaprac\47_var_args>javac V.java
V.java:6: error: <identifier> expected
        } catch(Exception... x) {
                         ^
V.java:6: error: not a statement
        } catch(Exception... x) {
                             ^
V.java:6: error: ';' expected
        } catch(Exception... x) {
                              ^
V.java:10: error: reached end of file while parsing
}
 ^
4 errors
 */