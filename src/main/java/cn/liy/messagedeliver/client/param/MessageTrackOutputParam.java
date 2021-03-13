package cn.liy.messagedeliver.client.param;

import cn.liy.messagedeliver.client.domain.MessageTrackInfo;
import cn.liy.messagedeliver.client.message.SubmitMessageInputParam;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * MessageTrackOutputParam简介
 *
 * @author liy-cn
 * @date 2020-12-09 15:48
 */
@Data
public class MessageTrackOutputParam implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -864279652249402059L;

    /**
     * receiptCode
     */
    private String receiptCode;

    /**
     * submitMessageInputParam 消息入参
     */
    private SubmitMessageInputParam submitMessageInputParam;

    /**
     * messageTrackList 消息跟踪列表
     */
    private List<MessageTrackInfo> messageTrackInfoList;
}
