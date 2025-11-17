public class EncryptionDecorator extends DocumentDecorator {

    public EncryptionDecorator(Document document) {
        super(document);
    }

    public void encryptDocument() {
        System.out.println("Encrypting file");
        // TODO: Create EncryptionDecorator
        //       - Should encrypt content when writing
        //       - Decrypt when reading
    }

    @Override
    public void write(String text) {
        super.write(text);
        encryptDocument();
    }
}
