public class Solution
{
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation)
    {
        int n = permutation.size();
        int index = -1;
        for(int i = n-2; i >= 0; i--){
            if(permutation.get(i) < permutation.get(i+1)){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(permutation,0);
            return permutation;
        }

        for(int i = n-1; i > index; i--){
            if(permutation.get(i) > permutation.get(index)){
                swap(permutation,i,index);
                break;
            }
        }
        reverse(permutation,index+1);
        return permutation;
    }
    public static void reverse(ArrayList<Integer> permutation,int i){
        int n = permutation.size()-1;
        while(i < n){
            swap(permutation,i,n);
            i++;
            n--;
        }
    }
    public static void swap(ArrayList<Integer> permutation,int i,int index){
        int temp = permutation.get(i);
        permutation.set(i,permutation.get(index));
        permutation.set(index, temp);
    }
}