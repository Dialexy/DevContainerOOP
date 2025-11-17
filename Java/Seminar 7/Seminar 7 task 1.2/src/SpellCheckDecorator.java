public class SpellCheckDecorator extends DocumentDecorator {

    public SpellCheckDecorator(Document document) {
        super(document);
    }

    public void spellCheck() {
        System.out.println("Checking for spelling errors in the document");
        // TODO: Add actual spell-checking logic
        //       - Should check for common misspellings
        //       - Fix simple errors when writing
    }

    @Override
    public void write(String text) {
        super.write(text);
        spellCheck();
    }
}
