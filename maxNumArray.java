class Test{
    static int arr[] = {10, 340, 43};
    static int largestNumber(){
        int i;
        int maximum = arr[0];
        for(i = 0;i < arr.length; i++){
            if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args){
        System.out.println("Largest in given array is "+ largestNumber());
    }
}