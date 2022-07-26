package com.example.android.miwok;

public class Color{
        // Declaring the variables
        private String mDefaultTranslation;
        private String mMiwokTranslation;

    public Color(String mDefaultTranslation, String mMiwokTranslation) {
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
