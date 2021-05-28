package com.javacodingskills.spring.batch.demo1;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
//@ComponentScan(basePackages = {"com.javacodingskills.spring.batch.demo1"})
public class SpringBatchDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchDemo1Application.class, args);
	}

	// public void write(List<? extends Task> task) throws Exception {
//// System.out.println("Data Saved for Users: " +task );
// taskRepository.saveAll(task);
// moveFile("src/main/resources/job");
// }
//
// public void deleteFile(String dirFile) {
//
// File file = new File(dirFile);
// if(file.exists()) {
// file.delete();
// }else{
// return;
// }
// }
//
// public void moveFile(String dir) throws IOException {
//
// File direc = new File(dir);
// File file = new File(direc,direc.list()[0]);
// Path temp = Files.move(Paths.get(file.getPath()),Paths.get("src/main/resources/done/"+file.getName()));
// System.out.println(file.getName());
// if(temp != null)
// {
// System.out.println("File renamed and moved successfully");
// }
// else
// {
// System.out.println("Failed to move the file");
// }
// deleteFile(file.getPath());
// }
}
