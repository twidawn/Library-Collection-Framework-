package library.collection;

import java.util.ArrayList;

public class MainClass2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("�̹��");
		list.add("�Ϸ�");
		list.add("�ξ�");
		list.add("�ֿ�");
		list.add("������");
		
		list.add(1, "������");
		list.add(3,"�̼���");
		
		System.out.println("���� ����" + list.size());
		for(int i = 0 ; i<list.size(); i++){
			String name = list.get(i);
			System.out.println(name);
		}
		System.out.println();
		
		System.out.println("3�� ����");
		list.remove(3);
		for(int i = 0 ; i<list.size(); i++){
			String name = list.get(i);
			System.out.println(name);
		}
		
		System.out.println("��ü ����");
		list.clear();
		System.out.println("���� ����" + list.size());
		for(int i = 0 ; i<list.size(); i++){
			String name = list.get(i);
			System.out.println(name);
		}
		System.out.println();
		
	}
}
