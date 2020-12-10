package com.example.gdritzy.ui.checkout;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

import com.example.gdritzy.R;
import com.example.gdritzy.ui.PriceAndListTotal;
import com.example.gdritzy.ui.checkout.CheckoutScreenViewModel;

import static com.example.gdritzy.MainActivity.priceFile;

//creating a this file as a subclass of the class Fragment
public class CheckoutScreenFragment extends Fragment {

    private CheckoutScreenViewModel checkoutScreenViewModel;    //instanciating the View model

    //executes the lines below as soon as the checkout screen is loaded up
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Log.d("Checkout Fragment", "Checkout screen initialized");   //outputing that this function has began running
        //setting the view model equal to the current fragment
        checkoutScreenViewModel =
                ViewModelProviders.of(this).get(CheckoutScreenViewModel.class);
        View root = inflater.inflate(R.layout.fragment_checkout, container, false);
        TextView listlbl = (TextView) root.findViewById(R.id.listtxt);
        listlbl.setText(priceFile.getListItems());
        Log.d("array list", priceFile.getListItems());
        TextView pricetext = (TextView) root.findViewById(R.id.pricelbl);
        pricetext.setText(String.format("%.2f", priceFile.getTotalPrice()));

        //Using alertdialog to alert the user to refresh the page after clearing the order, so we can let them have feedback.
        //Declaring button and finding it as removebtn so we can use it.
        Button button1 = (Button) root.findViewById(R.id.removebtn);
        //Button 1 OnClickListener
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //https://stackoverflow.com/questions/2115758/how-do-i-display-an-alert-dialog-on-android
                new AlertDialog.Builder(getContext())
                        .setTitle("Delete Order")
                        .setMessage("Are you sure you want to delete your order? (You must refresh the page after clearing it!)")

                        // Specifying a listener allows you to take an action before dismissing the dialog.
                        // The dialog is automatically dismissed when a dialog button is clicked.
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Continue with delete operation
                                priceFile.removeTotalPrice(); // calling priceFile.removeTotalPrice to clear everything if remove order btn is pressed,
                                priceFile.removeOrder(); // also calling remove order so we can clear the arraylist. (See PriceAndListTotal.java for more)
                                Log.d("ComboFragment", "Combo 1 Clicked!"); // Also setting up logs to see if they are reporting well.
                            }
                        })

                        // A null listener allows the button to dismiss the dialog and take no further action.
                        .setNegativeButton(android.R.string.no, null)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();

            }
        });

        pricetext.setText(Double.toString(priceFile.getTotalPrice()));


        return root;
    }
}
