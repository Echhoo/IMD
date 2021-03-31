package uk.aston.miniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount;
    private TextView mShowCount;
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCount=0;
        mShowCount=findViewById(R.id.count_text);

//        mShowCount.
    }


    public void AddCount(View view) {
        mCount++;
        if(mShowCount!=null){
            mShowCount.setText(Integer.toString(mCount));
        }

    }

    public void gotoHello(View view) {
        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE,Integer.toString(mCount));
        startActivity(intent);
    }
}