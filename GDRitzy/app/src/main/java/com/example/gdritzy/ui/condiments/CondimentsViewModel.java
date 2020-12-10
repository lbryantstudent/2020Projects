package com.example.gdritzy.ui.condiments;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CondimentsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CondimentsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is condiments fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}