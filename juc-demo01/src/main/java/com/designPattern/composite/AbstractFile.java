package com.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
    void killVirus();
}

class ImageFile implements AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("*** kill imageFile ***");
    }
}

class TextFile implements AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("*** kill TextFile ***");
    }
}

class VedioFile implements AbstractFile {
    private String name;

    public VedioFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("*** kill VedioFile ***");
    }
}


class Folder implements AbstractFile {
    private String name;
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file){
        list.add(file);
    }

    public void remove(AbstractFile file){
        list.remove(file);
    }

    public AbstractFile getChild(int index){
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("*** 文件夹"+name+" **杀毒");
        for(AbstractFile file: list){
            file.killVirus();
        }
    }
}