package com.example.demo.download;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.UrlResource;

import org.springframework.core.io.Resource;

public class FileDownloadUtil {
	private Path foundFile;
	
	public Resource getFilesResource( String filecode) throws IOException {
		Path uploadDir =  Paths.get("Files-Upload");
		Files.list(uploadDir).forEach(file ->{
			if(file.getFileName().toString().startsWith(filecode)) {
				foundFile = file;
				return; 
			}
		});
		if (foundFile != null) {
            return new UrlResource(foundFile.toUri());
        }
		
		return null; 
	}

}
