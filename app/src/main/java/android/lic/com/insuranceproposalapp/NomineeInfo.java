package android.lic.com.insuranceproposalapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;
import java.util.List;


public class NomineeInfo extends ActionBarActivity implements View.OnClickListener{

    Button doneButton;

    ArrayAdapter<String> relationshipAdapter;

    Spinner nomineeRelationshipSpinner, apointeeRelationshipSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nominee_info);

        List<String> relations = new ArrayList<String>();
        relations.add("Mother");
        relations.add("Father");
        relations.add("Brother");
        relations.add("Sister");
        relations.add("Spouse");


        relationshipAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, relations);
        nomineeRelationshipSpinner = (Spinner)findViewById(R.id.nomineerelationshipspinner);
        apointeeRelationshipSpinner = (Spinner)findViewById(R.id.apointeerelationshipspinner);
        nomineeRelationshipSpinner.setAdapter(relationshipAdapter);
        apointeeRelationshipSpinner.setAdapter(relationshipAdapter);
        doneButton = (Button) findViewById(R.id.nomineedonebutton);
        doneButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nominee_info, menu);
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

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.nomineedonebutton:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
