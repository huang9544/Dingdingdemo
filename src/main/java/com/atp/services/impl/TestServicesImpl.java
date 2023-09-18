package com.atp.services.impl;

import com.atp.services.TestServices;
import org.springframework.stereotype.Service;

@Service
public class TestServicesImpl implements TestServices {


    @Override
    public String testService(String str) {
        return str + "123";
    }
}
