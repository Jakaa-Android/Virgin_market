package com.example.virginmarket;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;

public class LoginFragment {

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.login_fragment, container, false);

        // Snippet from "Navigate to the next Fragment" section goes here.

        return view;
    }

    // "isPasswordValid" from "Navigate to the next Fragment" section method goes here
}

