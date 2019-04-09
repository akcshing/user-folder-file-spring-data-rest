package com.codeclan.example.AnnotatingRelationshipsHW.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    @Column
    private String title;
    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    private List<File> files;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Folder(String title, User user){
        this.title = title;
        this.user = user;
        this.files = new ArrayList<>();
    }

    public Folder(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}