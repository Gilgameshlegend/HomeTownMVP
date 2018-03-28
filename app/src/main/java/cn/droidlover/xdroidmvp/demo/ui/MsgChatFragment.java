package cn.droidlover.xdroidmvp.demo.ui;

import android.os.Bundle;

import cn.droidlover.xdroidmvp.demo.R;
import cn.droidlover.xdroidmvp.mvp.XFragment;

import java.util.ArrayList;
import java.util.List;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by yarong on 2018/3/27.
 */

public class MsgChatFragment extends XFragment {
    private ListView msgListView;

    private EditText inputText;

    private Button send;

    private MsgAdapter adapter;

    private List<Msg> msgList = new ArrayList<>();

    public static MsgChatFragment newInstance() {return new MsgChatFragment();}

    @Override
    public void initData(Bundle savedInstanceState) {
        initView();
        initEvent();
    }


    @Override
    public int getLayoutId() {
        return R.layout.fragment_msg_chat;
    }


    @Override
    public Object newP() {
        return null;
    }

    private void initView() {
        initMsg();
        adapter = new MsgAdapter(getActivity(), R.layout.adapter_msg_content, msgList);
        inputText = (EditText)getView().findViewById(R.id.input_text);
        send = (Button)getView().findViewById(R.id.btn_send);
        msgListView = (ListView)getView().findViewById(R.id.msg_list_view);
        msgListView.setAdapter(adapter);
    }

    private void initEvent() {
        send.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                String content = inputText.getText().toString();
                if(!"".equals(content)){
                    Msg msg = new Msg(content, Msg.SENT);
                    msgList.add(msg);
                    adapter.notifyDataSetChanged();//有新消息时，刷新ListView中的显示
                    msgListView.setSelection(msgList.size());//将ListView定位到最后一行
                    inputText.setText("");//清空输入框的内容
                }
            }

        });
    }

    private void initMsg() {
        Msg msg1 = new Msg("I miss you!balabalabalabalabalabalabalabalabalabalabalabalabalabalabalabalabala",Msg.RECEIVED);
        msgList.add(msg1);

        Msg msg2 = new Msg("I miss you,too!",Msg.SENT);
        msgList.add(msg2);

        Msg msg3 = new Msg("I will come back soon!",Msg.RECEIVED);
        msgList.add(msg3);

    }


    public class Msg{

        public static final int RECEIVED = 0;//收到一条消息

        public static final int SENT = 1;//发出一条消息

        private String  content;//消息的内容

        private int type;//消息的类型

        public  Msg(String content,int type){
            this.content = content;
            this.type = type;
        }

        public String getContent(){
            return content;
        }

        public int getType(){
            return type;
        }
    }

    public class MsgAdapter extends ArrayAdapter<Msg>{
        private int resourceId;

        public MsgAdapter(Context context, int textViewresourceId, List<Msg> objects) {
            super(context, textViewresourceId, objects);
            resourceId = textViewresourceId;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Msg msg = getItem(position);
            View view;
            ViewHolder viewHolder;

            if(convertView == null){
                view = LayoutInflater.from(getContext()).inflate(resourceId, null);
                viewHolder = new ViewHolder();
                viewHolder.leftLayout = (LinearLayout)view.findViewById(R.id.left_layout);
                viewHolder.rightLayout = (LinearLayout)view.findViewById(R.id.right_Layout);
                viewHolder.leftMsg = (TextView)view.findViewById(R.id.left_msg);
                viewHolder.rightMsg = (TextView)view.findViewById(R.id.right_msg);
                view.setTag(viewHolder);
            }else{
                view = convertView;
                viewHolder = (ViewHolder) view.getTag();
            }

            if(msg.getType()==Msg.RECEIVED){
                //如果是收到的消息，则显示左边消息布局，将右边消息布局隐藏
                viewHolder.leftLayout.setVisibility(View.VISIBLE);
                viewHolder.rightLayout.setVisibility(View.GONE);
                viewHolder.leftMsg.setText(msg.getContent());
            }else if(msg.getType()==Msg.SENT){
                //如果是发出去的消息，显示右边布局的消息布局，将左边的消息布局隐藏
                viewHolder.rightLayout.setVisibility(View.VISIBLE);
                viewHolder.leftLayout.setVisibility(View.GONE);
                viewHolder.rightMsg.setText(msg.getContent());
            }
            return view;
        }

        class ViewHolder{
            LinearLayout leftLayout;
            LinearLayout rightLayout;
            TextView leftMsg;
            TextView rightMsg;
        }
    }
}
