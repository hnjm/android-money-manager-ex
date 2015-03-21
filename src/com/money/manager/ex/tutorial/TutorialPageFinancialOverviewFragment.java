package com.money.manager.ex.tutorial;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.money.manager.ex.R;

/**
 * Here we try SVG-Android 2.
 * A simple {@link Fragment} subclass.
 * Use the {@link TutorialPageFinancialOverviewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TutorialPageFinancialOverviewFragment extends Fragment {

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment TutorialPageFinancialOverviewFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TutorialPageFinancialOverviewFragment newInstance() {
        TutorialPageFinancialOverviewFragment fragment = new TutorialPageFinancialOverviewFragment();
        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public TutorialPageFinancialOverviewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tutorial_page_financial_overview, container, false);

        WebView webView = (WebView)view.findViewById(R.id.webViewOverview);
        webView.loadUrl("file:///android_asset/tutorial/overview.html");

        return view;
    }

}
