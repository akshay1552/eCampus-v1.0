package com.example.ecampus.Admin_ndrawer.Forum;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ForumViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ForumViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Forum fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
