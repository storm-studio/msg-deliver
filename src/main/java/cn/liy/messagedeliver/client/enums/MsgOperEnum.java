package cn.liy.messagedeliver.client.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * 消息操作枚举
 *
 * @author liy
 * @date 2020-12-09 15:59
 */
@Getter
@AllArgsConstructor
public enum MsgOperEnum {

    /**
     * DSL
     */
    DSL(0, "待受理"),
    /**
     * 已受理
     */
    YSL(1, "已受理"),
    /**
     * 已分拣
     */
    YFJ(2, "已分拣"),
    /**
     * 已解析
     */
    YJX(3, "已解析"),
    /**
     * 已投递
     */
    YTD(4, "已投递"),
    /**
     * 投递失败
     */
    FAIL(999, "投递失败"),
    ;

    /**
     * value 状态值
     */
    private final Integer code;

    /**
     * description 状态描述
     */
    private final String description;

}
