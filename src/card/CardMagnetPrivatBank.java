package card;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CardMagnetPrivatBank extends CardMagnet {
    String regexNumber = "\\d+";

    @Override
    public boolean checkMagnetLine(String magnetLine) {
        if(magnetLine != null){
            setMagnetLine(magnetLine);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkCardNumber(String cardNumber) {
        if(cardNumber.length() == 14 && cardNumber.matches(regexNumber)){
            setCardNumber(cardNumber);
            return true;
        }
        return false;

    }

    @Override
    public boolean checkPinCode(String pinCode) {
        if(pinCode.length() == 4 && pinCode.matches(regexNumber)){
            setPinCode(pinCode);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkExpDate(String expDate) throws ParseException {
        String regex="\\d{2}\\/\\d{2}";   //проверка входящей строки в виде "чч/чч"
        if(expDate.trim().length() == 5 && expDate.matches(regex)){
            String[] cardDate = expDate.split("/");
            if(Integer.parseInt(cardDate[0]) <= 12){
                Date date = new SimpleDateFormat("MM/yy").parse(expDate); //преобразование входящей строки в дату
                Date currentDate = new Date();
                if (date.after(currentDate)){
                    setExpDate(expDate);
                    return true;
                }
            }

        }
        return false;
    }

    @Override
    public boolean checkCvv(String cvv) {
        if(cvv != null && cvv.length() == 3 && cvv.matches(regexNumber)){
            setCvv(cvv);
            return true;
        }
        return false;
    }
}
