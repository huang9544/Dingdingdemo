package com.atp.controller;

import com.aliyun.fc.runtime.HttpRequestHandler;
import com.atp.handler.HelloHandler;
import com.atp.services.TestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@RestController
public class TestController {

    @Autowired
    private HttpRequestHandler requestHandler;

    @Autowired
    private TestServices testServices;

    @RequestMapping("/testController")
    @ResponseBody
    public String testControl(HttpServletRequest request, HttpServletResponse response){
        try {
            requestHandler.handleRequest(request, response, null);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
        return "success";
    }

    @RequestMapping("/testControlNoHandler")
    @ResponseBody
    public String testControlNoHandler(HttpServletRequest request, HttpServletResponse response) throws Exception{
        // 获取json信息
        ServletInputStream inputStream = request.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
        }
        System.out.println(sb);
        String testStr = testServices.testService(sb.toString());
        System.out.println(testStr);
        return testStr;
    }
}
