package cn.liy.messagedeliver.client.message;

import cn.liy.messagedeliver.client.domain.MessageExtraParam;
import lombok.Data;

import java.io.Serializable;

/**
 * 包括基础消息字段
 *
 * @author liy-cn
 * @date 2020-12-09 15:06
 */
@Data
public class SubmitMessageInputParam implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -7876213395968935563L;

    /**
     * messageExtraParam
     */
    private MessageExtraParam messageExtraParam;
}
