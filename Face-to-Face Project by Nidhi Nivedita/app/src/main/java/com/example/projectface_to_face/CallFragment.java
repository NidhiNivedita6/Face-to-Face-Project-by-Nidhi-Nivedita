package com.example.projectface_to_face;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.projectface_to_face.Activity.DashboardActivity;


public class CallFragment extends Fragment {

    Activity context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        context = getActivity();

        // Inflate the layout for this fragment
         View root = inflater.inflate(R.layout.fragment_call, container, false);
         return root;
    }

        public void onStart(){
        super.onStart();
            Button btn = (Button) context.findViewById(R.id.ChatButton);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DashboardActivity.class);
                    startActivity(intent);
                }
            });
        }

}
