package com.example.mom.rememberme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageButton mTwitter;
    ImageButton mLinkedIn;
    EditText mFirstName;
    EditText mLastName;
    EditText mCellNumber;
    EditText mWorkNumber;
    EditText mAddress;
    EditText mEmail;
    EditText mTwitterText;
    EditText mLinkedInText;
    ListView mListview;
    ArrayList<String> mArrayList;
    ArrayAdapter<String> mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArrayList= new ArrayList<String>();
        mListview=(ListView)findViewById(R.id.listView);
        mAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mArrayList);
        mListview.setAdapter(mAdapter);

        mTwitterText=(EditText)findViewById(R.id.twitter_text);

        String twitterName= mTwitterText.getText().toString();
    }
}
