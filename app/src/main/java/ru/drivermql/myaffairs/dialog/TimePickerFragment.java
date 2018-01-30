package ru.drivermql.myaffairs.dialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import java.util.Calendar;

import android.text.format.DateFormat;
import android.os.Bundle;
import android.widget.TimePicker;

/**
 * Created by dkmngkfj on 07.01.2018.
 */

public class TimePickerFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

    }
}
