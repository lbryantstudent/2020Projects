package com.example.gdritzy.ui.combos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ComboViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ComboViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is combo fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}