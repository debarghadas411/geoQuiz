package com.example.geoquiz;

public class Questions {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Questions(int TextResId, boolean AnswerTrue){
        mTextResId=TextResId;
        mAnswerTrue=AnswerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

}
