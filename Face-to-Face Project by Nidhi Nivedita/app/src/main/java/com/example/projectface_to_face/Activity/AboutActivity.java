package com.example.projectface_to_face.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projectface_to_face.R;
import com.example.projectface_to_face.databinding.ActivityAboutBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AboutActivity extends AppCompatActivity {

    ActivityAboutBinding binding;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        /*
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.layout, new AboutFragment()).commit();

         */

        //public void FragmentMethod() {
        //    Toast.makeText(AboutActivity.this, "Method called from Fragment", Toast.LENGTH_SHORT).show();
    }



    //public void FragmentMethod() {
       // Toast.makeText(AboutActivity.this, "Method called from Fragment", Toast.LENGTH_SHORT).show();
   // }
}

        /*
        binding = ActivityAboutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home
                }
                return false;
            }
        });

         */





        /*
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.about);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.call:
                        startActivity(new Intent(getApplicationContext(),DashboardActivity.class ));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.chat:
                        startActivity(new Intent(getApplicationContext(), ChatActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.about:

                        return true;
                }

                return false;
            }
        });

         */

    //}

