package library.collection;

import java.util.ArrayList;

public class MainClass2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("이방원");
		list.add("하륜");
		list.add("민씨");
		list.add("최영");
		list.add("이인임");
		
		list.add(1, "정도전");
		list.add(3,"이성계");
		
		System.out.println("저장 갯수" + list.size());
		for(int i = 0 ; i<list.size(); i++){
			String name = list.get(i);
			System.out.println(name);
		}
		System.out.println();
		
		System.out.println("3번 삭제");
		list.remove(3);
		for(int i = 0 ; i<list.size(); i++){
			String name = list.get(i);
			System.out.println(name);
		}
		
		System.out.println("전체 삭제");
		list.clear();
		System.out.println("저장 갯수" + list.size());
		for(int i = 0 ; i<list.size(); i++){
			String name = list.get(i);
			System.out.println(name);
		}
		System.out.println();
		
	}
}
