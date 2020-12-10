package com.example.gdritzy.ui;

//This class is used so it can be shared globally with each fragment, as we need to append everything to a global arraylist.
// Import essential things needed.
// Log is for giving a specific printout to the log in Android Studio whenever something is ran. We can also define the tag so we know where it is.
// ArrayList is for storing, modfiying, deleting things out of the list.

import android.util.Log;
import java.util.ArrayList;

//Defining the class

import android.util.Log;

import java.util.ArrayList;

public class
PriceAndListTotal {

    //Making vars. double totalPrice so we can enter prices like 5.99,
    // defining ArrayList<String> itemsList, so we can append strings to it.
    double totalPrice;
    ArrayList<String> itemsList = new ArrayList<>();

    // Making a public void addToPrice(Double price) so we can push information to this function, then append it to the list. Only one argument.
    public void addToPrice(Double price) {
        totalPrice += price;
        Log.d("price", String.valueOf(totalPrice));
    }

    // Same concept for addToPrice, just a string this time.
    public void addToList(String listItem) {
        itemsList.add(listItem);
        Log.d("items", getListItems());

    }

    // public void for removing orders. We just clear() the ArrayList that is built in with Java.
    public void removeOrder() {
        itemsList.clear();
    }

    public void removeTotalPrice() {
        totalPrice = 0.00;
    }

    // getListItems iterates through the list and appends everything to a single string by using an advanced for loop.
    // we then add to the string the index of the ArrayList, then add \t to it so we can tab over.
    // Finally, we return the final string. This is used in the checkout.
    public String getListItems() {
            String listString ="";
            for (String i:itemsList) {
                listString += i + "\t";
            }
            Log.d("cashmoney",listString);
        return listString;
    }

    //Returning the double totalPrice, very simple function.
    public double getTotalPrice() {
        return totalPrice;
    }


}
