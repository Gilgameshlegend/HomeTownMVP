// Generated code from Butter Knife. Do not modify!
package cn.droidlover.xdroidmvp.demo.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cn.droidlover.xdroidmvp.demo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GanhuoAdapter$ViewHolder_ViewBinding<T extends GanhuoAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public GanhuoAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.tvItem = Utils.findRequiredViewAsType(source, R.id.tv_item, "field 'tvItem'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.tvItem = null;

    this.target = null;
  }
}
