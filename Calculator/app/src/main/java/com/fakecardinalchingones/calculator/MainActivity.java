package com.fakecardinalchingones.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnMultiplication;
    private Button btnDivision;
    private TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        operand1 = (EditText) findViewById(R.id.editText);
        operand2 = (EditText) findViewById(R.id.editText2);

        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        txtResult = (TextView) findViewById(R.id.txtResult);


        btnAddition.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               double op1 = Double.parseDouble(operand1.getText().toString());
                                               double op2 = Double.parseDouble(operand2.getText().toString());

                                               double theResult = op1 + op2;
                                               txtResult.setText(Double.toString(theResult));
                                           }
                                       });
        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double op1 = Double.parseDouble(operand1.getText().toString());
                double op2 = Double.parseDouble(operand2.getText().toString());

                double theResult = op1 - op2;
                txtResult.setText(Double.toString(theResult));
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double op1 = Double.parseDouble(operand1.getText().toString());
                double op2 = Double.parseDouble(operand2.getText().toString());

                double theResult = op1 * op2;
                txtResult.setText(Double.toString(theResult));
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double op1 = Double.parseDouble(operand1.getText().toString());
                double op2 = Double.parseDouble(operand2.getText().toString());

                double theResult = op1 / op2;
                txtResult.setText(Double.toString(theResult));
            }
        });

                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
