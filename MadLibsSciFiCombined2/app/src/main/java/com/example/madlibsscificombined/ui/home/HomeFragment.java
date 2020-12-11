package com.example.madlibsscificombined.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.madlibsscificombined.R;

public class HomeFragment extends Fragment {

    //    // defining a private shared variable with the other functions in this file.
    TextView mNounOne, mLocation, mVerbOne, mNounTwo, mNounRestar, mNounName, mPersonAge, mVerbTwo, mNounObj, mVerbThree, mNounWep, mNounBody, mAdjOne, mRelative, outText;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });


        // Defining the variables and getting them from the XML.

        mNounOne = (TextView) root.findViewById(R.id.txtNounOne);
        mLocation = (TextView) root.findViewById(R.id.txtLocation);
        mVerbOne = (TextView) root.findViewById(R.id.txtVerbOne);
        mNounTwo = (TextView) root.findViewById(R.id.txtNounTwo);
        mNounRestar = (TextView) root.findViewById(R.id.txtNounRestar);
        mNounName = (TextView) root.findViewById(R.id.txtNounName);
        mPersonAge = (TextView) root.findViewById(R.id.txtAge);
        mVerbTwo = (TextView) root.findViewById(R.id.txtVerbTwo);
        mNounObj = (TextView) root.findViewById(R.id.txtObject);
        mVerbThree = (TextView) root.findViewById(R.id.txtVerbThree);
        mNounWep = (TextView) root.findViewById(R.id.txtWep);
        mNounBody = (TextView) root.findViewById(R.id.txtBody);
        mAdjOne = (TextView) root.findViewById(R.id.txtAdjOne);
        mRelative = (TextView) root.findViewById(R.id.txtRelative);
        Button btnSubmit = (Button) root.findViewById(R.id.btnSubmit);
        outText = (TextView) root.findViewById(R.id.txtOutput);


        btnSubmit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Converting them to strings.
                String nounInputOne = mNounOne.getText().toString();
                String location = mLocation.getText().toString();
                String verbInputOne = mVerbOne.getText().toString();
                String nounInputTwo = mNounTwo.getText().toString();
                String restaurant = mNounRestar.getText().toString();
                String nounInputName = mNounName.getText().toString();
                String personAge = mPersonAge.getText().toString();
                String verbInputTwo = mVerbTwo.getText().toString();
                String nounInputObj = mNounObj.getText().toString();
                String verbInputThree = mVerbThree.getText().toString();
                String weapon = mNounWep.getText().toString();
                String bodyPart = mNounBody.getText().toString();
                String adjective = mAdjOne.getText().toString();
                String relative = mRelative.getText().toString();

                // EXAMPLE
                //String sister= mSister.getText().toString();


                //setting the final text
                outText.setText("");
                outText.append("A " + nounInputOne + " in " + location + " was arrested this morning after they " + verbInputOne + " a ");
                outText.append(nounInputTwo + " in front of " + restaurant + ". " + nounInputName + ", " + personAge + ", had a history of ");
                outText.append(verbInputTwo + ", but no one -- not even his " + nounInputObj + " -- ever imagined he'd ");
                outText.append(verbInputThree + " with a " + weapon + " stuck in his " + bodyPart + ". ");
                outText.append("'I always thought he was " + adjective + ", but I never thought they would do something like this. Even his " + relative + " was surprised.'");

            }
        });


        return root;
    }


}