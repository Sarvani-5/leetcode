class Solution {
    public int compress(char[] chars) {
        if (chars.length <= 1) {
            return chars.length;
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                compressed.append(chars[i - 1]);
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }
        char[] compressedChars = compressed.toString().toCharArray();
        int size = compressedChars.length;
        for (int j = 0; j < size && j < chars.length; j++) {
            chars[j] = compressedChars[j];
        }

        return size;
    }
}
