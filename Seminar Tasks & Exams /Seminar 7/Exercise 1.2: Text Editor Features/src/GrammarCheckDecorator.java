public class GrammarCheckDecorator extends DocumentDecorator {

    public GrammarCheckDecorator(Document document) {
        super(document);
    }

    public void checkGrammar() {
        System.out.println("Checking for grammatical errors in the document");
        // I would add the logic here but it involves pulling through an API key and I'm not doing that for uni.
    }

    @Override
    public void write(String text) {
        super.write(text);
        checkGrammar();
    }
}
