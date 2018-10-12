package developersancho.fragmentcache;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {

    private View view;
    private boolean isLoaded;

    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (isLoaded == false) {
            view = inflater.inflate(R.layout.fragment_notification, container, false);
            init(view);
            isLoaded = true;
        }

        return view;
    }

    private void init(View view) {
        WebView webview = view.findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://developersancho.com/");
    }
}
