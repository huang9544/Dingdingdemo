// This file is auto-generated, don't edit it. Thanks.
// 发起审批
package com.atp.sample;

import com.aliyun.tea.*;
import com.aliyun.teautil.models.*;
import com.aliyun.dingtalkworkflow_1_0.models.*;
import com.aliyun.teaopenapi.models.*;
import org.springframework.scheduling.annotation.Scheduled;

public class ProcessInstanceSample {

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

    @Scheduled(cron = "*/1 * * * * ?")
    public static void main(String[] args_) throws Exception {
        java.util.List<String> args = java.util.Arrays.asList(args_);
        com.aliyun.dingtalkworkflow_1_0.Client client = Sample.createClient();
        StartProcessInstanceHeaders startProcessInstanceHeaders = new StartProcessInstanceHeaders();
        startProcessInstanceHeaders.xAcsDingtalkAccessToken = "ad14afadcb0337b887184e698fbce330";
        StartProcessInstanceRequest.StartProcessInstanceRequestFormComponentValuesDetailsDetails formComponentValues0Details0Details0 = new StartProcessInstanceRequest.StartProcessInstanceRequestFormComponentValuesDetailsDetails()
                .setId("PhoneField_IZI2LP8QF6O0")
                .setBizAlias("Phone")
                .setName("PhoneField")
                .setValue("123xxxxxxxx")
                .setExtValue("总个数:1")
                .setComponentType("PhoneField");
        StartProcessInstanceRequest.StartProcessInstanceRequestFormComponentValuesDetails formComponentValues0Details0 = new StartProcessInstanceRequest.StartProcessInstanceRequestFormComponentValuesDetails()
                .setId("PhoneField_IZI2LP8QF6O0")
                .setBizAlias("Phone")
                .setName("PhoneField")
                .setValue("123xxxxxxxx")
                .setExtValue("总个数:1")
                .setDetails(java.util.Arrays.asList(
                        formComponentValues0Details0Details0
                ));
        StartProcessInstanceRequest.StartProcessInstanceRequestFormComponentValues formComponentValues0 = new StartProcessInstanceRequest.StartProcessInstanceRequestFormComponentValues()
                .setId("PhoneField_IZI2LP8QF6O0")
                .setBizAlias("myPhoneNumber")
                .setName("PhoneField")
                .setValue("123xxxxxxxx")
                .setExtValue("总个数:1")
                .setComponentType("PhoneField")
                .setDetails(java.util.Arrays.asList(
                        formComponentValues0Details0
                ));
        StartProcessInstanceRequest.StartProcessInstanceRequestTargetSelectActioners targetSelectActioners0 = new StartProcessInstanceRequest.StartProcessInstanceRequestTargetSelectActioners()
                .setActionerKey("manual_1918_5cd3_xxxx_6a98")
                .setActionerUserIds(java.util.Arrays.asList(
                        "26652461xxxx5992"
                ));
        StartProcessInstanceRequest.StartProcessInstanceRequestApprovers approvers0 = new StartProcessInstanceRequest.StartProcessInstanceRequestApprovers()
                .setActionType("会签：AND；或签：OR；单人：NONE")
                .setUserIds(java.util.Arrays.asList(
                        "user1"
                ));
        StartProcessInstanceRequest startProcessInstanceRequest = new StartProcessInstanceRequest()
                .setOriginatorUserId("manager432")
                .setProcessCode("PROC-9B3DDE81-1DDE-4C2E-85A3-7A4B830A4F33")
                .setDeptId(1L)
                .setMicroappAgentId(41605932L)
                .setApprovers(java.util.Arrays.asList(
                        approvers0
                ))
                .setCcList(java.util.Arrays.asList(
                        "user1"
                ))
                .setCcPosition("START、FINISH、START_FINISH")
                .setTargetSelectActioners(java.util.Arrays.asList(
                        targetSelectActioners0
                ))
                .setFormComponentValues(java.util.Arrays.asList(
                        formComponentValues0
                ));
        try {
            StartProcessInstanceResponse startProcessInstanceResponse = client.startProcessInstanceWithOptions(startProcessInstanceRequest, startProcessInstanceHeaders, new RuntimeOptions());
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