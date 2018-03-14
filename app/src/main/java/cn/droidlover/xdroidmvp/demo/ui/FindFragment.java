package cn.droidlover.xdroidmvp.demo.ui;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.demo.R;
import cn.droidlover.xdroidmvp.mvp.XFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

    public static FindFragment newInstance() {
        return new FindFragment();
    }


    @Override
    public void initData(Bundle savedInstanceState) {
        btn_filter = (Button) getView().findViewById(R.id.btn_filter);
        btn_member_cnt = (Button) getView().findViewById(R.id.btn_member_cnt);
        btn_trip_date = (Button) getView().findViewById(R.id.btn_trip_date);
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

    @Override
    public int getLayoutId() {
        return R.layout.fragment_search;
    }


    @Override
    public Object newP() {
        return null;
    }


}