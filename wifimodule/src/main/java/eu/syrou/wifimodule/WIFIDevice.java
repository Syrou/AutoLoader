package eu.syrou.wifimodule;

import android.content.Context;
import android.content.Intent;

import eu.syrou.coremodule.Device;

/**
 * Created by Syrou on 2016-02-11.
 */
public class WIFIDevice extends Device {
    public WIFIDevice(String typeOfDevice, int deviceId, String deviceName, String deviceDescription) {
        super(typeOfDevice, deviceId, deviceName, deviceDescription);
    }


    @Override
    public boolean findAndFilterDevice(String filter) {
        return filter.contains("wi:fi:");
    }

    @Override
    public void launchDeviceView(Context context) {
        Intent intent = new Intent(context, WIFIActivity.class);
        context.startActivity(intent);
    }
}
