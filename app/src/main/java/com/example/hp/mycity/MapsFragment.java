package com.example.hp.mycity;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.model.ButtCap;

public class MapsFragment extends Fragment {

        Button b;
        Context context; //Declare the variable context
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {


        //Pass your layout xml to the inflater and assign it to rootView.
        View rootView = inflater.inflate(R.layout.fragment_maps, container, false);
        context = rootView.getContext(); // Assign your rootView to context


        Button b = (Button) rootView.findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        //Pass the context and the Activity class you need to open from the Fragment Class, to the Intent
        Intent intent = new Intent(context, MapsActivity.class);
        startActivity(intent);
        }
        });
        return rootView;
        }
        }






