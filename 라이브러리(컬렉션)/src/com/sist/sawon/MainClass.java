package com.sist.sawon;

import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		ArrayList<SawonVO> list = new ArrayList<>();
		SawonVO vo = new SawonVO();
		
		vo.setSabun(1);
		vo.setName("������");
		vo.setJob("�븮");
		vo.setDname("������");
		vo.setLoc("����");
		vo.setPay(3200);
		list.add(vo);
		
		vo = new SawonVO();
		
		vo.setSabun(2);
		vo.setName("�̼���");
		vo.setJob("���");
		vo.setDname("��ȹ��");
		vo.setLoc("���");
		vo.setPay(2600);
		list.add(vo);
			
		vo = new SawonVO();
		
		vo.setSabun(3);
		vo.setName("������");
		vo.setJob("����");
		vo.setDname("���ߺ�");
		vo.setLoc("����");
		vo.setPay(4000);
		list.add(vo);
		
		for(SawonVO v : list){
			System.out.println(v.getSabun() + " "
					+v.getName() + " "
					+v.getDname() + " "
					+v.getLoc() + " "
					+v.getPay() + " "
					);
		}
		
		
	}
}
