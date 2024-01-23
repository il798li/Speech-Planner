class Main {
    public static void main(String[] args) {

        Event impromptu = new Event (0, 6);
        Event spar = new Event (0, 10, 2);
        Event extemp = new Event (30, 7);

        Lead meriel = new Lead ("Meriel", 60);
        Lead madelyne = new Lead ("Madelyne", 60);

        Speaker aditya = new Speaker ("Aditya", new Event [] {impromptu, extemp});
        Speaker nate   = new Speaker ("Nate",   new Event [] {impromptu, extemp});
    }
  }