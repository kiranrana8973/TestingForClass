package com.example.testingforclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class OutputActivity extends AppCompatActivity {

    private TextView tvOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        tvOutput = findViewById(R.id.tvOutput);
        Bundle extras = getIntent().getExtras();
        if(!extras.isEmpty()) {
            float str = extras.getFloat("result");
            tvOutput.setText("Result is : " + Float.toString(str));
        }
        else
        {
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }
    }
}
