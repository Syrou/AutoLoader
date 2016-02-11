package eu.syrou.blemodule;

import android.content.Context;
import android.content.Intent;

import eu.syrou.coremodule.Device;

/**
 * Created by Syrou on 2016-02-11.
 */
public class BLEDevice extends Device {
    public BLEDevice(String typeOfDevice, int deviceId, String deviceName, String deviceDescription) {
        super(typeOfDevice, deviceId, deviceName, deviceDescription);
    }


    @Override
    public boolean findAndFilterDevice(String filter) {
        return filter.contains("be:le:");
    }

    @Override
    public void launchDeviceView(Context context) {
        Intent intent = new Intent(context, BLEActivity.class);
        context.startActivity(intent);
    }
}
