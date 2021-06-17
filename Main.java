public class Main {
    public static void main(String args[]) {
        /* static Beispiel
        Foo.method1();
        Foo.method2(); // geht nicht

        Foo bar = new Foo(1);
        bar.method2(); // geht!

        bar.method1(); // geht auch, ist aber unclean
        */

        /* OO Beispiel */

        Dog dog = new Dog();

        dog.makeNoise();
        dog.buy();
        dog.sell();
        dog.live();
        dog.live();

        Human human = new Human();
        human.live();
        //human.buy(); // does not work

        Hat hat = new Hat();

        Ownable[] array = {dog, hat};

        for(Ownable o : array) {
            o.buy(); // nice
        }

        for(int i = 0; i < array.length; i++) {
            array[i].buy();
        }
    }
}
