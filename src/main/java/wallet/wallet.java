package wallet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class wallet {
    private String color;
    private double weightInGrams;
    private String brand;
    private List<String> cards = new ArrayList<String>();
    private double money;

    public wallet(String color, double weightInGrams, String brand) {
        this.color = color;
        this.weightInGrams = weightInGrams;
        this.brand = brand;
        this.money = 0;
    }

    public void addMoney( double addedMoney ){
        money += addedMoney;
    }

    public boolean checkMoney( double compareMoney){
        if ( money >= compareMoney ){

            return true;
        };

        return false;
    }

    public void addCard( String cardName ){
        cards.add(cardName);
    }

    public void lost(){
        money = 0;
        cards.clear();
    }

}
