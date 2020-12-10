package com.example.gdritzy.ui.icecream;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.gdritzy.R;

public class IceCreamFragment extends Fragment {   //creates the Welcome screen as a subclass of fragment

    private IceCreamViewModel iceCreamViewModel;   //instantiates the homeViewModel

    //executes as soon as the view is loaded up (The beginning of the app since this is the landing fragment)
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //creates the variable for the homeViewModel
        iceCreamViewModel =
                new ViewModelProvider(this).get(IceCreamViewModel.class);
        View root = inflater.inflate(R.layout.fragment_icecream, container, false);   //creates a root for all of the widgets and images to reside in
        return root;    //returns the root back to the screen to display
    }
}