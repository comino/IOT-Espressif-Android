package com.espressif.iot.object.db;

import com.espressif.iot.object.IEspDBObject;

/**
 * the Ap db should save such properties as follows
 * 
 * @author afunx
 * 
 */
public interface IApDB extends IEspDBObject
{
    /**
     * get the id of the ap
     * @return the id of the ap
     */
    Long getId();
    
    /**
     * set the id of the ap
     * @param id the id of the ap
     */
    void setId(Long id);
    
    /**
     * get the bssid of the ap
     * @return the bssid of the ap
     */
    String getBssid();
    
    /**
     * set the bssid of the ap
     * @param bssid the bssid of the ap
     */
    void setBssid(String bssid);
    
    /**
     * get the password of the ap
     * @return the password of the ap
     */
    String getPassword();
    
    /**
     * set the password of the ap
     * @param password the password of the ap
     */
    void setPassword(String password);
    
    /**
     * get whether the ap is selected last time
     * @return whether the ap is selected last time
     */
    boolean getIsLastSelected();
    
    /**
     * set whether the ap is selected last time
     * @param isLastSelected the ap is selected last time
     */
    void setIsLastSelected(boolean isLastSelected);
}
