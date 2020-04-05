package edu.qcc.et570.gamescore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    Button usawBtn;

    TextView usawText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usawText = findViewById(R.id.tv_usaw_count);


        usawBtn = findViewById(R.id.btn_usaw_goal);

    }

    public void onUsawClicked(View view) {

        String usawCount = usawText.getText().toString().trim();
        int count = Integer.parseInt(usawCount);
        count++;
        usawText.setText(String.valueOf(count));

    }
}


