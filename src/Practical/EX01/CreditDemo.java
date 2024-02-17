package Practical.EX01;

public class CreditDemo {
    public static void main(String[] args) {


            CreditCardFactory select=new CreditCardFactory();
            CreditCard c=select.getCreditCard("MasterCard");
            c.select();

            Shopping sh=new Shopping();
            sh.isValidate(c,"5111111111111111","12/28","Dilshan");



    }
}
