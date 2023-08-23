package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Ranging mode
 * \else
 * 测距模式
 * \endif
 */
public class EM_RANGE_MODE  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_RANGE_MODE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * Wolf
     * \else
     * 狼
     * \endif
     */
    public static final int EM_RANGE_MODE_WOLF = 0;

    /**
     * \if ENGLISH_LANG
     * Rabbit
     * \else
     * 兔
     * \endif
     */
    public static final int EM_RANGE_MODE_RABBIT = 1;

    /**
     * \if ENGLISH_LANG
     * People
     * \else
     * 人
     * \endif
     */
    public static final int EM_RANGE_MODE_PEOPLE = 2;

    /**
     * \if ENGLISH_LANG
     * Others
     * \else
     * 自定义
     * \endif
     */
    public static final int EM_RANGE_MODE_OTHER = 3;
}
