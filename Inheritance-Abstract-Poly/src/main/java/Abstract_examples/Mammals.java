package Abstract_examples;

public abstract class Mammals implements Animal {

    public final int brain = 1;
    public final int heart = 1;
    public String name = "Name:";
    
    public String getExplanation() {
        return explanation;
    }

    // Δεν μπορεί να γίνει override απο τις subclasses αλλα μπορούν να την καλέσουν ατόφια μιας και γινεται extend //
    public final int getBrain() {
        return brain;
    }

    // Δεν μπορεί να γίνει override απο τις subclasses αλλα μπορούν να την καλέσουν ατόφια μιας και γινεται extend //
    public final int getHeart() {
        return heart;
    }

    public String getName() {
        return name;
    }

    
    @Override
    public String voice() {
        return "Animal voice";
    }

    public abstract String poop();
    
}
