package com.example.roomlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button saveBtn;
    ListView listView;
    EditText editName, edtAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // id define
        saveBtn = findViewById(R.id.saveBtn);
        editName = findViewById(R.id.edtName);
        edtAmount = findViewById(R.id.edtAmount);


        DatabaseHelper databaseHelper = DatabaseHelper.getDB(this);

        saveBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String title = editName.getText().toString();
                String ammount = edtAmount.getText().toString();

                databaseHelper.dataAccessObject().addTx(
                        new ExpenseEntity(title,ammount)
                );

                Toast.makeText(MainActivity.this, "Data Save", Toast.LENGTH_SHORT).show();


            }
        });

//        databaseHelper.dataAccessObject().deleteTx();
//        databaseHelper.dataAccessObject().updateTx();
    }
}