class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            String arr[]=sentences[i].split("\\s+");
            int len=arr.length;
            max=Math.max(len,max);
        }
        return max;
    }
}