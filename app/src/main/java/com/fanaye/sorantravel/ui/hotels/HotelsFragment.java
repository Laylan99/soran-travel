package com.fanaye.sorantravel.ui.hotels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.fanaye.sorantravel.R;

public class HotelsFragment extends Fragment {

    private HotelsViewModel hotelsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        hotelsViewModel =
                ViewModelProviders.of(this).get(HotelsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_hotels, container, false);
//        final TextView textView = root.findViewById(R.id.text_hotels);
//        hotelsViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}