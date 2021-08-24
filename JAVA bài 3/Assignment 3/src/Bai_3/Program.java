package Bai_3;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Program {
	
		static Scanner scanner = new Scanner(System.in);
		static Random random = new Random();
	
		public static void main(String[] args) {
			// Exercise 1:
			// Question 1:
			System.out.println("Question 1");
			float a = 5240.5f;
			float b = 10970.055f;
			int x = (int) a;
			int y = (int) b;
			System.out.println(x);
			System.out.println(y + "\n");

			// Question 2:
			System.out.println("Question 2");
			int a1 = random.nextInt(100000);
			System.out.printf("%05d", a1);
			System.out.println("\n");

			// Question 3:
			System.out.println("Question 3");
			int b1 = a1 % 100;
			System.out.println("Hai số cuối của a1: " + b1);
			System.out.println("\n");

			Question4();

			Exercise2();

			System.out.println("\n");

			// Exercise 3:
			System.out.println("Exercise3");
			// Question 1:
			System.out.println("Question 1:");
			Integer salary = 5000;
			float salaryf = salary;
			System.out.printf("%.2f", salaryf);

			// Question 2:
			System.out.println("Question 2:");
			String value = "1234567";
			int a2 = Integer.parseInt(value);
			System.out.println(a2);

			// Question 3:
			System.out.println("Question 3:");
			Integer value1 = 1234567;
			int a3 = value1.intValue();
			System.out.println(a3);
			System.out.println("\n");

			// Exercise 4:
			System.out.println("Exercise 4:");
			// Question 1:
			System.out.println("Question 1");
			System.out.println("Mời bạn nhập họ và tên: ");
			String nhapGiaTri1 = scanner.nextLine();
			String nhapGiaTri = scanner.nextLine();
			int count = 1;
			int j;
			for (j = 0; j < nhapGiaTri.length(); j++) {
				if (nhapGiaTri.charAt(j) != ' ') {
					count++;
				}
			}
			System.out.println("Độ dài của chuỗi ký tự nhapGiaTri: " + count);
			System.out.println("\n");

			// Question 2:
			System.out.println("Question 2");
			System.out.println("Mời bạn nhập chuỗi ký tự 1: ");
			String s1 = scanner.next();
			System.out.println(" ");
			System.out.println("Mời bạn nhập chuỗi ký tự 2: ");
			String s2 = scanner.next();
			System.out.println("Kết quả khi nối hai xâu kí tự s1 và s2: " + s1 + s2);
			System.out.println("\n");

			// Question 3:
			System.out.println("Mời bạn nhập họ tên: ");
			String hoTen1 = scanner.nextLine();
			String hoTen2 = scanner.nextLine();
			String hoTen = hoTen2.substring(0, 1).toUpperCase() + hoTen2.substring(1);
			System.out.println(hoTen);
			System.out.println("\n");

			// question 4:
			String name;
			System.out.println("Nhập tên: ");
			name = scanner.nextLine();
			name = name.toUpperCase();
			for (int i = 0; i < name.length(); i++) {
				System.out.println("Ký tự thứ " + i + " là: " + name.charAt(i));
			}

			// question 5:;
			System.out.println("Nhập họ: ");
			String firstName = scanner.nextLine();
			System.out.println("Nhập tên: ");
			String lastName = scanner.nextLine();
			System.out.println("Họ tên đầy đủ: " + firstName.concat(lastName));

			// question 6:
			System.out.println("Nhập họ: ");
			String firstName1 = scanner.nextLine();
			System.out.println("Nhập tên: ");
			String lastName1 = scanner.nextLine();
			System.out.println("Họ tên đầy đủ: " + firstName.concat(lastName));

			// question 7:

			String fullName;
			System.out.println("Nhập họ tên đầy đủ");
			fullName = scanner.nextLine();
			// remove space characters
			fullName = fullName.trim();
			fullName = fullName.replaceAll("\\s+", " ");
			System.out.println(fullName);
			String[] words = fullName.split(" ");
			fullName = "";
			for (String word : words) {
				String firstCharacter = word.substring(0, 1).toUpperCase();
				String leftCharacter = word.substring(1);
				word = firstCharacter + leftCharacter;
				fullName += word + " ";
			}
			System.out.println("Họ tên sau khi chuẩn hóa: " + fullName);

			// question 8:
			String[] groupNames = { "Java with VTI", "Cách qua môn gia va", "Học Java có khó không?" };
			for (String groupName : groupNames) {
				if (groupName.contains("Java")) {
					System.out.println(groupName);
				}
			}

			// Question 9:
			String[] groupNames1 = { "Java", "C#", "C++" };
			for (String groupName : groupNames) {
				if (groupName.equals("Java")) {
					System.out.println(groupName);
				}
			}

			// question 10:
			String x1, x2, reversex1 = "";
			System.out.println("Nhập chuỗi 1");
			x1 = scanner.nextLine();
			System.out.println("Nhập chuỗi 2");
			x2 = scanner.nextLine();
			for (int i = x1.length() - 1; i >= 0; i--) {
				reversex1 += x1.substring(i, i + 1);
			}
			if (x2.equals(reversex1)) {
				System.out.println("Đây là chuỗi đảo ngược !");
			} else {
				System.out.println("Đây không phải chuỗi đảo ngược");
			}

			// question 11:
			System.out.println("Mời bạn nhập vào một chuỗi: ");
			String str = scanner.nextLine();
			int count1 = 0;
			for (int i = 0; i < str.length(); i++) {
				if ('a' == str.charAt(i)) {
					count1++;
				}
			}
			System.out.println(count);

			// question 12:
			String daoNguoc = "";
			System.out.println("Nhập chuỗi 1");
			String x3 = scanner.nextLine();
			for (int i = x3.length() - 1; i >= 0; i--) {
				daoNguoc += x3.charAt(i);
			}
			System.out.println(daoNguoc);			
			
		}

		
		
		
		
		
		public static void Question4() {
			// Question 4:
			System.out.println("Question 4:");
			System.out.println("Mời bạn nhập số nguyên thứ 1: ");
			int soThuMot = scanner.nextInt();
			System.out.println("Mời bạn nhập số nguyên thứ 2: ");
			int soThuHai = scanner.nextInt();
			int thuong = soThuMot / soThuHai;
			System.out.println("Thương của hai số nguyên vừa nhập là: " + thuong);
		}

		public static void Exercise2() {
			System.out.println("Exercise2");
			// Question 1:
			System.out.println("Question 1");
			Account[] accArr = new Account[5];
			int i;
			for (i = 0; i <= accArr.length; i++) {
				accArr[i] = new Account();
				accArr[i].email = "Email" + i;
				accArr[i].username = "NgVan" + i;
				accArr[i].fullName = "NgVanA" + i;
				accArr[i].createDate = LocalDate.now();
				System.out.println("Thông tin account: " + i);
				System.out.println(accArr[i] + "\n");
				}
			}
		
		

	}


