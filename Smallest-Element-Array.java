//Give an array, we have to find the smallest element in array:
//sample input:
//input : arr[] ={2,5,1,3,0 }
//output: 0
//sample input: 
// arr[] = {8,10,5,7,9}
//output: 5  


//Code 

public class SmallestElement {
    public static void main(String[] args) {
        // Sample input
        int[] arr = {8,10,5,7,9};
        //  find the smallest element
        int smallest = findSmallestElement(arr);
        System.out.println("Smallest element: " + smallest);
    }

    public static int findSmallestElement(int[] arr) {
        // Step 1: Assuming first element is the smallest
        int smallest = arr[0];

        // Step 2: Loop through the array to find the smallest element
        for (int i = 1; i < arr.length; i++) {
            // Step 3: If current element is smaller, update the smallest variable
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}




