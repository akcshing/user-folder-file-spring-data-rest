package com.codeclan.example.AnnotatingRelationshipsHW.models;

import com.codeclan.example.AnnotatingRelationshipsHW.Enums.Extension;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    @Column
    private String name;
    @Column
    private Extension extension;
    @Column
    private int size;
    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public File(String name, Extension extension, int size, Folder folder){
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    public File(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Extension getExtension() {
        return extension;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
