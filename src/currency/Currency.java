package currency;

public abstract class Currency {

    private String currencyName;
    private String abbreviation;
    private String currencyCode;
    private Integer denomination;

    public void setCurrencyName(String currencyName){
        if(currencyName != null && currencyName instanceof String == true) {
            this.currencyName = currencyName;
        }else {
            System.out.println("Incorrect currency name. Please, enter another!");
        }
    }
    public String getCurrencyName(){
        return currencyName;
    }

    public String  setAbbreviation(String abbreviation){
        this.abbreviation = abbreviation;
        return this.abbreviation;
    }
    public String getAbbreviation(){
        return abbreviation;
    }

    public String setCurrencyCode(String currencyCode){
        this.currencyCode = currencyCode;
        return this.currencyCode;
    }
    public String getCurrencyCode(){
        return currencyCode;
    }

    public int setDenomination(int denomination){
        this.denomination = denomination;
        return this.denomination;
    }
    public int getDenomination(){
        return denomination;
    }

    public abstract boolean checkAbbreviation(String abbreviation);
    public abstract boolean checkCurrencyName(String currencyName);
    public abstract boolean checkCurrencyCode(String currencyCode);
    public abstract boolean checkDenomination(Integer denomination);
}
