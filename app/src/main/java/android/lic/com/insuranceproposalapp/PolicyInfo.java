package android.lic.com.insuranceproposalapp;

import android.content.Intent;
import android.lic.com.insuranceutils.Utilities;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class PolicyInfo extends ActionBarActivity implements View.OnClickListener{

    Button policyinfodonebutton, previousPolicyDetails;
    Spinner paymentModeSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy_info);

        paymentModeSpinner = (Spinner)findViewById(R.id.paymentmodespinner);
        paymentModeSpinner.setAdapter(Utilities.getPaymentModeAdapter(this));

        policyinfodonebutton = (Button)findViewById(R.id.policyinfodonebutton);
        policyinfodonebutton.setOnClickListener(this);

        previousPolicyDetails = (Button)findViewById(R.id.previouspolicydetailsbutton);
        previousPolicyDetails.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_policy_info, menu);
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
        Intent intent;
        switch(v.getId()){
            case R.id.policyinfodonebutton:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.previouspolicydetailsbutton:
                intent = new Intent(this, PreviousPolicyDetails.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
