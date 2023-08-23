package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Vidio in Face AutoExposure
 * \else
 * 智能规则检测人脸，根据检测区域自动曝光配置
 * \endif
 */
public class NET_CFG_VIDEOIN_FACE_AUTOEXPOSURE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * enable
     * \else
     * 是否开启
     * \endif
     */
    public boolean bEnable;

    /**
     * \if ENGLISH_LANG
     * 2A Face exposure interval check time
     * \else
     * 2A人脸曝光间隔检测时间
     * \endif
     */
    public int nInterval;

    /**
     * \if ENGLISH_LANG
     * taiget brightness, range[0, 100]
     * \else
     * 亮度等级,范围[0, 100]
     * \endif
     */
    public int nTargetBrightness;

}
