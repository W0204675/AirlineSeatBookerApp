//Import Java's JOptionPane
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.*;

public class Application {

	public void start()
	{
		app();
	}	
		
	private void app()
	{	

		//Initialize Variables
		//Main 2D Boolean Array for the seats
		boolean seatChart[][] = new boolean[4][4];						
		boolean runAgain = true;
		int z = 0;
		int m = 0;
		ArrayList<String> report = new ArrayList<String>();
		
		//Default background colors for the HTML seat tracker
		String backgroundColor1  = "rgb(113,234,158)";
		String backgroundColor2  = "rgb(113,234,158)";
		String backgroundColor3  = "rgb(113,234,158)";
		String backgroundColor4  = "rgb(113,234,158)";
		String backgroundColor5  = "rgb(113,234,158)";
		String backgroundColor6  = "rgb(113,234,158)";
		String backgroundColor7  = "rgb(113,234,158)";
		String backgroundColor8  = "rgb(113,234,158)";
		String backgroundColor9  = "rgb(113,234,158)";
		String backgroundColor10 = "rgb(113,234,158)";
		String backgroundColor11 = "rgb(113,234,158)";
		String backgroundColor12 = "rgb(113,234,158)";
		String backgroundColor13 = "rgb(113,234,158)";
		String backgroundColor14 = "rgb(113,234,158)";
		String backgroundColor15 = "rgb(113,234,158)";
		String backgroundColor16 = "rgb(113,234,158)";
		

		//Program's main while loop
		while (runAgain == true)
		{	

			//HTML for the seat tracker
			Object HTMLString = 
				( "<html><body style = 'padding-left: 8px;'><table style = 'background-color: rgb(236,230,111); font-size: 20px;'>"
				+ "<tr>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor1 + "'>A1</td>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor2 + "'>A2</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor3 + "'>A3</td>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor4 + "'>A4</td>" + "</tr>"
				+ "<tr>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor5 + "'>B1</td>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor6 + "'>B2</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor7 + "'>B3</td>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor8 + "'>B4</td>" + "</tr>"
				+ "<tr>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor9 + "'>C1</td>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor10 + "'>C2</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor11 + "'>C3</td>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor12 + "'>C4</td>" + "</tr>"
				+ "<tr>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor13 + "'>D1</td>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor14 + "'>D2</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'background-color: rgb(236,230,111)ite;'>" + " " + "</td>" + "<td style = 'background-color: rgb(236,230,111);'>" + " " + "</td>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor15 + "'>D3</td>" + "<td style = 'text-align: center;color: Black;border: 3px solid black; background-color: " + backgroundColor16 + "'>D4</td>" + "</tr>"
				+ "</table></body></html>");
			
			Object[] startupOptions = {"Book Your Seat", "Exit Program"};
			
			//All of this is making the Seat Report and appending it to a string called printReport
			StringBuilder printReport = new StringBuilder();
			Collections.sort(report);
			
			for (String s : report)
			{
				printReport.append(s);
				printReport.append("\t");
			}	
			
			//Display the flights seats and prompt the user to either book a seat or exit the program
			int n = JOptionPane.showOptionDialog(null, HTMLString, 
			    "Airline Seat Booker", JOptionPane.YES_NO_CANCEL_OPTION,
			    JOptionPane.PLAIN_MESSAGE,
			    null,
			    startupOptions,
			    startupOptions[1]);
			
			//Logic for determining if the seat report should be displayed
			if (report.isEmpty())
			{
				m = 2;
			}
			
			if (n == JOptionPane.YES_OPTION) 
			{			
				runAgain = true;
				z = 0;
			}
			
			else if (n == JOptionPane.NO_OPTION ) 
			{			
				runAgain = false;	
				if (m == 0)
				{
					JOptionPane.showMessageDialog(null, printReport, "Seat Report", n);
				}
				break;
			}
			
			//Prompt user for the passengers name
			String name = JOptionPane.showInputDialog("Please enter passenger name: ");
			
			//Capitalize the first letter of the name the user enters and stores into a new name variable
			String name2 = name.substring(0, 1).toUpperCase() + name.substring(1);
			
			//Ask which class the user wants
			String Class = JOptionPane.showInputDialog("Hello " + name2 + ", Please type 1 for First Class or 2 for Economy: ");	
			
			//Converts the the number entered to an integer
			int ClassDigit = Integer.parseInt(Class);

			//Data Entry Validation
			while (ClassDigit >= 3)
				{
					Class = JOptionPane.showInputDialog("Hello " + name + ", Please type 1 for First Class or 2 for Economy: ");	
					ClassDigit = Integer.parseInt(Class);
				}
			

			//Ask which type of seat the user wants
			String windowOrAisle = JOptionPane.showInputDialog("Please type 1 for a window seat or 2 for an aisle seat: ");
			
			//Converts the the number entered to an integer
			int windowOrAilseDigit = Integer.parseInt(windowOrAisle);
			
			//Data Entry Validation
			while (windowOrAilseDigit >= 3)
				{
					windowOrAisle = JOptionPane.showInputDialog("Please type 1 for a window seat or 2 for an aisle seat: ");	
					windowOrAilseDigit = Integer.parseInt(windowOrAisle);
				}

			
			//While loop that determines if the the seat the user requested is available
			while (Class.equals("1") && windowOrAisle.equals("1") && z == 0)
			{
				
				if (seatChart[0][0] == false && z == 0)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: A1");
					report.add(name2 + " - A1\n");
					seatChart[0][0] = true;
					z = 1;
					m = 0;
					backgroundColor1 = "rgb(241,112,105)";
				}
					
				else if (seatChart[0][0] == true && seatChart[0][3] == false)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: A4");
					report.add(name2 + " - A4\n");
					seatChart[0][3] = true;
					z = 1;
					m = 0;
					backgroundColor4 = "rgb(241,112,105)";
				}
				
				else if (seatChart[0][3] == true && seatChart[1][0] == false)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: B1");
					report.add(name2 + " - B1\n");
					seatChart[1][0] = true;
					z = 1;
					m = 0;
					backgroundColor5 = "rgb(241,112,105)";
				}
				
				else if (seatChart[1][0] == true && seatChart[1][3] == false)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: B4");
					report.add(name2 + " - B4\n");
					seatChart[1][3] = true;
					z = 1;
					m = 0;
					backgroundColor8 = "rgb(241,112,105)";
				}
				
				if (z == 1)
				{
					break;
				}
					
			}//End of While loop
			
			//While loop that determines if the the seat the user requested is available
			while (Class.equals("1") && windowOrAisle.equals("2") && z == 0)
			{
				
				if (seatChart[0][1] == false && z == 0)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: A2");
					report.add(name2 + " - A2\n");
					seatChart[0][1] = true;
					z = 1;
					m = 0;
					backgroundColor2 = "rgb(241,112,105)";
				}
					
				else if (seatChart[0][1] == true && seatChart[0][2] == false)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: A3");
					report.add(name2 + " - A3\n");
					seatChart[0][2] = true;
					z = 1;
					m = 0;
					backgroundColor3 = "rgb(241,112,105)";
				}	
					
				else if (seatChart[0][2] == true && seatChart[1][1] == false)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: B2");
					report.add(name2 + " - B2\n");
					seatChart[1][1] = true;
					z = 1;
					m = 0;
					backgroundColor6 = "rgb(241,112,105)";
				}	
					
				else if (seatChart[1][1] == true && seatChart[1][2] == false)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: B3");
					report.add(name2 + " - B3\n");
					seatChart[1][2] = true;
					z = 1;
					m = 0;
					backgroundColor7 = "rgb(241,112,105)";
				}	
					
				if (z == 1)
				{
					break;
				}	
				
			}//End of While loop 
			
			//While loop that determines if the the seat the user requested is available
			while (Class.equals("2") && windowOrAisle.equals("1") && z == 0)
			{
				
				if (seatChart[2][0] == false && z == 0)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: C1");
					report.add(name2 + " - C1\n");
					seatChart[2][0] = true;
					z = 1;
					m = 0;
					backgroundColor9 = "rgb(241,112,105)";
				}
					
				else if (seatChart[2][0] == true && seatChart[2][3] == false)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: C4");
					report.add(name2 + " - C4\n");
					seatChart[2][3] = true;
					z = 1;
					m = 0;
					backgroundColor12 = "rgb(241,112,105)";
				}
					
				else if (seatChart[2][3] == true && seatChart[3][0] == false)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: D1");
					report.add(name2 + " - D1\n");
					seatChart[3][0] = true;
					z = 1;
					m = 0;
					backgroundColor13 = "rgb(241,112,105)";
				}	
					
				else if (seatChart[3][0] == true && seatChart[3][2] == false)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: D4");
					report.add(name2 + " - D4\n");
					seatChart[3][2] = true;
					z = 1;
					m = 0;
					backgroundColor16 = "rgb(241,112,105)";
				}
					
				if (z == 1)
				{
					break;
				}	
					
			} //End of While loop

			
			//While loop that determines if the the seat the user requested is available
			while (Class.equals("2") && windowOrAisle.equals("2") && z == 0)
			{	
				
				if (seatChart[2][1] == false && z == 0)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: C2");
					report.add(name2 + " - C2\n");
					seatChart[2][1] = true;
					z = 1;
					m = 0;
					backgroundColor10 = "rgb(241,112,105)";
				}
						
				else if (seatChart[2][1] == true && seatChart[2][2] == false)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: C3");
					report.add(name2 + " - C3\n");
					seatChart[2][2] = true;
					z = 1;
					m = 0;
					backgroundColor11 = "rgb(241,112,105)";
				}	
				
				else if (seatChart[2][2] == true && seatChart[3][1] == false)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: D2");
					report.add(name2 + " - D2\n");
					seatChart[3][1] = true;
					z = 1;
					m = 0;
					backgroundColor14 = "rgb(241,112,105)";
				}	
				
				else if (seatChart[3][1] == true && seatChart[3][2] == false)
				{
					JOptionPane.showMessageDialog(null, "Passenger name: " + name2 + "\nYour seat is: D3");
					report.add(name2 + " - D3\n");
					seatChart[3][2] = true;
					z = 1;
					m = 0;
					backgroundColor15 = "rgb(241,112,105)";
				}	
				
				if (z == 1)
				{
					break;
				}
				
			}//End of While loop			
		} //End of main while loop
	}
}