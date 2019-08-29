package card;

public abstract class CardChip extends CardMagnet {
    private String chip;

    public String getChip(String chip){return chip;};
    public abstract boolean checkChip(String chip);
    public  String setChip(String chip){
        this.chip = chip;
        return this.chip;
    }

}
