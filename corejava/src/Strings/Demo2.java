public class Demo2 {
    public static void main(String[] args)
    {
        String s1 = new String("");
        String s2 = new String("Hello");

        System.out.println(s2);

        char[] arr = {'D','e','b','a','n','j','a','n'};
        String s3 = new String(arr);
       // arr[0] = 'A';//change will not be applied
        System.out.println(s3);

         s3 = new String(arr,0,6);
        System.out.println(s3);

        byte[] arr1 ={97,98,99};
        s3 = new String(arr1);
        System.out.println(s3);
    }
}
