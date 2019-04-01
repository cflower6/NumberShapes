package com.cflower6.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void numShape(View view){
        EditText editText = findViewById(R.id.Number);

        int number = Integer.parseInt(editText.getText().toString());

        Number myNum = new Number();

        myNum.number = number;

        if(myNum.isSquare() == true && myNum.isTriangular() == true){
            Toast.makeText(MainActivity.this, "Both Triangular and Square", Toast.LENGTH_LONG).show();
        }else if(myNum.isSquare() == true && myNum.isTriangular() == false){
            Toast.makeText(MainActivity.this, "Square number only", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(MainActivity.this, "Triangular number only", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
