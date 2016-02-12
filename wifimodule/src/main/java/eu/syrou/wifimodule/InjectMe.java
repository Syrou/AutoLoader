package eu.syrou.wifimodule;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

import eu.syrou.coremodule.Device;
import eu.syrou.coremodule.DeviceManager;


/**
 * Created by Syrou on 2016-02-11.
 */
@Aspect
public class InjectMe {
    @ ("execution(* eu.syrou.autoloader.LoginActivity.onCreate(..))")
    public void postOnCreate(JoinPoint thisJoinPoint) {
        DeviceManager.getInstance().addDevice(new WIFIDevice("Injected Wifi", 1, "Injected Wifi Device", "A WIFI device that was injected"));
    }
}
