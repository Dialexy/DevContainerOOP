public class AutoSaveDecorator extends DocumentDecorator {

    public AutoSaveDecorator(Document document) {
        super(document);
    }

    public void saveDocument() {
        System.out.println("Saving document");
        // TODO: add saving logic
        //       - Should save to file after every write
        //       - Display save confirmation

    }

    @Override
    public void write(String text) {
        super.write(text);
        saveDocument();
    }
}
