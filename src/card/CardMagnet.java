package card;

import card.Card;

public abstract class CardMagnet extends Card {
    private String magnetLine;


    public abstract boolean checkMagnetLine(String magnetLine);

    public  String setMagnetLine(String magnetLine){
        this.magnetLine = magnetLine;
        return this.magnetLine;
    };

    public String getMagnetLine() {
        return magnetLine;
    }
}
