package game;

import java.util.Scanner;

public class lucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){//整体循环，对应continue
		int num1;
		Scanner input = new Scanner(System.in);
		System.out.println("请选择相关选项对应的标号：1注册，2登录，3抽奖");
		num1 = input.nextInt();
		switch (num1) {
		case 1:
			Scanner input1 = new Scanner(System.in);
			System.out.println("*******注册*******");
			System.out.println("用户名：");
			String name = input1.nextLine();
			System.out.println("手机号：");
			long num2 = input1.nextLong();
			System.out.println("密码：（密码由6位有效数字组成）");
			int password = input1.nextInt();//string类型为何报错？
			outer:System.out.println("验证码：");
			int yanzheng,num3;
			do{
			 yanzheng = (int)(Math.random()*100000);//随机生成验证码；
			System.out.println(yanzheng);
		    System.out.println("请输入验证码：");
			 num3 = input1.nextInt();
			
			 if(num3 == yanzheng)//boolean a = num3.equals(yanzheng);字符串比较方法if(a)
			{
				System.out.println("恭喜你注册成功！");
				int [] card = new int[1];
				card[0] = (int)(Math.random()*100);
				//int card = (int)(Math.random()*10000);
				System.out.println("您的会员卡号为："+card[0]);
			}else 
			{
				System.out.println("验证码输入错误，注册失败，请重新注册！");
				//continue outer;//跳转到outer继续填写验证码
			}
			}
			while(num3 != yanzheng);
	
			//break;
		case 2:
			System.out.println("*******登录*******");
			Scanner input2 = new Scanner(System.in);
			System.out.println("请输入您的会员卡号：");
			int card = input2.nextInt();
			System.out.println("请输入您的密码：");
			int password1 = input2.nextInt();//如何做到密码和用户名检查错误？
			int yanzheng1,num4;
			do{
			yanzheng1 = (int)(Math.random()*100000);
			System.out.println("验证码："+yanzheng1);
			System.out.println("请输入验证码：");
			num4 = input2.nextInt();
			if(num4 == yanzheng1)//boolean a = num3.equals(yanzheng);字符串比较方法if(a)
			{
				System.out.println("恭喜你登录成功！");
			}else 
			{
				System.out.println("验证码输入错误，登录失败，请重新输入！");
				//continue outer;跳转到outer继续填写验证码
				
			}
			}while(num4 != yanzheng1);
			//break;
		case 3:
			//如何从case1或者case2直接跳转到case3？
			System.out.println("*******欢迎抽奖*******");
			Scanner input3 = new Scanner(System.in);
			System.out.println("请输入您的会员卡号：");
			int num5 = input3.nextInt();
			System.out.println("请输入您的密码：");
			int password4 = input3.nextInt();
			System.out.println("验证码：");
			int yanzheng2,num6;
			do{
			yanzheng2 = (int)(Math.random()*100000);
			System.out.println(yanzheng2);
			System.out.println("请输入验证码：");
			num6 = input3.nextInt();
			if(num6 == yanzheng2){
				System.out.println("请等待结果：");
			}else
			{
				System.out.println("验证码输入错误，请退出重新输入！");
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
				System.out.println("恭喜您走狗屎运中奖了！！！！");
			}else
			{
				System.out.println("很遗憾没有中奖！");
			}
			System.out.println("是否重新注册：y/n");
			input3.nextLine();//nextline的输出
			String xz = input3.nextLine();
			
			if(xz.equals("y")){
				System.out.println("ok");
				continue;
				
			}else{
				System.out.println("see you!");
			}
			break;
		default:
			System.out.println("输入错误，请重新输入！");
			
			break;
		}
	break;	
	}

}
}