package problem_solving_java.level01;

//풀이시간  : 2021-10-27 09:30 ~ 09:38
//결과		 : 100.0 / 100.0 (정확성: 100.0)
//나의 판단 : 예전에 배웠던 replaceAll을 활용해서 정말 잘 풀었다^^

/*
 * <문제 제목> : 숫자 문자열과 영단어
 
 
 * <문제> : 
 	→ 네오와 프로도가 숫자놀이를 하고 있습니다.
 	네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
 	다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	1478 	→  "one4seveneight"
	234567  →  "23four5six7"
	10203   →  "1zerotwozero3"
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
 
	class Solution {
    public int solution(String s) {
        int answer = 0;
        return answer;
    }
}

 
 * <문제 설명> :
 	각 숫자에 대응되는 영단어는 다음 표와 같습니다.
 	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 	숫자	영단어
	0		zero
	1		one
	2		two
	3		three
	4		four
	5		five
	6		six
	7		seven
	8		eight
	9		nine
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 	
	
	
 * <제한사항> :
 	★ 1 ≤ s의 길이 ≤ 50
	★ s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
	★ return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어집니다.
	
		
 
 * <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	s							result
	"one4seveneight"			1478
	"23four5six7"				234567
	"2three45sixseven"			234567
	"123"						123
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	★ 입출력 예 #1
		문제의 예시와 같습니다.

	★ 입출력 예 #2
		문제의 예시와 같습니다.

	★ 입출력 예 #3
		three"는 3, "six"는 6, "seven"은 7에 대응되기 때문에 정답은 입출력 예 #2와 같은 234567이 됩니다.
		입출력 예 #2와 #3과 같이 같은 정답을 가리키는 문자열이 여러 가지가 나올 수 있습니다.

	★ 입출력 예 #4
		s에는 영단어로 바뀐 부분이 없습니다.
		
		
		
		
 * <제한 시간> :

     ★ 정확성 테스트 : 10초
	
*/

class Problem_003_MySolution01 {
	
	public int solution(String s) {
		
		String data = s;
		data = data.replaceAll("zero" , "0");
		data = data.replaceAll("one" , "1");
		data = data.replaceAll("two" , "2");
		data = data.replaceAll("three" , "3");
		data = data.replaceAll("four" , "4");
		data = data.replaceAll("five" , "5");
		data = data.replaceAll("six" , "6");
		data = data.replaceAll("seven" , "7");
		data = data.replaceAll("eight" , "8");
		data = data.replaceAll("nine" , "9");
		
        int answer = Integer.parseInt(data);
        return answer;
    }

}
