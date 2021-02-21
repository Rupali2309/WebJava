package in.edac;

import java.io.File;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/my")
public class MyRestActions {
	
	
	
	
	@GetMapping("/")
	public String sayHi() {
		return "Hiii";
		
	}
	
	@GetMapping("/my-list")
	public List<String>myList(){
		return Arrays.asList("Ahmednagar","Mumbai","Kolkata");
		
	}
	
	@PostMapping("/uplaod-demo")
	public String fileUploadRestDemo(MultipartFile myfile,String username)throws IllegalStateException,IOException{
	
		System.out.println(myfile);
		
		myfile.transferTo(new File("/Users/HP/Desktop/images/image1.jpg"));
		return "File Upload Demo" +username;
	}
	
	
	
   @PostMapping("/upload-demo-v1")
	public String fileUploadRestDemoV1(MultipartFile myfile,String username) throws IllegalStateException,IOException{
	
	   long randomNumber = System.currentTimeMillis();
	   String stroagePath = "/Users\\HP\\Desktop/";
	   String destinationPath = stroagePath + randomNumber +".jpg";
	   myfile.transferTo(new File(destinationPath));
	   return "File Upload Demo" + username;
	   
	   
	   
	   
	   
	}
	

}
