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
