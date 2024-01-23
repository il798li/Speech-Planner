public class Event {
    public int preparation;
    public int speech;
    public int speakers;

    public void initialize (int preparation, int speech, int speakers) {
        this.preparation = preparation;
        this.speech = speech;
        this.speakers = speakers;
    }

    public Event (int preparation, int speech, int speakers) {
        this.initialize (preparation, speech, speakers);
    }

    public Event (int preparation, int speech) {
        this.initialize( preparation, speech, 1);
    }
}