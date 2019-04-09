package com.codeclan.example.AnnotatingRelationshipsHW.components;

import com.codeclan.example.AnnotatingRelationshipsHW.Enums.Extension;
import com.codeclan.example.AnnotatingRelationshipsHW.models.File;
import com.codeclan.example.AnnotatingRelationshipsHW.models.Folder;
import com.codeclan.example.AnnotatingRelationshipsHW.models.User;
import com.codeclan.example.AnnotatingRelationshipsHW.repositories.FileRepository;
import com.codeclan.example.AnnotatingRelationshipsHW.repositories.FolderRepository;
import com.codeclan.example.AnnotatingRelationshipsHW.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args){

        User user = new User("Alex");
        userRepository.save(user);

        Folder folder = new Folder("cc_homeworks", user);
        folderRepository.save(folder);

        File file = new File("java_homework", Extension.JAVA, 144, folder);
        fileRepository.save(file);


    }
}
