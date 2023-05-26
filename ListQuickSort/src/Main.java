public class Main {
    public static void main(String args[]){

//        int[] array = {5,8,9,3,2,6,4,7,1};
//
//        for(int i = 0; i < array.length; i++){
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        Sorting.quickSort(array, 0, array.length -1);
//
//        for(int i = 0; i < array.length; i++){
//            System.out.print(array[i] + " ");
//        }


        DList testList = new DList();
        //Add nodes to the list
        testList.addLast(1);
        testList.addLast(2);
        testList.addLast(3);
        testList.addLast(4);


        //print the nodes of DoublyLinkedList
        testList.printNodes();
        System.out.println();
        testList = testList.swapNodes(testList, 1, 3);
        testList.printNodes();


    }

}