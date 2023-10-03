package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }
    public void button(View view){
        int cmp=(int)(Math.random()*101);
        int a=(int)(Math.random()*30+30);
        String str="";
        CheckBox food =(CheckBox) findViewById(R.id.checkBox);
        if(food.isChecked())
            str+="需等候"+a+"分鐘唷!!!";
        CheckBox get =(CheckBox) findViewById(R.id.checkBox2);
        if(get.isChecked())
            str+="號碼牌"+cmp;
        TextView output=(TextView)findViewById(R.id.textView5);
        output.setText(str);
    }
    public void button2_click(View view){
        finish();
    }
}