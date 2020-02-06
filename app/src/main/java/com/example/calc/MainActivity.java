package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    EditText editText;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);



        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.plus:
                        result.setText(Integer.parseInt(editText.getText().toString())+(Integer.parseInt(editText2.getText().toString())));
                        break;
                    case R.id.minus:
                        result.setText(Integer.parseInt(editText.getText().toString())-(Integer.parseInt(editText2.getText().toString())));
                        break;
                    case R.id.multiply:
                        result.setText(Integer.parseInt(editText.getText().toString())*(Integer.parseInt(editText2.getText().toString())));
                        break;
                    case R.id.divide:
                        if(Integer.parseInt(editText2.getText().toString())==0){
                            result.setText("Error");
                        } else {
                            result.setText(Integer.parseInt(editText.getText().toString())/(Integer.parseInt(editText2.getText().toString())));
                        }
                        break;
                }
            }
        };
    }


}
