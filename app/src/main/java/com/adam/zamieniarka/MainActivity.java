package com.adam.zamieniarka;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    TextView lblOutput1;
    EditText edittext;
    Button button;
    TextView lblOutput2;
    TextView lblOutput3;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblOutput1 = (TextView) findViewById(R.id.textView);
        lblOutput2 = (TextView) findViewById(R.id.textView2);
        lblOutput3 = (TextView) findViewById(R.id.textView3);
        button = (Button) findViewById(R.id.button);
        edittext = (EditText) findViewById(R.id.editTextNumber);
        context = getApplicationContext();

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(edittext.getText().toString().trim().length() == 0) {
                    Toast toast = Toast.makeText(context, "Wprowadź liczbę",Toast.LENGTH_SHORT);
                    toast.show();
                  lblOutput3.setText("");

                }else if (Integer.parseInt(edittext.getText().toString())>3999 | Integer.parseInt(edittext.getText().toString())==0){
                  Toast toast = Toast.makeText(context, " Wprowadź inną liczbę",Toast.LENGTH_SHORT);
                   toast.show();
                   lblOutput3.setText("");
               }
                else{ZamianaRoku(); }
            }
        });
    }

    private void ZamianaRoku() {
        String editString = edittext.getText().toString();
        int number = Integer.parseInt(editString);
        String[] data = editString.split("");
        List<String> lista = new ArrayList<String>();
        switch (Integer.parseInt(data[data.length-1])) {
            case 1:
                lista.add("I");
                break;
            case 2:
                lista.add("II");
                break;
            case 3:
                lista.add("III");
                break;
            case 4:
                lista.add("IV");
                break;
            case 5:
                lista.add("V");
                break;
            case 6:
                lista.add("VI");
                break;
            case 7:
                lista.add("VII");
                break;
            case 8:
                lista.add("VIII");
                break;
            case 9:
                lista.add("IX");
                break;
            default:
                lista.add("");
        }
        if(number>= 10){
            switch (Integer.parseInt(data[data.length-2])) {
                case 1:
                    lista.add("X");
                    break;
                case 2:
                    lista.add("XX");
                    break;
                case 3:
                    lista.add("XXX");
                    break;
                case 4:
                    lista.add("XL");
                    break;
                case 5:
                    lista.add("L");
                    break;
                case 6:
                    lista.add("LX");
                    break;
                case 7:
                    lista.add("LXX");
                    break;
                case 8:
                    lista.add("LXXX");
                    break;
                case 9:
                    lista.add("XC");
                    break;
                default:
                    lista.add("");
            }}
        if(number>=100){
            switch (Integer.parseInt(data[data.length-3])) {
                case 1:
                    lista.add("C");
                    break;
                case 2:
                    lista.add("CC");
                    break;
                case 3:
                    lista.add("CCC");
                    break;
                case 4:
                    lista.add("CD");
                    break;
                case 5:
                    lista.add("D");
                    break;
                case 6:
                    lista.add("DC");
                    break;
                case 7:
                    lista.add("DCC");
                    break;
                case 8:
                    lista.add("DCCC");
                    break;
                case 9:
                    lista.add("DM");
                    break;
                default:
                    lista.add("");
            }}
        if(number>=1000){
            switch (Integer.parseInt(data[data.length-4])) {
                case 1:
                    lista.add("M");
                    break;
                case 2:
                    lista.add("MM");
                    break;
                case 3:
                    lista.add("MMM");
                    break;
                default:
                    lista.add("");
            }}
        String wynik = "";
        for(int i=lista.size()-1;i>= 0;i--) {
            wynik = wynik+ lista.get(i);

        }
        lblOutput3.setText(wynik);
    }

}