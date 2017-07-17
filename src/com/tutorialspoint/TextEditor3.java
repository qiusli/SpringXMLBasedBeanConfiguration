package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Qiushi on 7/16/2017.
 */
public class TextEditor3 {
    private SpellChecker2 spellChecker2;

    @Autowired
    public TextEditor3(SpellChecker2 spellChecker2) {
        System.out.println("Inside TextEditor3 constructor." );
        this.spellChecker2 = spellChecker2;
    }

    public SpellChecker2 getSpellChecker2() {
        return spellChecker2;
    }

    public void spellCheck() {
        spellChecker2.checkSpell();
    }
}
