package ex7;

public class SizeCalculatorVisitor implements Visitor{
    private int size = 0;

    public int getSize() {
        return size;
    }

    @Override
    public void visit(DirectoryDetails file) {
        size = size;
    }

    @Override
    public void visit(JpgFileDetails file) {
        size += file.getSize();
    }

    @Override
    public void visit(HtmlFileDetails file) {
        size += file.getSize();
    }

    @Override
    public void visit(Mp3FileDetails file) {
        size += file.getSize();
    }

    @Override
    public void visit(PptxFileDetails file) {
        size += file.getSize();
    }

    @Override
    public void visit(TxtFileDetails file) {
        size += file.getSize();
    }

    @Override
    public void visit(DocxFileDetails file) {
        size += file.getSize();
    }
}
