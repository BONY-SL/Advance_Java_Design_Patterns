package Practical.EX01;

public class MasterCardValidate extends ValidateStrategy{
    @Override
    public void isValidate(String cardNumber, String xpdate, String holderName) {

        if(cardNumber.startsWith("5") && cardNumber.length() == 16 && cardNumber.charAt(1) >= '1' && cardNumber.charAt(1) <= '5'){
            System.out.println("Validated Master Card Details");
            System.out.println("Number :"+cardNumber);
            System.out.println("Expire Date :"+xpdate);
            System.out.println("Holder Name :"+holderName);
            System.out.println("Completed Payment");
        }else {
            System.out.println("Card is not Validate");
            System.out.println("Not Completed Payment");
        }
    }

}
