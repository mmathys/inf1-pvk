public class Dog extends Animal implements Ownable, Sellable {
    @Override
    void makeNoise() {
        System.out.println("woof");
    }

    void chooseName(String name) {
        assert name.length() < 6 : "name is too long";
        super.name = name;
    }

    @Override
    public void sell() {
        // something..
    }

    @Override
    public void buy() {

    }
}
