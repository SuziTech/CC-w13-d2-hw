package com.codeclan.UserFolderFileHomework.components;

import com.codeclan.UserFolderFileHomework.repositories.FileRepository;
import com.codeclan.UserFolderFileHomework.repositories.FolderRepository;
import com.codeclan.UserFolderFileHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public void run(ApplicationArguments args) {

    }
}
