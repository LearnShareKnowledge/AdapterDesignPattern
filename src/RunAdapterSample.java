/**
 * Created by 310124463 on 04/01/17.
 */
public class RunAdapterSample {

    public static void main(String [] args)
    {
        XPay xpay = new XPayImplementation();

        xpay.setAmount(2000.02);

        xpay.setCreditCardNumber("4001400240034004");

        xpay.setCardExpiryMonth("12");

        xpay.setCardExpiryYear("2018");

        xpay.setCustomerName("Zlatan");

        // pass this xpay object to the payment api from Xpay




        YPay yPay = new XPayToYPayAdapter(xpay);

        testOurAdapter(yPay);
    }

    private static void testOurAdapter(YPay yPay) {

        System.out.println(yPay.getCardExpMonthDate());

        System.out.println(yPay.getCustCardNo());

        System.out.println(yPay.getTotalAmount());
    }
}
