package android.lic.com.insuranceproposalapp;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class BasicInfo extends ActionBarActivity implements View.OnClickListener{

    Button doneButton;
    CheckBox addressCopyCheckBox;
    EditText presentAddEditText, permanentAddText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_info);

        doneButton = (Button)findViewById(R.id.basicinfodonebutton);
        doneButton.setOnClickListener(this);
        addressCopyCheckBox = (CheckBox)findViewById(R.id.presentaddresssamecheckbox);
        addressCopyCheckBox.setOnClickListener(this);
        presentAddEditText = (EditText)findViewById(R.id.presentaddresseditText);
        permanentAddText = (EditText)findViewById(R.id.permanentaddressedittext);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_basic_info, menu);
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
            case R.id.basicinfodonebutton:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.presentaddresssamecheckbox:
                if(addressCopyCheckBox.isChecked()){
                    permanentAddText.setText(presentAddEditText.getText());
                }else if(!addressCopyCheckBox.isChecked()){
                    permanentAddText.setText("");
                }
            break;
        }
    }
}
