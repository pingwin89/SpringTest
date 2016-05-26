package pl.pawc;
//autowiring by constructor
public class TextEditor6{

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