package com.example.handy.presenter.message;

import com.example.handy.R;
import com.example.handy.app.Constants;
import com.example.handy.app.HandyAPP;
import com.example.handy.base.presenter.BasePresenter;
import com.example.handy.contract.message.ReceivedCommentPagerContract;
import com.example.handy.contract.message.ReceivedReplyPagerContract;
import com.example.handy.core.DataManager;
import com.example.handy.core.bean.CommentMessageData;
import com.example.handy.core.bean.ReplyMessageData;
import com.example.handy.utils.RxUtils;
import com.example.handy.wigdet.BaseObserver;

import java.util.List;

import javax.inject.Inject;

public class ReceivedReplyPagerPresenter extends BasePresenter<ReceivedReplyPagerContract.View> implements ReceivedReplyPagerContract.Presenter {

    private DataManager mDataManager;
    private int mCurrentPage;
    private boolean isRefresh = true;

    @Inject
    public ReceivedReplyPagerPresenter(DataManager dataManager) {
        super(dataManager);
        this.mDataManager = dataManager;


    }

    @Override
    public void getReplyMessage(boolean isShowError) {
        addSubscribe(mDataManager.getReplyMessage(getLoginAccount(),mCurrentPage,Constants.LOAD_NUM)
                .compose(RxUtils.rxSchedulerHelper())
                .compose(RxUtils.handleResult())
                .subscribeWith(new BaseObserver<List<ReplyMessageData>>(mView,
                        HandyAPP.getInstance().getString(R.string.failed_to_obtain_follow_data),
                        false) {
                    @Override
                    public void onNext(List<ReplyMessageData> replyMessageData) {
                        mView.showReplyMessage(replyMessageData, isRefresh);
                    }
                }));
    }

    @Override
    public void autoRefresh(boolean isShowError) {
        isRefresh = true;
        mCurrentPage = 0;
        getReplyMessage(isShowError);

    }

    @Override
    public void loadMore() {
        isRefresh = false;
        mCurrentPage++;
        loadMoreData();

    }

    @Override
    public void loadMoreData() {
        addSubscribe(mDataManager.getReplyMessage(getLoginAccount(),mCurrentPage, Constants.LOAD_NUM)
                .compose(RxUtils.rxSchedulerHelper())
                .compose(RxUtils.handleResult())
                .subscribeWith(new BaseObserver<List<ReplyMessageData>>(mView,
                        HandyAPP.getInstance().getString(R.string.failed_to_obtain_follow_data),
                        false) {
                    @Override
                    public void onNext(List<ReplyMessageData> replyMessageData) {
                        mView.showReplyMessage(replyMessageData, isRefresh);
                    }
                }));

    }


}
