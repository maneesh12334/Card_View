package dukemaneeesh.example.com.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> image= new ArrayList<>();
    ArrayList<String> name=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addItems();

        RecyclerView recyclerview = (RecyclerView)findViewById(R.id.rv);
        recyclerview.setHasFixedSize(true);
        GridLayoutManager lm= new GridLayoutManager(MainActivity.this,2);
        recyclerview.setLayoutManager(lm);
        CardViewAdapter crd = new CardViewAdapter(MainActivity.this,image,name);
        recyclerview.setAdapter(crd);
    }

    private void addItems() {
        image.add(R.drawable.cupcake);
        image.add(R.drawable.eclair);
        name.add("Maneesh");
        name.add("yash");
    }
}
