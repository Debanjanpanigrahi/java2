class loop{
    public static void main(String[] args)
    {
        /* while loop */
        int i=1;
        while(i <= 10)
        {
            System.out.println(i);
            i++;
        }

        /* do while loop */
        System.out.printf("do-while loop");
        i=1;
        do{
            System.out.println(i);
            i++;
        }while(i <= 10);

        System.out.println("for loop");
        /*for loop */
        for(i = 1 ; i <=10 ; i++ )
        {
            System.out.println(i);
        }   

        System.out.println("experiment with for loop : - ");
        for(i=1;i<=10;)
        {
            System.out.println(i);
            i++;
        }  

        int j = 1;
        for(i=1,j=1;i<=10;i++,j++)
        {
            System.out.println(i*j);
           
        }

        /**
         * pattern printing */

        int rows = 5;
        int currentRow = 1;
        while(currentRow <= rows)
        {
            for(int col = 1 ; col<=currentRow; col++)
            {
                System.out.printf("*");
            }
            System.out.println("");
            currentRow++;
        }  

        System.out.println("Break Experiment");
          outer: for(i =1 ; i<=10 ; i++){
            for(j=1;j<=10;j++)
            {
                System.out.println(i*j);
                if(j==5){
                    break outer;
                }
            }
          }   
    } 
}