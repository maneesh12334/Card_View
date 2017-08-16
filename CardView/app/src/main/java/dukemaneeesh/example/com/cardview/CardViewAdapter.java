package dukemaneeesh.example.com.cardview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lenovo on 3/28/2017.
 */

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ViewHolder> {

    Context context;
    ArrayList<String> name= new ArrayList<>();
    ArrayList<Integer> image = new ArrayList<>();

    public CardViewAdapter(Context context, ArrayList<Integer> image,ArrayList<String>name) {
        this.context = context;
        this.image = image;
        this.name=name;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.ivImageview.setBackgroundResource(R.drawable.cupcake);
        //holder.tvTextview.setText(name.get(position));

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivImageview;
        TextView tvTextview;
        public ViewHolder(View itemView) {
            super(itemView);

            ivImageview=(ImageView)itemView.findViewById(R.id.ivImageview);
            tvTextview=(TextView)itemView.findViewById(R.id.tvTextview);
        }
    }
}
