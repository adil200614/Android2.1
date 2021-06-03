package com.example.android21.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.android21.R;
import com.example.android21.ui.home.TaskModel;


public class FormFragment extends Fragment {
    TextView title, decs;
    Button save;
    TaskModel model;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_form, container, false);
        initView(view);
        iniClickListener();
        return view;
    }

    private void iniClickListener() {
        save.setOnClickListener(v -> {
            String title1 = title.getText().toString();
            String decs1 = decs.getText().toString();
            model = new TaskModel(title1, decs1);

            Bundle bundle = new Bundle();
            bundle.putSerializable("keyModel", model);
            getParentFragmentManager().setFragmentResult("key", bundle);
            NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_content_main);
            navController.navigateUp();

        });
    }

    private void initView(View view) {
        title = view.findViewById(R.id.title1);
        decs = view.findViewById(R.id.description);
        save = view.findViewById(R.id.save);
    }

}