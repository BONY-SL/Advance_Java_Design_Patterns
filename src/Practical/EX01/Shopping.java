package Practical.EX01;

public class Shopping {

    private ValidateStrategy validateStrategy=null;


    public void isValidate(CreditCard creditCard,String cardNumber,String xpdate,String holderName){

        if(creditCard instanceof MasterCard){

            this.validateStrategy=new MasterCardValidate();
            validateStrategy.isValidate(cardNumber,xpdate,holderName);
        }

    }
}
