
public class Demo {
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);/*check the reference */

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3 == s4);

        /* case - 1 */
         s1 = "ja"+"va";
         s2 = "java";
        System.out.println(s1 == s2);//true

        /* case - 2 */
         s1 = "ja"+"va";
         s2 = s1+"va";
        System.out.println(s1 == s2);//false

        /* case - 3 */
         s1 = "ja"+"va";
         s2 = s1;
        System.out.println(s1 == s2);//true

        s1 = new String("Hello");
        s2 = "Hello";
        System.out.print(s1 == s2); //false

        String s = "";
        for(int i= 0 ; i < 5 ; i++)
        {
            s = s+i; /*will be stored in heap not inside string pool */
            System.out.println(s);
        }

        
    }    
}
