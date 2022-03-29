package SpringExample;
public class TextEditor {
   private SpellChecker spellChecker;
   public TextEditor(SpellChecker spellChecker) {
	   System.out.println("Text Editor Constructor");
	   this.spellChecker = spellChecker;
   }
   // a getter method to return spellChecker
 
   public void spellCheck() {
	   System.out.println("Coming here");
       spellChecker.checkSpelling();
   }
}
