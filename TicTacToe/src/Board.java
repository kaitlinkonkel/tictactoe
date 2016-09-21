
public class Board
	{	
		
		static int row=0;
		static int col=0;
		
		public static String[] [] spaces = new String [3] [3];
	
		public static void displayBoard()
		{
			System.out.println( "        1           2            3   ");
			System.out.println( "   ----------- -----------  -----------");
			System.out.println( "  |           |            |           |");
			System.out.println( "a |     " + spaces[0][0] + "     " + "|     " + spaces[0][1] + "      |     " + spaces[0][2]  + "     |");
			System.out.println( "  |           |            |           |");
			System.out.println( "   ----------- -----------  -----------");
			System.out.println( "  |           |            |           |");
			System.out.println( "b |     " + spaces[1][0] + "     " + "|     " + spaces[1][1] + "      |     " + spaces[1][2]  + "     |");
			System.out.println( "  |           |            |           |");
			System.out.println( "   ----------- -----------   -----------");
			System.out.println( "  |           |            |           |");
			System.out.println( "c |     " + spaces[2][0] + "     " + "|     " + spaces[2][1] + "      |     " + spaces[2][2]  + "     |");
			System.out.println( "  |           |            |           |");
			System.out.println( "   ----------- -----------  -----------");
			
			
			
		}
		
		public static void fillMatrix()
		{
			for(int row=0; row < 3; row++)
				{
					for(int col=0; col < 3; col++)
						{
							spaces[row][col]=" ";
						}
				}
		}
		public static void fillA1()
		{
			spaces[0][0]="X";
			displayBoard();
		}
		public static void fillA2()
		{
			spaces[0][1]="X";
			displayBoard();
		}
		

		
	}
