import java.util.Iterator;

public class P1768_MergeStringAlternaly {
	class Solution {
		public String mergeAlternately(String word1, String word2) {

			String palabraNueva = "";

			String sobrante = "";

			if (word1.length() != word2.length()) {
				if (word1.length() > word2.length()) {
					sobrante = word1.substring(word2.length(), word1.length());
				} else {
					sobrante = word2.substring(word1.length(), word2.length());
				}
			}

			for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
				palabraNueva += word1.charAt(i) +""+(word2.charAt(i));
			}
			
			palabraNueva += sobrante;
			return palabraNueva;

		}
	}

}
