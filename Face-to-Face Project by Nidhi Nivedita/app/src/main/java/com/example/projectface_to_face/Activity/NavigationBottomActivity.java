package com.example.projectface_to_face.Activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.projectface_to_face.AboutFragment;
import com.example.projectface_to_face.CallFragment;
import com.example.projectface_to_face.ChatFragment;
import com.example.projectface_to_face.R;
import com.example.projectface_to_face.databinding.ActivityNavigationBottomBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NavigationBottomActivity extends AppCompatActivity {

    ActivityNavigationBottomBinding binding;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityNavigationBottomBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentTransaction callTrans = getSupportFragmentManager().beginTransaction();
        callTrans.replace(R.id.content, new CallFragment());
        callTrans.commit();

        binding.bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.call:
                        FragmentTransaction callTrans = getSupportFragmentManager().beginTransaction();
                        callTrans.replace(R.id.content, new CallFragment());
                        callTrans.commit();
                        break;

                    case R.id.chat:
                        FragmentTransaction chatTrans = getSupportFragmentManager().beginTransaction();
                        chatTrans.replace(R.id.content, new ChatFragment());
                        chatTrans.commit();
                        break;

                    case R.id.about:
                        FragmentTransaction aboutTrans = getSupportFragmentManager().beginTransaction();
                        aboutTrans.replace(R.id.content, new AboutFragment());
                        aboutTrans.commit();
                        break;
                }
                return true;
            }
        });


     

    }
}
