/**
 * Created by 310124463 on 04/01/17.
 */
public interface YPay {

    public String getCustCardNo();

    public String getCardOwnerName();

    public String getCardExpMonthDate();

    public Integer getCVVNo();

    public Double getTotalAmount();

    public void setCustCardNo(String custCardNo);

    public void setCardOwnerName(String cardOwnerName);

    public void setCardExpMonthDate(String cardExpMonthDate);

    public void setCVVNo(Integer cVVNo);

    public void setTotalAmount(Double totalAmount);
}
