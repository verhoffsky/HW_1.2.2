package com.example.hw_122;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String pageMessage = String.valueOf(new Random().nextInt(100));

        TextView pageText = findViewById(R.id.text_page);
        pageText.setText("http://myfile.org/" + pageMessage);

        findViewById(R.id.button_back).setOnClickListener(buttonsClickListener);
        findViewById(R.id.button_forward).setOnClickListener(buttonsClickListener);

    }
    private View.OnClickListener buttonsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button_back :
                    finish();
                    break;
                case R.id.button_forward :
                    startNewActivity();
                    break;
            }

        }
    };
    private void startNewActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
