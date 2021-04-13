package kr.or.ddit.basic;

import java.util.SortedSet;
import java.util.TreeSet;

public class T06_TreeSetTest {

	public static void main(String[] args) {
		// TreeSet은 자동정렬 기능이 있다.
		TreeSet<String> ts = new TreeSet<String>();

		// 영어 대문자를 문자열로 변환하여 TreeSet에 저장
		for (char ch = 'Z'; ch >= 'A'; ch--) {//TreeSet에 데이터가 들어올 때 자동으로 정렬되는 기능이 있음. 
											 //정렬이 잘되는지 확인하려고 거꾸로 데이터를 넣음.
			String temp = String.valueOf(ch); // String이 제공해주는 valueOf(타입을 변환)를 사용
			ts.add(temp);
		}
		//기준값보다 head 작은 값(왼쪽), tail 큰값(오른쪽)
		System.out.println("TressSet 자료 : " + ts);

		// TreeSet에 저장된 자료 중 특정한 자료보다 작은 자료를 찾아서 SortedSet으로 반환하는 메서드가 있다.
		// => headSet(기준값) : 기본적으로 '기준값'은 포함시키지 않는다.
		// => headSet(기준값, 논리값) : 논리값이 true이면 '기준값'을 포함시킨다.
		SortedSet<String> ss1 = ts.headSet("K"); //기준값 K 
		System.out.println("K 이전 자료 : " + ss1); // 기준값 미포함
		System.out.println("K 이전 자료 (기준값 포함) : " + ts.headSet("K", true)); //가지고 오고 싶으면 true, 아니면 false

		// '기준값'보다 큰 자료를 찾아 SortedSet으로 반환하는 메서드
		// tailSet(기준값) => 기본적으로 '기준값'을 포함시킨다.
		// tailSet(기준값, 논리값) => 논리값이 false이면 '기준값'을 포함시키지 않음
		SortedSet<String> ss2 = ts.tailSet("K");
		System.out.println("K 이후 자료 : " + ss2);
		System.out.println("K 이후 자료 (기준값 미포함) : " + ts.tailSet("K", false));

		// subSet(기준값1, 기준값2) => 기준값1 ~ 기준값2 사이의 값을 가져온다.
		// => '기준값1' 포함, '기준값2' 미포함
		// subSet(기준값1, 논리값1, 기준값2, 논리값2)
		// => 각 기준값을 포함할지 여부를 설정한다.(논리값이 true이면 포함, false면 미포함)
		System.out.println("K(포함)부터 N(미포함)까지 : " + ts.subSet("K", "N"));
		System.out.println("K(포함) ~ N(포함) : " + ts.subSet("K", true, "N", true));
		System.out.println("K(미포함) ~ N(미포함) : " + ts.subSet("K", false, "N", false));
		System.out.println("K(미포함) ~ N(포함) : " + ts.subSet("K", false, "N", true));
	}

}
