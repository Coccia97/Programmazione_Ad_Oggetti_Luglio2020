package com.Exam.FacebookPhoto;

import com.Exam.FacebookPhoto.service.DownloadFromURL;
import com.Exam.FacebookPhoto.service.StringParser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		String url = "https://graph.facebook.com/v7.0/me?fields=photos&access_token=EAAH51tUzLoUBAEH4JY5lP7Sb6nlGcDExUc5CiH3QWQerwe1wLNg2NdTX1Jtv100KAp96eHdMVOLZBoyAGkQUykjujucJAQlXUioZCOUVnMRH9jZBZAczD7E1T2F0J075sF5QezcqTUM9sFO6CJqF5qkCHExDzFQofXZAlzsCaLE7yUsdw9ZCmYdnbYyA8bZBLHqYUygkwP3EXwUMEe6O9tuQ5kNTgvtWstGHeXXCNBgwQZDZD";
		DownloadFromURL json = new DownloadFromURL();
		String test1 = json.JsonToString(url);
		StringParser.StringToPhotos(test1);

		SpringApplication.run(Main.class, args);

	}
}
