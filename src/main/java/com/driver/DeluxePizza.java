package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg); //call const of parent  useing super keyword
        // your code goes here
        //it come with extra chees & topping so just call it
        addExtraCheese();
        addExtraToppings();

    }
}
