package developersancho.fragmentcache;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private String[] listItems;

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.textView.setText(listItems[position]);
    }

    public void addAll(String[] dataSet) {
        this.listItems = dataSet;
        notifyDataSetChanged();
    }


    @Override
    public int getItemCount() {
        if (listItems != null)
            return listItems.length;
        else
            return 0;

    }

    class ItemViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;


        public ItemViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.titleTv);
        }


    }
}
