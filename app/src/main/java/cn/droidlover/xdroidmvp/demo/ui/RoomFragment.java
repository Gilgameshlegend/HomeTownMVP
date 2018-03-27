package cn.droidlover.xdroidmvp.demo.ui;

import android.os.Bundle;

import cn.droidlover.xdroidmvp.demo.R;
import cn.droidlover.xdroidmvp.mvp.XFragment;

/**
 * Created by yarong on 2018/3/25.
 */

public class RoomFragment extends  XFragment{
    public static RoomFragment newInstance() {return new RoomFragment();}

    @Override
    public void initData(Bundle savedInstanceState) {
        initView();
        initEvent();
    }


    @Override
    public int getLayoutId() {
        return R.layout.fragment_room;
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