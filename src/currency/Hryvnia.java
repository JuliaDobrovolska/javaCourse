package currency;

public class Hryvnia extends CurrencyPrivatBank {

    public Hryvnia(String abbreviation){
        checkAbbreviation(abbreviation);
    }
}
