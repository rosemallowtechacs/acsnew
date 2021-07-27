package com.rosemellow.acsdata.VideoModule;

import android.os.Bundle;

import com.rosemellow.acsdata.BaseActivity;
import com.rosemellow.acsdata.R;

import tcking.github.com.giraffeplayer2.VideoView;

public class GirafferPlayerActivity extends BaseActivity {

    String url;
    VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giraffer_player);


        url = getIntent().getStringExtra("url");


        videoView = findViewById(R.id.video_view);
        videoView.setVideoPath(url).getPlayer().start();


    }
}
