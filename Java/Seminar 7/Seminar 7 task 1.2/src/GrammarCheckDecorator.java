public class GrammarCheckDecorator extends DocumentDecorator {

    public GrammarCheckDecorator(Document document) {
        super(document);
    }

    public void checkGrammar() {
        System.out.println("Checking for grammatical errors in the document");
        // TODO: add check grammar logic
        //       - Should check for grammar issues
        //       - Add warnings when reading
    }

    @Override
    public void write(String text) {
        super.write(text);
        checkGrammar();
    }
}
