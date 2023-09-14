package com.atp.controller;

import com.atp.handler.HelloHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class TestController {

    @RequestMapping("/testController")
    @ResponseBody
    public String testControl(HttpServletRequest request, HttpServletResponse response){
        try {
            new HelloHandler().handleRequest(request, response, null);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
