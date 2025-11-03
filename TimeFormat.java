// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		  String t = args[0];
		 int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		 int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
	     
		   
		   if(hours > 12)
		   {
			  if(minutes >=10)
			  {
			System.out.println(hours-12 + ":" + minutes+ " PM");
			  }
			else
			{
            System.out.println(hours-12 + ":0" + minutes+ " PM");
			}

		   }

		   if( 0 < hours && hours < 12)
		   {
		    if(minutes >=10)
			{
			System.out.println(hours + ":" + minutes+ " AM");
		   }
		   else
		    {
			System.out.println(hours + ":0" + minutes+ " AM");
		   }
		}
		   
		   if(hours == 12)
		   {
		    if(minutes >=10)
			{
			System.out.println(hours + ":" + minutes+ " PM");
			}
			else
			{
			System.out.println(hours + ":0" + minutes+ " PM");
		   }

		}
		   if(hours==0)
		   {
			if(minutes >=10)
			{
			System.out.println("0:" + minutes + " AM" );
		   }
		else
        {
		   System.out.println("0:0" + minutes + " AM" );

		}
	}
	
		   




		
	}
}