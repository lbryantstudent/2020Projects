package com.example.gdritzy.ui.combos;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.gdritzy.R;

import static com.example.gdritzy.MainActivity.priceFile;

/*

    ```````````````````````
    THIS JAVA FILE IS FOR CREATING THE COMBO ITEMS.
    ```````````````````````
 */



public class ComboFragment extends Fragment {

    private ComboViewModel comboViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        comboViewModel =
                ViewModelProviders.of(this).get(ComboViewModel.class);

        View root = inflater.inflate(R.layout.fragment_combo, container, false);
        /*
        Button button1 = (Button) root.findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Garden Salad - 4.99\n");
                priceFile.addToPrice(4.99);
                Log.d("Salds frag","Garden Salad clicked!");
            }
        });
        */

        // Getting buttons from fragment_combo.xml, and declaring them as a variable. Going to set an onClickListener for each
        // so I can use priceFile.addToPrice / addToList and set each item what I want it to be.

        Button button1 = (Button) root.findViewById(R.id.button1);
        Button button2 = (Button) root.findViewById(R.id.button2);
        Button button3 = (Button) root.findViewById(R.id.button3);
        Button button4 = (Button) root.findViewById(R.id.button4);
        Button button5 = (Button) root.findViewById(R.id.button5);
        Button button6 = (Button) root.findViewById(R.id.button6);
        Button button7 = (Button) root.findViewById(R.id.button7);

        //Button 1 OnClickListener
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Combo 1 - 6.99\n"); // calling addToList function SEE PriceAndListTotal.java located in com.example.gdritzy.ui.
                priceFile.addToPrice(6.99); // calling addToPrice function SEE PriceAndListTotal.java located in com.example.gdritzy.ui.
                Log.d("ComboFragment","Combo 1 Clicked!"); // Also setting up logs to see if they are reporting well.
            }
        });

        //Button 2 OnClickListener
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Combo 2 - 6.99\n");
                priceFile.addToPrice(6.99);
                Log.d("ComboFragment","Combo 2 Clicked!");
            }
        });

        //Button 3 OnClickListener
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Combo 3 - 6.99\n");
                priceFile.addToPrice(6.99);
                Log.d("ComboFragment","Combo 3 Clicked!");
            }
        });

        //Button 4 OnClickListener
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Combo 4 - 6.99\n");
                priceFile.addToPrice(6.99);
                Log.d("ComboFragment","Combo 4 Clicked!");
            }
        });

        //Button 5 OnClickListener
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Ritz Combo Basket - 11.99\n");
                priceFile.addToPrice(11.99);
                Log.d("ComboFragment","Ritz combo clicked!");
            }
        });

        //Button 6 OnClickListener
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Cool Deal - 7.99\n");
                priceFile.addToPrice(7.99);
                Log.d("ComboFragment","Cool deal Clicked!");
            }
        });

        //Button 7 OnClickListener
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Itzy Ritzy - 3.99\n");
                priceFile.addToPrice(7.99);
                Log.d("ComboFragment","Itzy Ritzy clicked!");
            }
        });

        return root;
    }




}