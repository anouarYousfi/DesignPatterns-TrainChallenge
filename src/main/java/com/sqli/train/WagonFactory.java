package com.sqli.train;

import java.security.InvalidParameterException;

public class WagonFactory {
    public Wagon getWagon(String wagon) {
        if ("H".equals(wagon))
            return new Head();
        else if ("P".equals(wagon))
            return new Passenger();
        else return null;
    }

}
