import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AutoSaveDecorator extends DocumentDecorator {

    public AutoSaveDecorator(Document document) {
        super(document);
    }

    public void saveDocument() {
        System.out.println("Saving document...");
        try {
            Files.writeString(Path.of("document.txt"), document.read());
            System.out.println("Document saved successfully.");
        }
        catch (IOException e) {
            System.err.println("Failed to save document: " + e.getMessage());
        }
    }

    @Override
    public void write(String text) {
        super.write(text);
        saveDocument();
    }
}
