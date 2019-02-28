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
		int escape = -1;
		do{
			System.out.println("What algorithm would you like to use?");
			String choice = in.nextLine();
			switch(choice) {
				case "bubble":
					System.out.println("What type of data?");
					String typeSort = in.nextLine();
					switch(typeSort) {
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
							System.out.println(bubble(bubInt));
							break;
						case "arrayList":
							System.out.println("Please enter the data: ");
							String bubLInt = in.nextLine();
							ArrayList<Object> bubInt1 = new ArrayList<Object>(bubLInt.length());
							for(int i = 0; i < bubInt1.size(); i++) {
								bubInt1.add(i, Integer.parseInt(String.valueOf(bubLInt.charAt(i))));
							}
							System.out.println(bubble(bubInt1, typeSort));
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
							System.out.println(bubble(bubStr));
							break;
						case "arrayList":
							System.out.println("Please enter the data: ");
							String bubLStr = in.nextLine();
							ArrayList<Object> bubStr1 = new ArrayList<Object>(bubLStr.length());
							String[] strvals = bubLStr.split(",");
							for(String word : strvals) {
								bubStr1.add(word);
							}
							System.out.println(bubble(bubStr1, typeSort));
							break;
						default:
							System.out.println("Invalid store type");
							break;
						}
					default:
						System.out.println("Invalid data type");
						break;
				}
				case "selection":
					System.out.println("What type of data?");
					String typeSort2 = in.nextLine();
					switch(typeSort2) {
					case "int":
						System.out.println("How is it stored?");
						String inType = in.nextLine();
						switch(inType) {
						case "array":
							System.out.println("Please enter the data: ");
							String selAInt = in.nextLine();
							int[] selInt = new int[selAInt.length()];
							for(int i = 0; i < selInt.length; i++) {
								selInt[i] = Integer.parseInt(String.valueOf(selAInt.charAt(i)));
							}
							// call selection class . selectionSort (int[] selInt)
							break;
						case "arrayList":
							System.out.println("Please enter the data: ");
							String selLInt = in.nextLine();
							ArrayList<Integer> selInt1 = new ArrayList<Integer>(selLInt.length());
							for(int i = 0; i < selInt1.size(); i++) {
								selInt1.add(i, Integer.parseInt(String.valueOf(selLInt.charAt(i))));
							}
							//call selection class . selectionSort (ArrayList<Integer> selInt1)
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
							String selAStr = in.nextLine();
							String[] selStr = new String[selAStr.length()];
							selStr = selAStr.split(",");
							// call selection class . selectionSort (String[] selStr)
							break;
						case "arrayList":
							System.out.println("Please enter the data: ");
							String selLStr = in.nextLine();
							ArrayList<String> selStr1 = new ArrayList<String>(selLStr.length());
							String[] strvals = selLStr.split(",");
							for(String word : strvals) {
								selStr1.add(word);
							}
							//call selection class . selectionSort (ArrayList<String> selStr1)
							break;
						default:
							System.out.println("Invalid store type");
							break;
						}
					default:
						System.out.println("Invalid data type");
						break;
				}
				case "insertion":
					System.out.println("What type of data?");
					String typeSort3 = in.nextLine();
					switch(typeSort3) {
					case "int":
						System.out.println("How is it stored?");
						String inType = in.nextLine();
						switch(inType) {
						case "array":
							System.out.println("Please enter the data: ");
							String isrAInt = in.nextLine();
							int[] isrInt = new int[isrAInt.length()];
							for(int i = 0; i < isrInt.length; i++) {
								isrInt[i] = Integer.parseInt(String.valueOf(isrAInt.charAt(i)));
							}
							// call insertion class . insertionSort (int[] isrInt)
							break;
						case "arrayList":
							System.out.println("Please enter the data: ");
							String isrLInt = in.nextLine();
							ArrayList<Integer> isrInt1 = new ArrayList<Integer>(isrLInt.length());
							for(int i = 0; i < isrInt1.size(); i++) {
								isrInt1.add(i, Integer.parseInt(String.valueOf(isrLInt.charAt(i))));
							}
							//call insertion class . insertionSort (ArrayList<Integer> isrInt1)
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
							String isrAStr = in.nextLine();
							String[] isrStr = new String[isrAStr.length()];
							isrStr = isrAStr.split(",");
							// call insertion class . insertionSort (String[] isrStr)
							break;
						case "arrayList":
							System.out.println("Please enter the data: ");
							String isrLStr = in.nextLine();
							ArrayList<String> isrStr1 = new ArrayList<String>(isrLStr.length());
							String[] strvals = isrLStr.split(",");
							for(String word : strvals) {
								isrStr1.add(word);
							}
							//call insertion class . insertionSort (ArrayList<String> isrStr1)
							break;
						default:
							System.out.println("Invalid store type");
							break;
						}
					default:
						System.out.println("Invalid data type");
						break;
				}
				case "merge":
					System.out.println("What type of data?");
					String typeSort4 = in.nextLine();
					switch(typeSort4) {
					case "int":
						System.out.println("How is it stored?");
						String inType = in.nextLine();
						switch(inType) {
						case "array":
							System.out.println("Please enter the data: ");
							String merAInt = in.nextLine();
							int[] merInt = new int[merAInt.length()];
							for(int i = 0; i < merInt.length; i++) {
								merInt[i] = Integer.parseInt(String.valueOf(merAInt.charAt(i)));
							}
							// call merge class . mergeSort (int[] merInt)
							break;
						case "arrayList":
							System.out.println("Please enter the data: ");
							String merLInt = in.nextLine();
							ArrayList<Integer> merInt1 = new ArrayList<Integer>(merLInt.length());
							for(int i = 0; i < merInt1.size(); i++) {
								merInt1.add(i, Integer.parseInt(String.valueOf(merLInt.charAt(i))));
							}
							//call merge class . mergeSort (ArrayList<Integer> merInt1)
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
							String merAStr = in.nextLine();
							String[] merStr = new String[merAStr.length()];
							merStr = merAStr.split(",");
							// call merge class . mergeSort (String[] merStr)
							break;
						case "arrayList":
							System.out.println("Please enter the data: ");
							String merLStr = in.nextLine();
							ArrayList<String> merStr1 = new ArrayList<String>(merLStr.length());
							String[] strvals = merLStr.split(",");
							for(String word : strvals) {
								merStr1.add(word);
							}
							//call merge class . mergeSort (ArrayList<String> merStr1)
							break;
						default:
							System.out.println("Invalid store type");
							break;
						}
					default:
						System.out.println("Invalid data type");
						break;
				}
				case "linear":
					System.out.println("What type of data?");
					String typeSearch1 = in.nextLine();
					switch(typeSearch1) {
					case "int":
						System.out.println("How is it stored?");
						String inType = in.nextLine();
						switch(inType) {
						case "array":
							System.out.println("Please enter the data: ");
							String linAInt = in.nextLine();
							int[] linInt = new int[linAInt.length()];
							for(int i = 0; i < linInt.length; i++) {
								linInt[i] = Integer.parseInt(String.valueOf(linAInt.charAt(i)));
							}
							System.out.println("What is the target value?");
							int targetInt1 = in.nextInt();
							// call linear class . linearSearch (int[] linInt, int targetInt1)
							break;
						case "arrayList":
							System.out.println("Please enter the data: ");
							String linLInt = in.nextLine();
							ArrayList<Integer> linInt1 = new ArrayList<Integer>(linLInt.length());
							for(int i = 0; i < linInt1.size(); i++) {
								linInt1.add(i, Integer.parseInt(String.valueOf(linLInt.charAt(i))));
							}
							System.out.println("What is the target value?");
							int targetInt2 = in.nextInt();
							//call linear class . linearSearch (ArrayList<Integer> linInt1, int targetInt2)
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
							String linAStr = in.nextLine();
							String[] linStr = new String[linAStr.length()];
							linStr = linAStr.split(",");
							System.out.println("What is the target value?");
							String targetStr1 = in.nextLine();
							
							// call linear class . linearSearch (String[] linStr, String targetStr1)
							break;
						case "arrayList":
							System.out.println("Please enter the data: ");
							String linLStr = in.nextLine();
							ArrayList<String> linStr1 = new ArrayList<String>(linLStr.length());
							String[] strvals = linLStr.split(",");
							for(String word : strvals) {
								linStr1.add(word);
							}
							System.out.println("What is the target value?");
							String targetStr2 = in.nextLine();
							//call linear class . linearSearch (ArrayList<String> linStr1, String targetString2)
							break;
						default:
							System.out.println("Invalid store type");
							break;
						}
					default:
						System.out.println("Invalid data type");
						break;
				}
				case "binary":
					System.out.println("What type of data?");
					String typeSearch2 = in.nextLine();
					switch(typeSearch2) {
					case "int":
						System.out.println("How is it stored?");
						String inType = in.nextLine();
						switch(inType) {
						case "array":
							System.out.println("Please enter the data: ");
							String binAInt = in.nextLine();
							int[] binInt = new int[binAInt.length()];
							for(int i = 0; i < binInt.length; i++) {
								binInt[i] = Integer.parseInt(String.valueOf(binAInt.charAt(i)));
							}
							System.out.println("What is the target value?");
							int targetInt1 = in.nextInt();
							// call binary class . binarySearch (int[] binInt, int targetInt1)
							break;
						case "arrayList":
							System.out.println("Please enter the data: ");
							String binLInt = in.nextLine();
							ArrayList<Integer> binInt1 = new ArrayList<Integer>(binLInt.length());
							for(int i = 0; i < binInt1.size(); i++) {
								binInt1.add(i, Integer.parseInt(String.valueOf(binLInt.charAt(i))));
							}
							System.out.println("What is the target value?");
							int targetInt2 = in.nextInt();
							//call binary class . binarySearch (ArrayList<Integer> binInt1, int targetInt2)
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
							String binAStr = in.nextLine();
							String[] binStr = new String[binAStr.length()];
							binStr = binAStr.split(",");
							System.out.println("What is the target value?");
							String targetStr1 = in.nextLine();
							
							// call binary class . binarySearch (String[] binStr, String targetStr1)
							break;
						case "arrayList":
							System.out.println("Please enter the data: ");
							String binLStr = in.nextLine();
							ArrayList<String> binStr1 = new ArrayList<String>(binLStr.length());
							String[] strvals = binLStr.split(",");
							for(String word : strvals) {
								binStr1.add(word);
							}
							System.out.println("What is the target value?");
							String targetStr2 = in.nextLine();
							//call binary class . binarySearch (ArrayList<String> binStr1, String targetString2)
							break;
						default:
							System.out.println("Invalid store type");
							break;
						}
					default:
						System.out.println("Invalid data type");
						break;
				}
				case "quit":
					escape = 0;
					break;
			}
		}while (escape != 0);
		in.close();
	}
	
	//_______________________________________________________________________________________
	
	public static int[] bubble(int[] bubInt) {
		boolean clean = false;
		do {
			clean = true;
			for(int i = 0; i < bubInt.length - 1; i++) {
				if(bubInt[i] > bubInt[i + 1]) {
					int temp = bubInt[i];
					bubInt[i] = bubInt[i + 1];
					bubInt[i + 1] = temp;
					clean = false;
				}
			}
		}while(clean != true);
		return bubInt;
	}
	public static ArrayList<Object> bubble(ArrayList<Object> bubInt1, String typeSort){
		switch(typeSort) {
		case "int":
			ArrayList<Integer> bubInt = new ArrayList<Integer>(bubInt1.size());
			for(Object val : bubInt1) {
				bubInt.add(Integer.parseInt(String.valueOf(val)));
			}
			boolean clean = false;
			do {
				clean = true;
				for(int i = 0; i < bubInt.size() - 1; i++) {
					if(bubInt.get(i) > bubInt.get(i + 1)) {
						int temp = bubInt.get(i);
						bubInt.set(i, bubInt.get(i + 1));
						bubInt.set(i + 1, temp);
						clean = false;
					}
				}
			}while(clean != true);
			for(int j = 0; j < bubInt.size(); j++) {
				bubInt1.set(j, bubInt.get(j));
			}
		case "String":
			ArrayList<String> bubStr = new ArrayList<String>(bubInt1.size());
			for(Object val : bubInt1) {
				bubStr.add(String.valueOf(val));
			}
			boolean clean2 = false;
			do {
				clean2 = true;
				for(int i = 0; i < bubStr.size() - 1; i++) {
					if(bubStr.get(i).compareTo(bubStr.get(i + 1)) <= 0) {
						String temp = bubStr.get(i);
						bubStr.set(i, bubStr.get(i + 1));
						bubStr.set(i + 1, temp);
						clean2 = false;
					}
				}
			}while(clean2 != true);
			for(int j = 0; j < bubStr.size(); j++) {
				bubInt1.set(j, bubStr.get(j));
			}
		}
		return bubInt1;
	}
	public static String[] bubble(String[] bubStr) {
		boolean clean2 = false;
		do {
			clean2 = true;
			for(int i = 0; i < bubStr.length - 1; i++) {
				if(bubStr[i].compareTo(bubStr[i + 1]) <= 0) {
					String temp = bubStr[i];
					bubStr[i] = bubStr[i + 1];
					bubStr[i + 1] = temp;
					clean2 = false;
				}
			}
		}while(clean2 != true);
		return bubStr;
	}
	
	//_______________________________________________________________________________________
	
	public static int[] selection(int[] selInt) {
		
	}
	public static ArrayList<Object> selection(ArrayList<Object> selInt1, String typeSort){
		switch(typeSort) {
		case "int":
			break;//this will be the return of type ArrayList<Integer>
		case "String":
			break;//this will be the return of type ArrayList<String>
		}
	}
	public static String[] selection(String[] selStr) {
		
	}
	
	//_______________________________________________________________________________________
	
}
