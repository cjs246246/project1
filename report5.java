import java.util.*;
class report5 {
        public static void main(String[] args) {
	 
	 Scanner s = new Scanner(System.in);
	
	System.out.print("�¾ �⵵�� �Է��ϼ��� ");
	
	int birth_year = s.nextInt();
	
	int age = 2012 - birth_year + 1;
	
	if(age < 7) {
	
	System.out.print("�����Դϴ�.");
	
	}
	
	else if(7 <= age && age < 13) {
	
	System.out.print("����Դϴ�.");
	
	}
	
	else if(13 <= age && age < 20) {
	
	System.out.print("û�ҳ��Դϴ�.");
	
	}
	
	else if(20 <= age && age < 30) {
	
	System.out.print("û���Դϴ�.");
	
	}
	
	else if(30 <= age && age < 60) {
	
	System.out.print("�߳��Դϴ�.");
	
	}
	
	else if(60 <= age) {
	
	System.out.print("����Դϴ�.");
	
	}
	
	else {}
	
	}
	
	}

