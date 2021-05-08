package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileUploadService {
    public void UploadFile(MultipartFile[] files) throws IOException {
        for(MultipartFile file:files){
            file.transferTo(new File("C:\\Downloads\\" + file.getOriginalFilename()));
        }
    }
}
