package com.gs.controller;

import com.gs.bean.ControllerResult;
import com.gs.common.PathUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/9/8.
 */
@Controller
@RequestMapping("/upload")
public class UploadController {

    @GetMapping("up_page")
    public String upPage() {
        return "upload";
    }

    /**
     * MultipartFile这个类封装了由页面传递过来的文件对象
     */
    @PostMapping("up")
    @ResponseBody
    public ControllerResult upload(MultipartFile file, HttpServletRequest request) {
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File(PathUtils.uploadDir(request) + "/" + file.getOriginalFilename()));
           // file.transferTo(new File(PathUtils.uploadDir(request) + "/" + file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ControllerResult.getSuccessResult("上传成功");
    }

}
