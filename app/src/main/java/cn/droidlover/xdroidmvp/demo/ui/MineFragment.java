package cn.droidlover.xdroidmvp.demo.ui;

import android.os.Bundle;

import cn.droidlover.xdroidmvp.demo.R;
import cn.droidlover.xdroidmvp.mvp.XFragment;

/**
 * Created by yarong on 2018/3/27.
 */

public class MineFragment extends XFragment {

    public static MineFragment newInstance() {
        return new MineFragment();
    }


    @Override
    public void initData(Bundle savedInstanceState) {
        initView();
        initEvent();
    }


    @Override
    public int getLayoutId() {
        return R.layout.fragment_mine;
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

