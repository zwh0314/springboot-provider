package com.jk.service.impl;

import com.jk.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String say(String something) {
        return "小明说了:"+something;
    }
}
