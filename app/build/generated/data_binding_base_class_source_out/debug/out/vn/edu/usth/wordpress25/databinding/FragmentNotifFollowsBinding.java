// Generated by view binder compiler. Do not edit!
package vn.edu.usth.wordpress25.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import vn.edu.usth.wordpress25.R;

public final class FragmentNotifFollowsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final TextView textView25;

  @NonNull
  public final TextView textView26;

  private FragmentNotifFollowsBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView imageView3, @NonNull TextView textView25, @NonNull TextView textView26) {
    this.rootView = rootView;
    this.imageView3 = imageView3;
    this.textView25 = textView25;
    this.textView26 = textView26;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNotifFollowsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNotifFollowsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_notif_follows, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNotifFollowsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.textView25;
      TextView textView25 = ViewBindings.findChildViewById(rootView, id);
      if (textView25 == null) {
        break missingId;
      }

      id = R.id.textView26;
      TextView textView26 = ViewBindings.findChildViewById(rootView, id);
      if (textView26 == null) {
        break missingId;
      }

      return new FragmentNotifFollowsBinding((RelativeLayout) rootView, imageView3, textView25,
          textView26);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
