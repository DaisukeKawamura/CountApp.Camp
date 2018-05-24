package android.lifeistech.com.countappcamp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);


    }





    public void plus(View v){
        number = number + 1;
        textView.setText(String.valueOf(number));

        color(number);

//        if (number >= 10) {
//            textView.setTextColor(Color.rgb(255, 0, 0));
//        }
    }

    public void  minus(View v){
        number = number - 1;
        textView.setText(String.valueOf(number));

        color(number);

//        if (number >= 10) {
//            textView.setTextColor(Color.rgb(255, 0, 0));
//        }else {
//            textView.setTextColor(Color.rgb(0,0,0));
//        }
    }

    public void clear(View v){
        number = 0;
        textView.setText(String.valueOf(number));

        color(number);

//        if (number >= 10) {
//            textView.setTextColor(Color.rgb(255, 0, 0));
//        }else {
//            textView.setTextColor(Color.rgb(0,0,0));
//        }
    }





    

    public void color(int n){
        if (n > 10){
            textView.setTextColor(Color.rgb(255, 0, 0));
        }else {
            textView.setTextColor(Color.rgb(0,0,0));
        }
    }


}
