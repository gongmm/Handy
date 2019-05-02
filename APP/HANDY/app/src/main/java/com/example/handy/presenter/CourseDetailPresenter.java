package com.example.handy.presenter;

import com.example.handy.R;
import com.example.handy.app.Constants;
import com.example.handy.app.HandyAPP;
import com.example.handy.base.presenter.BasePresenter;
import com.example.handy.contract.CourseDetailContract;
import com.example.handy.core.DataManager;
import com.example.handy.core.bean.CourseDetailData;
import com.example.handy.core.bean.FollowData;
import com.example.handy.utils.RxUtils;
import com.example.handy.wigdet.BaseObserver;

import java.util.List;

import javax.inject.Inject;

public class CourseDetailPresenter extends BasePresenter<CourseDetailContract.View> implements CourseDetailContract.Presenter {

    private DataManager mDataManager;

    @Inject
    public CourseDetailPresenter(DataManager dataManager) {
        super(dataManager);
        this.mDataManager = dataManager;
    }

    @Override
    public void attachView(CourseDetailContract.View view) {
        super.attachView(view);
    }

    @Override
    public int getLoginAccount() {
        return mDataManager.getLoginAccount();
    }

    @Override
    public void getCourseDetail(boolean isShowError, int courseId) {

        addSubscribe(mDataManager.getCourseDetail(courseId)
                .compose(RxUtils.rxSchedulerHelper())
                .compose(RxUtils.handleResult())
                .subscribeWith(new BaseObserver<CourseDetailData>(mView,
                        HandyAPP.getInstance().getString(R.string.failed_to_obtain_course_detail),
                        isShowError) {
                    @Override
                    public void onNext(CourseDetailData courseDetailData) {
                        mView.showCourseDetail(courseDetailData);
                    }
                }));
    }
}
