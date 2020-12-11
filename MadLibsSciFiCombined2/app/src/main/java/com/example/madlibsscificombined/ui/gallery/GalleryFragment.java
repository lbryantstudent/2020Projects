package com.example.madlibsscificombined.ui.gallery;

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

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private TextView mFirstName, mLastName, mCity, mSchool, mBrother, mSister, outText;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        //final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });


        mFirstName = (TextView) root.findViewById(R.id.txtFirstName);
        mLastName= (TextView) root.findViewById(R.id.txtLastName);
        mCity = (TextView) root.findViewById(R.id.txtCity);
        mSchool = (TextView) root.findViewById(R.id.txtSchool);
        mBrother = (TextView) root.findViewById(R.id.txtBrother);
        mSister = (TextView) root.findViewById(R.id.txtSister);
        Button btnSubmittal = (Button) root.findViewById(R.id.btnSubmit);
        outText = (TextView) root.findViewById(R.id.txtOutput);

        btnSubmittal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String first = mFirstName.getText().toString(); //getText just gets the info out of the TextView
                String last = mLastName.getText().toString();
                String city = mCity.getText().toString();
                String school = mSchool.getText().toString();
                String brother = mBrother.getText().toString();
                String sister= mSister.getText().toString();

                int rF = (int)(Math.random() * first.length());
                int rL = (int)(Math.random() * last.length());
                int rC = (int)(Math.random() * city.length());
                int rS = (int)(Math.random() * school.length());
                int rB = (int)(Math.random() * brother.length());
                int rSi = (int)(Math.random() * sister.length());


                String sciFiFirst = first.substring(0,rF) + last.substring(rL);
                String sciFiLast = city.substring(0,rC) + school.substring(rS);
                String sciFiHome = brother.substring(0,rB) + sister.substring(rSi);


                outText.setText("");
                outText.append("Hola " + sciFiFirst + " of " + sciFiHome + " son of " + sciFiLast);
                outText.append(" Welcome to the party!");
            }
        });



        return root;
    }


}