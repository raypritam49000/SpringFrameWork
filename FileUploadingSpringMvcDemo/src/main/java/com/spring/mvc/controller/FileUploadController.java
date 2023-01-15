package com.spring.mvc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home Handler");
		return "home";
	}
	
	@RequestMapping(value="/uploadImage",method = RequestMethod.POST)
	public String uploadImage(@RequestParam("profile") CommonsMultipartFile file,HttpSession session,Model m) throws IOException {
		System.out.println("File Upload Handler..."); 
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getFileItem());
		System.out.println(file.getInputStream());
		System.out.println(file.getBytes());
		System.out.println(file.getClass());
		
		byte[] data = file.getBytes();
		
		String path1 = session.getServletContext().getRealPath("/WEB-INF/resources/image/")+file.getOriginalFilename();
		String path2 = session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(path1);
		System.out.println(path2);
		
		// we have to save image to the server
		try 
		{
		FileOutputStream fout = new FileOutputStream(path1);
		fout.write(data);
		fout.close();
		
		m.addAttribute("msg","File Upload SuccessFully...");
		m.addAttribute("filename",file.getOriginalFilename());
		
		System.out.println("File Uploaded...");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			System.out.println("Upload Error...");
			
		}
		
		return "success";
	}

}
