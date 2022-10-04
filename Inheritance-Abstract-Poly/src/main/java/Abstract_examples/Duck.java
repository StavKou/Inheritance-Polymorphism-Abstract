
package Abstract_examples;


public class Duck extends Mammals implements Animal{
    
    public boolean feathers = true;

    @Override
    public String getName() {
        return "Duck";
    }

    
    @Override
    public String voice() {
        return "Pa Pa Pa";
    }

    public boolean isFeathers() {
        return feathers;
    }

    @Override
    public String poop() {
        return "Duck poop";
    }

    
}
