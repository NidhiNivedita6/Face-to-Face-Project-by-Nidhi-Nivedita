package com.example.projectface_to_face.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projectface_to_face.R;

import org.jitsi.meet.sdk.JitsiMeet;
import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class CallActivity extends AppCompatActivity {

    EditText secretCodeBox;
    Button joinBtn, shareBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

            secretCodeBox = findViewById(R.id.codeBox);
            joinBtn = findViewById(R.id.joinBtn);
            shareBtn = findViewById(R.id.shareBtn);

            URL serverURL;


            try {
                serverURL = new URL("https://meet.jit.si");
                JitsiMeetConferenceOptions defaultOptions =
                        new JitsiMeetConferenceOptions.Builder()
                                .setServerURL(serverURL)
                                .setWelcomePageEnabled(false)
                                .build();
                JitsiMeet.setDefaultConferenceOptions(defaultOptions);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }




            joinBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    JitsiMeetConferenceOptions options = new JitsiMeetConferenceOptions.Builder()
                            .setRoom(secretCodeBox.getText().toString())
                            .setWelcomePageEnabled(false)
                            .build();

                    JitsiMeetActivity.launch(CallActivity.this, options);
                }
            });



        }


    }
