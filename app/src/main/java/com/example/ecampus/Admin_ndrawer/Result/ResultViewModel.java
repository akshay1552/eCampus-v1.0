package com.example.ecampus.Admin_ndrawer.Result;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ResultViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ResultViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Result fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}