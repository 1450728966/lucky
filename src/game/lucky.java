package game;

import java.util.Scanner;

public class lucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){//����ѭ������Ӧcontinue
		int num1;
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ�����ѡ���Ӧ�ı�ţ�1ע�ᣬ2��¼��3�齱");
		num1 = input.nextInt();
		switch (num1) {
		case 1:
			Scanner input1 = new Scanner(System.in);
			System.out.println("*******ע��*******");
			System.out.println("�û�����");
			String name = input1.nextLine();
			System.out.println("�ֻ��ţ�");
			long num2 = input1.nextLong();
			System.out.println("���룺��������6λ��Ч������ɣ�");
			int password = input1.nextInt();//string����Ϊ�α���
			outer:System.out.println("��֤�룺");
			int yanzheng,num3;
			do{
			 yanzheng = (int)(Math.random()*100000);//���������֤�룻
			System.out.println(yanzheng);
		    System.out.println("��������֤�룺");
			 num3 = input1.nextInt();
			
			 if(num3 == yanzheng)//boolean a = num3.equals(yanzheng);�ַ����ȽϷ���if(a)
			{
				System.out.println("��ϲ��ע��ɹ���");
				int [] card = new int[1];
				card[0] = (int)(Math.random()*100);
				//int card = (int)(Math.random()*10000);
				System.out.println("���Ļ�Ա����Ϊ��"+card[0]);
			}else 
			{
				System.out.println("��֤���������ע��ʧ�ܣ�������ע�ᣡ");
				//continue outer;//��ת��outer������д��֤��
			}
			}
			while(num3 != yanzheng);
	
			//break;
		case 2:
			System.out.println("*******��¼*******");
			Scanner input2 = new Scanner(System.in);
			System.out.println("���������Ļ�Ա���ţ�");
			int card = input2.nextInt();
			System.out.println("�������������룺");
			int password1 = input2.nextInt();//�������������û���������
			int yanzheng1,num4;
			do{
			yanzheng1 = (int)(Math.random()*100000);
			System.out.println("��֤�룺"+yanzheng1);
			System.out.println("��������֤�룺");
			num4 = input2.nextInt();
			if(num4 == yanzheng1)//boolean a = num3.equals(yanzheng);�ַ����ȽϷ���if(a)
			{
				System.out.println("��ϲ���¼�ɹ���");
			}else 
			{
				System.out.println("��֤��������󣬵�¼ʧ�ܣ����������룡");
				//continue outer;��ת��outer������д��֤��
				
			}
			}while(num4 != yanzheng1);
			//break;
		case 3:
			//��δ�case1����case2ֱ����ת��case3��
			System.out.println("*******��ӭ�齱*******");
			Scanner input3 = new Scanner(System.in);
			System.out.println("���������Ļ�Ա���ţ�");
			int num5 = input3.nextInt();
			System.out.println("�������������룺");
			int password4 = input3.nextInt();
			System.out.println("��֤�룺");
			int yanzheng2,num6;
			do{
			yanzheng2 = (int)(Math.random()*100000);
			System.out.println(yanzheng2);
			System.out.println("��������֤�룺");
			num6 = input3.nextInt();
			if(num6 == yanzheng2){
				System.out.println("��ȴ������");
			}else
			{
				System.out.println("��֤������������˳��������룡");
			}
			}
			while(num6!=yanzheng2);
			int[] luck= new int[5];
			luck[0] = (int)(Math.random()*100);
			luck[1] = (int)(Math.random()*100);
			luck[2] = (int)(Math.random()*100);
			luck[3] = (int)(Math.random()*100); 
			luck[4] = (int)(Math.random()*100);
			System.out.println(luck[0]+"\t"+luck[1]+"\t"+luck[2]+"\t"+luck[3]+"\t"+luck[4]+"\t");
			
			/*int luck1 = (int)(Math.random()*100000);
			System.out.println(luck1);
			int luck2 = (int)(Math.random()*100000);
			System.out.println(luck2);
			int luck3 = (int)(Math.random()*100000);
			System.out.println(luck3);
			int luck4 = (int)(Math.random()*100000);
			System.out.println(luck4);
			int luck5 = (int)(Math.random()*100000);
			System.out.println(luck5);
			if(num5 == luck1 || num5 ==luck2 || num5 ==luck3 || num5 ==luck4 || num5 ==luck5 ){*/
			if(num5 == luck[0] || num5 ==luck[1] || num5 ==luck[2] || num5 ==luck[3] || num5 ==luck[4] ){
				System.out.println("��ϲ���߹�ʺ���н��ˣ�������");
			}else
			{
				System.out.println("���ź�û���н���");
			}
			System.out.println("�Ƿ�����ע�᣺y/n");
			input3.nextLine();//nextline�����
			String xz = input3.nextLine();
			
			if(xz.equals("y")){
				System.out.println("ok");
				continue;
				
			}else{
				System.out.println("see you!");
			}
			break;
		default:
			System.out.println("����������������룡");
			
			break;
		}
	break;	
	}

}
}