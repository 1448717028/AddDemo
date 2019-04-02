package meitu.activity.apater;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.meitu.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import meitu.activity.entity.Image;

/**
 * @author zhw QQ:1448717028
 * @version 1.0
 * @date 2019/4/2
 */
public class SquareLinearApater extends RecyclerView.Adapter<SquareLinearApater.ViewHolder> {

    private List<Image> imageList;

    /**
     * 创建构造函数进行初始化
     * @param imageList
     */
    public SquareLinearApater(ArrayList<Image> imageList) {
        this.imageList = imageList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Image image = imageList.get(position);
    }

    public void setDate(List<Image> imageList){
       this.imageList.clear();
       imageList.addAll(imageList);
       notifyItemRangeInserted(0,this.imageList.size());
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView iv_item;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_item = itemView.findViewById(R.id.iv_item);
        }
    }
}
