package com.example.ecampus.Admin_ndrawer.Exam_reg;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ExamViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ExamViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Exam Registration fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}