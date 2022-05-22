package ex7;

public class StatisticsVisitor implements Visitor{
    @Override
    public void visit(DirectoryDetails file) {

        fileCountVisitor v = new fileCountVisitor();

        file.accept(v);
        System.out.println("Directory " + file.getName() + " has " + v.getFiles() + " files.");
    }

    @Override
    public void visit(JpgFileDetails file) {
        System.out.println("The picture " + file.getName() + " has an average of " + Math.round((float)file.getSize() / (file.getHeight() * file.getWidth())) + " bytes per pixel.");
    }

    @Override
    public void visit(HtmlFileDetails file) {
        System.out.println("The file " + file.getName() + " contains " + file.getLines() +" lines.");
    }

    @Override
    public void visit(Mp3FileDetails file) {
        System.out.println("The bitrate of " + file.getName() + " is " + Math.round((float)file.getSize()/ file.getLengthSec()) + " bytes per second.");
    }

    @Override
    public void visit(PptxFileDetails file) {
        System.out.println("The average slide size in Presentation " + file.getName() + " is " + Math.round((float)file.getSize()/ file.getSlides()) + ".");
    }

    @Override
    public void visit(TxtFileDetails file) {
        System.out.println("The file " + file.getName() + " contains " + file.getWords() + " words.");
    }

    @Override
    public void visit(DocxFileDetails file) {
        System.out.println("The file " + file.getName() + " has an average of " + Math.round((float)(file.getWords()/ file.getPages())) + " words per page.");
    }
}
