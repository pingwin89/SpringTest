package pl.pawc;
//autowiring by type
public class TextEditor5{

	private SpellChecker spellChecker;

	public void setSpellChecker(SpellChecker spellChecker){
		System.out.println("Inside setSpellChecker.");
		this.spellChecker=spellChecker;
	}

	public SpellChecker getSpellChecker(){
		return spellChecker;
	}

	public void spellCheck(){
		spellChecker.checkSpelling();
	}

}