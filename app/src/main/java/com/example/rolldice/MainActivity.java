package com.example.rolldice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnRol;
    ImageView imageEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        onClickButton();




    }


    //Get Button Id
    public void init() {
        btnRol = (Button)findViewById(R.id.rollBtn);
        imageEmpty = (ImageView)findViewById(R.id.emptyImg);

    }

    // ROLL DIC FUNCTION

    public void rollDice() {

        Random random = new Random();
        int rollRandom = random.nextInt(6 - 1 + 1)+1;

        switch (rollRandom) {

            case 1 : {
                imageEmpty.setImageResource(R.drawable.dice_1);

            };break;

            case 2 : {
                imageEmpty.setImageResource(R.drawable.dice_2);

            };break;


            case 3 : {
                imageEmpty.setImageResource(R.drawable.dice_3);

            };break;


            case 4 : {
                imageEmpty.setImageResource(R.drawable.dice_4);

            };break;


            case 5 : {
                imageEmpty.setImageResource(R.drawable.dice_5);

            };break;

            case 6: {
                imageEmpty.setImageResource(R.drawable.dice_6);

            };break;
            default:
                System.out.println("Wrong choice !!!");
        }
        Toast.makeText(getApplicationContext(),"Roll Number "+rollRandom,Toast.LENGTH_SHORT).show();
    }

    //ONCLICK EVENT
    public void onClickButton() {
        btnRol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }
}