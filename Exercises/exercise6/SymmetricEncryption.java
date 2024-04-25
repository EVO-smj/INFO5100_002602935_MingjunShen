import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;
import java.util.Base64;

public class SymmetricEncryption {
    public static SecretKey generateAESKey() throws NoSuchAlgorithmException {
        // Generate AES key
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        return keyGenerator.generateKey();
    }

    public static String encrypt(String message, SecretKey key, GCMParameterSpec spec) throws Exception {
        // Symmetric Encryption (AES-256)
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(Cipher.ENCRYPT_MODE, key, spec);
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String encryptedMessage, SecretKey key, GCMParameterSpec spec) throws Exception {
        // Symmetric Decryption (AES-256)
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(Cipher.DECRYPT_MODE, key, spec);
        byte[] encryptedBytes = Base64.getDecoder().decode(encryptedMessage);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        return new String(decryptedBytes);
    }

    private static byte[] generateRandomIV() {
        // Generate IV
        SecureRandom random = new SecureRandom();
        byte[] iv = new byte[12];
        random.nextBytes(iv);
        return iv;
    }

    public static GCMParameterSpec generateGCMParameterSpec() {
        // Generate GCM Parameter Spec
        byte[] iv = generateRandomIV();
        return new GCMParameterSpec(128, iv);
    }
}
