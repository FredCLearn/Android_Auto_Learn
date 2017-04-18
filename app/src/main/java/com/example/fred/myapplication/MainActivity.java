package com.example.fred.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewTop;
    private TextView mTextViewBottom;
    private Button mActionButton;
    private Button mResetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewTop =  (TextView) findViewById(R.id.textViewTop);
        mTextViewBottom = (TextView) findViewById(R.id.textViewBottom);
        mActionButton = (Button) findViewById(R.id.actionButton);
        mResetButton = (Button) findViewById(R.id.resetButton);




        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //button clicked, do action
                String fact = "Eric is the Best!!";
                mTextViewBottom.setText(fact);


            }
        };

        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewBottom.setText("Rimple, Ben, Eric, Amel,Jeff OR Kevin??");
            }
        };


        mActionButton.setOnClickListener(listener);
        mResetButton.setOnClickListener(listener2);





    }
}
