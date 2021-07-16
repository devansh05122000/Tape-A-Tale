package com.example.tapeatale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView storyContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        storyContent = findViewById(R.id.contentofStory);
        Intent i = getIntent();
        String title = i.getStringExtra("titleofStory");
        String content = i.getStringExtra("contentofStory");

        //appbar title as story title
        getSupportActionBar().setTitle(title);

        //set content of story to textview
        storyContent.setText(content);
        storyContent.setMovementMethod(new ScrollingMovementMethod());

        //enable back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}