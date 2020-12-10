package com.example.gdritzy.ui.specialties;

//imports the necessary files to create the specialties fragment
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
import com.example.gdritzy.ui.home.WelcomeScreenViewModel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.gdritzy.R;
import com.example.gdritzy.ui.PriceAndListTotal;
import com.example.gdritzy.ui.home.WelcomeScreenViewModel;
import com.example.gdritzy.ui.salads.SaladsViewModel;
import com.example.gdritzy.ui.sandwiches.SandwichViewModel;

import static com.example.gdritzy.MainActivity.priceFile;

public class SpecialtiesFragment extends Fragment { //creates the sub class Specialties fragment that extends Fragment

    private SpecialtiesViewModel specialtiesViewModel;  //instanciates the view model

    //executes as soon as the tab is open
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //the variable for the view model
        specialtiesViewModel =
                ViewModelProviders.of(this).get(SpecialtiesViewModel.class);

        View root = inflater.inflate(R.layout.fragment_specialties, container, false);  //creates the root for all of the widgets to reside in

        Button button1 = (Button) root.findViewById(R.id.btn1); //the button for the pb&j
        button1.setOnClickListener(new View.OnClickListener() { //on click listener that detects when the pb&j button is pressed
            public void onClick(View v) {   //executes when the button is clicked
                priceFile.addToList("World Famous PB&J - 9.99\n");  //adds the pb&j to the order list
                priceFile.addToPrice(9.99);     //adds the price of the PB&J to the total cost of the order
            }
        });

        //The code for the shoestring fries ordering(almost the exact same as pb&j just with a different name and price)
        Button button2 = (Button) root.findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                priceFile.addToList("Shoe String Fries - 2.99\n");
                priceFile.addToPrice(2.99);
            }
        });

        //The code for the steamed vegtables ordering(almost the exact same as pb&j just with a different name and price)
        Button button3 = (Button) root.findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Steamed Vegtables - 2.99\n");
                priceFile.addToPrice(2.99);
            }
        });
        return root;
    }
}