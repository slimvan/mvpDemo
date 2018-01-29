package com.xingyun.mvpdemo.interf;

/**
 *
 */
public interface OnMoveAndSwipedListener {

    boolean onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);

}
