import java.util.Scanner;

public class Args {
	public static void main(String[] args) {
		if (args.length == 2) {
			Scanner sc = new Scanner(System.in);
			boolean flag = true;
			String name = args[0];
			try {
				Integer age = Integer.parseInt(args[1]);
				while (flag) {
					if (age >= 5) {
						System.out.println("Hello " + name + ".");
						int loop = 1;
						while (loop != 0) {
							System.out.println("What do you want me to do?");
							System.out.println("[1] Change my information.");
							System.out.println("[2] Count the number of vowels in your name.");
							System.out.println("[3] My actual information.");
							System.out.println("[4] Invert my name.");
							System.out.println("[5] Are there odd numbers in your name?");
							System.out.println("[0] Exit.");
							int option = sc.nextInt();
							sc.nextLine();
							switch (option) {
							default:
								System.out.println("ENTER ONE OF THE OPTIONS GIVEN.");
								break;
							case 0:
								loop = 0;
								flag = false;
								System.out.println("The program has been stopped.");
								break;
							case 1:
								boolean flag1 = true;
								System.out.println("You can change your name now. Write it down:");
								name = sc.next();
								sc.nextLine();
								while (flag1) {
									System.out.println("Your age:");
									if (sc.hasNextInt()) {
										age = sc.nextInt();
										while (age < 5) {
											System.out.println("You have to be older than 5 to use this program");
											age = sc.nextInt();
										}
										System.out.println("Your information has been changed.");
										flag1 = false;
									} else {
										System.out.println("You gotta enter a number.");
										sc.next();
									}
								}
								break;
							case 2:
								int counter = 0;
								char[] letters = name.toCharArray();
								for (int i = 0; i < name.length(); i++) {
									if (letters[i] == 'a') {
										counter++;
									}
									if (letters[i] == 'e') {
										counter++;
									}
									if (letters[i] == 'i') {
										counter++;
									}
									if (letters[i] == 'o') {
										counter++;
									}
									if (letters[i] == 'u') {
										counter++;
									}
								}
								System.out.println(name + ", your name has " + counter + " vowels.");
								System.out.println("Press enter to continue");
								sc.nextLine();
								break;
							case 3:
								System.out.println("Your name is " + name);
								System.out.println("And your actual age is " + age);
								System.out.println("Press enter to continue");
								sc.nextLine();
								break;
							case 4:
								char[] letters2 = name.toCharArray();
								for (int i = name.length() - 1; i >= 0; i--) {
									System.out.print(letters2[i]);
								}
								System.out.println("");
								System.out.println("Press enter to continue");
								sc.nextLine();
								break;
							case 5:
								String ageString = age.toString();
								int ageCounter = 0;
								for (int i = ageString.length() - 1; i >= 0; i--) {
									if (ageString.charAt(i) % 2 == 0) {
										ageCounter++;
									}
								}
								System.out.println("Your age number has " + ageCounter + " odd numbers.");
								System.out.println("Press enter to continue");
								sc.nextLine();
								break;
							}
						}
					} else {
						System.out.println("You have yo be older than 5 to use this program.");
						System.out.println("Enter your age:");
						age = sc.nextInt();
					}

				}
			} catch (NumberFormatException e) {
				System.out.println("You must enter your name and age (in this order).");
			}

			sc.close();
		} else {
			System.out.println("You must enter your name and age (in this order).");
		}
	}
}
