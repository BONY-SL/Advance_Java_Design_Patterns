package Practical.EX01;

public class CreditCardFactory {

    public CreditCard getCreditCard(String CardName){

        if(CardName==null){
            return null;
        } else if (CardName.equalsIgnoreCase("AmericanExpress")) {
            return new AmericanExpress();
        }else if(CardName.equalsIgnoreCase("Discover")){
            return new Discover();
        }else if(CardName.equalsIgnoreCase("MasterCard")){
            return new MasterCard();
        }else if(CardName.equalsIgnoreCase("Visa")){
            return new Visa();
        }else {
            return null;
        }
    }
}
