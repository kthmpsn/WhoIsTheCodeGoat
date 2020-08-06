public class Problem04 {
    static int[] solve(int arr[], int n)
    {
        // Initialize a variable to store the
        // total product of the array elements
        int[] productArry = new int[n];
        int prod = 1;
        for (int i = 0; i < n; i++)
            prod *= arr[i];


        // as x*(y to power -1)
        for (int i = 0; i < n; i++)
            productArry[i] = (int) (prod * Math.pow(arr[i], -1));

            return productArry;
    }


    public static void main(String args[])
    {
        int arr[] = { 10, 3, 5, 6, 2 };
        int n = arr.length;
        solve(arr, n);
    }

}

