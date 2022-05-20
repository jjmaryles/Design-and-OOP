package ex7;


public class fileCountVisitor implements Visitor{

    int files = 0;

    public int getFiles() {
        return files;
    }

    @Override
    public void visit(DirectoryDetails file) {

    }

    @Override
    public void visit(JpgFileDetails file) {
        files++;
    }

    @Override
    public void visit(HtmlFileDetails file) {
        files++;
    }

    @Override
    public void visit(Mp3FileDetails file) {
        files++;
    }

    @Override
    public void visit(PptxFileDetails file) {
        files++;
    }

    @Override
    public void visit(TxtFileDetails file) {
        files++;
    }

    @Override
    public void visit(DocxFileDetails file) {
        files++;
    }
}
