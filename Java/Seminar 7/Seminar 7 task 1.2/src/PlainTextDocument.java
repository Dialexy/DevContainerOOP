public class PlainTextDocument implements Document {
    private final StringBuilder content = new StringBuilder();

    @Override
    public void write(String text) {
        content.append(text);
    }

    @Override
    public String read() {
        return content.toString();
    }
}

// TODO: Create SpellCheckDecorator
//       - Should check for common misspellings
//       - Fix simple errors when writing

// TODO: Create GrammarCheckDecorator
//       - Should check for grammar issues
//       - Add warnings when reading

// TODO: Create AutoSaveDecorator
//       - Should save to file after every write
//       - Display save confirmation

// TODO: Create EncryptionDecorator
//       - Should encrypt content when writing
//       - Decrypt when reading

// TODO: Test with various combinations of decorators
