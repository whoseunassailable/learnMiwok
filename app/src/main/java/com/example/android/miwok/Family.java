package com.example.android.miwok;

public class Family {
    // Declaring the variables
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Family(String mDefaultTranslation, String mMiwokTranslation) {
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
