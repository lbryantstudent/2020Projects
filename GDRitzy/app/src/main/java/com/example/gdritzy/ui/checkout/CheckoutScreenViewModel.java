package com.example.gdritzy.ui.checkout;

//importing the necessary widgets to create a view model
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

//creating a checkout screen view model sub class that extends the ViewModel higher class
public class CheckoutScreenViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CheckoutScreenViewModel() {  //constructor for the checkout screen view model
        mText = new MutableLiveData<>();
        mText.setValue("This is checkout fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}