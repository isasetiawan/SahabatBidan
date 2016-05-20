package com.example.azaqo.sahabatbidan;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

/**
 * Created by azaqo on 12/05/2016.
 */
public class TambahKehamilanDialog extends DialogFragment {
    public interface NoticeDialogFragment{
        void onSimpanPressed(int selected);
    }

    NoticeDialogFragment mListener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater= getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_tambahkehamilan,null);
        final NumberPicker yangke = (NumberPicker) view.findViewById(R.id.numberPicker);
        yangke.setValue(0);yangke.setMinValue(0);yangke.setMaxValue(20);
        builder.setView(view)
                .setPositiveButton("Tambah", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //tambahkeun
                        mListener.onSimpanPressed(yangke.getValue());
                    }
                })
                .setTitle("Kehamilan yang ke-");

        return builder.create();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (NoticeDialogFragment) activity;
        } catch (ClassCastException e){
            throw new ClassCastException(activity.toString() + "harus di implement bang");
        }
    }
}
