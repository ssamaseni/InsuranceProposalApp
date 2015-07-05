package android.lic.com.insuranceproposalapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedWriter;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button basicInfoButton, personalInfoButton, nomineeInfoButton, familyInfoButton, femaleLivesButton,
    policyInfoButton, RFU, otherInfoButton, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        basicInfoButton = (Button)findViewById(R.id.basicinfobutton);
        basicInfoButton.setOnClickListener(this);
        personalInfoButton = (Button)findViewById(R.id.personalinfobutton);
        personalInfoButton.setOnClickListener(this);
        nomineeInfoButton = (Button)findViewById(R.id.nomineeinfobutton);
        nomineeInfoButton.setOnClickListener(this);
        familyInfoButton = (Button)findViewById(R.id.familyhistorybutton);
        familyInfoButton.setOnClickListener(this);
        femaleLivesButton = (Button)findViewById(R.id.femalelivesbutton);
        femaleLivesButton.setOnClickListener(this);
        policyInfoButton = (Button)findViewById(R.id.policyinfobutton);
        policyInfoButton.setOnClickListener(this);
        RFU = (Button)findViewById(R.id.RFUbuttton);
        RFU.setOnClickListener(this);
        otherInfoButton = (Button)findViewById(R.id.otherinfobutton);
        otherInfoButton.setOnClickListener(this);
        exit = (Button)findViewById(R.id.exitbutton);
        exit.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
            Intent intent;
        switch(v.getId()){
            case R.id.basicinfobutton:
                intent = new Intent(this, BasicInfo.class);
                startActivity(intent);
                break;
            case R.id.personalinfobutton:
                intent = new Intent(this, PersonalInfo.class);
                startActivity(intent);
                break;
            case R.id.nomineeinfobutton:
                intent = new Intent(this, NomineeInfo.class);
                startActivity(intent);
                break;
            case R.id.familyhistorybutton:
                intent = new Intent(this, FamilyInfo.class);
                startActivity(intent);
                break;
            case R.id.femalelivesbutton:
                intent = new Intent(this, FemaleLives.class);
                startActivity(intent);
                break;
            case R.id.policyinfobutton:
                intent = new Intent(this, PolicyInfo.class);
                startActivity(intent);
                break;
            case R.id.RFUbuttton:
                Toast rfuToast = Toast.makeText(this,"Reserved for Future Use", Toast.LENGTH_SHORT);
                rfuToast.show();
                break;
            case R.id.otherinfobutton:
                intent = new Intent(this, OtherInfo.class);
                startActivity(intent);
                break;
            case R.id.exitbutton:
                System.exit(1);
        }
    }
}
