// This file is auto-generated, don't edit it. Thanks.
// 获取审批单流程中的节点信息
package com.atp.sample;

import com.aliyun.tea.*;
import com.aliyun.teautil.models.*;
import com.aliyun.dingtalkworkflow_1_0.models.*;
import com.aliyun.teaopenapi.models.*;

public class ProcessesForecastSample {

    /**
     * 使用 Token 初始化账号Client
     * @return Client
     * @throws Exception
     */
    public static com.aliyun.dingtalkworkflow_1_0.Client createClient() throws Exception {
        Config config = new Config();
        config.protocol = "https";
        config.regionId = "central";
        return new com.aliyun.dingtalkworkflow_1_0.Client(config);
    }

    public static void main(String[] args_) throws Exception {
        java.util.List<String> args = java.util.Arrays.asList(args_);
        com.aliyun.dingtalkworkflow_1_0.Client client = Sample.createClient();
        ProcessForecastHeaders processForecastHeaders = new ProcessForecastHeaders();
        processForecastHeaders.xAcsDingtalkAccessToken = "ad14afadcb0337b887184e698fbce330";
        ProcessForecastRequest.ProcessForecastRequestFormComponentValuesDetailsDetails formComponentValues0Details0Details0 = new ProcessForecastRequest.ProcessForecastRequestFormComponentValuesDetailsDetails()
                .setId("PhoneField_IZI2LP8QF6O0")
                .setBizAlias("Phone")
                .setName("PhoneField")
                .setValue("123xxxxxxxx")
                .setExtValue("总个数:1")
                .setComponentType("TextField");
        ProcessForecastRequest.ProcessForecastRequestFormComponentValuesDetails formComponentValues0Details0 = new ProcessForecastRequest.ProcessForecastRequestFormComponentValuesDetails()
                .setId("PhoneField_IZI2LP8QF6O0")
                .setBizAlias("Phone")
                .setName("PhoneField")
                .setValue("123xxxxxxxx")
                .setExtValue("总个数:1")
                .setDetails(java.util.Arrays.asList(
                        formComponentValues0Details0Details0
                ));
        ProcessForecastRequest.ProcessForecastRequestFormComponentValues formComponentValues0 = new ProcessForecastRequest.ProcessForecastRequestFormComponentValues()
                .setId("PhoneField_IZI2LP8QF6O0")
                .setBizAlias("Phone")
                .setName("PhoneField")
                .setValue("123xxxxxxxx")
                .setExtValue("总个数:1")
                .setComponentType("TextField")
                .setDetails(java.util.Arrays.asList(
                        formComponentValues0Details0
                ));
        ProcessForecastRequest processForecastRequest = new ProcessForecastRequest()
                .setProcessCode("PROC-9B3DDE81-1DDE-4C2E-85A3-7A4B830A4F33")
                .setDeptId(1)
                .setUserId("18234952671296143")
                .setFormComponentValues(java.util.Arrays.asList(
                        formComponentValues0
                ));
        try {
            ProcessForecastResponse processForecastResponse = client.processForecastWithOptions(processForecastRequest, processForecastHeaders, new RuntimeOptions());
            System.out.println(1);
        } catch (TeaException err) {
            if (!com.aliyun.teautil.Common.empty(err.code) && !com.aliyun.teautil.Common.empty(err.message)) {
                // err 中含有 code 和 message 属性，可帮助开发定位问题
            }

        } catch (Exception _err) {
            TeaException err = new TeaException(_err.getMessage(), _err);
            if (!com.aliyun.teautil.Common.empty(err.code) && !com.aliyun.teautil.Common.empty(err.message)) {
                // err 中含有 code 和 message 属性，可帮助开发定位问题
            }

        }
    }
}