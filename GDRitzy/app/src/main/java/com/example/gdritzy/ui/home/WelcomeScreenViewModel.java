package com.example.gdritzy.ui.home;

//imports the necessary file to create the view model
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WelcomeScreenViewModel extends ViewModel { //creates the WelcomeScreenViewModel as a sub class of ViewModel

    private MutableLiveData<String> mText;

    public WelcomeScreenViewModel() {   //constructor for the view model
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}