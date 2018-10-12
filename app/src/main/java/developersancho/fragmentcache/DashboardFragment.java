package developersancho.fragmentcache;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {

    private View view;
    private boolean isLoaded;

    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (isLoaded == false) {
            view = inflater.inflate(R.layout.fragment_dashboard, container, false);
            isLoaded = true;
        }

        return view;
    }

}
