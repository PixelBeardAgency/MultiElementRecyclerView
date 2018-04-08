package co.pixelbeard.multielementrecyclerview.viewHolders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import co.pixelbeard.multielementrecyclerview.Content;

/**
 * Created by Michael Stoddart
 * 08/04/2018.
 */

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void setPayload(Content content);
}
