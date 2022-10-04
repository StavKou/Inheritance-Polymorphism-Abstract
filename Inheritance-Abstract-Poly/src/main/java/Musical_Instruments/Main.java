package Musical_Instruments;

// Movie //

import Abstract_examples.Animal;
import Abstract_examples.Cat;
import Abstract_examples.Duck;
import Abstract_examples.Mammals;
import Musical_Instruments.Guitar;
import Musical_Instruments.Harp;
import Musical_Instruments.Instrument;
import Musical_Instruments.Piano;

class Movie {

    private String name;

    public Movie() {
    }

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {

        return "No plot!";
    }

    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

// NorthMan //
class Northman extends Movie {

    public Northman() {
        super("NorthMan!");
    }

    @Override
    public String plot() {
        return "Northman Movie";

    }
}
// StarWars //

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars!");
    }

}

// Main //
public class Main {

    public static void main(String[] args) {

//        st.setName("John");
//        st.setAge(15);
//        Student st = new Student("Kostas", 14);
//        System.out.println("His name is: " + st.getName() + " and his age is: " + st.getAge());
//            Trainer tr = new Trainer();
//            Student st = new Student();
//            People pl = new People();
//            
//            tr.Language();
//            pl.Language();
//            st.Language();
//            Movie m = new Northman();
//            System.out.println(m.plot());
//            Movie sw = new StarWars();
//            System.out.println(sw.plot());
//            System.out.println();
//            Movie movie = new Movie();
//            System.out.println(movie.getName());
//            System.out.println(m.getName());
//            System.out.println(sw.getName());

                // Musical_Instruments //
                Instrument instr = new Instrument();
                Guitar g = new Guitar(true,"Guitar","wood",1779);
                Guitar harp = new Harp();
                Instrument piano = new Piano();
                System.out.println(instr.getName());
                instr.setName("Instrument");
                instr.setYearofmade(1966);
                instr.setMadeof("wood / plastic etc.... ");
                instr.setName("Default instrument!");
                System.out.println("Instrument: " + instr.getName() + ", " + "year of made: " + instr.getYearofmade() + ", " + "made from: " + instr.getMadeof() + 
                      ", " + "and sounds like: " + instr.sound() + "!!");
                
                g.setName("Guitar");
                g.setMadeof("Wood");
                g.setYearofmade(1799);
                
                System.out.println("Instrument " + g.getName() + ", " + "made from: " + g.getMadeof() + ", " + "in year: " + g.getYearofmade() +  ", " + "is it a String instrument? " + 
                       g.isItString(true) + ", " + "and sounds like: " + g.sound());
                
                
                harp.setName("Harp");
                harp.setMadeof("metal");
                harp.setYearofmade(1777);
                System.out.println("Instrument " + harp.getName() + ", " + "made from: " + harp.getMadeof() + ", " + "in year: " + harp.getYearofmade() +
                      ", " + "is it a String instrument? " + harp.isItString(true) + ", " + "and sounds like: " + harp.sound() + "!");
                
                piano.setName("Piano");
                piano.setYearofmade(1664);
                piano.setMadeof("Wood / plastic and more....");
                System.out.println("Piano is a: " + piano.getName() + ", " + "year of made: " + piano.getYearofmade() + ", " + "made by: " + piano.getMadeof() + 
                      ", " + "and sound like: " + piano.sound() + "!");
                
                
                ElectricGuitar eg = new ElectricGuitar();
                
                System.out.println(eg.getName()); // null
                
                AcousticGuitar ag = new AcousticGuitar();
                Guitar ag2 = new AcousticGuitar();
                ag.setName("another type of guitar");
                ag2.setName("Second Acoustic Guitar and ");
                
                System.out.println("Acoustic Guitar is: " + ag.getName() + ", " + "and it has: ");
                ag.sum(3, 3);
                
                
                System.out.println("Acoustic Guitar is: " + ag2.getName() + "it has also ");
                ag2.add(2, 2, 2);
                System.out.println("strings.");
                
                // Abstract_examples //
                Mammals c = new Cat();
                
                System.out.println(c.getExplanation() + c.getName() + " sometimes " + c.poop() + " and others making noises like: " + c.voice()
                + " also it has " + c.getBrain() + " brain and " + c.getHeart() + " heart");
                
                
                Duck duck = new Duck();
                System.out.println(duck.getExplanation() + duck.getName() + " sometimes" + duck.poop() + " and others making noises like: " + duck.voice()
                       + "!" + " Also it has " + duck.getBrain() + " brain and " + duck.getHeart() + " heart" 
                        + ". " + "But, does it has feathers? " + duck.isFeathers());
                
                
    }

}
