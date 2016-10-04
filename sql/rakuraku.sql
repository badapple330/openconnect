		drop database if exists rakugo;
		create database rakugo;
		use rakugo;

		create table user(
		id int primary key not null auto_increment comment'ユーザーID',
		email varchar(100) unique comment'メールアドレス',
		password varchar(255) comment'パスワード',
		name varchar(50) not null comment'名前',
		name_kana varchar(50) comment'フリガナ',
		card_num int comment''クレジットカード番号',
		token varchar(255) comment'クレジット用トークン',
		oauth_id varchar(50) comment''OAuth用トークン',
		oauth_name varchar(15) comment'OAuth名',
		created_at datetime not null comment'作成日時',
		updated_at datetime not null comment'更新日時'
		);

		create table event(
		id int primary key not null auto_increment comment'イベントID',
		name varchar(100) not null comment''イベント名',
		price float not null comment'値段',
		detail varchar(255) not null comment'商品詳細',
		img_path varchar(100) not null comment'画像パス',
		story_teller varchar(255) not null comment'出演者',
		start_date date not null comment'開催日',
		place varchar(100) not null comment'会場名',
		place_address varchar(100) not null comment'開催住所',
		ticket int not null comment'チケット発行数',
		earnings int not null,
		created_at datetime not null comment'作成日時',
		updated_at datetime not null comment'更新日時'
		);

		create table order_history(
		id int primary key not null auto_increment comment'購入履歴ID',
		user_id int not null comment'ユーザーID',
		event_id int not null comment'イベントID',
		event_date date not null comment'イベント開催日',
		number int not null comment'購入枚数',
		created_at datetime not null comment'作成日時',
		foreign key(user_id) references user(id),
		foreign key(event_id) references event(id)
		);

		create table admin(
		id int primary key not null auto_increment comment'管理者ID',
		password varchar(255) not null comment'管理者パスワード',
		name varchar(32) unique not null comment'管理者名',
		created_at datetime not null comment'作成日時',
		updated_at datetime not null comment'更新日時',
		);

		insert into user value
	(1,"rakugo100@docomo.ne.jp","rakugo100","田中 仁","タナカヒトシ",015515161,"","","","2016-01-28 22:00:00","2016-01-28 22:00:00"),
	(2,"rakugo101@docomo.ne.jp","rakugo101","鈴木 浩太","スズキコウタ",015515162,"","","","2016-01-28 22:00:01","2016-01-28 22:00:01"),
	(3,"rakugo102@docomo.ne.jp","rakugo102","田中 隆","タナカタカシ",015515163,"","","","2016-01-28 22:00:02","2016-01-28 22:00:02"),
	(4,"rakugo103@docomo.ne.jp","rakugo103","佐藤 瞳","サトウヒトミ",015515164,"","","","2016-01-28 22:00:03","2016-01-28 22:00:03"),
	(5,"rakugo104@docomo.ne.jp","rakugo104","中村 太郎","ナカムラタロウ",015515165,"","","","2016-01-28 22:00:04","2016-01-28 22:00:04"),
	(6,"rakugo105@docomo.ne.jp","rakugo105","山本 雅","ヤマモトマサ",015515166,"","","","2016-01-28 22:00:05","2016-01-28 22:00:05"),
	(7,"rakugo106@docomo.ne.jp","rakugo106","伊藤　博信","イトウヒロノブ",015515167,"","","","2016-01-28 22:00:06","2016-01-28 22:00:06"),
	(8,"rakugo107@docomo.ne.jp","rakugo107","小林 陽一","コバヤシヨウイチ",015515168,"","","","2016-01-28 22:00:07","2016-01-28 22:00:07"),
	(9,"rakugo108@docomo.ne.jp","rakugo108","高橋 名人","タカハシメイジン",015515169,"","","","2016-01-28 22:00:08","2016-01-28 22:00:08"),
	(10,"rakugo109@docomo.ne.jp","rakugo109","吉田　振門体","ヨシダフルモンティ",015515170,"","","","2016-01-28 22:00:09","2016-01-28 22:00:09"),
	(11,"rakugo110@docomo.ne.jp","rakugo110","加藤 嘉緒翠","カトウカオス",015515171,"","","","2016-01-28 22:00:10","2016-01-28 22:00:10"),
	(12,"rakugo111@docomo.ne.jp","rakugo111","山田 芽凸","ヤマダガコ",015515172,"","","","2016-01-28 22:00:11","2016-01-28 22:00:11"),
	(13,"rakugo112@docomo.ne.jp","rakugo112","松本 芯次威","ヤマモトシンディ",015515173,"","","","2016-01-28 22:00:12","2016-01-28 22:00:12"),
	(14,"rakugo113@docomo.ne.jp","rakugo113","井上 萌羅等南","イノウエモラトナ",015515174,"","","","2016-01-28 22:00:13","2016-01-28 22:00:13"),
	(15,"rakugo114@docomo.ne.jp","rakugo114","山口 陽","ヤマグチピン",015515175,"","","","2016-01-28 22:00:14","2016-01-28 22:00:14"),
	(16,"rakugo115@docomo.ne.jp","rakugo115","林 京桜靖","ハヤシキョオセイ",015515176,"","","","2016-01-28 22:00:15","2016-01-28 22:00:15"),
	(17,"rakugo116@docomo.ne.jp","rakugo116","木村 ピス湖","キムラビスコ",015515177,"","","","2016-01-28 22:00:16","2016-01-28 22:00:16"),
	(18,"rakugo117@docomo.ne.jp","rakugo117","佐々木 大描夢","ササキヒガム",015515178,"","","","2016-01-28 22:00:17","2016-01-28 22:00:17"),
	(19,"rakugo118@docomo.ne.jp","rakugo118","橋本 赤苺","ハシモトニュウイ",015515179,"","","","2016-01-28 22:00:18","2016-01-28 22:00:18"),
	(20,"rakugo119@docomo.ne.jp","rakugo119","清水 美波瑠璃","シミズヒバルリ",015515180,"","","","2016-01-28 22:00:19","2016-01-28 22:00:19"),
	(21,"rakugo120@docomo.ne.jp","rakugo120","山下 羅似","ヤマシタキライ",015515181,"","","","2016-01-28 22:00:20","2016-01-28 22:00:20"),
	(22,"rakugo121@docomo.ne.jp","rakugo121","森 美々魅","モリミミミ",015515182,"","","","2016-01-28 22:00:21","2016-01-28 22:00:21"),
	(23,"rakugo122@docomo.ne.jp","rakugo122","石川 愛保","イシカワラブホ",015515183,"","","","2016-01-28 22:00:22","2016-01-28 22:00:22"),
	(24,"rakugo123@docomo.ne.jp","rakugo123","阿部 とっぽ","アベトッポ",015515184,"","","","2016-01-28 22:00:23","2016-01-28 22:00:23"),
	(25,"rakugo124@docomo.ne.jp","rakugo124","齋藤 束生夏","サイトウバナナ",015515185,"","","","2016-01-28 22:00:24","2016-01-28 22:00:24"),
	(26,"rakugo125@docomo.ne.jp","rakugo125","池田 星影夢","イケダポエム",015515186,"","","","2016-01-28 22:00:25","2016-01-28 22:00:25"),
	(27,"rakugo126@docomo.ne.jp","rakugo126","前田 神生理","マエダカオリ",015515187,"","","","2016-01-28 22:00:26","2016-01-28 22:00:26"),
	(28,"rakugo127@docomo.ne.jp","rakugo127","岡田 陽夏照","オカダヒゲキ",015515188,"","","","2016-01-28 22:00:27","2016-01-28 22:00:27"),
	(29,"rakugo128@docomo.ne.jp","rakugo128","渡辺 空々","ワタナベクウソ",015515189,"","","","2016-01-28 22:00:28","2016-01-28 22:00:28"),
	(30,"rakugo129@docomo.ne.jp","rakugo129","中島 流墨愛","ナカジマルピア",015515190,"","","","2016-01-28 22:00:29","2016-01-28 22:00:29"),
	(31,"rakugo130@docomo.ne.jp","rakugo130","村上 姫奈","ムラカミピイナ",015515191,"","","","2016-01-28 22:00:30","2016-01-28 22:00:30"),
	(32,"rakugo131@docomo.ne.jp","rakugo131","小川 奇跡","オガワダイヤ",015515192,"","","","2016-01-28 22:00:31","2016-01-28 22:00:31"),
	(33,"rakugo132@docomo.ne.jp","rakugo132","藤田 おかし子","フジタオカシコ",015515193,"","","","2016-01-28 22:00:32","2016-01-28 22:00:32"),
	(34,"rakugo133@docomo.ne.jp","rakugo133","長谷川 雅龍","ハセガワガアル",015515194,"","","","2016-01-28 22:00:33","2016-01-28 22:00:33"),
	(35,"rakugo134@docomo.ne.jp","rakugo134","坂本 美依羅","サカモトミイラ",015515195,"","","","2016-01-28 22:00:34","2016-01-28 22:00:34"),
	(36,"rakugo135@docomo.ne.jp","rakugo135","松田 新愛","マツダニュラ",015515196,"","","","2016-01-28 22:00:35","2016-01-28 22:00:35"),
	(37,"rakugo136@docomo.ne.jp","rakugo136","渡邉 炎皇斗","ワタナベカオス",015515197,"","","","2016-01-28 22:00:36","2016-01-28 22:00:36"),
	(38,"rakugo137@docomo.ne.jp","rakugo137","石井 愛ん","イシイアミン",015515198,"","","","2016-01-28 22:00:37","2016-01-28 22:00:37"),
	(39,"rakugo138@docomo.ne.jp","rakugo138","斉藤 嗣音羽","サイトウツォネパ",015515199,"","","","2016-01-28 22:00:38","2016-01-28 22:00:38"),
	(40,"rakugo139@docomo.ne.jp","rakugo139","遠藤 窓風朝穂子","エンドウソフィアスイコ",015515200,"","","","2016-01-28 22:00:39","2016-01-28 22:00:39"),
	(41,"rakugo140@docomo.ne.jp","rakugo140","藤井 ララ桜桃","フジイララサクランボ",015515201,"","","","2016-01-28 22:00:40","2016-01-28 22:00:40"),
	(42,"rakugo141@docomo.ne.jp","rakugo141","青木 賢一郎","アオキケンイチロウ",015515202,"","","","2016-01-28 22:00:41","2016-01-28 22:00:41"),
	(43,"rakugo142@docomo.ne.jp","rakugo142","福田 苺苺苺","フクダマリナル",015515203,"","","","2016-01-28 22:00:42","2016-01-28 22:00:42"),
	(44,"rakugo143@docomo.ne.jp","rakugo143","三浦 美望","ミウラニャモ",015515204,"","","","2016-01-28 22:00:43","2016-01-28 22:00:43"),
	(45,"rakugo144@docomo.ne.jp","rakugo144","西村 泡姫","ニシムラアリエル",015515205,"","","","2016-01-28 22:00:44","2016-01-28 22:00:44"),
	(46,"rakugo145@docomo.ne.jp","rakugo145","藤原 美俺","フジワラビオレ",015515206,"","","","2016-01-28 22:00:45","2016-01-28 22:00:45"),
	(47,"rakugo146@docomo.ne.jp","rakugo146","森田 姫凛","モリタプリン",015515207,"","","","2016-01-28 22:00:46","2016-01-28 22:00:46"),
	(48,"rakugo147@docomo.ne.jp","rakugo147","酒井 恋恋愛","サカイレンレコ",015515208,"","","","2016-01-28 22:00:47","2016-01-28 22:00:47"),
	(49,"rakugo148@docomo.ne.jp","rakugo148","横山 姫星","ヨコヤマキティ",015515209,"","","","2016-01-28 22:00:48","2016-01-28 22:00:48"),
	(50,"rakugo149@docomo.ne.jp","rakugo149","谷口 晴日","タニグチハルヒ",015515210,"","","","2016-01-28 22:00:49","2016-01-28 22:00:49");

		insert into event value
		(1,"新人大集合",1000,"今話題の新人が大集合","images/rakugo/rakugo1","田代亭,阿部亭,副福亭","2016-01-20","東京ドーム","東京都文京区後楽１丁目３-６１",500,50,"2016-01-15 05:00:00","2016-01-15 05:00:00"),
(2,"ベテラン大集合",1500,"今話題のベテランが大集合","images/rakugo/rakugo2","佐藤亭,鈴木亭,高橋亭","2016-01-21","福岡YahooJapanドーム","福岡県福岡市中央区地行浜２丁目２−２",600,100,"2016-01-16 06:00:00","2016-01-16 06:00:00"),
(3,"第２０回大阪公演",2000,"今月もやってきました大阪公演！","images/rakugo/rakugo3","田中亭,伊藤亭,山本亭","2016-01-22","京セラドーム","大阪府大阪市西区千代崎３丁目中２−１ 京セラドーム大阪",700,150,"2016-01-17 07:00:00","2016-01-17 07:00:00"),
(4,"第２１回愛知公演",2500,"今月もやってきました愛知公演！","images/rakugo/rakugo4","渡邉亭,中村亭,小林亭","2016-01-23","ナゴヤドーム","愛知県名古屋市東区大幸南１丁目１－１",800,200,"2016-01-18 05:00:01","2016-01-18 05:00:01"),
(5,"LoveRakugo 2016",3000,"落語を愛する人に捧ぐ","images/rakugo/rakugo5","加藤亭,吉田亭,山田亭","2016-01-24","西武ドーム","埼玉県所沢市 上山口２１３５",900,250,"2016-01-19 06:00:01","2016-01-19 06:00:01"),
(6,"開運公演",3500,"今話題の落語占いです","images/rakugo/rakugo6","佐々木亭,山口亭,松本亭","2016-01-25","札幌ドーム","北海道札幌市豊平区羊ケ丘１",1000,300,"2016-01-20 07:00:01","2016-01-20 07:00:01"),
(7,"落語イベント",4000,"落語のイベント","images/rakugo/rakugo7","井上亭,木村亭,林亭","2016-01-26","大館樹海ドーム","秋田県大館市上代野稲荷台１−１",1100,350,"2016-01-21 05:00:02","2016-01-21 05:00:02"),
(8,"落語力強化公演",4500,"みんなも学ぼう落語！","images/rakugo/rakugo8","斉藤亭,清水亭,山崎亭","2016-01-27","仙台市屋内グラウンド","宮城県仙台市泉区野村字新桂島前４８",1200,400,"2016-01-22 06:00:02","2016-01-22 06:00:02"),
(9,"落語フェア at 宮城",5000,"今年も開催します落語フェア！","images/rakugo/rakugo1","阿部亭,森亭,池田亭","2016-01-28","出雲ドーム","島根県出雲市 矢野町999",1300,450,"2016-01-23 07:00:02","2016-01-23 07:00:02"),
(10,"落語クイズラリー",5500,"君には解けるかな？落語クイズ始まるよー！","images/rakugo/rakugo2","橋本亭,山下亭,石川亭","2016-01-29","札幌コミュニティドーム","北海道札幌市東区栄町８８５−１",1400,500,"2016-01-24 05:00:03","2016-01-24 05:00:03"),
(11,"こまつ落語パーク",6000,"各地の落語家が集まります！","images/rakugo/rakugo3","中島亭,前田亭,藤田亭","2016-01-30","こまつドーム","石川県小松市林町ほ−５",1500,550,"2016-01-25 06:00:03","2016-01-25 06:00:03"),
(12,"落語に触れよう！わくわく東京フェスタ",6500,"知らない人から知ってる人まで落語に触れよう！","images/rakugo/rakugo4","後藤亭,小川亭","2016-01-31","東京ドーム","東京都文京区後楽１丁目３-６１",1600,600,"2016-01-26 07:00:03","2016-01-26 07:00:03"),
(13,"落語美術展 -田代亭の経歴-",7000,"今話題の田代亭、その歴史をここで紹介します！","images/rakugo/rakugo5","田代亭,阿部亭,副福亭","2016-02-01","福岡YahooJapanドーム","福岡県福岡市中央区地行浜２丁目２−２",1700,650,"2016-01-27 05:00:04","2016-01-27 05:00:04"),
(14,"大阪落語の森",7500,"いろんな落語家が集まりました。","images/rakugo/rakugo6","佐藤亭,鈴木亭,高橋亭","2016-02-02","京セラドーム","大阪府大阪市西区千代崎３丁目中２−１ 京セラドーム大阪",1800,700,"2016-01-28 06:00:04","2016-01-28 06:00:04"),
(15,"愛知落語ワールド",8000,"今日から君も落語マスターだ！","images/rakugo/rakugo7","田中亭,伊藤亭,山本亭","2016-02-03","ナゴヤドーム","愛知県名古屋市東区大幸南１丁目１－１",1900,750,"2016-01-29 07:00:04","2016-01-29 07:00:04"),
(16,"0さいからのらくご",8500,"今、子供に学ばせるなら落語が一番！","images/rakugo/rakugo8","渡邉亭,中村亭,小林亭","2016-02-04","西武ドーム","埼玉県所沢市 上山口２１３５",2000,800,"2016-01-30 05:00:05","2016-01-30 05:00:05"),
(17,"さっぽろらくごスクール",9000,"落語大好きな子供たち向けの公演です！","images/rakugo/rakugo1","加藤亭,吉田亭,山田亭","2016-02-05","札幌ドーム","北海道札幌市豊平区羊ケ丘１",2100,850,"2016-01-31 06:00:05","2016-01-31 06:00:05"),
(18,"はじめてのらくご",9500,"初心者向けの落語公演です","images/rakugo/rakugo2","佐々木亭,山口亭,松本亭","2016-02-06","大館樹海ドーム","秋田県大館市上代野稲荷台１−１",2200,900,"2016-02-01 07:00:05","2016-02-01 07:00:05"),
(19,"落語の森 落語の祭典",10000,"今年もやってきました落語の祭典！！！","images/rakugo/rakugo3","井上亭,木村亭,林亭","2016-02-07","仙台市屋内グラウンド","宮城県仙台市泉区野村字新桂島前４８",2300,950,"2016-02-02 05:00:06","2016-02-02 05:00:06"),
(20,"白い落語パーク 2015-2016",10500,"みんな大好き白い落語シリーズです。","images/rakugo/rakugo4","斉藤亭,清水亭,山崎亭","2016-02-08","出雲ドーム","島根県出雲市 矢野町1000",2400,1000,"2016-02-03 06:00:06","2016-02-03 06:00:06"),
(21,"冬の落語体験",11000,"今年こそ落語と思う方、ぜひご来場くださいませ。","images/rakugo/rakugo5","阿部亭,森亭,池田亭","2016-02-09","札幌コミュニティドーム","北海道札幌市東区栄町８８５−１",2500,1050,"2016-02-04 07:00:06","2016-02-04 07:00:06"),
(22,"こまつドーム落語フェスタ",11500,"落語が好きな人、今月はこまつドームに集まれ！","images/rakugo/rakugo6","橋本亭,山下亭,石川亭","2016-02-10","こまつドーム","石川県小松市林町ほ−５",2600,1100,"2016-02-05 05:00:07","2016-02-05 05:00:07"),
(23,"年中行事「落語 言葉占い」",12000,"今話題の落語占いです。","images/rakugo/rakugo7","中島亭,前田亭,藤田亭","2016-02-11","東京ドーム","東京都文京区後楽１丁目３-６１",2700,1150,"2016-02-06 06:00:07","2016-02-06 06:00:07"),
(24,"新福岡落語祭り2016",12500,"落語のお祭りに集まれ！","images/rakugo/rakugo8","後藤亭,小川亭","2016-02-12","福岡YahooJapanドーム","福岡県福岡市中央区地行浜２丁目２−２",2800,1200,"2016-02-07 07:00:07","2016-02-07 07:00:07"),
(25,"阿部ゆき落語物語",13000,"阿部亭と落語と雪","images/rakugo/rakugo1","田代亭,阿部亭,副福亭","2016-02-13","京セラドーム","大阪府大阪市西区千代崎３丁目中２−１ 京セラドーム大阪",2900,1250,"2016-02-08 05:00:08","2016-02-08 05:00:08"),
(26,"RAKUGOバレンタイン公演",13500,"バレンタインこそ落語と愛を誓おう！！！　バレンタイン公演！！","images/rakugo/rakugo2","佐藤亭,鈴木亭,高橋亭","2016-02-14","ナゴヤドーム","愛知県名古屋市東区大幸南１丁目１－１",3000,1300,"2016-02-09 06:00:08","2016-02-09 06:00:08"),
(27,"落語で表現する言葉の美",14000,"落語の美しさをここに、落語の美しさの為の公演","images/rakugo/rakugo3","田中亭,伊藤亭,山本亭","2016-02-15","西武ドーム","埼玉県所沢市 上山口２１３５",3100,1350,"2016-02-10 07:00:08","2016-02-10 07:00:08"),
(28,"思考する落語 コトバノカタチ",14500,"落語で伝える自分の気持ち、そんな公演","images/rakugo/rakugo4","渡邉亭,中村亭,小林亭","2016-02-16","札幌ドーム","北海道札幌市豊平区羊ケ丘１",3200,1400,"2016-02-11 05:00:09","2016-02-11 05:00:09"),
(29,"あったか落語　言葉の波スライダー",15000,"言葉の波に乗ろう！","images/rakugo/rakugo5","加藤亭,吉田亭,山田亭","2016-02-17","大館樹海ドーム","秋田県大館市上代野稲荷台１−１",3300,1450,"2016-02-12 06:00:09","2016-02-12 06:00:09"),
(30,"仙台RAKUGOフェスティバル～落語の歴史～",15500,"落語好きのあなたの為の公演です！","images/rakugo/rakugo6","佐々木亭,山口亭,松本亭","2016-02-18","仙台市屋内グラウンド","宮城県仙台市泉区野村字新桂島前４８",3400,1500,"2016-02-13 07:00:09","2016-02-13 07:00:09"),
(31,"島根県落語資料館後期ロビー公演",16000,"隅から隅まで知りたいあなたに、今なら公演も見れちゃいます！？","images/rakugo/rakugo7","井上亭,木村亭,林亭","2016-02-19","出雲ドーム","島根県出雲市 矢野町1001",3500,1550,"2016-02-14 05:00:10","2016-02-14 05:00:10"),
(32,"2016 落語祭り",16500,"今年もやります、落語祭り！","images/rakugo/rakugo8","斉藤亭,清水亭,山崎亭","2016-02-20","札幌コミュニティドーム","北海道札幌市東区栄町８８５−１",3600,1600,"2016-02-15 06:00:10","2016-02-15 06:00:10"),
(33,"落語めぐり",17000,"落語に触れながら生きていこう","images/rakugo/rakugo1","阿部亭,森亭,池田亭","2016-02-21","こまつドーム","石川県小松市林町ほ−５",3700,1650,"2016-02-16 07:00:10","2016-02-16 07:00:10"),
(34,"東京の落語のイベント",17500,"都内で有名な落語家が集まります！","images/rakugo/rakugo2","橋本亭,山下亭,石川亭","2016-02-22","東京ドーム","東京都文京区後楽１丁目３-６１",3800,1700,"2016-02-17 05:00:11","2016-02-17 05:00:11"),
(35,"落語の路～言想と神秘の谷～",18000,"言想と神秘に触れよう","images/rakugo/rakugo3","中島亭,前田亭,藤田亭","2016-02-23","福岡YahooJapanドーム","福岡県福岡市中央区地行浜２丁目２−２",3900,1750,"2016-02-18 06:00:11","2016-02-18 06:00:11"),
(36,"落語界の夢",18500,"落語家なら皆目指した夢を公演します！","images/rakugo/rakugo4","後藤亭,小川亭","2016-02-24","京セラドーム","大阪府大阪市西区千代崎３丁目中２−１ 京セラドーム大阪",4000,1800,"2016-02-19 07:00:11","2016-02-19 07:00:11"),
(37,"愛知直行落語展",19000,"愛知県で落語のイベント！","images/rakugo/rakugo5","田代亭,阿部亭,副福亭","2016-02-25","ナゴヤドーム","愛知県名古屋市東区大幸南１丁目１－１",4100,1850,"2016-02-20 05:00:12","2016-02-20 05:00:12"),
(38,"埼玉落語物語 The RAKUGO Story　2016",19500,"The　RAKUGO　Story...今年も公演！","images/rakugo/rakugo6","佐藤亭,鈴木亭,高橋亭","2016-02-26","西武ドーム","埼玉県所沢市 上山口２１３５",4200,1900,"2016-02-21 06:00:12","2016-02-21 06:00:12"),
(39,"第40回落語と雪祭り",20000,"落語で語ろう、雪で遊ぼう！","images/rakugo/rakugo7","田中亭,伊藤亭,山本亭","2016-02-27","札幌ドーム","北海道札幌市豊平区羊ケ丘１",4300,1950,"2016-02-22 07:00:12","2016-02-22 07:00:12"),
(40,"落語公演 in 秋田",20500,"秋田でやっちゃいます落語のイベント！","images/rakugo/rakugo8","渡邉亭,中村亭,小林亭","2016-02-28","大館樹海ドーム","秋田県大館市上代野稲荷台１−１",4400,2000,"2016-02-23 05:00:13","2016-02-23 05:00:13"),
(41,"いらっしゃい らくご",21000,"いってらっしゃい　らくご","images/rakugo/rakugo1","加藤亭,吉田亭,山田亭","2016-02-29","仙台市屋内グラウンド","宮城県仙台市泉区野村字新桂島前４８",4500,2050,"2016-02-24 06:00:13","2016-02-24 06:00:13"),
(42,"落語の美術館",21500,"日本で有名な落語家に集まっていただきました！","images/rakugo/rakugo2","佐々木亭,山口亭,松本亭","2016-03-01","出雲ドーム","島根県出雲市 矢野町1002",4600,2100,"2016-02-25 07:00:13","2016-02-25 07:00:13"),
(43,"落語探偵 season8 ～落語と雪の言の葉女王編",22000,"雪の世界に迷い込んだ落語探偵、途方もなく歩いていたら目の前にお城！　そこに住む言の葉女王には深い悩みがあるそうだ！？　こんなときこそ行くんだ落語探偵！この雪の世界を救うんだ！","images/rakugo/rakugo3","井上亭,木村亭,林亭","2016-03-02","札幌コミュニティドーム","北海道札幌市東区栄町８８５−１",4700,2150,"2016-02-26 05:00:14","2016-02-26 05:00:14"),
(44,"第１９回　楽しい、落語展",22500,"楽しい落語","images/rakugo/rakugo4","斉藤亭,清水亭,山崎亭","2016-03-03","こまつドーム","石川県小松市林町ほ−５",4800,2200,"2016-02-27 06:00:14","2016-02-27 06:00:14"),
(45,"奇想天外！？落語ワールドツアー",23000,"日本全国の落語の中で面白いものだけを集めました！","images/rakugo/rakugo5","阿部亭,森亭,池田亭","2016-03-04","東京ドーム","東京都文京区後楽１丁目３-６１",4900,2250,"2016-02-28 07:00:14","2016-02-28 07:00:14"),
(46,"冬の落語リズム",23500,"冬・・冬といえば落語！　今月も公演やります。","images/rakugo/rakugo6","橋本亭,山下亭,石川亭","2016-03-05","福岡YahooJapanドーム","福岡県福岡市中央区地行浜２丁目２−２",5000,2300,"2016-02-29 05:00:15","2016-02-29 05:00:15"),
(47,"中島亭 落語の国の美術館",24000,"若手と見た目で人気の中島亭が出演します！","images/rakugo/rakugo7","中島亭,前田亭,藤田亭","2016-03-06","京セラドーム","大阪府大阪市西区千代崎３丁目中２−１ 京セラドーム大阪",5100,2350,"2016-03-01 06:00:15","2016-03-01 06:00:15"),
(48,"らっくご祭り",24500,"公演します！","images/rakugo/rakugo8","後藤亭,小川亭","2016-03-07","ナゴヤドーム","愛知県名古屋市東区大幸南１丁目１－１",5200,2400,"2016-03-02 07:00:15","2016-03-02 07:00:15"),
(49,"落語ウォッチング",25000,"君の世界のあちこちにある落語を集めよう！","images/rakugo/rakugo1","田代亭,阿部亭,副福亭","2016-03-08","西武ドーム","埼玉県所沢市 上山口２１３５",5300,2450,"2016-03-03 05:00:16","2016-03-03 05:00:16"),
(50,"落語の動物園",25500,"落語の動物園、閉演します！","images/rakugo/rakugo2","佐藤亭,鈴木亭,高橋亭","2016-03-09","札幌ドーム","北海道札幌市豊平区羊ケ丘１",5400,2500,"2016-03-04 06:00:16","2016-03-04 06:00:16");


		insert into order_history value
		(1,1,1,"2016-01-20",1,"2016-01-05 08:00:00"),
		(2,2,2,"2016-01-21",2,"2016-01-05 09:00:00"),
		(3,3,3,"2016-01-22",1,"2016-01-05 09:00:00"),
		(4,4,4,"2016-01-23",2,"2016-01-05 09:00:00"),
		(5,5,5,"2016-01-24",1,"2016-01-05 09:00:00"),
		(6,6,20,"2016-02-08",2,"2016-01-05 09:00:00"),
		(7,7,40,"2016-02-28",2,"2016-01-05 09:00:00"),
		(8,8,45,"2016-03-04",3,"2016-01-05 09:00:00"),
		(9,9,37,"2016-02-25",1,"2016-01-05 09:00:00"),
		(10,10,47,"2016-03-06",2,"2016-01-05 09:00:00"),
		(11,11,35,"2016-02-23",4,"2016-01-05 09:00:00"),
		(12,13,1,"2016-01-20",1,"2016-01-05 08:00:00"),
		(13,14,2,"2016-01-21",2,"2016-01-05 09:00:00"),
		(14,15,3,"2016-01-22",1,"2016-01-05 09:00:00"),
		(15,16,4,"2016-01-23",2,"2016-01-05 09:00:00"),
		(16,19,5,"2016-01-24",1,"2016-01-05 09:00:00"),
		(17,20,20,"2016-02-08",2,"2016-01-05 09:00:00"),
		(18,22,40,"2016-02-28",2,"2016-01-05 09:00:00"),
		(19,25,45,"2016-03-04",3,"2016-01-05 09:00:00"),
		(20,20,37,"2016-02-25",1,"2016-01-05 09:00:00"),
		(21,21,47,"2016-03-06",2,"2016-01-05 09:00:00"),
		(22,43,35,"2016-02-23",4,"2016-01-05 09:00:00");

		insert into admin value
		(1,"admin01","user01","2016-05-01 06:00:00","2016-05-01 06:00:00"),
		(2,"admin02","user02","2016-05-01 06:00:00","2016-05-01 06:00:00");

