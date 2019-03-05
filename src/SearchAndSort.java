import java.lang.reflect.Array;
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
		while (escape != 0){
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
							bubAInt.replace(" ,", ",");
							String[] bubIntStr = new String[bubAInt.length()];
							bubIntStr = bubAInt.split(",");
							int[] bubInt = new int[bubIntStr.length];
							for(String intStr : bubIntStr) {
								for(int p = 0; p < intStr.length(); p++)
								if(Character.isDigit(intStr.charAt(p)) == false){
									System.out.println("Invalid data entry");
									break;
								}
								
							}
							for(int i = 0; i < bubIntStr.length; i++) {
								bubInt[i] = Integer.parseInt(bubIntStr[i]);
							}
							int[] bubRet = new int[bubInt.length];
							bubRet = bubble(bubInt);
							System.out.print("Bubble: [");
							for(int i = 0; i < bubInt.length - 1; i++) {
								System.out.print(bubRet[i] + ", ");
							}
							System.out.println(bubRet[bubInt.length - 1] + "]");
							break;
						case "list":
							System.out.println("Please enter the data: ");
							String bubLInt = in.nextLine();
							ArrayList<Integer> bubInt1 = new ArrayList<Integer>(bubLInt.length());
							for(int i = 0; i < bubInt1.size(); i++) {
								if(Character.isDigit(bubLInt.charAt(i))) {
									bubInt1.add(i, Integer.parseInt(String.valueOf(bubLInt.charAt(i))));
								}
								else {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							System.out.println(bubble(bubInt1, typeSort));
							break;
						default:
							System.out.println("Invalid store type");
							break;
						}
						break;
					case "string":
						System.out.println("How is it stored?");
						String inTypeS1 = in.nextLine();
						switch(inTypeS1) {
						case "array":
							System.out.println("Please enter the data: ");
							String bubAStr = in.nextLine();
							for(int i = 0; i < bubAStr.length(); i++) {
								if(Character.isLetter(bubAStr.charAt(i)) == false) {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							String[] bubStr = new String[bubAStr.length()];
							bubStr = bubAStr.split(",");
							System.out.println(bubble(bubStr));
							break;
						case "list":
							System.out.println("Please enter the data: ");
							String bubLStr = in.nextLine();
							ArrayList<String> bubStr1 = new ArrayList<String>(bubLStr.length());
							String[] strvals = bubLStr.split(",");
							for(String word : strvals) {
								for(int i = 0; i < word.length(); i++) {
									if(Character.isLetter(word.charAt(i)) == false) {
										System.out.println("Invalid data entry. Please enter data of specified data type");
										break;
									}
								}
								bubStr1.add(word);
							}
							System.out.println(bubble(bubStr1));
							break;
						default:
							System.out.println("Invalid store type");
							break;
						}
						break;
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
								if(Character.isDigit(selAInt.charAt(i))){
									selInt[i] = Integer.parseInt(String.valueOf(selAInt.charAt(i)));
								}
								else {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							int[] selRet = new int[selInt.length];
							selRet = selection(selInt);
							System.out.print("Selection: [");
							for(int i = 0; i < selInt.length - 1; i++) {
								System.out.print(selRet[i] + ", ");
							}
							System.out.println(selRet[selInt.length - 1] + "]");
							break;
						case "list":
							System.out.println("Please enter the data: ");
							String selLInt = in.nextLine();
							ArrayList<Integer> selInt1 = new ArrayList<Integer>(selLInt.length());
							for(int i = 0; i < selInt1.size(); i++) {
								if(Character.isDigit(selLInt.charAt(i))) {
									selInt1.add(i, Integer.parseInt(String.valueOf(selLInt.charAt(i))));
								}
								else {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							System.out.println(selection(selInt1, typeSort2));
							break;
						default:
							System.out.println("Invalid store type");
							break;
						}
						break;
					case "string":
						System.out.println("How is it stored?");
						String inTypeS1 = in.nextLine();
						switch(inTypeS1) {
						case "array":
							System.out.println("Please enter the data: ");
							String selAStr = in.nextLine();
							for(int i = 0; i < selAStr.length(); i++) {
								if(Character.isLetter(selAStr.charAt(i)) == false) {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							String[] selStr = new String[selAStr.length()];
							selStr = selAStr.split(",");
							selection(selStr);
							break;
						case "list":
							System.out.println("Please enter the data: ");
							String selLStr = in.nextLine();
							ArrayList<String> selStr1 = new ArrayList<String>(selLStr.length());
							String[] strvals = selLStr.split(",");
							for(String word : strvals) {
								for(int i = 0; i < word.length(); i++) {
									if(Character.isLetter(word.charAt(i)) == false) {
										System.out.println("Invalid data entry. Please enter data of specified data type");
										break;
									}
								}
								selStr1.add(word);
							}
							System.out.println(selection(selStr1));
							break;
						default:
							System.out.println("Invalid store type");
							break;
						}
						break;
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
								if(Character.isDigit(isrAInt.charAt(i))){
									isrInt[i] = Integer.parseInt(String.valueOf(isrAInt.charAt(i)));
								}
								else {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							int[] isrRet = new int[isrInt.length];
							isrRet = insertion(isrInt);
							System.out.print("Insertion: [");
							for(int i = 0; i < isrInt.length - 1; i++) {
								System.out.print(isrRet[i] + ", ");
							}
							System.out.println(isrRet[isrInt.length - 1] + "]");
							break;
						case "list":
							System.out.println("Please enter the data: ");
							String isrLInt = in.nextLine();
							ArrayList<Integer> isrInt1 = new ArrayList<Integer>(isrLInt.length());
							for(int i = 0; i < isrInt1.size(); i++) {
								if(Character.isDigit(isrLInt.charAt(i))) {
									isrInt1.add(i, Integer.parseInt(String.valueOf(isrLInt.charAt(i))));
								}
								else {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							System.out.println(insertion(isrInt1, typeSort3));
						default:
							System.out.println("Invalid store type");
							break;
						}
						break;
					case "string":
						System.out.println("How is it stored?");
						String inTypeS1 = in.nextLine();
						switch(inTypeS1) {
						case "array":
							System.out.println("Please enter the data: ");
							String isrAStr = in.nextLine();
							for(int i = 0; i < isrAStr.length(); i++) {
								if(Character.isLetter(isrAStr.charAt(i)) == false) {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							String[] isrStr = new String[isrAStr.length()];
							isrStr = isrAStr.split(",");
							System.out.println(insertion(isrStr));
							break;
						case "list":
							System.out.println("Please enter the data: ");
							String isrLStr = in.nextLine();
							ArrayList<String> isrStr1 = new ArrayList<String>(isrLStr.length());
							String[] strvals = isrLStr.split(",");
							for(String word : strvals) {
								for(int i = 0; i < word.length(); i++) {
									if(Character.isLetter(word.charAt(i)) == false) {
										System.out.println("Invalid data entry. Please enter data of specified data type");
										break;
									}
								}
								isrStr1.add(word);
							}
							System.out.println(insertion(isrStr1));
							break;
						default:
							System.out.println("Invalid store type");
							break;
						}
						break;
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
								if(Character.isDigit(merAInt.charAt(i))){
									merInt[i] = Integer.parseInt(String.valueOf(merAInt.charAt(i)));
								}
								else {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							int[] merRet = new int[merInt.length];
							merRet = merge(merInt);
							System.out.print("Merge: [");
							for(int i = 0; i < merInt.length - 1; i++) {
								System.out.print(merRet[i] + ", ");
							}
							System.out.println(merRet[merInt.length - 1] + "]");
							break;
						case "list":
							System.out.println("Please enter the data: ");
							String merLInt = in.nextLine();
							ArrayList<Integer> merInt1 = new ArrayList<Integer>(merLInt.length());
							for(int i = 0; i < merInt1.size(); i++) {
								if(Character.isDigit(merLInt.charAt(i))) {
									merInt1.add(i, Integer.parseInt(String.valueOf(merLInt.charAt(i))));
								}
								else {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
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
							for(int i = 0; i < merAStr.length(); i++) {
								if(Character.isLetter(merAStr.charAt(i)) == false) {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							String[] merStr = new String[merAStr.length()];
							merStr = merAStr.split(",");
							// call merge class . mergeSort (String[] merStr)
							break;
						case "list":
							System.out.println("Please enter the data: ");
							String merLStr = in.nextLine();
							ArrayList<String> merStr1 = new ArrayList<String>(merLStr.length());
							String[] strvals = merLStr.split(",");
							for(String word : strvals) {
								for(int i = 0; i < word.length(); i++) {
									if(Character.isLetter(word.charAt(i)) == false) {
										System.out.println("Invalid data entry. Please enter data of specified data type");
										break;
									}
								}
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
								if(Character.isDigit(linAInt.charAt(i))){
									linInt[i] = Integer.parseInt(String.valueOf(linAInt.charAt(i)));
								}
								else {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							System.out.println("What is the target value?");
							int targetInt1 = in.nextInt();
							System.out.println(linear(linInt, targetInt1));
							break;
						case "list":
							System.out.println("Please enter the data: ");
							String linLInt = in.nextLine();
							ArrayList<Integer> linInt1 = new ArrayList<Integer>(linLInt.length());
							for(int i = 0; i < linInt1.size(); i++) {
								if(Character.isDigit(linLInt.charAt(i))) {
									linInt1.add(i, Integer.parseInt(String.valueOf(linLInt.charAt(i))));
								}
								else {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							System.out.println("What is the target value?");
							int targetInt2 = in.nextInt();
							System.out.println(linear(linInt1, targetInt2));
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
							for(int i = 0; i < linAStr.length(); i++) {
								if(Character.isLetter(linAStr.charAt(i)) == false) {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							String[] linStr = new String[linAStr.length()];
							linStr = linAStr.split(",");
							System.out.println("What is the target value?");
							String targetStr1 = in.nextLine();
							System.out.println(linear(linStr, targetStr1));
							break;
						case "list":
							System.out.println("Please enter the data: ");
							String linLStr = in.nextLine();
							ArrayList<String> linStr1 = new ArrayList<String>(linLStr.length());
							String[] strvals = linLStr.split(",");
							for(String word : strvals) {
								for(int i = 0; i < word.length(); i++) {
									if(Character.isLetter(word.charAt(i)) == false) {
										System.out.println("Invalid data entry. Please enter data of specified data type");
										break;
									}
								}
								linStr1.add(word);
							}
							System.out.println("What is the target value?");
							String targetStr2 = in.nextLine();
							System.out.println(linear(linStr1, targetStr2));
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
								if(Character.isDigit(binAInt.charAt(i))){
									binInt[i] = Integer.parseInt(String.valueOf(binAInt.charAt(i)));
								}
								else {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							System.out.println("What is the target value?");
							int targetInt1 = in.nextInt();
							System.out.println(binary(binInt, targetInt1));
							break;
						case "list":
							System.out.println("Please enter the data: ");
							String binLInt = in.nextLine();
							ArrayList<Integer> binInt1 = new ArrayList<Integer>(binLInt.length());
							for(int i = 0; i < binInt1.size(); i++) {
								if(Character.isDigit(binLInt.charAt(i))) {
									binInt1.add(i, Integer.parseInt(String.valueOf(binLInt.charAt(i))));
								}
								else {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							System.out.println("What is the target value?");
							int targetInt2 = in.nextInt();
							System.out.println(binary(binInt1, targetInt2));
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
							for(int i = 0; i < binAStr.length(); i++) {
								if(Character.isLetter(binAStr.charAt(i)) == false) {
									System.out.println("Invalid data entry. Please enter data of specified data type");
									break;
								}
							}
							String[] binStr = new String[binAStr.length()];
							binStr = binAStr.split(",");
							System.out.println("What is the target value?");
							String targetStr1 = in.nextLine();
							System.out.println(binary(binStr, targetStr1));
							break;
						case "list":
							System.out.println("Please enter the data: ");
							String binLStr = in.nextLine();
							ArrayList<String> binStr1 = new ArrayList<String>(binLStr.length());
							String[] strvals = binLStr.split(",");
							for(String word : strvals) {
								for(int i = 0; i < word.length(); i++) {
									if(Character.isLetter(word.charAt(i)) == false) {
										System.out.println("Invalid data entry. Please enter data of specified data type");
										break;
									}
								}
								binStr1.add(word);
							}
							System.out.println("What is the target value?");
							String targetStr2 = in.nextLine();
							System.out.println(binary(binStr1, targetStr2));
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
				default:
					System.out.println("Invalid algorithm");
			}
		}
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
	public static ArrayList<Integer> bubble(ArrayList<Integer> bubInt1, String typeSort){
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
			return bubInt;
	}
	public static ArrayList<String> bubble(ArrayList<String> bubInt1){
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
		return bubStr;
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
		int[] selSortInt = new int[selInt.length];
		for(int i = 0; i < selInt.length; i++) {
			int min = Integer.parseInt(String.valueOf(selInt[i]));
			for(int j = i; j < selInt.length; j++) {
				int nexCheck = Integer.parseInt(String.valueOf(selInt[j]));
				if(min > nexCheck){
					min = nexCheck;
				}
			}
			selSortInt[i] = min;
		}
		return selSortInt;
	}
	public static ArrayList<Integer> selection(ArrayList<Integer> selInt1, String typeSort){
		ArrayList<Integer> selSortInt = new ArrayList<Integer>(selInt1.size());
		for(int i = 0; i < selInt1.size(); i++) {
			int min = Integer.parseInt(selInt1.get(i).toString());
			for(int j = i; j < selInt1.size(); j++) {
				int nexCheck = Integer.parseInt(selInt1.get(j).toString());
				if(min > nexCheck){
					min = nexCheck;
				}
			}
			selSortInt.add(min);
		}
		return selSortInt;//this will be the return of type ArrayList<Integer>
	}
	public static ArrayList<String> selection(ArrayList<String> selStr1){
		ArrayList<String> selSortStr = new ArrayList<String>(selStr1.size());
			for(int i = 0; i < selStr1.size(); i++) {
				String first = selStr1.get(i).toString();
				for(int j = i; j < selStr1.size(); j++) {
					String nexCheck = selStr1.get(j).toString();
					if(first.compareTo(nexCheck) <= 0) {
						first = nexCheck;
					}
				}
				selSortStr.add(first);
			}
			return selSortStr;//this will be the return of type ArrayList<String>
	}
	public static String[] selection(String[] selStr) {
		String[] selSortStr = new String[selStr.length];
		for(int i = 0; i < selStr.length; i++) {
			String first = String.valueOf(selStr[i]);
			for(int j = i; j < selStr.length; j++) {
				String nexCheck = String.valueOf(selStr[j]);
				if(first.compareTo(nexCheck) <= 0){
					first = nexCheck;
				}
			}
			selSortStr[i] = first;
		}
		return selSortStr;
	}
	
	//_______________________________________________________________________________________
	
	public static int[] insertion(int[] isrInt) {
		for(int i = 1; i < isrInt.length; i++) {
			int temp = isrInt[i];
			int j = i - 1; 
			while(j >= 0 && isrInt[j] > temp) {
				isrInt[j+1] = isrInt[j];
				j--;
			}
			isrInt[j+1] = temp;
		}
		return isrInt;
	}
	
	public static String[] insertion(String[] isrStr) {
		for(int i = 1; i < isrStr.length; i++) {
			String temp = isrStr[i];
			int j = i - 1; 
			while(j >= 0 && isrStr[j].compareTo(temp) <= 0) {
				isrStr[j+1] = isrStr[j];
				j--;
			}
			isrStr[j+1] = temp;
		}
		return isrStr;
	}
	
	public static ArrayList<Integer> insertion(ArrayList<Integer> isrInt1, String typeSort){
		for(int i = 1; i < isrInt1.size(); i++) {
			int temp = Integer.parseInt(isrInt1.get(i).toString());
			int j = i - 1; 
			while(j >= 0 && Integer.parseInt(isrInt1.get(j).toString()) > temp) {
				isrInt1.set(j+1, isrInt1.get(j));
				j--;
			}
			isrInt1.set(j+1, temp);
		}
		return isrInt1;
	}
	public static ArrayList<String> insertion(ArrayList<String> isrInt1){
			for(int i = 1; i < isrInt1.size(); i++) {
				String temp = isrInt1.get(i).toString();
				int j = i - 1; 
				while(j >= 0 && isrInt1.get(j).toString().compareTo(temp) <= 0) {
					isrInt1.set(j+1, isrInt1.get(j));
					j--;
				}
				isrInt1.set(j+1, temp);
			}
			return isrInt1;	
	}
	
	//_______________________________________________________________________________________

	public static int[] merge(int[] merInt) {
		int split = merInt.length / 2;
		int[] halfL = new int[split];
		int[] halfR = new int[merInt.length - split];
		for(int i = 0; i < halfL.length; i++) {
			halfL[i] = merInt[i];
		}
		for(int j = 0; j < halfR.length; j++) {
			halfR[j] = merInt[split + j];
		}
		int l = 0;
		int r = 0;
		int k = 0;
		while(l < halfL.length && r < halfR.length) {
			if(halfL[l] <= halfR[r]) {
				merInt[k] = halfL[l];
				l++;
			}
			else {
				merInt[k] = halfR[r];
				r++;
			}
			k++;
		}
		while(l < halfL.length) {
			merInt[k] = halfL[l];
			l++;
			k++;
		}
		while(r < halfR.length) {
			merInt[k] = halfR[r];
			r++;
			k++;
		}
		if(halfL.length > halfR.length) {
			for(int x = 0; x < halfL.length; x++) {
				merInt[x] = halfL[x];
			}
			for(int y = 0; y < halfR.length; y++) {
				merInt[halfL.length + y] = halfR[y];
			}
		}
		merge(halfL);
		merge(halfR);
		return merInt;
		// Im really confuzzled
	}
	
	public static String[] merge(String[] merStr) {
		int split = merStr.length / 2;
		String[] halfL = new String[split];
		String[] halfR = new String[merStr.length - split];
		for(int i = 0; i < halfL.length; i++) {
			halfL[i] = merStr[i];
		}
		for(int j = 0; j < halfR.length; j++) {
			halfR[j] = merStr[split + j];
		}
		int l = 0;
		int r = 0;
		int k = 0;
		while(l < halfL.length && r < halfR.length) {
			if(halfL[l].compareTo(halfR[r]) >= 0) {
				merStr[k] = halfL[l];
				l++;
			}
			else {
				merStr[k] = halfR[r];
				r++;
			}
			k++;
		}
		while(l < halfL.length) {
			merStr[k] = halfL[l];
			l++;
			k++;
		}
		while(r < halfR.length) {
			merStr[k] = halfR[r];
			r++;
			k++;
		}
		if(halfL.length > halfR.length) {
			for(int x = 0; x < halfL.length; x++) {
				merStr[x] = halfL[x];
			}
			for(int y = 0; y < halfR.length; y++) {
				merStr[halfL.length + y] = halfR[y];
			}
		}
		merge(halfL);
		merge(halfR);
		return merStr;
		// Im really confuzzled

	}
	
	public static ArrayList<Integer> merge(ArrayList<Integer> merInt1, String typeSort){
		int split = merInt1.size() / 2;
		ArrayList<Integer> halfL = new ArrayList<Integer>(split);
		ArrayList<Integer> halfR = new ArrayList<Integer>(merInt1.size() - split);
		for(int i = 0; i < halfL.size(); i++) {
			halfL.set(i, merInt1.get(i));
		}
		for(int j = 0; j < halfR.size(); j++) {
			halfR.set(j, merInt1.get(split + j));
		}
		int l = 0;
		int r = 0;
		int k = 0;
		while(l < halfL.size() && r < halfR.size()) {
			if(halfL.get(l) <= halfR.get(r)) {
				merInt1.set(k, halfL.get(l));
				l++;
			}
			else {
				merInt1.set(k, halfR.get(r));
				r++;
			}
			k++;
		}
		while(l < halfL.size()) {
			merInt1.set(k, halfL.get(l));
			l++;
			k++;
		}
		while(r < halfR.size()) {
			merInt1.set(k, halfR.get(r));
			r++;
			k++;
		}
		if(halfL.size() > halfR.size()) {
			for(int x = 0; x < halfL.size(); x++) {
				merInt1.set(x, halfL.get(x));
			}
			for(int y = 0; y < halfR.size(); y++) {
				merInt1.set(halfL.size() + y, halfR.get(y));
			}
		}
		merge(halfL,typeSort);
		merge(halfR, typeSort);
		return merInt1;
		// Im really confuzzled

	}
	
	public static ArrayList<String> merge(ArrayList<String> merStr1){
		int split = merStr1.size() / 2;
		ArrayList<String> halfL = new ArrayList<String>(split);
		ArrayList<String> halfR = new ArrayList<String>(merStr1.size() - split);
		for(int i = 0; i < halfL.size(); i++) {
			halfL.set(i, merStr1.get(i));
		}
		for(int j = 0; j < halfR.size(); j++) {
			halfR.set(j, merStr1.get(split + j));
		}
		int l = 0;
		int r = 0;
		int k = 0;
		while(l < halfL.size() && r < halfR.size()) {
			if(halfL.get(l).compareTo(halfR.get(r)) >= 0) {
				merStr1.set(k, halfL.get(l));
				l++;
			}
			else {
				merStr1.set(k, halfR.get(r));
				r++;
			}
			k++;
		}
		while(l < halfL.size()) {
			merStr1.set(k, halfL.get(l));
			l++;
			k++;
		}
		while(r < halfR.size()) {
			merStr1.set(k, halfR.get(r));
			r++;
			k++;
		}
		if(halfL.size() > halfR.size()) {
			for(int x = 0; x < halfL.size(); x++) {
				merStr1.set(x, halfL.get(x));
			}
			for(int y = 0; y < halfR.size(); y++) {
				merStr1.set(halfL.size() + y, halfR.get(y));
			}
		}
		merge(halfL);
		merge(halfR);
		return merStr1;
		// Im really confuzzled

	}
	
	//_______________________________________________________________________________________

	public static int linear(int[] linInt, int targetInt) {
		for(int i = 0; i < linInt.length; i++) {
			if(linInt[i] == targetInt) {
				return i;
			}
		}
		return -1;
	}
	
	public static int linear(String[] linStr, String targetStr) {
		for(int i = 0; i < linStr.length; i++) {
			if(linStr[i].compareTo(targetStr) == 0){
				return i;
			}
		}
		return -1;
	}
	
	public static int linear(ArrayList<Integer> linInt1, int targetInt) {
		for(int i = 0; i < linInt1.size(); i++) {
			if(linInt1.get(i) == targetInt) {
				return i;
			}
		}
		return -1;
	}
	
	public static int linear(ArrayList<String> linStr1, String targetStr) {
		for(int i = 0; i < linStr1.size(); i++) {
			if(linStr1.get(i).compareTo(targetStr) == 0) {
				return i;
			}
		}
		return -1;
	}
	
	//_______________________________________________________________________________________
	
	public static int binary(int[] binInt, int targetInt) {
		int split = binInt.length / 2;
		int[] half = new int[binInt.length - split];
		if(binInt[split] == targetInt) {
			return split;
		}
		else if(binInt[split] < targetInt) {
			for(int i = split + 1; i < binInt.length; i++) {
				half[i] = binInt[i];
			}
		}
		else if(binInt[split] > targetInt) {
			for(int i = 0; i < split; i++) {
				half[i] = binInt[i];
			}
		}
		else if(binInt.length == 1 && binInt[split] != targetInt) {
			return -1;
		}
		return binary(half, targetInt);
	}
	
	public static int binary(String[] binStr, String targetStr) {
		int split = binStr.length / 2;
		String[] half = new String[binStr.length - split];
		if(binStr[split].compareTo(targetStr) == 0) {
			return split;
		}
		else if(binStr[split].compareTo(targetStr) > 0) {
			for(int i = split + 1; i < binStr.length; i++) {
				half[i] = binStr[i];
			}
		}
		else if(binStr[split].compareTo(targetStr) < 0) {
			for(int i = 0; i < split; i++) {
				half[i] = binStr[i];
			}
		}
		else if(binStr.length == 1 && binStr[split].compareTo(targetStr) != 0) {
			return -1;
		}
		return binary(half, targetStr);
	}
	
	public static int binary(ArrayList<Integer> binInt1, int targetInt) {
		int split = binInt1.size() / 2;
		ArrayList<Integer> half = new ArrayList<Integer>(binInt1.size() - split);
		if(binInt1.get(split) == targetInt) {
			return split;
		}
		else if(binInt1.get(split) < targetInt) {
			for(int i = split + 1; i < binInt1.size(); i++) {
				half.set(i, binInt1.get(i));
			}
		}
		else if(binInt1.get(split) > targetInt) {
			for(int i = 0; i < split; i++) {
				half.set(i, binInt1.get(i));
			}
		}
		else if(binInt1.size() == 1 && binInt1.get(split) != targetInt) {
			return -1;
		}
		return binary(half, targetInt);
	}
	
	public static int binary(ArrayList<String> binStr1, String targetStr) {
		int split = binStr1.size() / 2;
		ArrayList<String> half = new ArrayList<String>(binStr1.size() - split);
		if(binStr1.get(split).compareTo(targetStr) == 0) {
			return split;
		}
		else if(binStr1.get(split).compareTo(targetStr) > 0) {
			for(int i = split + 1; i < binStr1.size(); i++) {
				half.set(i, binStr1.get(i));
			}
		}
		else if(binStr1.get(split).compareTo(targetStr) < 0) {
			for(int i = 0; i < split; i++) {
				half.set(i, binStr1.get(i));
			}
		}
		else if(binStr1.size() == 1 && binStr1.get(split).compareTo(targetStr) != 0) {
			return -1;
		}
		return binary(half, targetStr);
	}
}