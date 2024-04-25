import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;
import java.util.Base64;

public class CryptoMessage {
    public static void main(String[] args) throws Exception {
        // Generate AES key and RSA keypair
        SecretKey aesKey = SymmetricEncryption.generateAESKey();
        KeyPair rsaKeyPair = AsymmetricEncryption.generateRSAKeyPair();

        // Message from Alice to Bob
        String message = "Hello Bob, this is Alice!";

        // Symmetric Encryption and Decryption (AES-256)
        GCMParameterSpec spec = SymmetricEncryption.generateGCMParameterSpec();
        String encryptedSymmetric = SymmetricEncryption.encrypt(message, aesKey, spec);
        String decryptedSymmetric = SymmetricEncryption.decrypt(encryptedSymmetric, aesKey, spec);
        System.out.println("\nDemonstrate symmetric encryption and decryption of message sent between Alice and Bob: ");
        System.out.println("Symmetric Encrypted Message: " + encryptedSymmetric);
        System.out.println("Symmetric Decrypted Message: " + decryptedSymmetric);

        // Asymmetric Encryption and Decryption (RSA-2048)
        String encryptedAsymmetric = AsymmetricEncryption.encrypt(message, rsaKeyPair.getPublic());
        String decryptedAsymmetric = AsymmetricEncryption.decrypt(encryptedAsymmetric, rsaKeyPair.getPrivate());
        System.out.println("\nDemonstrate asymmetric encryption and decryption of message sent between Alice and Bob: ");
        System.out.println("Asymmetric Encrypted Message: " + encryptedAsymmetric);
        System.out.println("Asymmetric Decrypted Message: " + decryptedAsymmetric);

        // Signing and Signature Validation (RSA-2048)
        String signature = AsymmetricEncryption.sign(message, rsaKeyPair.getPrivate());
        boolean isVerified = AsymmetricEncryption.verify(message, signature, rsaKeyPair.getPublic());
        System.out.println("\nDemonstrate signing a message and validating the signature using RSA-2048 keys between Alice and Bob: ");
        System.out.println("Message Signature: " + signature);
        System.out.println("Is Signature Valid? " + isVerified);
    }
}
