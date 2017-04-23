package com.example.fred.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    //create object from class so we can use in main activity
    private DataBook mDataBook= new DataBook();

    //Declare View Variables
    private TextView mTextViewTop;
    private TextView mTextViewBottom;
    private Button mActionButton;
    private Button mResetButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewTop =  (TextView) findViewById(R.id.textViewTop);
        mTextViewBottom = (TextView) findViewById(R.id.textViewBottom);
        mActionButton = (Button) findViewById(R.id.actionButton);
        mResetButton = (Button) findViewById(R.id.resetButton);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);




        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String person = mDataBook.getfact();

                mTextViewBottom.setText(person);
                mRelativeLayout.setBackgroundColor(Color.RED);
            }
        };

        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewBottom.setText("Rimple, Ben, Eric, Amel,Jeff OR Kevin??");
                mRelativeLayout.setBackgroundColor(Color.GREEN);
            }
        };


        mActionButton.setOnClickListener(listener);
        mResetButton.setOnClickListener(listener2);





    }
}
