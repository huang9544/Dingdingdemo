// This file is auto-generated, don't edit it. Thanks.
// 获取指定用户可见的审批表单列表
package com.atp.sample;

import com.aliyun.dingtalkworkflow_1_0.models.ListUserVisibleBpmsProcessesResponse;
import com.aliyun.tea.*;
import com.aliyun.teautil.models.RuntimeOptions;

public class UserVisibilitiesSample {

    /**
     * 使用 Token 初始化账号Client
     * @return Client
     * @throws Exception
     */
    public static com.aliyun.dingtalkworkflow_1_0.Client createClient() throws Exception {
        com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config();
        config.protocol = "https";
        config.regionId = "central";
        return new com.aliyun.dingtalkworkflow_1_0.Client(config);
    }

    public static void main(String[] args_) throws Exception {
        java.util.List<String> args = java.util.Arrays.asList(args_);
        com.aliyun.dingtalkworkflow_1_0.Client client = Sample.createClient();
        com.aliyun.dingtalkworkflow_1_0.models.ListUserVisibleBpmsProcessesHeaders listUserVisibleBpmsProcessesHeaders = new com.aliyun.dingtalkworkflow_1_0.models.ListUserVisibleBpmsProcessesHeaders();
        listUserVisibleBpmsProcessesHeaders.xAcsDingtalkAccessToken = "ad14afadcb0337b887184e698fbce330";
        com.aliyun.dingtalkworkflow_1_0.models.ListUserVisibleBpmsProcessesRequest listUserVisibleBpmsProcessesRequest = new com.aliyun.dingtalkworkflow_1_0.models.ListUserVisibleBpmsProcessesRequest()
                .setUserId("18234952671296143")
                .setMaxResults(10L)
                .setNextToken(0L);
        try {
            ListUserVisibleBpmsProcessesResponse listUserVisibleBpmsProcessesResponse = client.listUserVisibleBpmsProcessesWithOptions(listUserVisibleBpmsProcessesRequest, listUserVisibleBpmsProcessesHeaders, new RuntimeOptions());
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