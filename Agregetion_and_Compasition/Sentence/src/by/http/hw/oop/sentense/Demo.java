package by.http.hw.oop.sentense;

public class Demo {

		public static void main(String[] args) {
			
			Word w1 = new Word("Shepard");
			Word w2 = new Word("is");
			Word w3 = new Word("Alive");
			Sentence sent1 = new Sentence();
			Sentence sent2 = new Sentence();
			Text text = new Text("Mass Effect");
			
			sent1.addWord(w1);
			sent1.addWord(w2);
			sent1.addWord(w3);
			
			sent2.addWord(w3);
			sent2.addWord(w1);
			sent2.addWord(w2);

			text.addSentence(sent1);
			text.addSentence(sent2);
			
			System.out.println(text);
			
			text.printTitle();
			text.printText();
			
			
		}

}
