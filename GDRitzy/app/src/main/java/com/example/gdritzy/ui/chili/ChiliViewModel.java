package com.example.gdritzy.ui.chili;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChiliViewModel extends ViewModel { //creates ChiliViewModel as a sub class of ViewModel

    private MutableLiveData<String> mText;

    public ChiliViewModel() {   //the constructor for the ChiliViewModel
        mText = new MutableLiveData<>();
        mText.setValue("This is chili fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}