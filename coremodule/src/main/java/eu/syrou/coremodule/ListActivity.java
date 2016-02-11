package eu.syrou.coremodule;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import eu.syrou.coremodule.Device;
import eu.syrou.coremodule.DeviceManager;


public class ListActivity extends AppCompatActivity {


    private static final String TAG = "ListActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new DeviceRecycleAdapter(DeviceManager.getInstance().getDeviceList()));

    }

    @Override
    protected void onPause() {
        super.onPause();
    }

}
