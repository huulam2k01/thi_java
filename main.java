package quan_ly_san_pham;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so san pham: ");
		int n = input.nextInt();
		product sp[] = new product[n];
		boolean flag = true;
		do {
			System.out.println("1.Nhap thong tin cho tung san pham\n" + "2.Hien thi san pham theo gia thuc tang dan\n"
					+ "3.Thoat\n");
			System.out.println("Chon chuc nang: ");
			int chon = input.nextInt();
			switch (chon) {
				case 1:

					for (int i = 0; i < n; i++) {
						System.out.println("Nhap san pham thu " + (i + 1));
						sp[i] = new product();
						sp[i].add();
					}
					break;
				case 2:
					product temp = sp[0];
					for (int i = 0; i < n; i++) {
						for (int j = i + 1; j < n; j++) {
							if (sp[i].getReal_price() > sp[j].getReal_price()) {
								temp = sp[j];
								sp[j] = sp[i];
								sp[i] = temp;
							}
						}
					}
					System.out.println("Sap xep tang dan theo gia thuc:");
					for (int i = 0; i < n; i++) {
						sp[i].print();
					}
					break;
				case 3:
					System.out.println("tam biet");
					flag = false;
					break;
				default:
					System.out.println("Chuc nang khong phu hop");
					break;
			}

		} while (flag);

	}

}
