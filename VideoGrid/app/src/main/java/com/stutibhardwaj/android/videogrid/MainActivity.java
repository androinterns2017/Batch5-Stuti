package com.stutibhardwaj.android.videogrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView Vid0,Vid1,Vid2,Vid3;

    MediaController mc0,mc1,mc2,mc3;

    Button btn,btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find your VideoView in your video_main.xml layout
        Vid0 = (VideoView) findViewById(R.id.Vid0);
        Vid1 = (VideoView) findViewById(R.id.Vid1);
        Vid2 = (VideoView) findViewById(R.id.Vid2);
        Vid3 = (VideoView) findViewById(R.id.Vid3);

        btn = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);




        if (mc0 == null) {
            // create an object of media controller class
            mc0 = new MediaController(MainActivity.this);
            mc0.setAnchorView(Vid0);

            mc1 = new MediaController(MainActivity.this);
            mc1.setAnchorView(Vid1);

            mc2 = new MediaController(MainActivity.this);
            mc2.setAnchorView(Vid2);

            mc3 = new MediaController(MainActivity.this);
            mc3.setAnchorView(Vid3);


        }
        // set the media controller for video view
        Vid0.setMediaController(mc0);
        Vid1.setMediaController(mc1);
        Vid2.setMediaController(mc2);
        Vid3.setMediaController(mc3);

        // set the uri for the video view
        Vid0.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.small));
        Vid1.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.small2));
        Vid2.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.small2));
        Vid3.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.small));
        // start a video



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button bt = (Button) v;
                v.setVisibility(View.GONE);
                Vid0.start();
                mc0.show();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button bt = (Button) v;
                v.setVisibility(View.GONE);
                Vid1.start();
                mc1.show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button bt = (Button) v;
                v.setVisibility(View.GONE);
                Vid2.start();
                mc2.show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button bt = (Button) v;
                v.setVisibility(View.GONE);
                Vid3.start();
                mc3.show();
            }
        });


    }
}
