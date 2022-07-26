package com.example.android.miwok;

public class Phrase {
    // Declaring the variables
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Phrase(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
