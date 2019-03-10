package com.kubatov.ikosty;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final Random RANDOM = new Random();

    ImageView imageView1, imageView2;
    Button button;
    TextView textView;

    int val1;
    int val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        imageView1 = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        textView = findViewById(R.id.textView2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = randomNumber();
                val2 = randomNumber();
                Log.d("ololo", "dice " + val1);

                int res1 = getResources()
                        .getIdentifier("dice" + val1, "drawable", "com.kubatov.ikosty");
                int res2 = getResources()
                        .getIdentifier("dice" + val2, "drawable", "com.kubatov.ikosty");

                imageView1.setImageResource(res1);
                imageView2.setImageResource(res2);
                textView.setText("The sum is: \n" + Integer.toString( val1+val2));

            }
        });
    }

    public static int randomNumber(){

    return RANDOM.nextInt(6) + 1;
    }

}
