package ex7;

public class shortPrintVisitor implements Visitor{

    @Override
    public void visit(DirectoryDetails file) {
         System.out.println(  file.getName());
    }

    @Override
    public void visit(JpgFileDetails file) {
        System.out.println(  file.getName());
    }

    @Override
    public void visit(HtmlFileDetails file) {
        System.out.println(  file.getName());
    }

    @Override
    public void visit(Mp3FileDetails file) {
        System.out.println(  file.getName());
    }

    @Override
    public void visit(PptxFileDetails file) {
        System.out.println(  file.getName());
    }

    @Override
    public void visit(TxtFileDetails file) {
        System.out.println(  file.getName());
    }

    @Override
    public void visit(DocxFileDetails file) {
        System.out.println(  file.getName());
    }
}
