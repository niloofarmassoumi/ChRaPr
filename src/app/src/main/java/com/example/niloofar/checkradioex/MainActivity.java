package com.example.niloofar.checkradioex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view){

        TextView text=findViewById(R.id.txv_text);

        EditText name=findViewById(R.id.txt_name);
        EditText family=findViewById(R.id.txt_family);
        EditText age=findViewById(R.id.txt_age);

        RadioButton male=findViewById(R.id.rb_male);
        RadioButton female=findViewById(R.id.rb_female);
        RadioButton married=findViewById(R.id.rb_married);
        RadioButton single=findViewById(R.id.rb_single);

        CheckBox nameCB=findViewById(R.id.cb_name);
        CheckBox titleCB=findViewById(R.id.cb_title);
        CheckBox familyCB=findViewById(R.id.cb_family);
        CheckBox ageCB=findViewById(R.id.cb_age);

        String result="";

        if(nameCB.isChecked()){
            result+="Name is:"+name.getText().toString()+" "+family.getText().toString()+"\n";
        }
        if(titleCB.isChecked() && male.isChecked()){
            result+="Mr:"+name.getText().toString()+" "+family.getText().toString()+"\n";

        }if(titleCB.isChecked() && female.isChecked() && single.isChecked()){
            result+="Ms:"+name.getText().toString()+" "+family.getText().toString()+"\n";

        }if(titleCB.isChecked() && female.isChecked() && married.isChecked()){
            result+="Mis:"+name.getText().toString()+" "+family.getText().toString()+"\n";

        }if(familyCB.isChecked()){
            result+="Family:"+family.getText().toString()+"\n";

        }if(ageCB.isChecked()){
            result+="age:"+age.getText().toString();
        }

        text.setText(result);




    }

}
