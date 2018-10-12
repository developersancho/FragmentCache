package developersancho.fragmentcache;


import androidx.fragment.app.Fragment;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private String[] listItems = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    private ItemAdapter mAdapter;
    private View view;
    private boolean isLoaded;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (isLoaded == false) {
            view = inflater.inflate(R.layout.fragment_home, container, false);
            init(view);
            isLoaded = true;
        }

        return view;
    }

    private void init(View view) {
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.listRv);

        mAdapter = new ItemAdapter();

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.addAll(listItems);
    }

}
