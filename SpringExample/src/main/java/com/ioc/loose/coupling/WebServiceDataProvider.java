package com.ioc.loose.coupling;

public class WebServiceDataProvider implements UserDataProviderInterface {
    @Override
    public String getUserDetails() {
        return "IOC EXAMPLE : user details from a Web Service";
    }
}
