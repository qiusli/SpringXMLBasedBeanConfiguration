package com.tutorialspoint;

/**
 * Created by Qiushi on 7/16/2017.
 */
public class TextEditor {
    private SpellChecker spellChecker;
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.print("Inside setSpellChecker2");
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpell();
    }
}
