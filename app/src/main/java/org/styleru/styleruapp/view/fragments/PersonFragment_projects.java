package org.styleru.styleruapp.view.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.styleru.styleruapp.R;

/**
 * Created by Пользователь on 19.03.2017.
 */

public class PersonFragment_projects extends Fragment {


    public PersonFragment_projects() {
        // Required empty public constructor
    }

    Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile_projects, container, false);
        // Inflate the layout for this fragment
        return view;
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d("FRAG","Peopledestroy");
//            getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
    }
}