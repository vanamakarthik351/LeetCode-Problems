class Solution {
    public int compress(char[] chars) {
        if (chars == null || chars.length == 0) {
            return 0;
        }
        
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                result.append(chars[i - 1]);
                if (count > 1) {
                    result.append(count);
                }
                count = 1;
            }
        }
        
        result.append(chars[chars.length - 1]);
        if (count > 1) {
            result.append(count);
        }
        
        for (int i = 0; i < result.length(); i++) {
            chars[i] = result.charAt(i);
        }
        
        return result.length();
    }
}