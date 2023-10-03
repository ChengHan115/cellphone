package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button_click(View view){
        EditText key =(EditText)findViewById(R.id.editTextTextPersonName);
        Intent i =new Intent(Intent.ACTION_WEB_SEARCH);
        i.putExtra(SearchManager.QUERY,key.getText().toString());
        startActivity(i);
    }
    public void button_click2(View view) {
        Intent i = new Intent(Intent.ACTION_DIAL);
    i.setData(Uri.parse("tel:0926 680 660"));
        startActivity(i);
    }
    public void button_click3(View view){
        Intent intent =new Intent(this,MainActivity2.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }
}