package cn.liy.messagedeliver.client.message;

import cn.liy.messagedeliver.client.domain.MessageExtraParam;
import cn.liy.messagedeliver.client.enums.MsgOperEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 消息投递状态更新消息实体
 * topic: message-deliver-state-update
 *
 * @author liy-cn
 * @date 2020-12-09 16:31
 */
@Data
public class MessageDeliverStateUpdate implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 7084317050957905095L;
    /**
     * receiptCode
     */
    private String receiptCode;

    /**
     * messageExtraParam
     */
    private MessageExtraParam messageExtraParam;

    /**
     * processTime 操作时间
     */
    private Date processTime;

    /**
     * operCode 操作动作编码
     *
     * @see MsgOperEnum
     */
    private Integer operCode;

    /**
     * operName 操作动作名称
     *
     * @see MsgOperEnum
     */
    private String operDescription;

    /**
     * content 操作详情
     */
    private String content;
}
