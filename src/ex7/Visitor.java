package ex7;

public interface Visitor {

     void visit(DirectoryDetails file);
     void visit(JpgFileDetails file);
     void visit(HtmlFileDetails file);
     void visit(Mp3FileDetails file );
     void visit(PptxFileDetails file);
     void visit(TxtFileDetails file);
     void visit(DocxFileDetails file);
}
