package com.example.gdritzy.ui.specialties;

//imports the necessarry files to create the view model
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SpecialtiesViewModel extends ViewModel {   //creates the sub class SpecialtiesViewModel that extends the parent class ViewModel

    private MutableLiveData<String> mText;

    public SpecialtiesViewModel() { //The constructor for the view model
        mText = new MutableLiveData<>();
        mText.setValue("This is the specialties fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}