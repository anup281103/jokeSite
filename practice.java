import java.util.ArrayList;
class Solution{
static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer>Al=new ArrayList<>();
        int left=1;
        int right=1;
        int totalSum=0;
        for (int i = 0; i < arr.length; i++) {
           if(totalSum==s){
            if(left==right){
                if(!Al.isEmpty())Al.removeAll(Al);
                Al.add(right);
            }
            else{
                if(!Al.isEmpty())Al.removeAll(Al);
                Al.add(left);
                Al.add(right);
            }
            break;
           }
           if(totalSum<s){
            totalSum+=arr[i];
            if(totalSum<s)right++;
           }
           if(totalSum>s){
            totalSum-=arr[left-1];
            left++;
           }

        }
    }
}
