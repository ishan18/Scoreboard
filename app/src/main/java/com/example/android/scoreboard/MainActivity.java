package com.example.android.scoreboard;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int pointa=0,pointb=0;
    public void point3a(View view)
    {
        pointa+=3;
        TextView pointTextview=(TextView) findViewById(R.id.pointa);
        pointTextview.setText("" +pointa);
    }
    public void point3b(View view)
    {
        pointb+=3;
        TextView pointTextview=(TextView) findViewById(R.id.pointb);
        pointTextview.setText("" +pointb);
    }
    public void point2a(View view)
    {
        pointa+=2;
        TextView pointTextview=(TextView) findViewById(R.id.pointa);
        pointTextview.setText("" +pointa);
    }
    public void point2b(View view)
    {
        pointb+=2;
        TextView pointTextview=(TextView) findViewById(R.id.pointb);
        pointTextview.setText("" +pointb);
    }
    public void point1a(View view)
    {
        pointa+=1;
        TextView pointTextview=(TextView) findViewById(R.id.pointa);
        pointTextview.setText("" +pointa);
    }
    public void point1b(View view)
    {
        pointb+=1;
        TextView pointTextview=(TextView) findViewById(R.id.pointb);
        pointTextview.setText("" +pointb);
    }
    public void reset(View view)
    {
        TextView pointbTextview=(TextView) findViewById(R.id.pointb);
        pointbTextview.setText("0");
        TextView pointTextview=(TextView) findViewById(R.id.pointa);
        pointTextview.setText("0");
        pointa=0;
        pointb=0;
    }
}
