// Generated code from Butter Knife. Do not modify!
package cn.droidlover.xdroidmvp.demo.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cn.droidlover.xdroidmvp.demo.R;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PartnerAdapter$ViewHolder_ViewBinding<T extends PartnerAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public PartnerAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.llPartner = Utils.findRequiredViewAsType(source, R.id.ll_partner, "field 'llPartner'", LinearLayout.class);
    target.ivPartnerImg = Utils.findRequiredViewAsType(source, R.id.iv_partner_img, "field 'ivPartnerImg'", RoundedImageView.class);
    target.tvPartnerName = Utils.findRequiredViewAsType(source, R.id.tv_partner_name, "field 'tvPartnerName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.llPartner = null;
    target.ivPartnerImg = null;
    target.tvPartnerName = null;

    this.target = null;
  }
}
