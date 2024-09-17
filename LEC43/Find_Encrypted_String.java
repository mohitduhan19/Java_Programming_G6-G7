package LEC43;

public class Find_Encrypted_String {
    public String getEncryptedString(String s, int k) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int idx = (i + k) % s.length();
            encrypted.append(s.charAt(idx));
        }
        return encrypted.toString();
    }
}
