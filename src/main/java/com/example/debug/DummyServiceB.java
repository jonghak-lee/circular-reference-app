package com.example.debug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyServiceB {
    @Autowired
    private DummyServiceA serviceA;

    public String getServiceName() {
        return "I'm service B";
    }

    public String getOtherServiceName() {
        return serviceA.getServiceName();
    }
}
