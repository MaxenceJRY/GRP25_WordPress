package vn.edu.usth.wordpress25.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import vn.edu.usth.wordpress25.R;
import vn.edu.usth.wordpress25.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNotifications;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        ViewPager viewPager = root.findViewById(R.id.viewPager);
        PagerAdapter pagerAdapter = new NotificationsPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(pagerAdapter);


        TabLayout tabLayout = root.findViewById(R.id.tabLayout);

        // Connectez le TabLayout au ViewPager
        tabLayout.setupWithViewPager(viewPager);
        return root;



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public class NotificationsPagerAdapter extends FragmentPagerAdapter {

        public NotificationsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            // Retournez le fragment correspondant à la position
            switch (position) {
                case 0:
                    return new NotifAllFragment();
                case 1:
                    return new NotifUnreadFragment();
                case 2:
                    return new NotifCommentsFragment();
                case 3:
                    return new NotifFollowsFragment();
                case 4:
                    return new NotifLikesFragment();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Retournez le nombre total d'onglets
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // Retournez le titre de l'onglet en fonction de la position
            switch (position) {
                case 0:
                    return "ALL";
                case 1:
                    return "UNREAD";
                case 2:
                    return "COMMENTS";
                case 3:
                    return "FOLLOWS";
                case 4:
                    return "LIKES";
                default:
                    return null;
            }
        }
    }
}







