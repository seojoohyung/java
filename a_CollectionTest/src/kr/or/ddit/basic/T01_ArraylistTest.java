package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class T01_ArraylistTest {
	public static void main(String[] args) {
		//Arraylist는 기본적인 사용법이 Vector와 같다.
		//DEFAULT_CAPACITY = 10
		List list1 = new ArrayList();//list1 객체 생성
		//List list1 = new Vector(); //Vector()사용법 
		
		//add()메서드를 사용해서 데이터를 추가한다.
		list1.add("aaa");
		list1.add("bbb");
		list1.add(111);
		list1.add('k');
		list1.add(true);
		list1.add(12.34);
		
		//size() => 데이터의 개수
		System.out.println("size =>" + list1.size());
		System.out.println("list1 => "+ list1);
		
		//get1으로 데이터 꺼내오기
		System.out.println("1번째 자료: " + list1.get(1)); //인덱스 
		//데이터 끼워넣기도 같다.
		list1.add(0,"zzz"); //그냥 add는 list의 맨 뒤에 넣는 것, (인덱스 값, 추가할 데이터)
		System.out.println("list1 => " + list1);
		
		//데이터 변경하기(set 메서드)
		String temp = (String)list1.set(0,"yyy");
		System.out.println("temp =>" + temp);
		System.out.println("list1 =>" + list1);
		
		//삭제하기
		list1.remove(0); //삭제 할 인덱스 값 넣어주기 
		System.out.println("삭제 후 :" + list1);
		
		list1.remove("bbb");
		System.out.println("bbb 삭제후 : "+ list1);
		System.out.println("===================================");
	
		//제네릭을 지정하여 선언할 수 있다. 
		List<String> list2 = new ArrayList<String>();
		list2.add("AAA");
		list2.add("BBB");
		list2.add("CCC");
		list2.add("DDD");
		list2.add("EEE");
		//list2.add(1); <= 제네릭 String 타입으로 오류가 남!! String타입만 들어올 수 있음.
		 
		//<>제네릭안에 Object를 사용하면 그 안에 들어있는 타입을 확인하기 어렵다.
		//<String>으로 제네릭을 설정하면 String타입만 들어있는 것을 확인할 수 있다. 
		
		for (int i = 0; i < list2.size(); i++) { 
			System.out.println(i + " : " + list2.get(i));
		}
		System.out.println("--------------------------------");
		
		for(String s : list2) {//collection 객체의 사이즈 만큼 돌아준다. (향상된 for문)
			System.out.println(s);
			
		}
		System.out.println("--------------------------------");
			
		//contains(비교객체); => 리스트에 '비교객체'가 있으면 true 없으면 false 리턴함.
		System.out.println(list2.contains("DDD")); //true //list2에 DDD가 있나? 
		System.out.println(list2.contains("ZZZ")); //false
		System.out.println("---------------------------------");
		
		//toArray() => 리스트 안의 데이터들을 배열로 변환하여 반환한다.
		//			=> 기본적으로 Object형 배열로 반환한다.
		Object[] strArr = list2.toArray(); //list2를 배열로 반환 toArray()
		System.out.println("배열의 갯수: " + strArr.length);
		
		//리스트의 제네릭타입에 맞는 자료형의 배열로 반환하는 방법
		//제네릭타입의 0개짜리 배열을 생성해서 매개변수로 넣어준다.
		// => 배열을 크기가 리스트 크기보다 작으면 리스트의 크기에 맞는 배열을 넣어준다.
		String[] strArr2 = list2.toArray(new String[0]);
		System.out.println("strArr2의 개수: " + strArr2.length);
		
		for(int i=0; i<list2.size(); i++) {
			list2.remove(i);
		}
		System.out.println("remove 후 list2의 size : " + list2.size());
		System.out.println(list2);
		
		//끝에서부터 지우면 list안에 있는 데이터를 다 지울 수 있다. 
		for(int i=list2.size()-1; 0<=i; i--) {
			list2.remove(i);
		}
		System.out.println("remove 후 list2의 size : " + list2.size());
		
		
	}
}
