package com.hackmidwest.cloudinary;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.cloudinary.Singleton;
import com.cloudinary.SingletonManager;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		Cloudinary cloudinary = new Cloudinary
				(ObjectUtils.asMap("cloud_name", "cloud_name", "api_key", "api_key",
				"api_secret", "api_secret"));
		
		SingletonManager manager = new SingletonManager();
		manager.setCloudinary(cloudinary);
		manager.init();
		File toUpload = new File("download.jpg");
		Map uploadResult = cloudinary.uploader().upload(toUpload, ObjectUtils.emptyMap());
	}
}
