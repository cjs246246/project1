import java.util.*;
class report1 {
        void print(){
	Scanner s = new Scanner(System.in);
	System.out.print("�¾ �⵵�� �Է��ϼ���.");
	int birth_year = s.nextInt();
	int age = 2014 - birth_year + 1;
	if (age < 20) {
	System.out.print("�̼����� �Դϴ�.");
	  }
	  else {
	  System.out.print("�̼����ڰ� �ƴմϴ�.");
	      }
	       }
        public static void main(String[] args) {
        new report1().print();
        }
	}

