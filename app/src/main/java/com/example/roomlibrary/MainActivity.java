package com.example.roomlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button saveBtn;
    EditText editName, edtAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // id define
        saveBtn = findViewById(R.id.saveBtn);
        editName = findViewById(R.id.edtName);
        edtAmount = findViewById(R.id.edtAmount);



    }
}