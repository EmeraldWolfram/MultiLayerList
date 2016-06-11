package com.info.ghiny.multilayerlist;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleExpandableListAdapter;

import java.util.List;
import java.util.Map;

/**
 * Created by GhinY on 10/06/2016.
 */
public class DebugSimpleExpandableListAdapter extends SimpleExpandableListAdapter{

    public DebugSimpleExpandableListAdapter(Context context,
                                            List<? extends Map<String, ?>> groupData,
                                            int groupLayout,
                                            String[] groupFrom,
                                            int[] groupTo,
                                            List<? extends List<? extends Map<String, ?>>> childData,
                                            int childLayout, String[] childFrom, int[] childTo) {
        super(context, groupData, groupLayout, groupFrom, groupTo, childData,
                childLayout, childFrom, childTo);
    }

    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        //Log.d( LOG_TAG, "getChildView: groupPosition: "+groupPosition+"; childPosition: "+childPosition+"; v: "+v );
        return super.getChildView( groupPosition, childPosition, isLastChild, convertView, parent );
    }

    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        //Log.d( LOG_TAG, "getGroupView: groupPosition: "+groupPosition+"; isExpanded: "+isExpanded+"; v: "+v );
        return super.getGroupView( groupPosition, isExpanded, convertView, parent );
    }

    private static final String LOG_TAG = "DebugSimpleExpandableListAdapter";
}
