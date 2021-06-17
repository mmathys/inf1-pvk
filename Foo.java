class Foo {
    int i;

    public Foo(int i) {
        this.i = i;
    }

    // statisch
    public static String method1() {
        return "An example string that doesn't depend on i (an instance variable)";
    }

    // nicht statisch
    public int method2() {
        return this.i + 1; // Depends on i
    }
}