package com.example.gdritzy.ui.icecream;

//imports the necessary file to create the view model
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IceCreamViewModel extends ViewModel { //creates the WelcomeScreenViewModel as a sub class of ViewModel

    private MutableLiveData<String> mText;

    public IceCreamViewModel() {   //constructor for the view model
        mText = new MutableLiveData<>();
        mText.setValue("This is icecream fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}