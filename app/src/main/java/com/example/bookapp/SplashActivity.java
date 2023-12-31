package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.bookapp.databinding.ActivitySplashBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SplashActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        firebaseAuth = FirebaseAuth.getInstance();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                checkUser();
            }
        },5000);
    }

    private void checkUser() {
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
//        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
//        if (firebaseUser == null)
//        {
//            startActivity(new Intent(SplashActivity.this, MainActivity.class));
//            finish();
//        }else {
//            DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Users");
//            ref.child(firebaseUser.getUid())
//                    .addListenerForSingleValueEvent(new ValueEventListener() {
//                        @Override
//                        public void onDataChange(DataSnapshot snapshot) {
//                            String userType = ""+snapshot.child("userType").getValue();
//
//                            if(userType.equals("user"))
//                            {
//                                startActivity(new Intent(SplashActivity.this, DashboardUserActivity.class));
//                                finish();
//                            } else if (userType.equals("admin")) {
//                                startActivity((new Intent(SplashActivity.this, DashboardAdminActivity.class)));
//                                finish();
//                            }
//                        }
//
//                        @Override
//                        public void onCancelled(DatabaseError error) {
//
//                        }
//                    });
//        }
    }
}