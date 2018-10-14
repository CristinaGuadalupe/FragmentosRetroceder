package guzmancom.cristina.myapplicationusobasicodefragments;

import android.app.FragmentBreadCrumbs;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFragmentoA=(Button)findViewById(R.id.btnFragmentoA);
        btnFragmentoA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .setTransition(FragmentTransaction.TRANSIT_UNSET)
                        .replace(R.id.contenedor,new FragmentA())
                        .addToBackStack(null)
                        .commit();
            }
        });
        Button btnFragmentoB=(Button)findViewById(R.id.btnFragmentoB);
        btnFragmentoB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .setCustomAnimations(R.anim.enter,R.anim.exit)
                        .replace(R.id.contenedor,new FragmentB())
                        .addToBackStack(null)
                        .commit();
            }
        });

    }
}
