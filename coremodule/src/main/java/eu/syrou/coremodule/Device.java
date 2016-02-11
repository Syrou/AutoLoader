package eu.syrou.coremodule;

/**
 * Created by Syrou on 2016-02-11.
 */
public abstract class Device implements DeviceOperation {
    int deviceId;
    String deviceName;
    String deviceDescription;
    String typeOfDevice;

    public Device(String typeOfDevice, int deviceId, String deviceName, String deviceDescription) {
        this.typeOfDevice = typeOfDevice;
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.deviceDescription = deviceDescription;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceDescription() {
        return deviceDescription;
    }

    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }

    public String getTypeOfDevice() {
        return typeOfDevice;
    }

    public void setTypeOfDevice(String typeOfDevice) {
        this.typeOfDevice = typeOfDevice;
    }
}
