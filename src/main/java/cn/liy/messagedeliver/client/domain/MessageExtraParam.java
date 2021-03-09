package cn.liy.messagedeliver.client.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 消息额外的参数
 * @author liy
 * @date 2021-03-09 09:42
 */
@Data
public class MessageExtraParam implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1506826759326064297L;
    /**
     * messageKey 在鲁强那边能够查询消息详情的主键，用来拉取其他内容。
     */
    private String messageKey;
    /**
     * requestId 方便日志查询
     */
    private String requestId;
}
