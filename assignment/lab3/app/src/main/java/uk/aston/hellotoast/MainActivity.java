package uk.aston.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount;
    private TextView mShowCount;
    private Button mZeroButton;
    private Button mCountButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCount=0;
        // initial
        mShowCount = (TextView) findViewById(R.id.show_count);
        mZeroButton = (Button) findViewById(R.id.button_zero);
        mCountButton = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast=Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        //长的实际长度约为3.5秒，Toast短的实际长度为2秒Toast。
        mZeroButton.setBackgroundColor(Color.RED);
        toast.show();
    }

    public void countUP(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        mZeroButton.setBackgroundColor(Color.RED);
        if (mCount%2==0){
            mCountButton.setBackgroundColor(getResources().getColor(R.color.pink));
        }
        else{
            mCountButton.setBackgroundColor(getResources().getColor(R.color.teal_200));
        }
    }

    public void changeColor(View view) {
        mZeroButton.setBackgroundColor(0xFF7E797A);
    }
}