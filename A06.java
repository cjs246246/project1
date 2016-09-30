import java.util.*;
class A06 {
        public static void main(String[] args) {
        int kor=0;
	int eng=0;
	int math=0;
	int total=0;
	char name;
	double avg=0;
	Scanner s = new Scanner(System.in);
	System.out.print("이름 : ");
	do{	
	System.out.print("국어 점수를 입력하세요 ");
	kor = s.nextInt();
	} while(kor ==0);
	do{														System.out.print("영어 점수를 입력하세요 ");
 	eng = s.nextInt();
	} while(eng == 0);
	do{  System.out.print("수학 점수를 입력하세요 ");
	math = s.nextInt();
	} while(math == 0);
	total = kor + eng + math;
	avg = 1.0*total/3;
	System.out.println(" 님은 \n평균은 "  );
	if(avg >= 95) {
	System.out.print("학점은 A+ 입니다 .\n");
	 }
	 else {}
	     if(avg >= 90) {
	     System.out.print("학점은 A 입니다.\n");
	        }
	else {}
	if(avg >= 85) {
	System.out.print("학점은 B+ 입니다.\n");
		}	
		else {}
			       if(avg >= 80) {
			         System.out.print("학점은 B 입니다.\n");
			        }
			else {}
			       if(avg >= 75) {
			        System.out.print("학점은 C+ 입니다.\n");
			        }
			else {}
			      if(avg >= 70) {
			       System.out.print("학점은 C 입니다.\n");
			        }
				else {}

				     }
				 }
