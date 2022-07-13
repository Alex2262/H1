package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView instructions;
    private TextView counter;
    private Button update_button;
    private EditText text_editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instructions = (TextView) findViewById(R.id.instructions);
        counter = (TextView) findViewById(R.id.counter);
        update_button = (Button) findViewById(R.id.update_button);
        text_editor = (EditText) findViewById(R.id.text_editor);

        update_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int text_count = text_editor.getText().length();
                if (text_count == 0) {
                    counter.setText("");
                } else {
                    counter.setText(String.valueOf(text_count));
                }
            }
        });



    }
}