package com.arialyy.downloadutil.core.command;

import com.arialyy.downloadutil.core.DownloadTarget;
import com.arialyy.downloadutil.core.IDownloadTarget;

import java.util.List;

/**
 * Created by lyy on 2016/8/22.
 * 下载命令
 */
public abstract class IDownloadCommand {
    private IDownloadTarget target;

    public IDownloadCommand(IDownloadTarget target) {
        this.target = target;
    }

    /**
     * 执行命令
     */
    public abstract void executeComment();

    /**
     * 设置下载器
     *
     * @param downloadTarget {@link IDownloadTarget}
     */
    public void setDownloadTarget(IDownloadTarget downloadTarget) {
        target = downloadTarget;
    }


}