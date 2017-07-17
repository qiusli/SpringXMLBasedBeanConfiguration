package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Qiushi on 7/16/2017.
 */
public class TextEditor2 {
    private SpellChecker2 spellChecker2;

    public SpellChecker2 getSpellChecker2() {
        return spellChecker2;
    }

    @Autowired
    public void setSpellChecker2(SpellChecker2 spellChecker2) {
        this.spellChecker2 = spellChecker2;
    }

    public void spellCheck() {
        spellChecker2.checkSpell();
    }
}
