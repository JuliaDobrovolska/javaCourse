public class ATM {
    private Cassette[] cassette;

    public ATM(Cassette[] cassette) {
        this.cassette = cassette;

    }

    public Cassette[] getCassette() {
        return cassette;
    }

    public void setCassette(Cassette[] cassette) {
        this.cassette = cassette;
    }
}
