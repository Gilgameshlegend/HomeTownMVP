package cn.droidlover.xdroidmvp.demo.ui;

import android.os.Bundle;
//import android.support.design.widget.TabLayout;
//import android.support.v4.app.Fragment;
//import android.support.v4.view.ViewPager;
//import android.support.v7.widget.Toolbar;
//import android.view.MenuItem;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import butterknife.BindView;
//import cn.droidlover.xdroidmvp.base.XFragmentAdapter;
import cn.droidlover.xdroidmvp.demo.R;
import cn.droidlover.xdroidmvp.mvp.XActivity;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import android.widget.TextView;
/**
 * Created by wanglei on 2016/12/22.
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
    private TextView txt_main;
    private BottomNavigationBar bottom_bar;

    @Override
    public void initData(Bundle savedInstanceState) {
        setContentView(R.layout.bottom_navigater_bar);
        initView();
        initEvent();
    }

    @Override
    public int getLayoutId() {
//        return R.layout.activity_main;
        return R.layout.bottom_navigater_bar;
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


    private void initEvent() {
        bottom_bar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                switch (position) {
                    case 0:
                        txt_main.setText(getString(R.string.find));
                        break;
                    case 1:
                        txt_main.setText(getString(R.string.room));
                        break;
                    case 2:
                        txt_main.setText(getString(R.string.box));
                        break;
                    case 3:
                        txt_main.setText(getString(R.string.mine));
                        break;
                }
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });
    }

    private void initView() {
        txt_main = (TextView) findViewById(R.id.txt_main);
        bottom_bar = (BottomNavigationBar) findViewById(R.id.bottom_bar);
        bottom_bar.addItem(new BottomNavigationItem(R.drawable.ic_find, getString(R.string.find)))
                .addItem(new BottomNavigationItem(R.drawable.ic_room, getString(R.string.room)))
                .addItem(new BottomNavigationItem(R.drawable.ic_box, getString(R.string.box)))
                .addItem(new BottomNavigationItem(R.drawable.ic_mine, getString(R.string.mine)))
                .initialise();
        txt_main.setText(getString(R.string.find));
    }
}