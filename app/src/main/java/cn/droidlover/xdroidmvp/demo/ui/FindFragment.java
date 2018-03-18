package cn.droidlover.xdroidmvp.demo.ui;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.demo.R;
import cn.droidlover.xdroidmvp.demo.adapter.PartnerAdapter;
import cn.droidlover.xdroidmvp.mvp.XFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by yarong on 2018/3/14.
 */

public class FindFragment extends XFragment {
//    private TextView loction_text;
//    private EditText search_content;
    private Button btn_filter;
    private Button btn_member_cnt;
    private Button btn_trip_date;
//    private FragmentTransaction transaction;

//    PartnerAdapter adapter;


    public static FindFragment newInstance() {
        return new FindFragment();
    }


    @Override
    public void initData(Bundle savedInstanceState) {
        initView();
        initEvent();
    }


    @Override
    public int getLayoutId() {
        return R.layout.fragment_find;
    }


    @Override
    public Object newP() {
        return null;
    }

    private void initView() {
        //搜索
        btn_filter = (Button) getView().findViewById(R.id.btn_filter);
        btn_member_cnt = (Button) getView().findViewById(R.id.btn_member_cnt);
        btn_trip_date = (Button) getView().findViewById(R.id.btn_trip_date);

        //探索旅伴

    }

    private void initEvent() {
        btn_filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),
                        "将进入筛选页面",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_member_cnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),
                        "将进入人数页面",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_trip_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),
                        "将进入日期页面",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}