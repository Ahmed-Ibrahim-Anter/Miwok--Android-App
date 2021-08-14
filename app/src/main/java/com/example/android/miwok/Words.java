package com.example.android.miwok;

public class Words {
    private String mMiwkoword;
    private String mDefaultword;
    private int mImage = noImage;
    private static final int noImage = -1;
    private int mAudio;

    public Words(String mMiwkoword, String mDefaultword, int mImage, int mAudio) {
        this.mMiwkoword = mMiwkoword;
        this.mDefaultword = mDefaultword;
        this.mImage = mImage;
        this.mAudio = mAudio;
    }

    public Words(String mMiwkoword, String mDefaultword, int mAudio) {
        this.mMiwkoword = mMiwkoword;
        this.mDefaultword = mDefaultword;
        this.mAudio = mAudio;
    }

    public int getmImage() {
        return mImage;
    }

    public String getDefaultword() {

        return mDefaultword;
    }

    public String getMiwkoword() {

        return mMiwkoword;
    }

    public boolean hasImage() {
        return mImage != noImage;
    }

    public int getmAudio() {
        return mAudio;
    }
}
