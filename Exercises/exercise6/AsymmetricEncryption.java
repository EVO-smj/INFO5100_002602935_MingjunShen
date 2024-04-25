import javax.crypto.*;
import java.security.*;
import java.util.Base64;

public class AsymmetricEncryption {
    public static KeyPair generateRSAKeyPair() throws NoSuchAlgorithmException {
        // Generate RSA Key Pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        return keyPairGenerator.generateKeyPair();
    }

    public static String encrypt(String message, PublicKey publicKey) throws Exception {
        // Asymmetric Encryption (RSA-2048)
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String encryptedMessage, PrivateKey privateKey) throws Exception {
        // Asymmetric Decryption (RSA-2048)
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] encryptedBytes = Base64.getDecoder().decode(encryptedMessage);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        return new String(decryptedBytes);
    }

    public static String sign(String message, PrivateKey privateKey) throws Exception {
        // Sign Message (RSA-2048)
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);
        signature.update(message.getBytes());
        byte[] signatureBytes = signature.sign();
        return Base64.getEncoder().encodeToString(signatureBytes);
    }

    public static boolean verify(String message, String signature, PublicKey publicKey) throws Exception {
        // Verify Signature (RSA-2048)
        Signature verifier = Signature.getInstance("SHA256withRSA");
        verifier.initVerify(publicKey);
        verifier.update(message.getBytes());
        byte[] signatureBytes = Base64.getDecoder().decode(signature);
        return verifier.verify(signatureBytes);
    }
}
