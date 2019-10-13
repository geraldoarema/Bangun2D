package id.ac.polinema.uts.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.ac.polinema.uts.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LingkaranHitungFragment extends Fragment {


    public LingkaranHitungFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lingkaran_hitung, container, false);
    }

}
