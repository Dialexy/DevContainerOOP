public class SpellCheckDecorator extends DocumentDecorator {

    public SpellCheckDecorator(Document document) {
        super(document);
    }

    public void spellCheck() {
        System.out.println("Checking for spelling errors in the document");
        // yeah actually adding a proper spell checker would be insane I'm ngl so you get what's above instead.
   }

    @Override
    public void write(String text) {
        super.write(text);
        spellCheck();
    }
}
