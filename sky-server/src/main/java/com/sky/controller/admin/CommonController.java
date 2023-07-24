package com.sky.controller.admin;
/*
 * @author  MaRui
 * @date  2023/7/24 12:47
 * @version 1.0
 */


import com.sky.result.Result;
import com.sky.utils.QiniuUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItem;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;

/**
 * @author MaRui
 */
@RestController
@RequestMapping("/admin/common")
@Api(tags = "通用接口")
@Slf4j
public class CommonController {

    /**
     * 文件上传
     * @param file
     * @return
     */
    @PostMapping("/upload")
    @ApiOperation("文件上传")
    public Result<String> upload(MultipartFile file) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(file.getBytes());
        log.info("文件上传");
        String s = new QiniuUtil().setUploadManager(inputStream);
        return Result.success(s);
    }

}
