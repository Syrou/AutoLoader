package eu.syrou.blemodule;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

import eu.syrou.coremodule.DeviceManager;


/**
 * Created by Syrou on 2016-02-11.
 */
@Aspect
public class InjectMe {
    @After("execution(*  eu.syrou.autoloader.LoginActivity.onCreate(..))")
    public void postOnCreate(JoinPoint thisJoinPoint) {
        DeviceManager.getInstance().addDevice(new BLEDevice("Injected BLE", 2, "Injected BLE Device", "A BLE device that was injected"));
    }
}
