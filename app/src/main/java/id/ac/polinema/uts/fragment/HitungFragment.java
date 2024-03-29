package id.ac.polinema.uts.fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import id.ac.polinema.uts.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HitungFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private ImageView segitiga, lingkaran;



    public HitungFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hitung, container, false);

        segitiga = view.findViewById(R.id.fragmentRumus_segitiga);
        lingkaran = view.findViewById(R.id.fragmentRumus_lingkaran);

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null) {
                    mListener.onSegitigaFragmentonClicked();
                }
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null) {
                    mListener.onLingkaranFragmentonClicked();
                }
            }
        });
        return view;
    }

    public interface OnFragmentInteractionListener {
        void onSegitigaFragmentonClicked();
        void onLingkaranFragmentonClicked();
    }
}
