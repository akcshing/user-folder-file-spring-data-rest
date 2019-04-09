package com.codeclan.example.AnnotatingRelationshipsHW;

import com.codeclan.example.AnnotatingRelationshipsHW.Enums.Extension;
import com.codeclan.example.AnnotatingRelationshipsHW.models.File;
import com.codeclan.example.AnnotatingRelationshipsHW.models.Folder;
import com.codeclan.example.AnnotatingRelationshipsHW.models.User;
import com.codeclan.example.AnnotatingRelationshipsHW.repositories.FileRepository;
import com.codeclan.example.AnnotatingRelationshipsHW.repositories.FolderRepository;
import com.codeclan.example.AnnotatingRelationshipsHW.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotatingRelationshipsHwApplicationTests {

	@Autowired
	FileRepository fileRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateUser(){
		User user = new User("Alex");
		userRepository.save(user);
	}

	@Test
	public void canCreateFolder(){
		User user = new User("Alex");
		userRepository.save(user);
		Folder folder = new Folder("folder", user);
		folderRepository.save(folder);
	}

	@Test
	public void canCreateFile(){
		User user = new User("Alex");
		userRepository.save(user);
		Folder folder = new Folder("folder", user);
		folderRepository.save(folder);
		File file = new File("file", Extension.JAVA, 128, folder);
		fileRepository.save(file);
	}

}
