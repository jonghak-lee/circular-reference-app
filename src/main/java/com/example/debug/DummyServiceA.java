package com.example.debug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyServiceA {
    @Autowired
    private DummyServiceB serviceB;

    public String getServiceName() {
        return "This is service A";
    }

    public String getOtherServiceName() {
        return serviceB.getServiceName();
    }
}
