package id.ac.polinema.uts.fragment;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import id.ac.polinema.uts.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SegitigaHitungFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    private EditText inputanA, inputanB, inputanC;
    private Button btnKeliling;

    private TextView hasil;

    public SegitigaHitungFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_segitiga_hitung, container, false);
        hasil = view.findViewById(R.id.fragmentSegitigaHitung_hasilKelilingText);
        btnKeliling = view.findViewById(R.id.fragmentSegitigaHitung_hasilKeliling);
        inputanA = view.findViewById(R.id.fragmentSegitigaHitung_inputA);
        inputanB = view.findViewById(R.id.fragmentSegitigaHitung_inputB);
        inputanC = view.findViewById(R.id.fragmentSegitigaHitung_inputC);

        btnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputanA.getText() != null || inputanB.getText() != null || inputanC.getText() != null){
                    hasil.setText(String.valueOf(Float.parseFloat(inputanA.getText().toString())) + (Float.parseFloat(inputanB.getText().toString())) + (Float.parseFloat(inputanC.getText().toString())));
                }
            }
        });
        return view;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onSegitigaHitungFragmentClicked();
        void onFragmentInteraction(Uri uri);
    }
}
