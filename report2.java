import java.util.*;
class report2 {
        public static void main(String[] args){
	Scanner s = new Scanner(System.in);
        System.out.print("�µ��� �Է��ϼ��� ");					            
	double input_degree = s.nextInt();
	double output_degree;
	System.out.print("�Է��Ͻ� �µ��� �����µ��̸� C��, ȭ���µ��̸� F�� �Է��ϼ��� ";
	String kind = s.next();								                
	if(kind.equals("C")) {
	output_degree = input_degree * 1.8 + 32;
	System.out.print("��ȯ�� �µ��� " + output_degree + " �Դϴ�.");
	               }
	
	else if(kind.equals("F")) {
	
	output_degree = (input_degree - 32)/1.8;
	
	System.out.print("��ȯ�� �µ��� " + output_degree + " �Դϴ�.");
	
	}
	
	else {
	
	System.out.print("�߸��� �Է��Դϴ�.");
	
	}
	
	}
	
	}
