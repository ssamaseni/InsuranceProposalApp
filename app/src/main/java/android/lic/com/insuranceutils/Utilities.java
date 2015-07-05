package android.lic.com.insuranceutils;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bp00351876 on 3/7/15.
 */
public class Utilities {

    public static ArrayAdapter<String> getPaymentModeAdapter(Context context){
        List<String> paymentModes = new ArrayList<String>();
        paymentModes.add("Monthly");
        paymentModes.add("Quarterly");
        paymentModes.add("Annual");

        ArrayAdapter<String> paymentModeAdapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, paymentModes);

        return paymentModeAdapter;
    }
}
