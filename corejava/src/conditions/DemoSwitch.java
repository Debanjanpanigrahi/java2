class Demo2{
    public static void main(String[] args)
    {
        // int i=1;
        // switch(i){
        //     case 1:
        //         System.out.println(i);
        //         break;

        //     case 2:
        //         System.out.println(i);
        //         break;

        //     case 3:
        //         System.out.println(i);
        //         break;    
        //      case 4:
        //         System.out.println(i);
        //         break;
        //     default:
        //         System.out.println(i);
        //         break;                
        // }

        //nested switch
        int j=5;
        int k=6;
        switch(j){

            case 4:
                System.out.println("j is 4");
                break;

             case 5:
                switch(k){
                    case 6:
                    System.out.println("k is 6");
                    break;

                    default:
                        System.out.println("k is not 6");
                        break;
                }
                System.out.println("j is 4");
                break;

            default:
                System.out.println("j is nither 4 nor 5");
                break;        
        }
    }
}