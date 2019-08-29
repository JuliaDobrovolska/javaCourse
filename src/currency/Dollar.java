package currency;

public class Dollar extends CurrencyPrivatBank{

    //конструктор с полями
    public Dollar(String abbreviation){
        checkAbbreviation(abbreviation);
    }
}
