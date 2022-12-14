package com.example.demo.upload;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {
	public static String saveFile(String fileName,MultipartFile multipartFile) throws IOException {
		 Path uploadDir = Paths.get("files-upload");
		 
		 String fileCode = RandomStringUtils.randomAlphanumeric(5);
		 
		 
		 try(InputStream inputStream =  multipartFile.getInputStream() ){
			Path filepath = uploadDir.resolve( fileCode + "-" + fileName);
			Files.copy(inputStream, filepath,StandardCopyOption.REPLACE_EXISTING);
		 }
		 catch(IOException ioe) {
			 throw new IOException("Error  : " + fileName,ioe);
		 }
		return fileCode;
	}

}
