package com.easylabs.howtoclean;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ContentActivity extends AppCompatActivity {

    TextView tvContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        setTitle(Data.titles[Data.currentId]);

        tvContent = (TextView) findViewById(R.id.tvContent);

        switch (Data.currentId){
            case Data.BLOOD_ID: tvContent.setText(getString(R.string.blood_content)); break;
        }
    }
}
