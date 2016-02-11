package eu.syrou.coremodule;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syrou on 2016-02-11.
 */
public class DeviceManager {
    private static final String TAG = "DeviceManager";

    public List<Device> getDeviceList() {
        Log.d(TAG, "List size: "+sInstance.deviceList.size());
        return sInstance.deviceList;
    }

    public void setDeviceList(List<Device> deviceList) {
        sInstance.deviceList = deviceList;
    }

    List<Device> deviceList;
    static DeviceManager sInstance = null;

    public static DeviceManager getInstance()
    {
        if(sInstance == null)
        {
            sInstance = new DeviceManager();
        }
        return sInstance;
    }

    public DeviceManager() {
        this.deviceList = new ArrayList<Device>();
    }

    public void listAllDevices()
    {
        if(sInstance.deviceList != null)
        {
            for(Device device : sInstance.deviceList)
            {
                Log.d(TAG, device.deviceName);
            }
        }
    }

    public void addDevice(Device device)
    {
        if(sInstance.deviceList != null)
        {
            Log.d(TAG, "Adding: "+device.getTypeOfDevice());
            sInstance.deviceList.add(device);
        }
    }


}
