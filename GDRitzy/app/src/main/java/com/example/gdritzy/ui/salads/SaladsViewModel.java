package com.example.gdritzy.ui.salads;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SaladsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SaladsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is salads fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}