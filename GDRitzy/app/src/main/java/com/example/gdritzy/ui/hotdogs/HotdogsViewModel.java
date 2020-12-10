package com.example.gdritzy.ui.hotdogs;

//imports the necessary files for the hotdogs view model
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HotdogsViewModel extends ViewModel {   //creates the HotdogsViewModel as a subclass of ViewModel

    private MutableLiveData<String> mText;

    public HotdogsViewModel() { //the constructor for the view model
        mText = new MutableLiveData<>();
        mText.setValue("This is hotdog fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}