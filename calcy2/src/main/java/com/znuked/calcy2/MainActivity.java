package com.znuked.calcy2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Stack;


public class MainActivity extends Activity {

    public double val1;

    public Stack<String> stack;

    public String enteredText = "";      // Entered Text in output EditText

    public EditText output;

    public Button b1;           // 1
    public Button b2;           // 2
    public Button b3;           // 3
    public Button b4;           // 4
    public Button b5;           // 5
    public Button b6;           // 6
    public Button b7;           // 7
    public Button b8;           // 8
    public Button b9;           // 9
    public Button b0;           // 0
    public Button b_dec;        // .
    public Button equals;       // =
    public Button adds;         // +
    public Button subtracts;    // -
    public Button multiplies;   // *
    public Button divides;      // /

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (EditText) findViewById(R.id.output);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        equals = (Button) findViewById(R.id.equals);
        b_dec = (Button) findViewById(R.id.b_dec);
        adds = (Button) findViewById(R.id.adds);
        subtracts = (Button) findViewById(R.id.subtracts);
        multiplies = (Button) findViewById(R.id.multiplies);
        divides = (Button) findViewById(R.id.divides);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += "1";
//                output.setText(enteredText);
                output.append("1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += "2";
//                output.setText(enteredText);
                output.append("2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += "3";
//                output.setText(enteredText);
                output.append("3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += "4";
//                output.setText(enteredText);
                output.append("4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += "5";
//                output.setText(enteredText);
                output.append("5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += "6";
//                output.setText(enteredText);
                output.append("6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += "7";
//                output.setText(enteredText);
                output.append("7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += "8";
//                output.setText(enteredText);
                output.append("8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += "9";
//                output.setText(enteredText);
                output.append("9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += "0";
//                output.setText(enteredText);
                output.append("0");
            }
        });

        b_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += ".";
//                output.setText(enteredText);
                output.append(".");
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        adds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += "+";
//                output.setText(enteredText);

                output.append(" + ");
            }
        });

        subtracts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += "-";
//                output.setText(enteredText);
                output.append(" - ");
            }
        });

        multiplies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += "*";
//                output.setText(enteredText);
                output.append(" * ");
            }
        });

        divides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText += "/";
//                output.setText(enteredText);
                output.append(" / ");
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
