package com.arithmetic;

import java.util.Vector;

public class SequenceDemo {
	static Vector<Integer> vector = new Vector<Integer>();
	static Vector<Integer> vector1 = new Vector<Integer>();
	static {
		vector.add(23);
		vector.add(13);
		vector.add(33);
		vector.add(2);
		vector.add(3);
		vector.add(21);
		vector.add(15);
		vector.add(16);
		vector.add(20);
		vector.add(15);
		
		vector1.add(9);
		vector1.add(11);
		vector1.add(16);
		vector1.add(19);
		vector1.add(20);
		vector1.add(10);
		vector1.add(15);
		vector1.add(17);
		vector1.add(18);
		vector1.add(29);
		
		
	}

	/**
	 * ��������
	 * 
	 * @param v
	 * @param left
	 * @param right
	 */
	static void quickSort(Vector<Integer> v, int left, int right) {
		int low = left;
		int hight = right;
		int key = v.get(left);
		if (left < right) {
			while (low < hight) {
				System.out.println("��ʼ:[low=" + low + "|hight=" + hight + "]"
						+ v.toString()); 
				while (low < hight && v.get(hight) <= key) {
					hight--;
				}
				System.out.println("�м�:[low=" + low + "|hight=" + hight + "]"
						+ v.toString());

				v.set(low, v.get(hight));
				while (low < hight && v.get(low) >= key) {
					low++;
				}
				System.out.println("����:[low=" + low + "|hight=" + hight + "]"
						+ v.toString());

				v.set(hight, v.get(low));
			}
			v.set(low, key);
			quickSort(v, left, low - 1);
			quickSort(v, low + 1, right);
		}

	}
	
	/**
	 * ��������
	 */
	static void insertSort(Vector<Integer> v ){
		System.out.println("��������ǰ:"+v.toString());
		String str[] ={"d","dd"};
		int s = str.length;
		for(int i = 0;i < v.size(); i++){
			int t = v.get(i);
			int j = i;
			while((j > 0)&&(v.get(j-1) > t)){
				v.set(j, v.get(j-1));
				j--;
			}
			v.set(j, t);
		}
		System.out.println("���������:"+v.toString());			
	}
	
	/**
	 * ð������
	 */
	static void BubbleSort(Vector<Integer> v){
		System.out.println("ð�ݷ�����ǰ��"+v.toString());
		int temp = 0;
		for(int i = v.size()-1;i > 0;--i ){
			for(int j = 0;j < i;++j){
				if(v.get(j) > v.get(j+1)){
					temp = v.get(i);
					v.set(j, v.get(j+1));
					v.set(j+1, temp);
				}
			}
		}
		System.out.println("ð�ݷ������"+v.toString());
	}
	
	public static void main(String[] args) {
		System.out.println("����ǰ:" + vector.toString());
		quickSort(vector, 0, vector.size() - 1);
		System.out.println("�����:" + vector.toString());
		insertSort(vector1);
		BubbleSort(vector1);
	}
}
