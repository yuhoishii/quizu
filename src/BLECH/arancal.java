package BLECH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


	class Quiz2 {
		private String question;
		private String answer;
		private String answer2;


		public Quiz2(String question, String answer,String answer2) {
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

	public class arancal{
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			// クイズのリストを作成
			List<Quiz> quizzes = new ArrayList<>();
			quizzes.add(new Quiz("アランカルの刀剣開放をなんというか（カタカナorひらがな）", "レスレクシオン","れすれくしおん"));
			quizzes.add(new Quiz("№5の、ノイトラのレスレクシオン状態の名前は？", "サンタテレサ","さんたてれさ"));
			quizzes.add(new Quiz("エスパーダ№4のウルキオラの刀剣開放の解言は？", "閉ざせ","とざせ"));
			quizzes.add(new Quiz("レスレクシオン名「グロトネリア」のエスパーダは誰？", "アーロニーロ","あーろにーろ"));
			quizzes.add(new Quiz("スンスン、ミラローズ、アパッチの右腕から生成される三人のペットの名前は？", "アヨン","あよん"));
			quizzes.add(new Quiz("バラガンのレスレクシオン名は？", "アロガンテ","あろがんて"));
			quizzes.add(new Quiz("レスレクシオン名が「ティグレストーク」のアランカルの名前は？", "ジオぺガ","じおぺが"));
			quizzes.add(new Quiz("アランカル戦で砕蜂と戦ったエスパーダ№2のアランカルの名前は？(カタカナ)", "バラガン","バラガン・ルイゼンバーン"));
			quizzes.add(new Quiz("エスパーダで一番番号が小さいのは誰か（カタカナ）", "ヤミー","ヤミー・リヤルゴ"));
			quizzes.add(new Quiz("エスパーダの中でソニードが一番早いのは誰でしょう？（カタカナ）", "ゾマリ","ゾマリ・ルルー"));
			quizzes.add(new Quiz("コヨーテ・スタークの司る市の形は？", "孤独","こどく"));
			quizzes.add(new Quiz("グリムジョーがエスパーダ落ちしたときに６番としてはいったアランカルの名前は？（カタカナ）", "ルピ","ルピ・アンテノール"));
			quizzes.add(new Quiz("グリムジョーのレスレクシオン名は？", "パンテラ","ぱんてら"));
			quizzes.add(new Quiz("ネリエルのレスレクシオン名は？", "ガミューサ","がみゅーさ"));
			quizzes.add(new Quiz("トレスエスパーダの名前を答えよ（カタカナ）", "ティア・ハリベル","ハリベル"));
			quizzes.add(new Quiz("コヨーテ・スタークのフラシオンの名前は？", "リリネット","りりねっと"));
			quizzes.add(new Quiz("ハリベルの司る死の形は？", "犠牲","ぎせい"));
			quizzes.add(new Quiz("エスパーダ№8のザエルアポロのレスレクシオン名は？（カタカナorひらがな）", "フォルニカラス","ふぉるにからす"));
			quizzes.add(new Quiz("アランカルが使う霊圧の塊を相手に向かって撃つ技を総称してなんというか", "虚閃","せろ"));
			quizzes.add(new Quiz("虚は愛染の持っていた物でアランカルの姿となった。蒲原喜助が作り出し愛染が持っていた物の名前は？", "宝玉","ほうぎょく"));
			quizzes.add(new Quiz("グリムジョーの解言は？", "軋れ","きしれ"));
			quizzes.add(new Quiz("愛染が山本元柳斎対策として作ったアランカルの名前は？", "ワンダーワイス","わんだーわいす"));
			quizzes.add(new Quiz("アランカル戦でスタークと戦っていた鳳橋楼十郎の斬魄刀の始解の名前は？", "金沙羅","きんしゃら"));
			quizzes.add(new Quiz("アランカル戦で綾瀬川弓親と戦ったアランカルの名前は？", "シャルロッテクールホーン","しゃるろってくーるほーん"));
			quizzes.add(new Quiz("アランカル戦で吉良イズルと戦ったアビラマのレスレクシオン名は？", "アギラ","あぎら"));
			quizzes.add(new Quiz("アビラマの戦士を鼓舞する舞の問題で〇に入る文字は？「〇〇〇〇〇！〇〇〇〇〇！！〇〇〇〇〇ぞー！！！", "やってやる","殺ってやる"));
			quizzes.add(new Quiz("アランカル戦で柱を守るために班目一角が戦ったアランカルの名前は？（カタカナ）", "ポウ","チーノンポウ"));
			quizzes.add(new Quiz("自称ネルの兄を名乗っていて、口から相手をぬるぬるにする液体を吐くアランカルの名前は？", "ペッシュ","ぺっしゅ"));
			quizzes.add(new Quiz("ドンドチャッカの腹の中で飼われているやつの名前は？", "バワバワ","ばわばわ"));
			quizzes.add(new Quiz("エスパーダ№5のアランカルの名前は？（カタカナ）", "ノイトラ","ノイトラ・ジルガ"));
			quizzes.add(new Quiz("アランカルの高速移動術の名前は？", "ソニード","そにーど"));

			
			
			// ゲームを繰り返すためのループ
			while (true) {
				System.out.print("出題する問題数を入力してください: /30");
				System.out.println("回答はカタカナか、漢字、ひらがなで答えてください");
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




