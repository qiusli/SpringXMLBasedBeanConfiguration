package com.tutorialspoint;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Qiushi on 7/16/2017.
 */
public class JavaCollection {
    private List addressList;
    private Map addressMap;
    private Set addressSet;
    private Properties addressProp;

    public List getAddressList() {
        System.out.println("List Elements: " + addressList);
        return addressList;
    }

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public Map getAddressMap() {
        System.out.println("Map Elements: " + addressMap);
        return addressMap;
    }

    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public Set getAddressSet() {
        System.out.println("Set Elements: " + addressSet);
        return addressSet;
    }

    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public Properties getAddressProp() {
        System.out.println("Properties Elements: " + addressProp);
        return addressProp;
    }

    public void setAddressProp(Properties addressProp) {
        this.addressProp = addressProp;
    }
}
