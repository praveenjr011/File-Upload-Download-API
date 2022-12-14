package com.example.demo.upload;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.util.StringUtils;

@RestController
public class FileUploadController {

	
	@PostMapping("/uploadFile")
	public ResponseEntity<FileUpload>uploadFile(
			@RequestParam("file") MultipartFile	multipartFile) throws IOException{
		
		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		long size = multipartFile.getSize();
		
		String fileCode = FileUploadUtil.saveFile(fileName, multipartFile);
		
		FileUpload response = new FileUpload();
		response.setFileName(fileName);
		response.setSize(size);
		response.setUri("/downloadFile/" + fileCode);
		
		return new ResponseEntity<>( response ,HttpStatus.OK);
	}
}
