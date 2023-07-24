package com.sky.utils;
/*
 * @author  MaRui
 * @date  2023/7/24 13:04
 * @version 1.0
 */


import java.io.InputStream;
import java.util.UUID;
import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.DownloadUrl;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import com.qiniu.storage.Configuration;
import lombok.Data;
import lombok.experimental.PackagePrivate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.InputStream;

/**
 * @author MaRui
 */
@Component
@Data
@ConfigurationProperties(prefix = "qiniuyun")
public class QiniuUtil {
    // 设置需要操作的账号的AK和SK
    public static String accessKey = "EgWJOo-144oVkEGua-A5j06LT8-vHCDHeVtA78Y6";
    public static String secretKey = "M1vqWmOHkl8nFmhXnpVfQ4tgKUWr68krW97YuOAF";
    public static String bucket = "sky-take-out-bing";
    public static String domain = "http://ryabmpz7y.hn-bkt.clouddn.com";

    /**
     * 上传文件并且返回文件地址
     *
     * @param inputStream 文件
     */
    public String setUploadManager(InputStream inputStream) {
        //设置密钥、文件连接、文件名等等属性
        //构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.huanan());
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //设置连接地址
        Auth auth = Auth.create(accessKey, secretKey);
        String prefix = "";
        int Guid = 100;
        try {
            String s = auth.uploadToken(bucket);
            //生成文件名
            String s1 = UUID.randomUUID().toString().replaceAll("-","");
            //实现文件上传
            Response response = uploadManager.put(inputStream, s1, s, null, null);
            //解析上传成功结果
            DefaultPutRet defaultPutRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            new DownloadUrl(domain,false,secretKey);
            //返回文件外链地址
            return domain + "/" + defaultPutRet.key;
        } catch (QiniuException e) {
            e.printStackTrace();
            return null;
        }
    }
}
