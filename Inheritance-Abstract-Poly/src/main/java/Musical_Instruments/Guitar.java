package Musical_Instruments;

public class Guitar extends Instrument {

    protected boolean isit;

    // Default Constructor //
    public Guitar() {
    }


//    public Guitar(String name, String madeof, int yearofmade, boolean isit) {
//        this.name = name;
//        this.madeof = madeof;
//        this.yearofmade = yearofmade;
//        this.isit = isit;
//    }

    public Guitar(boolean isit, String name, String madeof, int yearofmade) {
        super(name, madeof, yearofmade);
        this.isit = isit;
    }

    
    
    
    
    @Override
    public String sound() {
        return "Guitar sound";
    }

    @Override
    public String numberOfInstruments() {
        return "Number of Guitars: ";
    }

    // itIsString method //
    public boolean isItString(boolean isit) {

//        int counter = 0;
        if (isit == true) {
//            counter += counter;
            return true;

        } else {

            return false;
        }
    }

    public int a;
    public int b;
    public int c;
    
    public void add(int x, int y) {
    
        a = x;
        b = y;
        
        System.out.println(x + y);
    }
    
    public void add(int x, int y, int z) {
    
        a = x;
        b = y;
        c = z;
        
        System.out.println(x + y + z);
    }
}

// Electric Guitar //
class ElectricGuitar extends Guitar {

    @Override
    public String sound() {
        return "Electric Guitar sound!";
    }

    @Override
    public boolean isItString(boolean isit) {
        return super.isItString(isit);
    }

    @Override
    public String numberOfInstruments() {
        return super.numberOfInstruments();
    } 
    
}

// Acoustic Guitar //
class AcousticGuitar extends Guitar{
    
    @Override
    public String sound() {
        return "Sound like Acoustic Guitar.";
    }
      
    
    @Override
    public boolean isItString(boolean isit) {
        return super.isItString(isit);
    }

    
    
    public void sum(int x, int y) {
    
        add(x, y);
    }
    
    public void sum(int x, int y, int z) {
    
        add(x, y + z);
    }
}