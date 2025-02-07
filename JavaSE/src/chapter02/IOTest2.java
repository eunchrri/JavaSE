package chapter02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class IOTest2 {

	public static void main(String[] args) throws Exception{
		
		/*
		 * System.in은 기본적으로 keyboard 로 부터 입력받지만
		 * 다른 대사응로 부터 입력받을 경우 setIn(입력받을 대상) 함수로 설정한다.
		 * */
		
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		System.out.println(line);
	}

}

