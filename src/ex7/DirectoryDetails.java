package ex7;

import java.nio.file.FileVisitor;
import java.util.ArrayList;
import java.util.List;

// TODO: Implement Composite (change this file).
public class DirectoryDetails extends FileDetails {
    List<FileDetails> file_list = new ArrayList<>();
    public void Accept(Visitor vis){

    }
    public DirectoryDetails(String path, String name){
        super(path,name);
    }
    public void addFile(FileDetails fileDetails){
        file_list.add(fileDetails);
    }
}