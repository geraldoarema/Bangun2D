package id.ac.polinema.uts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import id.ac.polinema.uts.fragment.LingkaranFragment;
import id.ac.polinema.uts.fragment.RumusFragment;
import id.ac.polinema.uts.fragment.SegitigaFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener,
                                                               RumusFragment.OnFragmentInteractionListener{

    private SegitigaFragment segitigaFragment;
    private LingkaranFragment lingkaranFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        segitigaFragment = new SegitigaFragment();
        lingkaranFragment = new LingkaranFragment();
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.action_rumus:
                fragment = new RumusFragment();
                break;
//            case R.id.action_hitung:
//                fragment = new HitungFragment();
//                break;
        }
        return loadFragment(fragment);
    }

    @Override
    public void onSegitigaFragmentonClicked() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container_rumus, segitigaFragment).commit();
    }

    @Override
    public void onLingkaranFragmentonClicked() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container_rumus, lingkaranFragment).commit();

    }
}
