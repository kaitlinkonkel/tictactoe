import java.util.Scanner;

public class TicTacToeRunner
	{
		String name;
		String xoro;
		public static void main(String[] args)
			{
				
				greetUser();
				
			}
		public static void playX()
		{
			Board.fillMatrix();
			Board.displayBoard();
			
		
			System.out.println("At what location would you like to play? Ex: a1");
			Scanner userInput = new Scanner (System.in);
			String first = userInput.nextLine();
			
			
		}
		public static void playO()
		{
			
			Board.fillMatrix();
			Board.displayBoard();
		
			System.out.println("At what location would you like to play? Ex: a1");
			Scanner userInput = new Scanner (System.in);
			String first = userInput.nextLine();
			
			
			
		}
		
		public static void greetUser()
		{
				{
					System.out.println("What is your name?");
				}
					Scanner userInput = new Scanner (System.in);
					String name = userInput.nextLine();
						{
							System.out.println("Hello " + name + ", would you like to play with an X or an O");
						}
						Scanner userInput2 = new Scanner (System.in);
						String xoro = userInput2.nextLine();
						
					if(xoro.equalsIgnoreCase("X"))
						{
							System.out.println("You will be playing X's.");
							playX();
							
						}
					
					if(xoro.equalsIgnoreCase("O"))
					{
						System.out.println("You wil be playing O's.");
						playO();
				
						
					}
					
						
					
		}


	}
