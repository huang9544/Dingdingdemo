// This file is auto-generated, don't edit it. Thanks.
// 获取表单schema
package com.atp.sample;

import com.aliyun.tea.*;
import com.aliyun.teautil.models.*;
import com.aliyun.dingtalkworkflow_1_0.models.*;
import com.aliyun.teaopenapi.models.*;

public class SchemaSample {

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
        QuerySchemaByProcessCodeHeaders querySchemaByProcessCodeHeaders = new QuerySchemaByProcessCodeHeaders();
        querySchemaByProcessCodeHeaders.xAcsDingtalkAccessToken = "ad14afadcb0337b887184e698fbce330";
        QuerySchemaByProcessCodeRequest querySchemaByProcessCodeRequest = new QuerySchemaByProcessCodeRequest()
                .setProcessCode("PROC-9B3DDE81-1DDE-4C2E-85A3-7A4B830A4F33");
        try {
            QuerySchemaByProcessCodeResponse querySchemaByProcessCodeResponse = client.querySchemaByProcessCodeWithOptions(querySchemaByProcessCodeRequest, querySchemaByProcessCodeHeaders, new RuntimeOptions());
            System.out.println(querySchemaByProcessCodeResponse.getBody().getResult());
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