package BLECH;

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

		public class BlechQuizZanpakutou {
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);

				// クイズのリストを作成
				List<Quiz> quizzes = new ArrayList<>();
				quizzes.add(new Quiz("解言が「砕けろ」の斬魄刀の名前は？", "鏡花水月","きょうかすいげつ"));
				quizzes.add(new Quiz("解言が「霜天に坐せ」の斬魄刀の名前は？", "氷輪丸","ひょうりんまる"));
				quizzes.add(new Quiz("解言が「おはよう！」の斬魄刀の名前は？", "土鯰","つちなまず"));
				quizzes.add(new Quiz("解言が「花風紊れて花神啼き、天風紊れて天魔嗤う」の斬魄刀の名前", "花天狂骨","かてんきょうこつ"));
				quizzes.add(new Quiz("解言が「波ことごとく我が盾となれ、雷ことごとく我が刃となれ」の斬魄刀の名前は？", "双魚の理","そうぎょのことわり"));
				quizzes.add(new Quiz("解言が「尽敵螫殺」の斬魄刀の名前は？", "雀蜂","すずめばち"));
				quizzes.add(new Quiz("解言が「轟け！」の斬魄刀の名前は？", "天譴","てんけん"));
				quizzes.add(new Quiz("解言が「万象一切灰塵と化せ」の斬魄刀の名前は？", "流刃若火","りゅうじんじゃっか"));
				quizzes.add(new Quiz("解言が「射殺せ」の斬魄刀の名前は？", "神槍","しんそう"));
				quizzes.add(new Quiz("袖の白雪の卍解した時の斬魄刀の名前は？", "白霧罸","はっかのとがめ"));
				quizzes.add(new Quiz("解言が「鳴け」の斬魄刀の名前は？", "鈴虫","すずむし"));
				quizzes.add(new Quiz("砕蜂の卍解した時の斬魄刀の名前は？", "雀蜂雷公鞭","じゃくほうらいこうべん"));
				quizzes.add(new Quiz("市丸ギンの卍解した時の斬魄刀の名前は？", "神殺槍","かみしにのやり"));
				quizzes.add(new Quiz("解言が「伸びろ！」の斬魄刀の名前は？", "鬼灯丸","ほうずきまる"));
				quizzes.add(new Quiz("二番隊副隊長、大前田が使う斬魄刀の始解状態の名前は？", "五形頭","げげつぶり"));
				quizzes.add(new Quiz("解言が「刈れ」の斬魄刀の名前は？", "風死","かぜしに"));
				quizzes.add(new Quiz("解言が「水天逆巻け」の斬魄刀の名前は？", "捩花","ねじばな"));
				quizzes.add(new Quiz("朽木白夜の斬魄刀「千本桜」の卍解状態の名前は？", "千本桜景厳","せんぼんざくらかげよし"));
				quizzes.add(new Quiz("「已己已己巴」この漢字の読み方は？", "いこみきともえ",""));
				quizzes.add(new Quiz("平子真子の卍解したときの斬魄刀の名前は？", "逆様邪八宝塞","さかしまよこしまはっぽうふさがり"));
				quizzes.add(new Quiz("尸魂界で一番美しい斬魄刀は？", "袖の白雪","そでのしらゆき"));
				quizzes.add(new Quiz("解言が「奔れ」の斬魄刀の名前は？", "いてぐも","凍雲"));
				quizzes.add(new Quiz("四番隊隊長、卯ノ花の斬魄刀の名前は？", "肉雫唼","みなずき"));
				quizzes.add(new Quiz("十一番隊副隊長、草鹿やちるの斬魄刀の名前は？", "三歩剣獣","さんぽけんじゅう"));
				quizzes.add(new Quiz("更木剣八の始解状態の斬魄刀の名前は？", "野晒","のざらし"));
				quizzes.add(new Quiz("蒲原喜助の卍解状態の斬魄刀の名前は？", "観音開き紅姫改メ","かんのんびらきべにひめあらため"));
				quizzes.add(new Quiz("六番隊副隊長、阿散井の真の卍解した時の斬魄刀名は？", "双王蛇尾丸","そうおうざびまる"));
				quizzes.add(new Quiz("尸魂界で「一番早い」と言われている斬魄刀は誰の？", "市丸ぎん","いちまるぎん"));
				quizzes.add(new Quiz("バイザードの一人である猿柿ひよ里の始解状態の斬魄刀の名前は？", "馘大蛇","くびきりおろち"));
				quizzes.add(new Quiz("五番隊副隊長、雛森の斬魄刀「飛梅」の解言は？", "弾け","はじけ"));

				
				
				// ゲームを繰り返すためのループ
				while (true) {
					System.out.print("出題する問題数を入力してください: /30");
					System.out.println("回答は漢字か、ひらがなで答えてください");
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

