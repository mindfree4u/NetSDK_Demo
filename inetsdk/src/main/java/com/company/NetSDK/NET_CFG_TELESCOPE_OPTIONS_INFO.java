package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Telescope configuration，Corresponding enumeration {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_TELESCOPE_OPTIONS}
 * \else
 *  望远镜配置，对应的枚举 {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_TELESCOPE_OPTIONS}
 * \endif
 */
public class NET_CFG_TELESCOPE_OPTIONS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Laser indication control (true: on; false: off)
     * \else
     * 激光指示控制 TRUE:开; FALSE:关)
     * \endif
     */
    public boolean						bLaserCtrl;

    /**
     * \if ENGLISH_LANG
     * Range switch control (true: on; false: off)
     * \else
     * 测距开关控制 TRUE:开; FALSE:关)
     * \endif
     */
    public boolean						bRangeCtrl;

    /**
     * \if ENGLISH_LANG
     * Ranging mode,refer to {@link EM_RANGE_MODE}
     * \else
     * 测距模式,参考{@link EM_RANGE_MODE}
     * \endif
     */
    public int				emRangeMode;

    /**
     * \if ENGLISH_LANG
     * OSD settings. Show / hide (true: show; false: hide)
     * \else
     * OSD设置.显示/隐藏(TRUE:显示;FALSE:隐藏)
     * \endif
     */
    public boolean						bOsdSet;

    /**
     * \if ENGLISH_LANG
     * Object detection,refer to{@link EM_TARGET_DETECT_SENSITIVITY}
     * \else
     * 目标检测,参考{@link EM_TARGET_DETECT_SENSITIVITY}
     * \endif
     */
    public int emTargetChk;

    /**
     * \if ENGLISH_LANG
     * Fire detection,refer to{@link EM_TARGET_DETECT_SENSITIVITY}
     * \else
     * 火点检测,参考{@link EM_TARGET_DETECT_SENSITIVITY}
     * \endif
     */
    public int emFireChk;

    /**
     * \if ENGLISH_LANG
     * Image parameter setting,refer to {@link EM_SCENE_MODE}
     * \else
     * 图像参数设置,参考{@link EM_SCENE_MODE}
     * \endif
     */
    public int				 emSceneMode;

    /**
     * \if ENGLISH_LANG
     * Automatic shutdown time unit: minutes (0: turn off automatic shutdown function)
     * \else
     * 自动关机时间 单位:分钟(0:关闭自动关机功能)
     * \endif
     */
    public int							 nAutoShutdown;

    /**
     * \if ENGLISH_LANG
     * Automatic sleep time unit: minutes (0: turn off automatic sleep function)
     * \else
     * 自动休眠时间 单位:分钟(0:关闭自动休眠功能)
     * \endif
     */
    public int							 nAutoSleep;

    /**
     * \if ENGLISH_LANG
     * Screen switch,refer to {@link EM_SCREEN_SWITCH_TYPE}
     * \else
     * 屏幕切换开关,参考{@link EM_SCREEN_SWITCH_TYPE}
     * \endif
     */
    public int		 emScreenSwitch;

    /**
     * \if ENGLISH_LANG
     * WiFi switch: (true: on; false: off)
     * \else
     * WIFI开关:(TRUE:开;FALSE:关)
     * \endif
     */
    public boolean						 bWIFICtrl;

    /**
     * \if ENGLISH_LANG
     * Cold and hot spot display switch,refer to {@link EM_SWITCH_CONTROL_TYPE}
     * \else
     * 冷热点显示开关，参考{@link EM_SWITCH_CONTROL_TYPE}
     * \endif
     */
    public int		 emHotColdPoint;

    /**
     * \if ENGLISH_LANG
     * Distance unit,refer to{@link EM_RANGE_UNIT}
     * \else
     * 距离单位,参考{@link EM_RANGE_UNIT}
     * \endif
     */
    public int				 emRangeUnit;

    /**
     * \if ENGLISH_LANG
     * Buzzer switch,refer to {@link EM_SWITCH_CONTROL_TYPE}
     * \else
     * 蜂鸣器开关，参考{@link EM_SWITCH_CONTROL_TYPE}
     * \endif
     */
    public int		 emBuzzerCtrl;

    /**
     * \if ENGLISH_LANG
     * The custom height of the object to be measured (0.1~999.9 m/ft) is multiplied by 10 and issued (1~9999).
     * \else
     * 待测距物体自定义高度(0.1~999.9米/英尺),乘10下发(1~9999).
     * \endif
     */
    public int      nCustomHeight;
}
