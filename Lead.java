public class Lead {
    public String name; // name of the lead
    public int minutes; // how many minutes will they be free?
    public boolean free; // are they currently available to clear?
    public int eta;
    
    private void initialize (String name, int minutes) {
        this.name = name;
        this.minutes = minutes;
        this.free = true;
    }

    public Lead (String name, int minutes) {
        this.initialize (name, minutes);
    }

    public Lead (String name) {
        this.initialize (name, 60);
    }

    public Lead (int minutes) {
        this.initialize ("Unknown", minutes);
    }

    public Lead () {
        this.initialize ("Unknown", 60);
    }
}