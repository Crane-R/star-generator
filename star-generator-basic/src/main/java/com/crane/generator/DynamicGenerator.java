package com.crane.generator;

import com.crane.model.AcmTemplateConfig;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 动态文件生成
 *
 * @Author Crane Resigned
 * @Date 2024/1/18 18:14:41
 */
public class DynamicGenerator {

    public static void doGenerate(String inputPath, String outputPath, Object model) throws IOException, TemplateException {

        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);

        File templateDir = new File(inputPath).getParentFile();
        configuration.setDirectoryForTemplateLoading(templateDir);

        configuration.setDefaultEncoding("utf-8");

        Template template = configuration.getTemplate(new File(inputPath).getName());

        AcmTemplateConfig acmTemplateConfig = new AcmTemplateConfig();
        acmTemplateConfig.setAuthor("zxc");
        acmTemplateConfig.setLoop(false);
        acmTemplateConfig.setOutputText("求和结果：");

        Writer out = new FileWriter(outputPath);
        template.process(model,out);

        out.close();
    }


    public static void main(String[] args) throws TemplateException, IOException {
        String projectPath = System.getProperty("user.dir");
        String inputPath = projectPath + File.separator + "star-generator-basic/src/main/resources/templates/acm.java.ftl";
        String outputPath = projectPath + File.separator + "tempoutput/Main.java";
        AcmTemplateConfig mainTemplateConfig = new AcmTemplateConfig();
        mainTemplateConfig.setAuthor("yupi");
        mainTemplateConfig.setLoop(false);
        mainTemplateConfig.setOutputText("求和结果：");
        doGenerate(inputPath, outputPath, mainTemplateConfig);
    }

}
