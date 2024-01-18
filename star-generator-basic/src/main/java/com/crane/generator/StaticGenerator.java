package com.crane.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

/**
 * 静态文件生成
 *
 * @Author Crane Resigned
 * @Date 2024/1/18 17:22:32
 */
public class StaticGenerator {

    public static void copyFilesByHuTool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, true);
    }

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        String inputPath = new File("templates" + File.separator + "acm").getAbsolutePath();
        copyFilesByHuTool(inputPath, projectPath);
    }

}
