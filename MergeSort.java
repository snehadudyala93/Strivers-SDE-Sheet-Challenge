class MergeSort{
    public static void main(String[] args) {
        int[] array = {4,2,5,6,3,9,8,1,2,14,11};
        mergeSort(array, 0, array.length);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
    }
        public static void mergeSort(int[] arr, int low, int high){
            if(low < high){
                int mid = (low + high) / 2;
                mergeSort(arr, low, mid);
                mergeSort(arr, mid+1, high);
                merge(arr, low, mid, high);
            }
        }
        public static void merge(int[] arr, int low, int mid, int high) {
            int first = low;
            int second = mid + 1;
            int[] temp = new int[high - low + 1];
            int count = 0;
            while (first <= mid && second <= high) {
                if (arr[first] <= arr[second]) {
                    temp[count++] = arr[first++];
                } else {
                    temp[count++] = arr[second++];
                }
            }
            while (first <= mid) temp[count++] = arr[first++];
            while (second <= high) temp[count++] = arr[second++];
            for (int i = low; i <= high; i++) {
                arr[i] = temp[i - low];
            }
        }
}
