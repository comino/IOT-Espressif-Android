package com.espressif.iot.action.device.longsocket;

import java.net.InetAddress;

import com.espressif.iot.base.net.longsocket.IEspLongSocket;
import com.espressif.iot.type.device.status.IEspStatusLight;

public interface IEspDeviceLongSocketLight
{
    /**
     * add light status by local
     * @param statusLight status of light
     */
    void addLigthtStatusLocal(IEspStatusLight statusLight);
    
    /**
     * add light status by Internet
     * @param statusLight status of light
     */
    void addLigthStatusInternet(IEspStatusLight statusLight);
    
    /**
     * finish the task
     */
    void finish();
    
    /**
     * close the task immediately
     */
    void close();
    
    /**
     * connect to light by local
     * 
     * @param inetAddress the light's inetAddress
     * @param listener the listener when the socket is disconnected
     * @return whether the connect is build up suc
     */
    boolean connectLightLocal(InetAddress inetAddress, IEspLongSocket.EspLongSocketDisconnected listener);
    
    /**
     * connect to light by Internet
     * 
     * @param deviceKey the light's device key
     * @param listener the listener when the socket is disconnected
     * @return whether the connect is build up suc
     */
    boolean connectLightInternet(String deviceKey, IEspLongSocket.EspLongSocketDisconnected listener);
}
