package meitu.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.meitu.R;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import meitu.activity.apater.SquareLinearApater;
import meitu.activity.entity.Image;

public class LoaginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btExie;
    private RecyclerView rvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loagin);
        btExie = findViewById(R.id.bt_exit);
        btExie.setOnClickListener(this);
        rvList = findViewById(R.id.rv_list);
        rvList.setLayoutManager(new GridLayoutManager(this,2));
        //设置默认的数据
        ArrayList<Image> arrayList=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(new Image(""));
        }
        rvList.setAdapter(new SquareLinearApater(arrayList));

    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
