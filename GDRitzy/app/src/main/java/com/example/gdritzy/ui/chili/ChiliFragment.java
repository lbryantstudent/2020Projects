package com.example.gdritzy.ui.chili;

//imports the necessary items to create the chili fragment
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
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

//Creates the ChiliFragment as a subclass of the Fragment class
public class ChiliFragment extends Fragment {

    private ChiliViewModel chiliViewModel;  //instanciates the ChiliViewModel

    //runs as soon as a user switches to the page and the view is created
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //creates the variable for the Chili View Model
        chiliViewModel =
                ViewModelProviders.of(this).get(ChiliViewModel.class);

        View root = inflater.inflate(R.layout.fragment_chili, container, false);    //creates the root so that we can use widgets within this fragment



        Button button1 = (Button) root.findViewById(R.id.btn1); //creates the first button to finish the order for chili
        NumberPicker chiliType = (NumberPicker) root.findViewById(R.id.chiliNumberPicker);  //creates the number picker that is used to select how many items go into their chili.

        //creates an array that is 4 items in size
        chiliType.setMaxValue(3);   //sets the max value of the picker to 3
        chiliType.setMinValue(0);   //sets the min value of the picker to 0

        //sets the number picker with the 3,4,5, and 7 to symbolize the different number of items in the chili
        chiliType.setDisplayedValues(new String[]{"3","4","5","7"});

        //creates the on click listener for the order button
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //adds the chili to the list with whatever number that was in the picker being the type of chili they get
                priceFile.addToList("Chili-"+chiliType.getValue()+" way - 4.99\n");
                //adds the final price of the chili to the total order price
                priceFile.addToPrice(4.99);
            }
        });

        return root;    //returns the root to display on the screen
    }
}
