package cn.liy.messagedeliver.client.domain;

import cn.liy.messagedeliver.client.enums.MsgOperEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * MessageTrackInfo简介
 *
 * @author liy
 * @date 2020-12-09 15:50
 */
@Data
public class MessageTrackInfo implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 4703054383914888407L;
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
