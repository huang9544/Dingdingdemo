package com.atp.handler;


import com.aliyun.fc.runtime.Context;
import com.aliyun.fc.runtime.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;

/**
 * 阿里云FC（function computer）
 */
public class HelloHandler implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response, Context context) throws IOException, ServletException {
        String requestPath = (String) request.getAttribute("FC_REQUEST_PATH");
        String requestURI = (String) request.getAttribute("FC_REQUEST_URI");
        String requestClientIP = (String) request.getAttribute("FC_REQUEST_CLIENT_IP");

        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String str = parameterNames.nextElement();
            System.out.println(str + ":::" + request.getParameter(str));
        }
        String queryString = request.getQueryString();
        System.out.println(queryString);

        // 获取json信息
        ServletInputStream inputStream = request.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
        }
        System.out.println(sb);


        response.setStatus(200);
        response.setHeader("header1", "value1");
        response.setHeader("header2", "value2");

//        String body = String.format("Path: %s\n Uri: %s\n IP: %s\n", requestPath, requestURI, requestClientIP);
        OutputStream out = response.getOutputStream();
        out.write((sb.toString()).getBytes());
    }
}
