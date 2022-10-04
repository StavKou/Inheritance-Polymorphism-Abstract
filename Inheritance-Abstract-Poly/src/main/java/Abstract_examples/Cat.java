package Abstract_examples;

public class Cat extends Mammals implements Animal {

    @Override
    public String getName() {
        return "Cat";
    }

    @Override
    public String voice() {
        return "Miew!";
    }

    @Override
    public String poop() {
        return "Cat poop";
    }

}
