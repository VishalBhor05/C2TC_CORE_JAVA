/* Write code for following pattern:

     #
# # # # #
     #
# # # # #
     #
# # # # #
     #
# # # # #
     #
     */
public class VishalB {

	
		public static void main(String [] args)
		{
				for(int i=1;i<=9;i++)
				{
						for(int k=1;k<=2;k++)
						{
							if(i%2==1)
							System.out.print(" ");
						}
					
					
				for(int j=1;j<=5;j++)	
				{
					if(i%2==0)
					{
						System.out.print("#");
					}
					
					else if (j==3)
					{
						System.out.print("#");
			
					}

					}		
			System.out.println( );

			}            

				
	}

}
/**********************OUTPUT********************

  #
#####
  #
#####
  #
#####
  #
#####
  #

****************************/
