package com.xingyun.mvpdemo.contract;

import com.xingyun.mvpdemo.base.BaseView;
import com.xingyun.mvpdemo.model.WeatherBean;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/4/13.
 * desc:
 */

public class WeatherContract {
    public interface View extends BaseView {
        void onLoadSuccess(WeatherBean weatherBean);
        void onLoadFail();
    }

    public interface Presenter {
        void requestWeatherNow();
    }
}
