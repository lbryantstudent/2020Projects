package com.example.gdritzy.ui.sandwiches;

//imports the necessary files for the sandwich fragment
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

import static com.example.gdritzy.MainActivity.priceFile;

public class SandwichesFragment extends Fragment {  //creates the sub class Sandwiches fragment that extends Fragment the parent class

    private SandwichViewModel sandwichViewModel;    //instanciates the view model inside the fragment

    //executes as soon as this page is opened
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //creates the variable for the view model
        sandwichViewModel =
                ViewModelProviders.of(this).get(SandwichViewModel.class);

        //creates the root in which all of the widgets will reside
        View root = inflater.inflate(R.layout.fragment_sandwiches, container, false);

        //creates the Cheese Burger button widget
        Button button1 = (Button) root.findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() { //creates an on click listener for the cheese burger button
            public void onClick(View v) {   //executes when the order button is clicked
                priceFile.addToList("Cheese Burger - 4.99\n");  //adds a cheese burger and its price to the total item list
                priceFile.addToPrice(4.99); //adds 4.99 to the total price
            }
        });

        //works the same as button one only with a different name and price
        Button button2 = (Button) root.findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Double Ritz - 5.99\n");
                priceFile.addToPrice(5.99);
            }
        });

        //works the same as button one only with a different name and price
        Button button3 = (Button) root.findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Fish Sandwich - 4.99\n");
                priceFile.addToPrice(4.99);
            }
        });

        //works the same as button one only with a different name and price
        Button button4 = (Button) root.findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Chicken Sandwich - 5.99\n");
                priceFile.addToPrice(5.99);
            }
        });

        //works the same as button one only with a different name and price
        Button button5 = (Button) root.findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Peanut Butter and Jelly - 4.99\n");
                priceFile.addToPrice(4.99);
            }
        });

        return root;
    }




}