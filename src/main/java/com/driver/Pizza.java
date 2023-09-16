package com.driver;

public class Pizza {

    private int price; //Total price

    private Boolean isVeg;

    private String bill; //it takes care of the total bill in the string format

    private int cheesePrice;

    private int toppingsPrice;

    private int paperBagPrice;

    private boolean isCheeseAdded; // to make sure not to call this fn again n again after we call this fn one time

    private boolean isToppingsAdded; // all these is to avoid duplicacy

    private boolean isPaperBagAdded;

    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){ //veg price is 300
            this.price = 300;
            this.toppingsPrice = 70;
        }
        else{ //non veg price is 400
            this.price = 400;
            this.toppingsPrice = 120;
        }

        this.cheesePrice = 80;
        this.paperBagPrice = 20;

        this.bill = "Base Price Of The Pizza: " +this.price +"\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){ //we want to make sure that this method is called only once
        // your code goes here
        if(!isCheeseAdded){//it means it is never been called
            price += cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            price += toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            price += paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isCheeseAdded){
                bill = bill + "Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingsAdded){
                bill = bill + "Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if(isPaperBagAdded){
                bill = bill + "Paperbag Added: "+this.paperBagPrice+"\n";
            }

            bill = bill + "Total Price: "+ price +"\n";

            isBillGenerated = true;
        }
        return this.bill;
    }
}
