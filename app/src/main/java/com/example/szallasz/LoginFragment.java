package com.example.szallasz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LoginFragment extends Fragment {


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.fragment_login, container, false);
        Button signIn=rootView.findViewById(R.id.btnSingIn);
        Button login = rootView.findViewById(R.id.btnLogin);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new SignFragment(),"SignIn");
            }
        });
        return rootView;
    }
    private void loadFragment(Fragment fragment,String tag){
        FragmentTransaction fragmentTransaction= getParentFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragment,tag);
        fragmentTransaction.commit();
    }

}





