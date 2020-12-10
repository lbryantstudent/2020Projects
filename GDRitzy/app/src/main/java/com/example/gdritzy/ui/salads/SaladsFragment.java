package com.example.gdritzy.ui.salads;


import android.os.Bundle;
import android.util.Log;
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

import com.example.gdritzy.MainActivity;
import com.example.gdritzy.R;
import com.example.gdritzy.ui.PriceAndListTotal;
import com.example.gdritzy.ui.home.WelcomeScreenViewModel;

import static com.example.gdritzy.MainActivity.priceFile;

public class SaladsFragment extends Fragment {

    private SaladsViewModel saladsViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        saladsViewModel =
                ViewModelProviders.of(this).get(SaladsViewModel.class);

        View root = inflater.inflate(R.layout.fragment_salads, container, false);

        // Getting buttons from fragment_salads.xml, and declaring them as a variable. Going to set an onClickListener for each
        // so I can use priceFile.addToPrice / addToList and set each item what I want it to be.

        Button button1 = (Button) root.findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Garden Salad - 4.99\n");  // calling addToList function SEE PriceAndListTotal.java located in com.example.gdritzy.ui.
                priceFile.addToPrice(4.99); // calling addToPrice function SEE PriceAndListTotal.java located in com.example.gdritzy.ui.
                Log.d("Salds frag","Garden Salad clicked!"); // Also setting up logs to see if they are reporting well.
            }
        });

        //button2 onclicklistener
        Button button2 = (Button) root.findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Deluxe Salad - 5.99\n");
                priceFile.addToPrice(5.99);
                Log.d("Salds frag","Deluxe Salad clicked!");
            }
        });

        //button3 onclicklistener
        Button button3 = (Button) root.findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Side Salad - 2.99\n");
                priceFile.addToPrice(2.99);
                Log.d("Salds frag","Side Salad clicked!");
            }
        });

        //button 4 onclicklistener
        Button button4 = (Button) root.findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Taco Salad - 5.99\n");
                priceFile.addToPrice(5.99);
                Log.d("Salds frag","Taco Salad clicked!");
            }
        });

        Button button5 = (Button) root.findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Chicken Salad - 6.99\n");
                priceFile.addToPrice(6.99);
                Log.d("Salds frag","Chicken Salad clicked!");
            }
        });

        return root;
    }




}