package com.example.telacontador;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView counterTextView = findViewById(R.id.counterTextView);
        counterTextView.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            @Override
            public void onClick(View v) {
                count++;
                counterTextView.setText(String.valueOf(count));
            }
        });

        if(savedInstanceState != null) {
            int count = savedInstanceState.getInt("count");
            counterTextView.setText(String.valueOf(count));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        TextView counterTextView = findViewById(R.id.counterTextView);
        int count = Integer.parseInt(counterTextView.getText().toString());
        outState.putInt("count", count);
    }
}
