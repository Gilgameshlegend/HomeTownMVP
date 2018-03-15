package cn.droidlover.xdroidmvp.demo.ui;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.demo.R;
import cn.droidlover.xdroidmvp.mvp.XFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
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

    private SearchFragment msearchFragment;
    private PartnerFragment mpartnerFragment;
    private FragmentTransaction transaction_parent;
    private FragmentTransaction transaction_child;

    public static FindFragment newInstance() {
        return new FindFragment();
    }


    @Override
    public void initData(Bundle savedInstanceState) {

        initView();
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
        FragmentManager fm = getChildFragmentManager();
        transaction_child = fm.beginTransaction();
        msearchFragment = SearchFragment.newInstance();
        mpartnerFragment = PartnerFragment.newInstance();
        transaction_child.add(R.id.id_child_fragment_search, msearchFragment);
        transaction_child.add(R.id.id_child_fragment_recmd_parter, mpartnerFragment);
        transaction_child.commit();
    }

}