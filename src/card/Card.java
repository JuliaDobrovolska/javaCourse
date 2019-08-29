package card;

import java.text.ParseException;

public abstract class Card {

    private String cardNumber;
    private String pinCode;
    private String expDate;
    private String cvv;

    public  String setExpDate(String expDate){
        this.expDate= expDate;
        return this.expDate;
    };

    public String setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this.cardNumber;
    }

    public String setPinCode(String pinCode) {
        this.pinCode = pinCode;
        return this.pinCode;
    }

    public String setCvv(String cvv) {
        this.cvv = cvv;
        return this.cvv;
    }

    public String getPinCode() { return pinCode; }

    public String getCardNumber() { return cardNumber; }

    public String getCvv() { return cvv; }

    public String getExpDate() { return expDate; }

    public abstract boolean checkCardNumber(String cardNumber);
    public abstract boolean checkPinCode(String pinCode);
    public abstract boolean checkExpDate(String expDate) throws ParseException;
    public abstract boolean checkCvv(String cvv);

}
