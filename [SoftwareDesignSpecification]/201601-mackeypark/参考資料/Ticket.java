import java.util.ArrayList;
/**
 * チケットを出力するためのクラス
 * @SHIZUKA IMANISHI
 * @version 1.0
 * @since 1.0
 */
public class Ticket{
	/**
	 * チケット情報をMySQLに挿入するためのSQL文をコンソール上に出力するためのメソッド
	 */
	public static void main(String[] args) {
		String name = "";
		String period = "";
		String division = "";
		String explanation = "";
		String design = "";
		String img = "";
		String imgpath = "";
		String date = "now()";
		String content ="";
		int price = 0;

		ArrayList<String> ticket = new ArrayList<>();

		for(int i=1;i<=7;i++){
			if(i==1){
				division = "大人";
				explanation = "20歳以上の方がお楽しみいただけます。";
				price = 4000;
			}
			if(i==2){
				division = "小人";
				explanation = "6歳以上、20歳以下の方がお楽しみいただけます。";
				price = 3000;
			}
			if(i==3){
				division = "幼児";
				explanation = "5歳以下の方がお楽しみいただけます。";
				price = 2000;
			}
			if(i==4){
				division = "団体";
				explanation = "20人以上の団体が対象です。";
				price = 3500;
			}
			if(i==5){
				division = "バースデー";
				explanation = "当日お誕生日の方が対象です。お誕生日をお祝いするグッズがついています。";
				price = 5000;
			}
			if(i==6){
				division = "アフター6";
				explanation = "午後6時以降に入園する方が対象です。。";
				price = 2000;
			}
			if(i==7){
				division = "シニア";
				explanation = "65歳以上の方がお楽しみいただけます。";
				price = 2000;
			}
			for(int j=1;j<=4;j++){
				if(j==1){period = "1日";}
				if((i>=4 && i <=6) && j>=2){continue;}
				if(j==2){
					period = "1週間";
					price = price * 2;
				}
				if(j==3){
					period = "1ヶ月";
					price = price * 5;
				}
				if(j==4){
					period = "1年";
					price = price * 10;
					price=price/5;
				}

				name =period +"("+ division +")";


				for(int k=1; k<=6 ; k++){
					if(k==1){
						img = "マッキー";
						imgpath = "./picture/マッキー.jpg";
					}
					if(k==5){
						img = "グッフィ";
						imgpath = "./picture/グッフィ.png";
					}
					
					if(k==2){
						img = "マニー";
						imgpath = "./picture/マニー.jpg";
					}
					if(k==4){
						img = "ドイジー";
						imgpath = "./picture/ドイジー.jpg";
					}
					
					if(k==3){
						img = "ドルナド";
						imgpath = "./picture/ドルナド.jpg";
					}
					if(k==6){
						img = "ポルート";
						imgpath = "./picture/ポルート.jpg";

					}

					content = "(\""+ name + "\",\""+period+"\",\""+division+"\",\""+explanation
							+"\",\""+img+"\",\""+imgpath+"\","+price+","+date+");";
					ticket.add(content);
			}
		}
	}

	for(String s: ticket){
		System.out.println("insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)"
				+ "values"+s);
	}
}

}