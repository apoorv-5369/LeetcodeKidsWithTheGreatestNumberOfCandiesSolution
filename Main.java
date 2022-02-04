class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int ext) {
        int max=arr[0]; // Initializing an integer max, whose value is equal to the first element of the given array.
        List<Boolean> result = new ArrayList<>(arr.length); // Intializing an ArrayList of Boolean type, to store the result.
        // Iterating through the given array, to find the kid with maximum candies.
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }
        // Iterating through the given array again to add the given number of extra candies to ith kid's candies, and then checking if the it is greater than or equal to the previous maximum.
        for(int i=0;i<arr.length;i++){
            arr[i]+=ext;
            if(arr[i]>=max) result.add(i, true); // Adding true to the result ArrayList, at ith index.
            else result.add(i, false); //Adding false to the result ArrayList, at ith index.
        }
        return result; // Returning the result ArrayList.
    }
}
