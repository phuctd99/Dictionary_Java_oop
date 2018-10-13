package dictionary;

import java.util.Scanner;

public class DictionaryCommandline {
	DictionaryManagement dictionarymanagement = new DictionaryManagement();
	Scanner sc = new Scanner(System.in);

	public void showAllWord() {
                //dictionarymanagement.sortListWord();
		System.out.println("|No |English            |Vietnamese");
		for (int i = 0; i < Dictionary.listWord.size(); i++) {
			Word word = Dictionary.listWord.get(i);
			System.out.printf("%-5d%-20s%-20s",i,word.getWord_target(),word.getWord_explain());
                        System.out.println();
		}
	}

	public void dictionaryBasic() {
		dictionarymanagement.insertFromCommandline();
		showAllWord();
	}

	public void dictionaryAdvanced() {
		// dictionarymanagement.insertFromCommandline();
		dictionarymanagement.insertFromFile();
		int choose;
		do {
			System.out.println("-----------------------------------------");
			System.out.println("1. Thêm từ ");
			System.out.println("2. Xóa từ ");
			System.out.println("3. Sửa từ ");
			System.out.println("4. Tìm kiếm nhanh (Searcher Word)");
                        System.out.println("5. Tìm kiếm chính xác (Lookup Word)");
			System.out.println("6. Hiển thị tất cả từ"); 
			System.out.println("7. Thoát");
			System.out.print("Nhập lựa chọn của bạn: ");
			choose = sc.nextInt();
			sc.nextLine();
                        //dictionarymanagement.sortListWord();
			switch (choose) {
			case 1:
                             
				dictionarymanagement.addWord();
				break;
			case 2:
				dictionarymanagement.deleteWord();
				break;
			case 3:
				dictionarymanagement.editWord();
				break;
			case 4:
				dictionarymanagement.dictionarySearcher();
				break;
                        case 5:
                                dictionarymanagement.dictionaryLookup();
                                break;
			case 6:
				showAllWord();
				break;
			case 7:
				System.exit(0);
			}
			//dictionarymanagement.sortListWord();
			dictionarymanagement.dictionaryExportToFile();
		} while (choose >= 1 && choose <= 7);
	}

	public static void main(String[] args) {
		DictionaryCommandline dicCommand = new DictionaryCommandline();
		// dicCommand.dictionaryAdvanced();
		dicCommand.dictionaryAdvanced();
	}
}
