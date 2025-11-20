public abstract class DocumentDecorator implements Document {
    protected Document document;

    public DocumentDecorator(Document document) {
        this.document = document;
    }

    @Override
    public void write(String text) {
        document.write(text);
    }

    @Override
    public String read() {
        return document.read();
    }
}
