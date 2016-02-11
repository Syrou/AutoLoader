package eu.syrou.coremodule;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Syrou on 2016-02-11.
 */
public class DeviceRecycleAdapter extends RecyclerView.Adapter<DeviceRecycleAdapter.ViewHolder> {
    private List<Device> deviceItems;

    public DeviceRecycleAdapter(List<Device> itemsData) {
        this.deviceItems = itemsData;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public DeviceRecycleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.device_item_layout, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        // - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData

        viewHolder.txtDeviceName.setText(deviceItems.get(position).getDeviceName());
        viewHolder.txtDeviceType.setText(deviceItems.get(position).getTypeOfDevice());


    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtDeviceName;
        public TextView txtDeviceType;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            txtDeviceName = (TextView) itemLayoutView.findViewById(R.id.device_name);
            txtDeviceType = (TextView) itemLayoutView.findViewById(R.id.device_type);
        }
    }


    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return deviceItems.size();
    }
}
