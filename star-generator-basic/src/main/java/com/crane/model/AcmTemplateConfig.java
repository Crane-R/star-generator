package com.crane.model;

import lombok.Data;

/**
 * acm代码模板数据模型
 *
 * @Author Crane Resigned
 * @Date 2024/1/18 18:15:57
 */

@Data
public class AcmTemplateConfig {

    private boolean loop;

    private String author = "zxx";

    private String outputText = "Sum = ";

}
