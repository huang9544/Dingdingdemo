// This file is auto-generated, don't edit it. Thanks.
// 创建或更新审批表单模板
package com.atp.sample;

import com.aliyun.tea.*;
import com.aliyun.teautil.models.*;
import com.aliyun.dingtalkworkflow_1_0.models.*;
import com.aliyun.teaopenapi.models.*;

public class Sample {

    /**
     * 使用 Token 初始化账号Client
     *
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
        FormCreateHeaders formCreateHeaders = new FormCreateHeaders();
        formCreateHeaders.xAcsDingtalkAccessToken = "ad14afadcb0337b887184e698fbce330";
        // 1. 单行输入控件
        FormComponentProps formComponentProps1 = new FormComponentProps()
                .setComponentId("TextField-abcd")
                .setPlaceholder("请输入")
                .setLabel("单行输入")
                .setRequired(true);
        FormComponent formComponent1 = new FormComponent()
                .setComponentType("TextField")
                .setProps(formComponentProps1);
        // 2. 多行输入控件
        FormComponentProps formComponentProps2 = new FormComponentProps()
                .setComponentId("TextareaField-abcd")
                .setPlaceholder("请输入")
                .setLabel("多行输入")
                .setRequired(true);
        FormComponent formComponent2 = new FormComponent()
                .setComponentType("TextareaField")
                .setProps(formComponentProps2);
        // 3. 数字输入控件
        FormComponentProps formComponentProps3 = new FormComponentProps()
                .setComponentId("NumberField-abcd")
                .setPlaceholder("请输入")
                .setLabel("数字输入")
                .setUnit("元")
                .setRequired(true);
        FormComponent formComponent3 = new FormComponent()
                .setComponentType("NumberField")
                .setProps(formComponentProps3);
        // 4. 单选控件
        SelectOption option1 = new SelectOption();
        option1.setKey("option1");
        option1.setValue("选项1");
        SelectOption option2 = new SelectOption();
        option2.setKey("option2");
        option2.setValue("选项2");
        FormComponentProps formComponentProps4 = new FormComponentProps()
                .setComponentId("DDSelectField-abcd")
                .setPlaceholder("请选择")
                .setLabel("单选")
                .setBizAlias("staff_type")
                .setOptions(java.util.Arrays.asList(option1, option2))
                .setRequired(true);
        FormComponent formComponent4 = new FormComponent()
                .setComponentType("DDSelectField")
                .setProps(formComponentProps4);

        // 5. 多选控件
        SelectOption option3 = new SelectOption();
        option3.setKey("option1");
        option3.setValue("选项1");
        SelectOption option4 = new SelectOption();
        option4.setKey("option2");
        option4.setValue("选项2");
        FormComponentProps formComponentProps5 = new FormComponentProps()
                .setComponentId("DDMultiSelectField-abcd")
                .setPlaceholder("请选择")
                .setLabel("多选")
                .setOptions(java.util.Arrays.asList(option3, option4))
                .setRequired(true);
        FormComponent formComponent5 = new FormComponent()
                .setComponentType("DDMultiSelectField")
                .setProps(formComponentProps5);

        // 6. 日期控件
        FormComponentProps formComponentProps6 = new FormComponentProps()
                .setComponentId("DDDateField-abcd")
                .setPlaceholder("请选择")
                .setLabel("日期")
                .setUnit("小时")
                .setFormat("yyyy-MM-dd HH:mm")
                .setRequired(true);
        FormComponent formComponent6 = new FormComponent()
                .setComponentType("DDDateField")
                .setProps(formComponentProps6);

        // 7. 时间区间控件
        FormComponentProps formComponentProps7 = new FormComponentProps()
                .setComponentId("DDDateRangeField-abcd")
                .setPlaceholder("请选择")
                .setLabel("[\"开始时间\",\"结束时间\"]")
                .setUnit("小时")
                .setFormat("yyyy-MM-dd HH:mm")
                .setRequired(true);
        FormComponent formComponent7 = new FormComponent()
                .setComponentType("DDDateRangeField")
                .setProps(formComponentProps7);

        // 8. 文字说明控件
        FormComponentProps formComponentProps8 = new FormComponentProps()
                .setComponentId("TextNote-abcd")
                .setLabel("说明")
                .setContent("详细说明内容")
                .setLink("https://www.dingtalk.com/")
                .setPrint("0")
                .setRequired(false);
        FormComponent formComponent8 = new FormComponent()
                .setComponentType("TextNote")
                .setProps(formComponentProps8);

        // 9. 电话控件
        FormComponentProps formComponentProps9 = new FormComponentProps()
                .setComponentId("PhoneField-abcd")
                .setLabel("电话")
                .setMode("phone")
                .setRequired(true);
        FormComponent formComponent9 = new FormComponent()
                .setComponentType("PhoneField")
                .setProps(formComponentProps9);

        // 10. 图片控件
        FormComponentProps formComponentProps10 = new FormComponentProps()
                .setComponentId("DDPhotoField-abcd")
                .setLabel("图片");
        FormComponent formComponent10 = new FormComponent()
                .setComponentType("DDPhotoField")
                .setProps(formComponentProps10);

        // 11. 金额控件
        FormComponentProps formComponentProps11 = new FormComponentProps()
                .setComponentId("MoneyField-abcd")
                .setUpper("0")
                .setPlaceholder("请输入金额")
                .setLabel("奖金（元）");
        FormComponent formComponent11 = new FormComponent()
                .setComponentType("MoneyField")
                .setProps(formComponentProps11);

        // 12. 明细控件
        // 12.1. 明细中子控件 数字输入控件
        FormComponentProps childFormComponentProps1 = new FormComponentProps()
                .setComponentId("NumberField-child-1")
                .setPlaceholder("请输入")
                .setLabel("数字输入")
                .setUnit("元")
                .setRequired(true);
        FormComponent childFormComponentChild1 = new FormComponent()
                .setComponentType("NumberField")
                .setProps(childFormComponentProps1);

        // 12.2. 明细中子控件 单行输入控件
        FormComponentProps childFormComponentProps2 = new FormComponentProps()
                .setComponentId("TextField-child-2")
                .setPlaceholder("请输入")
                .setLabel("单行输入")
                .setRequired(true);
        FormComponent childFormComponent2 = new FormComponent()
                .setComponentType("TextField")
                .setProps(childFormComponentProps2);
        // 12.2. 明细中汇总子控件数字统计
        FormComponentProps.FormComponentPropsStatField statField1 = new FormComponentProps.FormComponentPropsStatField();
        statField1.setComponentId("NumberField-child-1");
        statField1.setLabel("数字输入");

        FormComponentProps formComponentProps12 = new FormComponentProps()
                .setComponentId("TableField-abcd")
                .setUpper("0")
                .setTableViewMode("table")
                .setLabel("明细")
                .setStatField(java.util.Arrays.asList(statField1));
        FormComponent formComponent12 = new FormComponent()
                .setComponentType("TableField")
                .setProps(formComponentProps12)
                .setChildren(java.util.Arrays.asList(childFormComponentChild1, childFormComponent2));


        // 13. 附件控件
        FormComponentProps formComponentProps13 = new FormComponentProps()
                .setComponentId("DDAttachment-abcd")
                .setLabel("附件");
        FormComponent formComponent13 = new FormComponent()
                .setComponentType("DDAttachment")
                .setProps(formComponentProps13);

        // 14. 联系人控件
        FormComponentProps formComponentProps14 = new FormComponentProps()
                .setComponentId("InnerContactField-abcd")
                .setLabel("联系人")
                .setChoice("1");
        FormComponent formComponent14 = new FormComponent()
                .setComponentType("InnerContactField")
                .setProps(formComponentProps14);

        // 15. 部门控件
        FormComponentProps formComponentProps15 = new FormComponentProps()
                .setComponentId("DepartmentField-abcd")
                .setLabel("部门")
                .setMultiple(false);
        FormComponent formComponent15 = new FormComponent()
                .setComponentType("DepartmentField")
                .setProps(formComponentProps15);

        // 16. 关联审批单控件
        AvaliableTemplate template = new AvaliableTemplate();
        template.setName("出差申请单");
        template.setProcessCode("出差申请单的ProcessCode");
        FormComponentProps formComponentProps16 = new FormComponentProps()
                .setComponentId("RelateField-abcd")
                .setLabel("关联审批单")
                .setAvailableTemplates(java.util.Arrays.asList(template));
        FormComponent formComponent16 = new FormComponent()
                .setComponentType("RelateField")
                .setProps(formComponentProps16);

        // 17. 省市区控件
        FormComponentProps formComponentProps17 = new FormComponentProps()
                .setComponentId("AddressField-abcd")
                .setLabel("省市区")
                .setPlaceholder("请选择")
                .setAddressModel("city");
        FormComponent formComponent17 = new FormComponent()
                .setComponentType("AddressField")
                .setProps(formComponentProps17);

        // 18. 评分控件
        FormComponentProps formComponentProps18 = new FormComponentProps()
                .setComponentId("StarRatingField-abcd")
                .setLabel("请输入")
                .setLimit(5);
        FormComponent formComponent18 = new FormComponent()
                .setComponentType("StarRatingField")
                .setProps(formComponentProps18);

        FormCreateRequest formCreateRequest = new FormCreateRequest()
                .setName("出差报销审批")
                .setDescription("用于员工差旅费用报销使用")
                .setFormComponents(java.util.Arrays.asList(
                        formComponent1, formComponent2, formComponent3, formComponent4, formComponent5,
                        formComponent6, formComponent7, formComponent8, formComponent9, formComponent10,
                        formComponent11, formComponent12, formComponent13, formComponent14, formComponent15,
                        formComponent16, formComponent17
                ));
        try {
            client.formCreateWithOptions(formCreateRequest, formCreateHeaders, new RuntimeOptions());
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