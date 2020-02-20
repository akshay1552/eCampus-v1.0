package com.example.ecampus.Admin_ndrawer.Course_reg;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CourseViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CourseViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Course Registration fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}