package cn.liy.messagedeliver.client.param;

import cn.liy.messagedeliver.client.domain.MessageExtraParam;
import lombok.Data;

import java.io.Serializable;

/**
 * SubmitMessageOutputParam
 *
 * @author liy
 * @date 2020-12-09 15:05
 */
@Data
public class SubmitMessageOutputParam implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 5466600712763173547L;

    /**
     * receiptCode 受理码
     */
    private String receiptCode;

    /**
     * messageExtraParam
     */
    private MessageExtraParam messageExtraParam;

}
