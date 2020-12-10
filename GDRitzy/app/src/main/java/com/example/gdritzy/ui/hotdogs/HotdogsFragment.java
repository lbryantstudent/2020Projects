package com.example.gdritzy.ui.hotdogs;

//imports the necessary files for the hotdog fragment
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
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

public class HotdogsFragment extends Fragment { //creates the hotdogs fragment as a sub class of fragment

    private HotdogsViewModel hotdogsViewModel;  //instantiates the view model

    //executes as soon as the screen is loaded up
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //creates the variable for the view model
        hotdogsViewModel =
                ViewModelProviders.of(this).get(HotdogsViewModel.class);

        //establishes the root for the fragment
        View root = inflater.inflate(R.layout.fragment_hotdog, container, false);

        Button button1 = (Button) root.findViewById(R.id.btn1); //creates the first button to order a plain hot dog
        button1.setOnClickListener(new View.OnClickListener() { //creates the on click listener
            //executes whenever the button is clicked
            public void onClick(View v) {
                priceFile.addToList("Hotdog - 2.99\n"); //adds the item to the list
                priceFile.addToPrice(2.99); //adds to the total price
            }
        });

        //creates a second button the exact same as the first
        Button button2 = (Button) root.findViewById(R.id.btn2);
        CheckBox cheese = (CheckBox) root.findViewById(R.id.coneydogchkbx);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //this if statement is different from the first button because it is checking if the user checked the
                //cheese box or not and charges them accordingly, but the rest of the button works the same way
                if (cheese.isChecked()){
                    priceFile.addToList("Coney Dog (Cheese) - 7.99\n");
                    priceFile.addToPrice(7.99);
                }
                else{
                    priceFile.addToList("Coney Dog - 6.99\n");
                    priceFile.addToPrice(6.99);
                }
            }
        });

        return root;
    }




}