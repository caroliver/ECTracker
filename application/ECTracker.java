package application;

import java.util.*;
import java.io.*;
public class ECTracker
{

	public ECTracker()
	{

	}

	public static void saveUsers(ArrayList<User> persons) {
		FileWriter myWriter;
		try {
			myWriter = new FileWriter("users.csv");
			for(User myUsers : persons) {
				myWriter.write(myUsers.getUserID() + "," + myUsers.getFirstName() + "," + myUsers.getLastName() + "," + myUsers.getEmail() + "," + myUsers.getPassword() + "\n" );
			}
			myWriter.close();            
		}
		catch(IOException e) {
			System.out.println("Oh NO!");
		}
	}

	public static void loadUsers(ArrayList<User> persons) {
		BufferedReader myReader;
		try {
			myReader = new BufferedReader(new FileReader("users.csv"));
			String myData;
			do {
				myData = myReader.readLine();
				if (myData == null)
					break;
				String [] parts = myData.split(",");
				String userID = parts[0];
				String firstName = parts[1];
				String lastName = parts[2];
				String email = parts[3];
				String password = parts[4];
				Individual newIndividual = new Individual();
		        newIndividual.setAttributes(firstName,lastName,password,email,userID);
		        persons.add(newIndividual);
				//System.out.println(myData);
			} while (myData != null);
			myReader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Oh NO file not there!");
		}
		catch(IOException e) {
			System.out.println("Oh NO!");
		}
		
	}

	/**
	 * Implements all methods for ECTracker.
	 *
	 * @params entered through user input through scanner within main().
	 * @preconditions for most command if/else statements to make sure user has
	 * been created before the call is allowed to take place.
	 */    
	public static void main(String []args) {
		Individual newIndividual = null;
		System.out.println("Welcome to ECTracker!");
		System.out.println();

		System.out.println("Commands Include:");
		System.out.println("1.Create User             7.Create Calculator");
		System.out.println("2.Change Password         8.Create Schedule");
		System.out.println("3.Update Email            9.Add to Calorie Counter");
		System.out.println("4.Update ID               10.Reset Calorie Counter to 0");
		System.out.println("5.Get user information    11.Quit");
		System.out.println("6.Create Initial Counter  12. Login");
		System.out.println(); 

		System.out.println("You will be prompted for a command until");
		System.out.println("a correct command number is given");
		System.out.println();

		System.out.println("Enter 13 at any time for the full command list");
		System.out.println("If you are a returning user, enter 14 when prompted for a command and then login");
		System.out.println();

		Scanner in = new Scanner(System.in);
		System.out.print("Enter Command Number: ");

		ArrayList<User> persons = new ArrayList<User>();

		while(in.hasNext() == true){
			int command = in.nextInt();

			if(command >= 1 && command <= 14){
				//Creates new USER 
				if(command==1){
					newIndividual = Individual.createNewUser();
					persons.add(newIndividual);
					System.out.println();
					System.out.println("User successfully added!");
					System.out.println();

					saveUsers(persons);



				}


				//CHANGES PASSWORD     
				else if(command==2){
					if (newIndividual != null) {
						System.out.print("New Password: ");
						String changedPassword = in.next();
						newIndividual.setPassword(changedPassword);
						System.out.println("Password successfully changed");
						System.out.println();
						
						saveUsers(persons);
					}
				}

				//UPDATES EMAIL   
				else if(command==3){
					if (newIndividual != null) {
						System.out.print("Updated email: ");
						String updatedEmail = in.next();
						newIndividual.updateEmail(updatedEmail);
						System.out.println("Email successfully updated!");
						System.out.println();
						
						saveUsers(persons);
					}
				}

				//UPDATES ID
				else if(command==4){
					if (newIndividual != null) {
						System.out.print("Updated ID: ");
						String updatedID = in.next();
						newIndividual.updateID(updatedID);
						System.out.println("ID successfully updated!");
						System.out.println();
						
						saveUsers(persons);
					}
				}

				//gets USER INFORMATION
				else if(command==5){
					HashMap<String,String> usernamePassword = readUsers();
					Scanner keyboard = new Scanner(System.in);

					System.out.println();
					System.out.print("Username:");
					String inpUser = keyboard.nextLine();

					System.out.print("Password:");
					String inpPass = keyboard.nextLine();
					System.out.println();

					if (usernamePassword.containsKey(inpUser) == false) {
						System.out.println("Username is not in the file");
					} 
					else if (usernamePassword.get(inpUser).equals(inpPass)) {
						//System.out.println("User ID: " + inpUser);
						//System.out.println("Password: " + inpPass);
						HashMap<String,String> firstNames = readFirstNames();
						String firstNamePrint = firstNames.get(inpUser);
						System.out.println("First name: " + firstNamePrint);
						HashMap<String,String> lastNames = readLastNames();
						String lastNamePrint = lastNames.get(inpUser);
						System.out.println("Last name: " + lastNamePrint);
						HashMap<String,String> emails = readEmails();
						String emailsPrint = emails.get(inpUser);
						System.out.println("Email: " + emailsPrint);
						System.out.println();
					} 
					else {
						System.out.print("Could not get user information");
					}
				}

				//Creates new CALORIE CALCULATOR    
				else if(command==7){
					if (newIndividual != null) {
						CalCalculator calCalc = CalCalculator.newCalCalc();
						newIndividual.setCalCalc(calCalc);
						System.out.println();
						System.out.println(calCalc.newDailyIntake());
						System.out.println();
					}
				}

				//Creates new SCHEDULE
				else if(command==8){
					if (newIndividual != null) {
						Schedule sched = Schedule.getScheduleType();
						System.out.println();
					}
				}

				//QUITS THE PROGRAM
				else if(command == 11){
					System.out.println("Thank you for using ECTracker!");
					break;
				}

				//CALCOUNT functions
				else if(command == 6 || command == 9 || command == 10){
					CalCounter calCount;
					if (newIndividual.getCalCounter() == null) {
						calCount = CalCounter.newCalCount();
						newIndividual.setCalCount(calCount);
					} else
						calCount = newIndividual.getCalCounter();

					if(command == 6 && newIndividual != null){
						calCount.initialAddCals();
						System.out.println();
					}

					else if(command == 9 && newIndividual != null){
						calCount.addCals();
						System.out.println("Total calories for the day: " + calCount.getUpdatedCals());
						System.out.println();
					}
					else if(command == 10 && newIndividual != null){
						calCount.resetCals();
						System.out.println("Calories set to 0!");
						System.out.println();
					}

				}

				else if(command == 12){
					persons = new ArrayList<User>();
					loadUsers(persons);
					
					HashMap<String,String> usernamePassword = readUsers();
					Scanner keyboard = new Scanner(System.in);

					System.out.print("Username:");
					String inpUser = keyboard.nextLine();
					System.out.print("Password:");
					String inpPass = keyboard.nextLine();

					if (usernamePassword.containsKey(inpUser) == false) {
						System.out.println("Username is not in the file");
					} 
					else if (usernamePassword.get(inpUser).equals(inpPass)) {
						System.out.println();
						System.out.println("Login successful");
						System.out.println();
						//newIndividual = new Individual();
						//HashMap<String,String> firstNames = readFirstNames();
						//HashMap<String,String> lastNames = readLastNames();
						//HashMap<String,String> emails = readEmails();
						for (User ind : persons) {
							if (ind.getUserID().equals(inpUser))
								newIndividual = (Individual)ind;
						}
						//newIndividual.setAttributes( firstNames.get(inpUser),  lastNames.get(inpUser), inpPass,  emails.get(inpUser),  inpUser);
					} 
					else {
						System.out.print("Login unsuccessful");
					}
				}

				else if(command == 13){
					System.out.println();
					System.out.println("Commands Include:");
					System.out.println("1.Create User             7.Create Calculator");
					System.out.println("2.Change Password         8.Create Schedule");
					System.out.println("3.Update Email            9.Add to Calorie Counter");
					System.out.println("4.Update ID               10.Reset Calorie Counter to 0");
					System.out.println("5.Get user information    11.Quit");
					System.out.println("6.Create Initial Counter  12.Login");
					System.out.println();
				}

				System.out.print("Enter Command Number: ");
			} 


			else{
				System.out.println("Please enter a valid command!");
				System.out.println();
				System.out.print("Enter Command Number: ");
			}
		}
	}

	public static HashMap readUsers() {
		HashMap<String, String> usernamePassword = new HashMap<String, String>();
		try{

			BufferedReader br = new BufferedReader (new FileReader("users.csv"));
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				String [] fields = line.split(",");
				String username = fields[0];
				String password = fields[fields.length-1];
				usernamePassword.put(username,password);
			}
		} 
		catch(FileNotFoundException e) {
		} 
		catch (IOException e) {
		}
		return usernamePassword;
	}

	public static HashMap readEmails() {
		HashMap<String, String> usernameEmail = new HashMap<String, String>();
		try{

			BufferedReader br = new BufferedReader (new FileReader("users.csv"));
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				String [] fields = line.split(",");
				String username = fields[0];
				String email = fields[3];

				usernameEmail.put(username,email);
			}
		} 
		catch(FileNotFoundException e) {
		} 
		catch (IOException e) {
		}
		return usernameEmail;
	}

	public static HashMap readLastNames() {
		HashMap<String, String> usernameLastName = new HashMap<String, String>();
		try{

			BufferedReader br = new BufferedReader (new FileReader("users.csv"));
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				String [] fields = line.split(",");
				String username = fields[0];
				String lastName = fields[2];

				usernameLastName.put(username,lastName);
			}
		} 
		catch(FileNotFoundException e) {
		} 
		catch (IOException e) {
		}
		return usernameLastName;
	}

	public static HashMap readFirstNames() {
		HashMap<String, String> usernameFirstName = new HashMap<String, String>();
		try{

			BufferedReader br = new BufferedReader (new FileReader("users.csv"));
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				String [] fields = line.split(",");  
				String username = fields[0];
				String firstName = fields[1];

				usernameFirstName.put(username,firstName);
			}
		} 
		catch(FileNotFoundException e) {
		} 
		catch (IOException e) {
		}
		return usernameFirstName;
	}
}
