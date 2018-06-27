
public class Test {

	public static void main(String[] args) {

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="080-0000-1111";
		jiro.address="千葉県";
		jiro.gender="男性";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		System.out.println(jiro.gender);


		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="080-2222-3333";
		hanako.address="埼玉県";
		hanako.gender="女性";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		System.out.println(hanako.gender);

		Person mai=new Person();
		mai.name="藤井舞";
		mai.age=26;
		mai.phoneNumber="080-6040-5374";
		mai.address="東京都";
		mai.gender="女性";
		System.out.println(mai.name);
		System.out.println(mai.age);
		System.out.println(mai.phoneNumber);
		System.out.println(mai.address);
		System.out.println(mai.gender);

jiro.talk();
hanako.walk();
mai.run();



Robot aibo=new Robot();
aibo.name="アイボ";

Robot asimo=new Robot();
asimo.name="アシモ";

Robot pepper=new Robot();
pepper.name="ペッパー";

Robot doraemon=new Robot();
doraemon.name="ドラえもん";


aibo.talk();
asimo.walk();
pepper.run();
doraemon.talk();


	}

}
