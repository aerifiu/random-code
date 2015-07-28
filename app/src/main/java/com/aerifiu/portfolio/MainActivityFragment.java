package com.aerifiu.portfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivityFragment extends Fragment implements View.OnClickListener {

	public MainActivityFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {

		final View root = inflater.inflate(R.layout.fragment_main, container, false);
		root.findViewById(R.id.fragment_main_btn_movies).setOnClickListener(this);
		root.findViewById(R.id.fragment_main_btn_scores).setOnClickListener(this);
		root.findViewById(R.id.fragment_main_btn_library).setOnClickListener(this);
		root.findViewById(R.id.fragment_main_btn_bigger).setOnClickListener(this);
		root.findViewById(R.id.fragment_main_btn_reader).setOnClickListener(this);
		root.findViewById(R.id.fragment_main_btn_capstone).setOnClickListener(this);

		return root;
	}

	@Override
	public void onClick(View v) {

		final String launchStr = getString(R.string.substr_launch);

		if(getActivity().isFinishing()){
			return;
		}

		switch (v.getId()) {
		case R.id.fragment_main_btn_movies:
			Toast.makeText(getActivity(), String.format(launchStr, getString(R.string.movies)), Toast.LENGTH_SHORT).show();
			break;
		case R.id.fragment_main_btn_scores:
			Toast.makeText(getActivity(), String.format(launchStr, getString(R.string.scores)), Toast.LENGTH_SHORT).show();
			break;
		case R.id.fragment_main_btn_library:
			Toast.makeText(getActivity(), String.format(launchStr, getString(R.string.library_app)), Toast.LENGTH_SHORT).show();
			break;
		case R.id.fragment_main_btn_bigger:
			Toast.makeText(getActivity(), String.format(launchStr, getString(R.string.build_it_bigger)), Toast.LENGTH_SHORT).show();
			break;
		case R.id.fragment_main_btn_reader:
			Toast.makeText(getActivity(), String.format(launchStr, getString(R.string.xyz_reader)), Toast.LENGTH_SHORT).show();
			break;
		case R.id.fragment_main_btn_capstone:
			Toast.makeText(getActivity(), String.format(launchStr, getString(R.string.capstone)), Toast.LENGTH_SHORT).show();
			break;
		}

	}
}
