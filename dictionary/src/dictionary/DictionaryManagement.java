package dictionary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;

public class DictionaryManagement {
	Scanner sc = new Scanner(System.in);
	public void insertFromCommandline() {
		System.out.println("Nhập số lượng từ: ");
		int numberWord = sc.nextInt();
		sc.nextLine();
		// sc.nextLine() de doc not ki tu "\n" khi nhap sc.nextInt()
		for (int i = 0; i < numberWord; i++) {
			System.out.println("Nhập từ: ");
			String word_target = sc.nextLine();
			System.out.println("Giải nghĩa: ");
			String word_explain = sc.nextLine();
			Word word = new Word(word_target, word_explain);
			Dictionary.listWord.add(word);
		}
	}
        
	public void dictionaryLookup(){
		System.out.println("Nhập từ cần tìm: ");
		String wordLookup = sc.nextLine().trim();
                Word word = new Word(wordLookup);
		int pos = Collections.binarySearch(Dictionary.listWord, word, WordtargetComparator);
                if(pos >= 0){
                    System.out.println("Đã tìm thấy!");
                    System.out.println("Từ cần tìm là: "+Dictionary.listWord.get(pos).getWord_target()
                    +"               "+Dictionary.listWord.get(pos).getWord_explain());
                }
                else{
                    System.out.println("Không tìm thấy!");
                }
	}
	public void addWord() {
		System.out.println("Nhập từ cần thêm: ");
		String wordAdd = sc.nextLine().trim();
		Word word = new Word(wordAdd);
                int pos = Collections.binarySearch(Dictionary.listWord, word, WordtargetComparator);
                if(pos<0){
		System.out.println("Giải nghĩa: ");
		String wordAddMean = sc.nextLine().trim();
		Dictionary.listWord.add(new Word(wordAdd, wordAddMean));
		System.out.println("Thêm thành công!");
                sortListWord();
                }
                else{
                    System.out.println("Từ này đã tồn tại! ");
                }
	}

	// xoa tu
	public void deleteWord() {
		System.out.println("Nhập từ muốn xóa: ");
		String wordDelete = sc.nextLine().trim();
		Word word = new Word(wordDelete);
                int pos = Collections.binarySearch(Dictionary.listWord, word, WordtargetComparator);
                if(pos >= 0){
                    Dictionary.listWord.remove(pos);
                    System.out.println("Xóa thành công!");
                }
                else System.out.println("Không tìm thấy từ này!");
	}

	// sua tu
	public void editWord() {
		System.out.println("Nhập từ muốn thay thế: ");
		String replaceWord = sc.nextLine().trim();
		Word word = new Word(replaceWord);
                int pos = Collections.binarySearch(Dictionary.listWord, word, WordtargetComparator);
                if(pos >= 0){
                    Dictionary.listWord.remove(pos);
                    addWord();
                }
                else{
                    System.out.println("Không tìm thấy từ này!");
                }
	}
	
	// ham tim kiem cac tu
	public void dictionarySearcher() {
		System.out.println("Nhập từ cần tìm: ");
		String wordSearch = sc.nextLine().trim();
		ArrayList<Word> newList = new ArrayList<>();
		for (int i = 0; i < Dictionary.listWord.size(); i++) {
			Word word = Dictionary.listWord.get(i);
			if (word.getWord_target().indexOf(wordSearch) == 0) {
				newList.add(word);
			}
		}
		int i = 1;
		for (Word word : newList) {
			System.out.printf("%-5d%-20s%-20s",i,word.getWord_target(),word.getWord_explain());
                        System.out.println();
			i++;
		}
	}
        public static void insertFromFile() {
		try {
			FileInputStream fis = new FileInputStream("Dictionary.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while(line != null) {
				String newOneLine = line.replace("\ufeff", "");
				String []arr = newOneLine.split("\t");
				Dictionary.listWord.add(new Word(arr[0], arr[1]));
				line = br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void dictionaryExportToFile() {
		try {
			FileOutputStream fos = new FileOutputStream("Output.txt");
			
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			for (Word tu : Dictionary.listWord) {
				String line = tu.getWord_target() + "   " + tu.getWord_explain();
				bw.write(line);
				bw.newLine();

			}
			bw.close();
			osw.close();
			fos.close();
			// return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
        //su dung bo so sanh comparator cho viec sap xep
        public Comparator<Word> WordtargetComparator = new Comparator<Word>(){
	@Override
	public int compare(Word o1, Word o2) {
		return o1.getWord_target().compareTo(o2.getWord_target());
	}
        };
	// sap xep
	public void sortListWord() {
		Collections.sort(Dictionary.listWord,  WordtargetComparator);
	}
}
	