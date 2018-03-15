package cn.droidlover.xdroidmvp.demo.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cn.droidlover.xdroidmvp.demo.R;
import cn.droidlover.xdroidmvp.mvp.XFragment;

import cn.droidlover.xdroidmvp.base.SimpleRecAdapter;
import cn.droidlover.xdroidmvp.demo.adapter.PartnerAdapter;
import cn.droidlover.xdroidmvp.demo.model.GankResults;
import cn.droidlover.xrecyclerview.RecyclerItemCallback;
import cn.droidlover.xrecyclerview.XRecyclerView;
/**
 * Created by yarong on 2018/3/15.
 */

public class PartnerFragment extends XFragment {
    PartnerAdapter adapter;

    public static PartnerFragment newInstance() {
        return new PartnerFragment();
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }

//    @Override
//    public SimpleRecAdapter getAdapter() {
//        if (adapter == null) {
//            adapter = new PartnerAdapter(context);
//            adapter.setRecItemClick(new RecyclerItemCallback<GankResults.Item, PartnerAdapter.ViewHolder>() {
//                @Override
//                public void onItemClick(int position, GankResults.Item model, int tag, PartnerAdapter.ViewHolder holder) {
//                    super.onItemClick(position, model, tag, holder);
//                    switch (tag) {
//                        case PartnerAdapter.TAG_VIEW:
//                            WebActivity.launch(context, model.getUrl(), model.getDesc());
//                            break;
//                    }
//                }
//            });
//        }
//        return adapter;
//    }

//    @Override
    public void setLayoutManager(XRecyclerView recyclerView) {
        recyclerView.verticalLayoutManager(context);
    }

//    @Override
    public String getType() {
        return "all";
    }

    @Override
    public int getLayoutId() {return R.layout.fragment_recommend_partner; }

    @Override
    public Object newP() {
        return null;
    }
}
