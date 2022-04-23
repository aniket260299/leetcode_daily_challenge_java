/**
 * @author Aniket
 */

class Codec {
    public String encode(String longUrl) {
        char[] encoded = longUrl.toCharArray();
        int n = encoded.length;
        for (int i = 0; i < n; i++) {
            encoded[i]++;
        }
        return new String(encoded);
    }

    public String decode(String shortUrl) {
        char[] decoded = shortUrl.toCharArray();
        int n = decoded.length;
        for (int i = 0; i < n; i++) {
            decoded[i]--;
        }
        return new String(decoded);
    }
}
