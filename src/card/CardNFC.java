package card;

public abstract class CardNFC extends CardChip {

    private String nfc;

    public String getNfc(String nfc) {
        return nfc;
    };
    public abstract boolean checkNfc(String nfc);
    public String setNfc(String nfc){
        this.nfc = nfc;
        return this.nfc;
    };
}
