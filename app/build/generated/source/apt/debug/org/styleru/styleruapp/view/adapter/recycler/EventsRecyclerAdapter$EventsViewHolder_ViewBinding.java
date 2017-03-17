// Generated code from Butter Knife. Do not modify!
package org.styleru.styleruapp.view.adapter.recycler;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.styleru.styleruapp.R;

public class EventsRecyclerAdapter$EventsViewHolder_ViewBinding implements Unbinder {
  private EventsRecyclerAdapter.EventsViewHolder target;

  @UiThread
  public EventsRecyclerAdapter$EventsViewHolder_ViewBinding(EventsRecyclerAdapter.EventsViewHolder target, View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.subtitle = Utils.findRequiredViewAsType(source, R.id.subtitle, "field 'subtitle'", TextView.class);
    target.date = Utils.findRequiredViewAsType(source, R.id.date, "field 'date'", TextView.class);
    target.time = Utils.findRequiredViewAsType(source, R.id.time, "field 'time'", TextView.class);
    target.location = Utils.findRequiredViewAsType(source, R.id.location, "field 'location'", TextView.class);
    target.image = Utils.findRequiredViewAsType(source, R.id.image, "field 'image'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EventsRecyclerAdapter.EventsViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.subtitle = null;
    target.date = null;
    target.time = null;
    target.location = null;
    target.image = null;
  }
}
