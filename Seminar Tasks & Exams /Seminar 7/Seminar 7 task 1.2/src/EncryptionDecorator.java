import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionDecorator extends DocumentDecorator {

    public EncryptionDecorator(Document document) {
        super(document);
    }

    private static final String ALGORITHM = "AES";
    private static final byte[] KEY = "1234567890123456".getBytes();

    public String encryptDocument(String text) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            SecretKeySpec secretKey = new SecretKeySpec(KEY, ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(text.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        }
        catch (javax.crypto.NoSuchPaddingException | java.security.NoSuchAlgorithmException | java.security.InvalidKeyException | javax.crypto.IllegalBlockSizeException | javax.crypto.BadPaddingException e) {
            throw new RuntimeException("Error while encrypting", e);
        }
    }

    public String decryptDocument(String encryptedText) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            SecretKeySpec secretKey = new SecretKeySpec(KEY, ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes);
        }
        catch (Exception e) {
            throw new RuntimeException("Error while decrypting", e);
        }
    }

    @Override
    public void write(String text) {
        super.write(text);
        encryptDocument(text);
    }
}
