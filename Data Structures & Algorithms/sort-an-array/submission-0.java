class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int[] nums,int l,int h){
        if(l>=h){
            return;
        }
        int mid=(l+h)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,h);
        merge(nums,l,mid,h);
    }
    public void merge(int[] nums,int l,int mid,int h){
        int[] a=new int[h-l+1];
        int c=0;
        int i=l;
        int j=mid+1;
        while(i<=mid  && j<=h){
            if(nums[i]<nums[j]){
                a[c]=nums[i];
                i++;
            }
            else{
                a[c]=nums[j];
                j++;
            }
            c++;
        }
        while(i<=mid){
            a[c]=nums[i];
            c++;
            i++;
        }
        while(j<=h){
            a[c]=nums[j];
            c++;
            j++;
        }
        i=0;
        for(int k=l;k<=h;k++,i++){
            nums[k]=a[i];
        }
    }
}