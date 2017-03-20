package org.styleru.styleruapp.view.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.styleru.styleruapp.MainActivity;
import org.styleru.styleruapp.R;
import org.styleru.styleruapp.view.adapter.tab.ViewPagerAdapter;
import org.styleru.styleruapp.view.adapter.tab.ViewPagerAdapter2;

/**
 * Created by Пользователь on 19.03.2017.
 */
public class PersonFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    PersonFragment_myprof frag2;
    FragmentTransaction fTrans;
    TabLayout tabLayout;
    ViewPager viewPager;
    private FragmentActivity myContext;
    ViewPagerAdapter2 viewPagerAdapter;
    public PersonFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PeopleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PersonFragment newInstance(String param1, String param2) {
        PersonFragment fragment = new PersonFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);

            mParam2 = getArguments().getString(ARG_PARAM2);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        MainActivity activity = (MainActivity) getActivity();
        Toolbar toolbar = (Toolbar) activity.findViewById(R.id.toolbar);
        toolbar.setTitle("Ваш профиль");

        // Inflate the layout for this fragment

//        viewPager = (ViewPager) view.findViewById(R.id.viewpager_profile);
//        setupViewPager(viewPager);
//
//        tabLayout = (TabLayout) view.findViewById(R.id.sliding_tabs_profile);
//        tabLayout.setupWithViewPager(viewPager);
//        return view;
//
//
//    }
//
//    private void setupViewPager(ViewPager viewPager) {
//        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());
//        adapter.addFragments(new PersonFragment_myprof(), "Мой");
//        adapter.addFragments(new PersonFragment_projects(), "Проекты");
//        adapter.addFragments(new PersonFragment_timeline(), "Время");
//        viewPager.setAdapter(adapter);
//    }
//
//}






        viewPager = (ViewPager) view.findViewById(R.id.viewpager_profile);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) view.findViewById(R.id.sliding_tabs_profile);
        tabLayout.setupWithViewPager(viewPager);

return view;
    }


    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());
        adapter.addFragment(new PersonFragment_myprof(), "People");
        adapter.addFragment(new PersonFragment_projects(), "Group");
        adapter.addFragment(new PersonFragment_timeline(), "Calls");
        viewPager.setAdapter(adapter);
    }

}

//    private void setupViewPager(ViewPager viewPager) {
//        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
//        adapter.addFragment(new PersonFragment_myprof(), "ONE");
//        adapter.addFragment(new PersonFragment_projects(), "TWO");
//        adapter.addFragment(new PersonFragment_timeline(), "THREE");
//        viewPager.setAdapter(adapter);
//    }
//
//    class ViewPagerAdapter extends FragmentPagerAdapter {
//        private final List<Fragment> mFragmentList = new ArrayList<>();
//        private final List<String> mFragmentTitleList = new ArrayList<>();
//
//        public ViewPagerAdapter(FragmentManager manager) {
//            super(manager);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return mFragmentList.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return mFragmentList.size();
//        }
//
//        public void addFragment(Fragment fragment, String title) {
//            mFragmentList.add(fragment);
//            mFragmentTitleList.add(title);
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return mFragmentTitleList.get(position);
//        }
//    }