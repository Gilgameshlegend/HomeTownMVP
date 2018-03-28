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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by yarong on 2018/3/25.
 */

public class MsgboxFragment extends XFragment{


    public static MsgboxFragment newInstance() {
        return new MsgboxFragment();
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        initView();
        initEvent();
    }


    @Override
    public int getLayoutId() {
        return R.layout.fragment_msgbox;
    }


    @Override
    public Object newP() {
        return null;
    }

    private void initView() {

    }

    private void initEvent() {

    }




}

