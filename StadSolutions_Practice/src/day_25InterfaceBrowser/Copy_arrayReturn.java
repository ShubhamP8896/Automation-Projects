package day_25InterfaceBrowser;

// Copy Array program with the method returning the array

import java.util.Arrays;

class arrayReturn
{
    public int[] copyArray(int a[]) 
    {
        int b[] = new int[5];  // Create an array to store the copied values
        for (int i = 0; i < a.length; i++) 
        {
            b[i] = a[i];  // Copy each element from array 'a' to array 'b'
        }
        return b;  // Return the copied array
    }
}

class Copy_arrayReturn 
{

    public static void main(String[] args)
    {
        int i, c = 10;
        int a[] = new int[5];  // Declare an array 'a' of size 5

        // Fill the array 'a' with values
        
        for (i = 0; i < a.length; i++) 
        {
            a[i] = c;
            c = c + 10;
        }

        // Print the original array 'a'
        
        System.out.println("Original Array: " + Arrays.toString(a));

        // Create an instance of the arrayReturn class
        
        arrayReturn ta = new arrayReturn();

        // Call the copyArray method and print the copied array
        int[] copiedArray = ta.copyArray(a);      //we stored that copy array here
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));          // we are calling copy array
    }
}
