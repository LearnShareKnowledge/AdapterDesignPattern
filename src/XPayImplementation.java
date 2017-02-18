/**
 * Created by 310124463 on 04/01/17.
 */
public class XPayImplementation implements XPay {
    private String creditCardNumber;
    private String name;
    private String expiryMonth;
    private String expiryYear;
    private short cvvNumber;
    private double amount;


    @Override
    public String getCreditCardNumber() {
        return creditCardNumber;
    }


    @Override
    public String getCustomerName() {
        return name;
    }

    @Override
    public String getCardExpiryMonth() {
        return expiryMonth;
    }

    @Override
    public String getCardExpiryYear() {
        return expiryYear;
    }

    @Override
    public short getCardCVVNumber() {
        return cvvNumber;
    }

    @Override
    public double getAmount() {

        return amount;
    }

    @Override
    public void setCreditCardNumber(String creditCardNumber) {

        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void setCustomerName(String name) {

        this.name = name;

    }

    @Override
    public void setCardExpiryMonth(String month) {

        this.expiryMonth = month;

    }

    @Override
    public void setCardExpiryYear(String year) {
        this.expiryYear = year;

    }

    @Override
    public void setCardCVVNumber(short cvvNumber) {
        this.cvvNumber = cvvNumber;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
