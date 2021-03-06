package com.example.demo.controller;

import com.example.demo.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/")
public class TemplateController {

    @Autowired
    private FileUploadService fileUploadService;

    @GetMapping("login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("upload")
    public String getUpload() {
        return "upload";
    }

    @PostMapping("files")
    public String getFiles(@RequestParam("files") MultipartFile[] files) throws IOException {
        fileUploadService.UploadFile(files);
        return "confirmation";
    }
}
