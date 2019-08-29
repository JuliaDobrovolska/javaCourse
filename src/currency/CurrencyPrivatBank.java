package currency;

public class CurrencyPrivatBank extends Currency{
    @Override
    public boolean checkAbbreviation(String abbreviation) {
        if(abbreviation !=null){
            setAbbreviation(abbreviation);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkCurrencyName(String currencyName) {
        if(currencyName !=null){
            setCurrencyName(currencyName);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkCurrencyCode(String currencyCode) {
        String regex = "\\d+";
        if(currencyCode !=null && currencyCode.matches(regex)){
            setCurrencyCode(currencyCode);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkDenomination(Integer denomination) {
        if(denomination != null && denomination > 0){
            setDenomination(denomination);
            return true;
        }
        return false;
    }
}
