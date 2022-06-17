
public class VigenereCipher
{
    public static String vigenereCipherEncrypting(String data, String key)
    {
        StringBuilder encryptedData = new StringBuilder();
        data = data.toUpperCase();
        int counterKeySize = 0;
        for (int i = 0; i < data.length(); i++)
        {
            char charAt = data.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                encryptedData.append((char) ((charAt + key.charAt(counterKeySize) - 2 * 'A') % 26 + 'A'));
                counterKeySize = ++counterKeySize % key.length();
            }else{
                encryptedData.append(charAt);
            }
        }
        return encryptedData.toString();
    }

    public static String vigenereCipherDecryption(String data, String key)
    {
        StringBuilder stringBuilder = new StringBuilder();
        data = data.toUpperCase();
        int counterKeySize = 0;
        for (int i = 0; i < data.length(); i++)
        {
            char charAt = data.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                stringBuilder.append((char) ((charAt - key.charAt(counterKeySize) + 26) % 26 + 'A'));
                counterKeySize = ++counterKeySize % key.length();
            }
            else{
                stringBuilder.append(charAt);
            }

        }
        return stringBuilder.toString();
    }
}