class Solution {
    public long sumAndMultiply(int n) {
        List<Integer> list=new ArrayList();
        int temp=n;
        int sum=0;
        while(temp!=0){
            int digit=temp%10;
            if(digit!=0){
                list.add(digit);
                sum+=digit;
            }
            temp=temp/10;
        }
        long value=0;
        for(int i=list.size()-1;i>=0;i--){
            value=value*10+list.get(i);
        }
        long ans=value*sum;
        return ans;
    }
}