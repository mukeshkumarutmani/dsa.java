 class Dsa1{
    public static void main(String[] args) {
        int[] num = { 9, 11, 14, 17, 21, 34, 56 };
        int target = 34;
        int ans = linearSearch(num, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr , int target) {
            

        
        
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target)
            {

                return index;
            }
        }

        return -1;
    }
}