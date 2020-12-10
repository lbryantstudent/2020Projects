package com.example.gdritzy.ui.condiments;


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
import com.example.gdritzy.ui.condiments.CondimentsViewModel;

import static com.example.gdritzy.MainActivity.priceFile;

public class CondimentsFragment extends Fragment {

    private CondimentsViewModel condimentsViewModel;


    //whenever we look at the screen, update this
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        condimentsViewModel =
                ViewModelProviders.of(this).get(CondimentsViewModel.class);

        View root = inflater.inflate(R.layout.fragment_condiments, container, false);

        // Getting buttons from fragment_condiments.xml, and declaring them as a variable. Going to set an onClickListener for each
        // so I can use priceFile.addToPrice / addToList and set each item what I want it to be.

        Button button1 = (Button) root.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Ketchup - 0.99\n"); // calling addToList function SEE PriceAndListTotal.java located in com.example.gdritzy.ui.
                priceFile.addToPrice(0.99); // calling addToPrice function SEE PriceAndListTotal.java located in com.example.gdritzy.ui.
                Log.d("CondimentsFragment","Ketchup clicked!"); // Also setting up logs to see if they are reporting well.
            }
        });

        //Button 2 onClickListener
        Button button2 = (Button) root.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Mustard - 0.99\n");
                priceFile.addToPrice(0.99);
                Log.d("CondimentsFragment","mustard clicked!");
            }
        });

        //Button 3 onClickListener
        Button button3 = (Button) root.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Mayonnaise - 0.99\n");
                priceFile.addToPrice(0.99);
                Log.d("CondimentsFragment","mayo clicked!");
            }
        });


        return root;
    }




}