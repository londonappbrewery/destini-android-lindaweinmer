package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int STORY_1 = 1;
    private static final int STORY_2 = 2;
    private static final int STORY_3 = 3;
    private static final int STORY_4 = 4;
    private static final int STORY_5 = 5;
    private static final int STORY_6 = 6;

    private TextView mStoryText;
    private Button mBtnAnswer1;
    private Button mBtnAnswer2;
    private int mStoryLine = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("DestiniTest", "story nr: " + mStoryLine);

        mStoryText = findViewById(R.id.storyTextView);
        mBtnAnswer1 = findViewById(R.id.buttonTop);
        mBtnAnswer2 = findViewById(R.id.buttonBottom);

        mBtnAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryLine == STORY_1) {
                    mStoryLine = STORY_3;
                } else if (mStoryLine == STORY_2) {
                    mStoryLine = STORY_3;
                } else if (mStoryLine == STORY_3) {
                    mStoryLine = STORY_6;
                }
                updateStory();
            }
        });
        mBtnAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryLine == STORY_1) {
                    mStoryLine = STORY_2;
                } else if (mStoryLine == STORY_2) {
                    mStoryLine = STORY_4;
                } else if (mStoryLine == STORY_3) {
                    mStoryLine = STORY_5;
                }
                updateStory();
            }
        });
    }

    private void updateStory() {
        Log.d("DestiniTest", "story nr: " + mStoryLine);
        switch (mStoryLine) {
            case 2:
                mStoryText.setText(R.string.T2_Story);
                mBtnAnswer1.setText(R.string.T2_Ans1);
                mBtnAnswer2.setText(R.string.T2_Ans2);
                break;
            case 3:
                mStoryText.setText(R.string.T3_Story);
                mBtnAnswer1.setText(R.string.T3_Ans1);
                mBtnAnswer2.setText(R.string.T3_Ans2);
                break;
            case 4:
                mStoryText.setText(R.string.T4_End);
                mBtnAnswer1.setVisibility(View.GONE);
                mBtnAnswer2.setVisibility(View.GONE);
                break;
            case 5:
                mStoryText.setText(R.string.T5_End);
                mBtnAnswer1.setVisibility(View.GONE);
                mBtnAnswer2.setVisibility(View.GONE);
                break;
            case 6:
                mStoryText.setText(R.string.T6_End);
                mBtnAnswer1.setVisibility(View.GONE);
                mBtnAnswer2.setVisibility(View.GONE);
                break;
            default: //Story 1
                mStoryText.setText(R.string.T1_Story);
                mBtnAnswer1.setText(R.string.T1_Ans1);
                mBtnAnswer2.setText(R.string.T1_Ans2);
                break;
        }
    }
}
