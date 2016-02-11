package eu.syrou.blemodule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import eu.syrou.coremodule.BaseActivity;

public class BLEActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ble);
    }
}
