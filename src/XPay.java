/**
 * Created by 310124463 on 04/01/17.
 */
public interface XPay {

    public String getCreditCardNumber();

    public String getCustomerName();

    public String getCardExpiryMonth();

    public String getCardExpiryYear();

    public short getCardCVVNumber();

    public double getAmount();

    public void setCreditCardNumber(String creditCardNumber);

    public void setCustomerName(String name);

    public void setCardExpiryMonth(String month);

    public void setCardExpiryYear(String year);

    public void setCardCVVNumber(short cvvNumber);

    public void setAmount (double amount);

}
