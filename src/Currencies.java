public enum Currencies {

    DOLLAR("dollar","USD", "840"){
        @Override
        public boolean checkAbbreviation(String abbreviation) {
            if(abbreviation !=null){
                setAbbreviation(abbreviation);
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
    },
    HRYVNIA ("hryvnia","UAH", "980") {
        @Override
        public boolean checkAbbreviation(String abbreviation) {
            if(abbreviation !=null){
                setAbbreviation(abbreviation);
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
    },
    RUBLES ("rubles","RUB", "643"){
        @Override
        public boolean checkAbbreviation(String abbreviation) {
            if(abbreviation !=null){
                setAbbreviation(abbreviation);
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
    };

    private  String currencyName;
    private String abbreviation;
    private String currencyCode;

    public String getCurrencyName(){
        return currencyName;
    }
    public String getAbbreviation(){
        return abbreviation;
    }
    public String getCurrencyCode(){
        return currencyCode;
    }

    public String setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
        return this.currencyName;
    }

    public String  setAbbreviation(String abbreviation){
        this.abbreviation = abbreviation;
        return this.abbreviation;

    }

    public String setCurrencyCode(String currencyCode){
        this.currencyCode = currencyCode;
        return this.currencyCode;
    }


    Currencies(String currencyName, String abbreviation, String currencyCode) {
        this.currencyName = currencyName;
        this.abbreviation = abbreviation;
        this.currencyCode = currencyCode;


    }
    public abstract boolean checkAbbreviation(String abbreviation);
    public abstract boolean checkCurrencyCode(String currencyCode);

}
