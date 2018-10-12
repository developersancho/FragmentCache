package developersancho.fragmentcache;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    replaceFragmentNew(new HomeFragment());
                    break;
                case R.id.navigation_dashboard:
                    replaceFragmentNew(new DashboardFragment());
                    break;
                case R.id.navigation_notifications:
                    replaceFragmentNew(new NotificationFragment());
                    break;
            }
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replaceFragmentNew(new HomeFragment());

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    /*private void replaceFragment(Fragment newFragment) {

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment fragmentStack = manager.findFragmentByTag(newFragment.getClass().getName());

        if (fragmentStack == null) {
            transaction.replace(R.id.main_fl, newFragment, newFragment.getClass().getName());
        } else {
            transaction.replace(R.id.main_fl, fragmentStack);
        }

        transaction.addToBackStack(null);
        transaction.commit();
    }*/

    private void replaceFragmentNew(Fragment newFragment) {

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment fragmentStack = manager.findFragmentByTag(newFragment.getClass().getName());

        if (fragmentStack == null) {
            transaction.replace(R.id.main_fl, newFragment, newFragment.getClass().getName());
        } else {
            transaction.replace(R.id.main_fl, fragmentStack);
        }

        transaction.addToBackStack(null);
        transaction.commit();
    }

}
