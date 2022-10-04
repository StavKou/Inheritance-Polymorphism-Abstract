
package Musical_Instruments;


public class Instrument {
    
    protected String name;
    protected String madeof;
    protected int yearofmade;

    public Instrument() {
    }

    public Instrument(String name, String madeof, int yearofmade) {
        this.name = name;
        this.madeof = madeof;
        this.yearofmade = yearofmade;
    }

    public String getName() {
        return name;
    }

    public String getMadeof() {
        return madeof;
    }

    public int getYearofmade() {
        return yearofmade;
    }
    
    
    
    public String sound() {
    
        return "Instrument sound";
    }
    
    public String numberOfInstruments() {
    
        return "Number of Instruments";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMadeof(String madeof) {
        this.madeof = madeof;
    }

    public void setYearofmade(int yearofmade) {
        this.yearofmade = yearofmade;
    }
}
