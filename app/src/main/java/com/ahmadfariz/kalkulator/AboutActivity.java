package com.ahmadfariz.kalkulator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void git(View view) {
        String url = "https://github.com/ahmadfariz" ;
        Intent git = new Intent(Intent. ACTION_VIEW);
        git.setData(Uri. parse(url));
        startActivity(git);
    }

    public void fb(View view) {
        String url = "https://www.facebook.com/ahmadfarizdwiputra" ;
        Intent fb = new Intent(Intent. ACTION_VIEW);
        fb.setData(Uri. parse(url));
        startActivity(fb);
    }

    public void steam(View view) {
        String url = "https://steamcommunity.com/id/ahmadfariz/" ;
        Intent steam = new Intent(Intent. ACTION_VIEW);
        steam.setData(Uri. parse(url));
        startActivity(steam);
    }

    public void ig(View view) {
        String url = "https://www.instagram.com/ahmadfarizdwiputra/" ;
        Intent ig = new Intent(Intent. ACTION_VIEW);
        ig.setData(Uri. parse(url));
        startActivity(ig);
    }

    public void sawer(View view) {
        String url = "https://saweria.co/ahmadfariz" ;
        Intent sawer = new Intent(Intent. ACTION_VIEW);
        sawer.setData(Uri. parse(url));
        startActivity(sawer);
    }
}