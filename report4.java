import java.util.*;
class report4 {
        public static void main(String[] args) {
	int kor=0;
	int eng=0;
	
	int math=0;
	
	int total=0;
	
	double avg=0;
	
	Scanner s = new Scanner(System.in);
	do{
	System.out.print("���� ������ �Է��ϼ��� ");
	kor = s.nextInt();
	} while(kor == 0);
	do{

	System.out.print("���� ������ �Է��ϼ��� ");

	eng = s.nextInt();

	} while(eng == 0);



	do{

	System.out.print("���� ������ �Է��ϼ��� ");

	math = s.nextInt();

	} while(math == 0);

	total = kor + eng + math;

	avg = 1.0*total/3;

	System.out.println("�Է��Ͻ� ������ ������ " + total + " �̰�,\n����� " + avg + " �Դϴ�.");

	if(kor >= 90) {

	System.out.print("���������� ����մϴ�.\n");

	}

	else {}

	if(eng >= 90) {

	System.out.print("���������� ����մϴ�.\n");
																																																									                }

	else {}

	if(math >= 90) {

	System.out.print("���������� ����մϴ�.");

	}
	else {}
        }
	}




