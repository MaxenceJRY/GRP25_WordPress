package vn.edu.usth.wordpress25.ui.me;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import vn.edu.usth.wordpress25.R;
import vn.edu.usth.wordpress25.databinding.FragmentMeBinding;
import vn.edu.usth.wordpress25.databinding.FragmentNotificationsBinding;
import vn.edu.usth.wordpress25.ui.notifications.NotificationsViewModel;

public class MeFragment extends Fragment {

    private FragmentMeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
    /*    MeViewModel MeViewModel =
                new ViewModelProvider(this).get(MeViewModel.class);

        binding = FragmentMeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMe;
        MeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;*/
        return inflater.inflate(R.layout.fragment_me, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}