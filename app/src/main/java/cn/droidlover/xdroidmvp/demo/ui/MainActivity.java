package cn.droidlover.xdroidmvp.demo.ui;

import android.os.Bundle;
import cn.droidlover.xdroidmvp.demo.R;
import cn.droidlover.xdroidmvp.mvp.XActivity;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/**
 * Created by yarong on 2018/03/27.
 */

public class MainActivity extends XActivity {
    //    @BindView(R.id.toolbar)
//    Toolbar toolbar;
//    @BindView(R.id.tabLayout)
//    TabLayout tabLayout;
//    @BindView(R.id.viewPager)
//    ViewPager viewPager;
//
//    List<Fragment> fragmentList = new ArrayList<>();
//    String[] titles = {"首页", "干货", "妹子"};
//
//    XFragmentAdapter adapter;

    //导航栏
    private BottomNavigationBar bottom_bar;
    //Fragment类
    private FindFragment mfragment_find;
    private MsgboxFragment mfragment_msgbox;
    private RoomFragment mfragment_room;
    private MineFragment mfragment_mine;
    private MsgChatFragment mfragment_msgdetail;
    //Fragment管理
    private FragmentManager fm;
//    //fragmet嵌入在这里
//    private FrameLayout main_frameLayout;
    //事务
    private FragmentTransaction transaction;
    //MsgboxFragment中的返回按钮
    private ImageButton ib_backToBox;


    @Override
    public void initData(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
    }

    @Override
    public int getLayoutId() {
//        return R.layout.activity_main1;
        return R.layout.activity_main;
    }

//    @Override
//    public int getOptionsMenuId() {
//        return R.menu.menu_main;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.action_droid:
//                AboutActivity.launch(context);
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }
//
    @Override
    public Object newP() {
        return null;
    }

    private void initView() {
        //初始化导航栏
        bottom_bar = (BottomNavigationBar) findViewById(R.id.bottom_bar);
        bottom_bar.setMode(BottomNavigationBar.MODE_FIXED);
        bottom_bar.addItem(new BottomNavigationItem(R.drawable.ic_find, getString(R.string.find)))
                .addItem(new BottomNavigationItem(R.drawable.ic_room, getString(R.string.room)))
                .addItem(new BottomNavigationItem(R.drawable.ic_box, getString(R.string.box)))
                .addItem(new BottomNavigationItem(R.drawable.ic_mine, getString(R.string.mine)))
                .setActiveColor(R.color.navigationItem_active)
                .setInActiveColor(R.color.navigationItem_inActive)
                .initialise();
        //默认显示发现页面
        setDefaultFragment();
    }

    private void initEvent() {
        bottom_bar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                switch (position) {
                    case 0:
                        setDefaultFragment();
                        break;
                    case 1:
                        setRoomFragment();
                        break;
                    case 2:
                        setMsgBoxFragment();
                        break;
                    case 3:
                        setMineFragment();
                        break;
                }
            }
            @Override
            public void onTabUnselected(int position) {}
            @Override
            public void onTabReselected(int position) {}
        });

    }



    private void setDefaultFragment() {
        fm = getSupportFragmentManager();
        transaction = fm.beginTransaction();
        hideFragments(transaction);
        if (mfragment_find == null) {
            mfragment_find = FindFragment.newInstance();
            transaction.add(R.id.main_content, mfragment_find);
        } else {
            transaction.show(mfragment_find);
        }
        transaction.commit();
    }

    private void setMsgBoxFragment() {
        fm = getSupportFragmentManager();
        transaction = fm.beginTransaction();
        hideFragments(transaction);
        if(mfragment_msgbox == null) {
            mfragment_msgbox = MsgboxFragment.newInstance();
            transaction.add(R.id.main_content, mfragment_msgbox);
        }
        else {
            transaction.show(mfragment_msgbox);
        }
        transaction.commit();
    }

    private void setRoomFragment() {
        fm = getSupportFragmentManager();
        transaction = fm.beginTransaction();
        hideFragments(transaction);
        if(mfragment_room == null) {
            mfragment_room = RoomFragment.newInstance();
            transaction.add(R.id.main_content, mfragment_room);
        }
        else {
            transaction.show(mfragment_room);
        }
        transaction.commit();
    }

    private void setMineFragment() {
        fm = getSupportFragmentManager();
        transaction = fm.beginTransaction();
        hideFragments(transaction);
        if(mfragment_mine == null) {
            mfragment_mine = MineFragment.newInstance();
            transaction.add(R.id.main_content, mfragment_mine);
        }
        else {
            transaction.show(mfragment_mine);
        }
        transaction.commit();
    }

    private void setMsgChatFragment() {
        fm = getSupportFragmentManager();
        transaction = fm.beginTransaction();
        hideFragments(transaction);
        if(mfragment_msgdetail == null) {
            mfragment_msgdetail = MsgChatFragment.newInstance();
            transaction.add(R.id.main_content, mfragment_msgdetail);
            }
        else {
            transaction.show(mfragment_msgdetail);
        }
        transaction.commit();
    }

    private void hideFragments(FragmentTransaction transaction) {
        if (mfragment_find != null) {
            transaction.hide(mfragment_find);
        }
        if (mfragment_msgbox != null) {
            transaction.hide(mfragment_msgbox);
        }
        if (mfragment_room != null)
            transaction.hide(mfragment_room);
        if (mfragment_mine != null)
            transaction.hide(mfragment_mine);
        if (mfragment_msgdetail != null)
            transaction.hide(mfragment_msgdetail);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_msg_item:
                setMsgChatFragment();
                break;
            case R.id.ib_backToBox:
                setMsgBoxFragment();
                break;
        }
    }
}