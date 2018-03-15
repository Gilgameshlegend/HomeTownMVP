package cn.droidlover.xdroidmvp.demo.adapter;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.base.SimpleRecAdapter;
import cn.droidlover.xdroidmvp.demo.R;
import cn.droidlover.xdroidmvp.demo.model.GankResults;
import cn.droidlover.xdroidmvp.demo.ui.CustomShadowView;
import cn.droidlover.xdroidmvp.imageloader.ILFactory;
import cn.droidlover.xdroidmvp.kit.KnifeKit;

/**
 * Created by yarong on 2018/3/15.
 */


public class PartnerAdapter extends SimpleRecAdapter<GankResults.Item, PartnerAdapter.ViewHolder> {

    public static final int TAG_VIEW = 0;

    public PartnerAdapter(Context context) {
        super(context);
    }

    @Override
    public ViewHolder newViewHolder(View itemView) {
        return new ViewHolder(itemView);
    }

    @Override
    public int getLayoutId() {
        return R.layout.adapter_partner;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        //final GankResults.Item item = data.get(position);

        //String type = item.getType();

        //补充画阴影代码

        holder.llPartner.setVisibility(View.VISIBLE);
        holder.cvPartnerImg.setVisibility(View.VISIBLE);

        //以下需要获取数据
        holder.tvPartnerName.setText("Susan");
//        holder.cvPartnerImg.setBackgroundResource();


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getRecItemClick() != null) {
//                    getRecItemClick().onItemClick(position, item, TAG_VIEW, holder);
                }
            }
        });


    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ll_partner)
        LinearLayout llPartner;
        @BindView(R.id.cv_partner_image)
        CustomShadowView cvPartnerImg;
        @BindView(R.id.tv_partner_name)
        TextView tvPartnerName;

        public ViewHolder(View itemView) {
            super(itemView);
            KnifeKit.bind(this, itemView);
        }
    }
}