package exampleForPupils;

import java.text.SimpleDateFormat;

/*��� �������� ���������� ������ �������� ����� ������ �������,
 *  ������� ������� ������� ����� �������� ������ ���� � ����, 
 *  ����� �������� ������� ������� ������ �� ������� ���������,
 *   �� � ������ 15 �������, � ������� ����� ��� �� ������ �����������.
 *    � ������ ������� �������� ���������, ������� ����� �������� �� ����� 
 *    15 ��������� �������� �� ������� ��������� (�� 2*2 �� 9*9, 
 *    ������ ��� ������� �� ��������� �� 1 � �� 10 � ������� ������). 
 *    ��� ���� ����� 15 �������� �� ������ ���� �������������
 *     (������� 2*3 � 3*2 � �� �������� ���� ������� ��������������). 
 *     ��������� ��� ������ ������ � �������� � ������ Math*/

public class Test {

	public static void main(String[] args) {
		
		Example ex = new Example();
		
		long start = System.currentTimeMillis();		
				
		ex.startTest();  // ����� ������ ����� ...
		
		long finish = System.currentTimeMillis();
		long timeConsumedMillis = finish - start;			
	
		System.out.println(timeConsumedMillis/1000 + " seconds" );
		
		
		

	}

}
