package com.panghaha.it.timepackdemo.view.wheelview.adapter;

import android.content.Context;

/**
 * Description:
 * Created by zhouweiyong on 2015/12/8.
 */
public class EnMonthWheelAdapter extends  AbstractWheelTextAdapter{
    /** The default min value */
    public static final int DEFAULT_MAX_VALUE = 9;

    /** The default max value */
    private static final int DEFAULT_MIN_VALUE = 0;

    // Values
    private int minValue;
    private int maxValue;

    // format
    private String format;

    private String label;
    protected EnMonthWheelAdapter(Context context) {
        this(context,DEFAULT_MIN_VALUE,DEFAULT_MAX_VALUE);
    }

    /**
     * Constructor
     * @param context the current context
     * @param minValue the wheel min value
     * @param maxValue the wheel max value
     */
    public EnMonthWheelAdapter(Context context, int minValue, int maxValue) {
        this(context, minValue, maxValue, null);
    }

    /**
     * Constructor
     * @param context the current context
     * @param minValue the wheel min value
     * @param maxValue the wheel max value
     * @param format the format string
     */
    public EnMonthWheelAdapter(Context context, int minValue, int maxValue, String format) {
        super(context);
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.format = format;
    }


    @Override
    protected CharSequence getItemText(int index) {
        return null;
    }

    @Override
    public int getItemsCount() {
        return 0;
    }
}
