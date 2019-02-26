import java.util.ArrayList;
import java.util.Scanner;
public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What algorithm would you like to use?");
		String choice = in.nextLine();
		switch(choice) {
			case "bubble":
				System.out.println("What type of data?");
				String typeD = in.nextLine();
				switch(typeD) {
				case "int":
					System.out.println("How is it stored?");
					String inType = in.nextLine();
					switch(inType) {
					case "array":
						System.out.println("Please enter the data: ");
						String bubAInt = in.nextLine();
						int[] bubInt = new int[bubAInt.length()];
						for(int i = 0; i < bubInt.length; i++) {
							bubInt[i] = Integer.parseInt(String.valueOf(bubAInt.charAt(i)));
						}
						// call bubble class . bubbleSort (int[] bubInt)
						break;
					case "arrayList":
						System.out.println("Please enter the data: ");
						String bubLInt = in.nextLine();
						ArrayList<Integer> bubInt1 = new ArrayList<Integer>(bubLInt.length());
						for(int i = 0; i < bubInt1.size(); i++) {
							bubInt1.add(i, Integer.parseInt(String.valueOf(bubLInt.charAt(i))));
						}
						//call bubble class . bubbleSort (ArrayList<Integer> bubInt1)
					default:
						System.out.println("Invalid store type");
						break;
					}
				case "string":
					System.out.println("How is it stored?");
					String inTypeS1 = in.nextLine();
					switch(inTypeS1) {
					case "array":
						System.out.println("Please enter the data: ");
						String bubAStr = in.nextLine();
						String[] bubStr = new String[bubAStr.length()];
						bubStr = bubAStr.split(",");
						// call bubble class . bubbleSort (String[] bubInt)
						break;
					case "arrayList":
						System.out.println("Please enter the data: ");
						String bubLStr = in.nextLine();
						ArrayList<String> bubStr1 = new ArrayList<String>(bubLStr.length());
						String[] strvals = bubLStr.split(",");
						for(String word : strvals) {
							bubStr1.add(word);
						}
						//call bubble class . bubbleSort (ArrayList<String> bubStr1)
						break;
					default:
						System.out.println("Invalid store type");
						break;
					}
				default:
					System.out.println("Invalid data type");
					break;
			}
		}
		in.close();
	}
}