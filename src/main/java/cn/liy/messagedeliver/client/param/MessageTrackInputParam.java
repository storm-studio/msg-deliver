package cn.liy.messagedeliver.client.param;

import lombok.Data;

import java.io.Serializable;

/**
 * MessageTrackInputParam简介
 *
 * @author liy-cn
 * @date 2020-12-09 15:46
 */
@Data
public class MessageTrackInputParam implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -6799507636230592654L;
    /**
     * receiptCode 受理码
     */
    private String receiptCode;
}
