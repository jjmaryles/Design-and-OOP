package ex7;

public class StatisticsVisitor implements Visitor{
    @Override
    public void visit(DirectoryDetails file) {
        System.out.println("Directory " + file.getName() + " has " + file.getSize() + " files.");
    }

    @Override
    public void visit(JpgFileDetails file) {
        System.out.println("The picture " + file.getName() + " averages " + Math.round((float)file.getSize() / (file.getHeight() * file.getWidth())) + " bytes per pixel.");
    }

    @Override
    public void visit(HtmlFileDetails file) {
        System.out.println("The file " + file.getName() + " has " + file.getLines() +".");
    }

    @Override
    public void visit(Mp3FileDetails file) {
        System.out.println("The speed of " + file.getName() + " is " + Math.round((float)file.getSize()/ file.getLengthSec()) + "bps.");
    }

    @Override
    public void visit(PptxFileDetails file) {
        System.out.println("The average slide size in  " + file.getName() + " is " + Math.round((float)file.getSize()/ file.getSlides()) + ".");
    }

    @Override
    public void visit(TxtFileDetails file) {
        System.out.println("The file " + file.getName() + " has " + file.getWords() + " words.");
    }

    @Override
    public void visit(DocxFileDetails file) {
        System.out.println("The file " + file.getName() + " has an average of " + Math.round((float)(file.getWords()/ file.getPages())) + ".");
    }
}
