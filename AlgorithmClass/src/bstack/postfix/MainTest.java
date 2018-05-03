package bstack.postfix;

import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) { // 결론 : 32+45-*
		
		String inputStr = "(3+2)*(4-5)"; // 중위표기법 입력 
		char[] infix = inputStr.toCharArray(); // 하나하나 배열에 담김 
		
		char[] postfix = toPostFix(infix); // 후위표기법을 담을 char[]	
		
		System.out.println(postfix);
		
		int result = calPostFix(postfix); // 후위표기법을 계산하는 함수
		
		System.out.println(result);
	}
	
	static int calPostFix(char[] postfix) {
		ListStack stack = new ListStack();
		for (int i = 0; i < postfix.length; i++) {
			char ch = postfix[i];
//			int second = 0;
//			int first = 0;
			int result = 0;
			if(ch=='\0'){
				continue;
			} else if(ch >= '0' && ch<= '9'){ //1) 숫자라면 스택에 저장
				int a = ch - '0';
				stack.push(a);
			} else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){ 
				// 2) 연산자라면 스택에서 2개를꺼내서 계산하고 다시 스택에 저장 
				int second = (int)stack.pop(); // char ->int
				int first =  (int)stack.pop();
				switch (ch) {
				case '+':
					result = first + second;
					stack.push(result);
					break;
				case '-':
					result = first - second;
					stack.push(result);
					break;
				case '*':
					result = first * second;
					stack.push(result);
					break;
				case '/':
					result = first / second;
					stack.push(result);
					break;
				default:
					break;
				}
				
			}
			
		}
		return (int) stack.pop();
	}

	/** 중위표기법을 후위표기법으로 변환하는 함수 **/
	static char[] toPostFix (char[] infix){
		ListStack stack = new ListStack<>();
		
		char[] postfix = new char[infix.length];
		
		int index = 0;
		
		for (int i = 0; i < infix.length; i++) {
			char ch = infix[i];
			// 1) 하나씩 꺼내온 것이 숫자라면(연산자가 아니라면)postfix에 바로 저장 
			// 2) 연산자라면 stack에 저장 
			// 3) ')'라면 stack에 있는 연산자를 배열에 저장
			if( ch >= '0' && ch <='9'){
				postfix[index]= ch;
				index++;
			}else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
				stack.push(ch);
			}else if(ch == ')'){
				char temp = (char) stack.pop();
				postfix[index] = temp;
				index++;
			}
			
			
		}
		// 스택에 남은 연산자를 모두 배열에 넣기 
		while(!stack.isEmpty()) {
			char temp = (char) stack.pop();
			postfix[index] = temp;
			index++;
		}
		return postfix;
	}

}
