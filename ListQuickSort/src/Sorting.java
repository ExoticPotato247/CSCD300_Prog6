public class Sorting {
    public static void quickSort(int[] array, int start, int end){

        if(end <= start) return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot -1);//sorts the left side
        quickSort(array, pivot + 1, end);//sorts the right side



    }
    public static int partition(int[] array, int start, int end){

        int pivot = array[end];
        int i = start -1;

        for(int j = start; j <= end -1; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
