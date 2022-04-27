import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class main {

	void print(String input)
	{
		System.out.print(input);		
	} 

	void print(String input, int newline) 
	{
		System.out.println(input);
	}

	public static void main (String[] Args)
	{
		System.out.println("test");
		try{
			File users = new File("users.txt");
			Scanner sc = new Scanner(users);
			String[] arr  = new String [6];
			int i = 0;
			while (sc.hasNextLine()){ 
				String data = sc.nextLine();
				arr[i] = data;
				i = i + 1;
			}
			sc.close();
			for (int j = 0; j < arr.length; j++){
				System.out.println(j + ": " + arr[j]);
			}
		} catch (FileNotFoundException e){
			System.out.println("File not found");
		}	
	}
}
