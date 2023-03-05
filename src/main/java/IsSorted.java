public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        
        for(int i = 0; i < arr.length-1; i++){//length -1 because last value does not need to be compared
            if(arr[i] > arr[i+1]){ // current index value compared to the upcoming index value
                return false; // will return flase if current value is greater than next value
            }

        }
        
        return true;

    }
}
