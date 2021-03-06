package com.espressif.iot.device.upgrade;

import com.espressif.iot.type.upgrade.EspUpgradeDeviceCompatibility;

public interface IEspDeviceCheckCompatibility extends IEspDeviceUpgrade
{
    static final String OLDEST_IOT_DEMO_VERSION = "b1.0.5t45772(a)";
    
    static final String NEWEST_IOT_DEMO_VERSION = "b1.0.9t45772(o)";
    
    EspUpgradeDeviceCompatibility checkDeviceCompatibility(String version);
}
