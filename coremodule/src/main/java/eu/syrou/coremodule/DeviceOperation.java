package eu.syrou.coremodule;

import android.content.Context;

/**
 * Created by Syrou on 2016-02-11.
 */
public interface DeviceOperation {
    boolean findAndFilterDevice(String filter);

    void launchDeviceView(Context context);
}
