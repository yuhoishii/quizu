package EVA;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Quiz {
	private String question;
	private String answer;
	private String answer2;


	public Quiz(String question, String answer,String answer2) {
		this.question = question;
		this.answer = answer;
		this.answer2 = answer2;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

	public String getAnswer2() {
		return answer2;
	}
}

public class evaquiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// クイズのリストを作成
		List<Quiz> quizzes = new ArrayList<>();
		quizzes.add(new Quiz("劇場版エヴァの中でカヲル君は何番目の使途として登場した？", "13番目","13"));
		        quizzes.add(new Quiz("アンチATフィールドを常に展開している槍状のチート武器の名前は？", "+ロンギヌスの槍",""));
		        quizzes.add(new Quiz("葛城ミサトのネルフでの階級は？", "一佐",""));
		        quizzes.add(new Quiz("フォースチルドレンの名前は？", "鈴原トウジ","トウジ"));
		        quizzes.add(new Quiz("シンジ君が通っていた高校の隠された秘密は？", "高校の生徒全員がチルドレンの素質あり","全員チルドレン"));
		        quizzes.add(new Quiz("シンジ君が一番最初に戦った使徒の名前は？","サキエル",""));
		        quizzes.add(new Quiz("初号機はシンジ君の前は誰が乗ろうとしていた？","綾波レイ",""));
		        quizzes.add(new Quiz("シンジ君の友達の健介の趣味は？","サバイバル","サバゲ"));
		        quizzes.add(new Quiz("２号機の登場者","惣流・アスカ・ラングレー","アスカ"));
		        quizzes.add(new Quiz("綾波レイのモデルは？","碇ゆい","シンジのお母さん"));
		        quizzes.add(new Quiz("第五使徒を倒すための作戦名は？","ラミレス",""));
		        quizzes.add(new Quiz("ネルフが計画していた世界計画の名前は「人類〇〇計画」丸の部分の文字は？","保管",""));
		        quizzes.add(new Quiz("エヴァに出てくる架空のバリアの名前は？","ATフィールド",""));
		        quizzes.add(new Quiz("葛城ミサトの元カレの名前は？","加持リョウジ","加持さん"));
		        quizzes.add(new Quiz("アスカの綾波の呼び方は？","えこひいき","エコヒイキ"));
		        quizzes.add(new Quiz("エヴァ８号機の搭乗者は？","マリ",""));
		        quizzes.add(new Quiz("アニメや漫画で最初に覚醒したエヴァは何号機？","初号機",""));
		        quizzes.add(new Quiz("月で開発された機体の名前は？","マークシックス","M6"));
		        quizzes.add(new Quiz("劇場版の「Q」でカヲル君が首につけていた物の名前は？","DSSチョーカー","チョーカー"));
		        quizzes.add(new Quiz("アスカはどこの国から来た？","アメリカ","USA"));
		        quizzes.add(new Quiz("アスカがシンジ君を呼ぶときの呼び方は？","馬鹿シンジ","バカシンジ"));
		        quizzes.add(new Quiz("エヴァンゲリオンのOP曲は？","残酷な天使のテーゼ","残天"));
		        quizzes.add(new Quiz("有名なED曲の穴埋め問題「魂の〇〇〇〇」〇の部分にはいる言葉は？","ルフラン",""));
		        quizzes.add(new Quiz("ミサトさんのセリフでの穴埋め「風呂は〇〇〇〇よ♪」〇の部分にはいる言葉は？","命の洗濯",""));
		        quizzes.add(new Quiz("カヲル君はアダム、じゃあ綾波は？","リリス","リリィ"));
		        quizzes.add(new Quiz("劇場版での零号機は黄色だが、アニメ版の零号機改の色は何色でしょう？","青色",""));
		        quizzes.add(new Quiz("ATフィールドを司り、生の象徴として完成した槍状の武器の名前","カシウスの槍","カシウス"));
		        quizzes.add(new Quiz("碇ゲンドウが最も愛していた人物は？","碇ゆい","ゆい"));
		        quizzes.add(new Quiz("エヴァの世界でミサトさんは人類は第何使徒と言ったでしょう？","18","18番目"));
		        quizzes.add(new Quiz("劇場版Qでミサトさんが作りあげた対ネルフ組織の名前は？","NERV","ナーブ"));
		        quizzes.add(new Quiz("ミサトさん家にいる温泉ペンギンの名前は？","ぺんぺん",""));






		// ゲームを繰り返すためのループ
		while (true) {
			System.out.print("出題する問題数を入力してください: /30");
			int numberOfQuestions = scanner.nextInt();

			// 問題数が0以下ならゲームを終了
			if (numberOfQuestions <= 0) {
				System.out.println("無効な問題数です。ゲームを終了します。");
				break;
			}

			// 指定された問題数だけクイズをランダムに選択
			List<Quiz> selectedQuizzes = getRandomQuizzes(quizzes, numberOfQuestions);

			// 選択されたクイズを出題
			for (Quiz quiz : selectedQuizzes) {
				// クイズの問題を表示
				System.out.println("問題: " + quiz.getQuestion());

				// ユーザーに回答を入力させる
				System.out.print("回答: ");
				String userAnswer = scanner.next();

				// 回答を照らし合わせる
				if (userAnswer.equalsIgnoreCase(quiz.getAnswer()) || userAnswer.equalsIgnoreCase(quiz.getAnswer2())) {
					System.out.println("正解！");
				} else {
					System.out.println("不正解。正解は: " + quiz.getAnswer()+"または"+quiz.getAnswer2());
				}

				System.out.println();  // 空行を挿入して見やすくする
			}

			// ゲーム終了か続行かをユーザーに尋ねる
			System.out.print("もう一度プレイしますか？ (y/n): ");
			String playAgain = scanner.next();

			if (!playAgain.equalsIgnoreCase("y")) {
				break; // ゲームを繰り返さない場合はループを抜ける
			}
		}

		// スキャナーをクローズ
		scanner.close();
	}

	private static List<Quiz> getRandomQuizzes(List<Quiz> quizzes, int numberOfQuestions) {
		// 指定された問題数だけクイズをランダムに選ぶ
		Collections.shuffle(quizzes);
		return quizzes.subList(0, Math.min(numberOfQuestions, quizzes.size()));
	}
}

