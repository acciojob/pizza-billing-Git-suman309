package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping;
    boolean isExtraCheeseAdded;
    boolean isExtraToopingAdded;
    boolean isBillCreated;
    boolean isTakeAway;


    public Pizza(Boolean isVeg){ //this will be called in deluxpizza super(isVeg;
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){ //for veg
            this.price = 300;
            this.topping =70;
        }
        else{ //non
            this.price =400;
            this.topping = 120;
        }
        //option just a good pratice to initilize
        this.isExtraCheeseAdded = false;
        this.isExtraToopingAdded =false;
        this.isBillCreated = false;
        this.isTakeAway = false;
        //bill
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        //this.price +=80; //wrong way if user invoke it multipal tym then it will add muulti
        if(!isExtraCheeseAdded){ //means extra chees not added then only it will run
            this.price += 80;
            this.isExtraCheeseAdded = true;

        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToopingAdded){
            this.price += this.topping ; //it ll work coz allready ini in const so it know which topping we r talking aboput
            isExtraToopingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price +=20;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        //only do it if bill not created
        if(!isBillCreated) {
            if (isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (isExtraToopingAdded) {
                this.bill += "Extra Toppings Added: " +this.topping + "\n";
            }
            if (isTakeAway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill = "Total Price: " + this.price+"\n";
            this.isBillCreated =true;
            return this.bill;
        }
       return "";
    }
}
