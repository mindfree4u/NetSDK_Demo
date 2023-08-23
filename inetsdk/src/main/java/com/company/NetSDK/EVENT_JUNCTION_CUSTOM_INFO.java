package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief custom info in
 * \else
 * @brief 卡口事件专用上报内容，增加到Custom下
 * \endif
 */
public class EVENT_JUNCTION_CUSTOM_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  custom weight info
     * \else
     *  原始图片信息
     * \endif
     */
    public EVENT_CUSTOM_WEIGHT_INFO					stuWeightInfo = new EVENT_CUSTOM_WEIGHT_INFO();

    /**
     * \if ENGLISH_LANG
     * Content Based Image Retrieval Feature offset,Unit:Byte
     * \else
     *  数据偏移，单位字节 （由于结构体保留字节有限的限制,添加在此处， 下同）
     * \endif
     */
    public int					nCbirFeatureOffset;

    /**
     * \if ENGLISH_LANG
     * Content Based Image Retrieval Feature length,Unit:Byte
     * \else
     *  数据大小，单位字节 
     * \endif
     */
    public int					nCbirFeatureLength;

    /**
     * \if ENGLISH_LANG
     *  Head direction 0:Unknown 1:left 2:center 3:right
     * \else
     *  车头朝向 0:未知 1:左 2:中 3:右
     * \endif
     */
    public int					dwVehicleHeadDirection;

    /**
     * \if ENGLISH_LANG
     *  Number of available parking space(customized demand for entrance and exit camera project)
     * \else
     *  停车场车位余位数量 (出入口相机项目）
     * \endif
     */
    public int					nAvailableSpaceNum;

    /**
     * \if ENGLISH_LANG
     *  Radar free stream info
     * \else
     *  雷达自由流信息
     * \endif
     */
    public NET_RADAR_FREE_STREAM					stuRadarFreeStream = new NET_RADAR_FREE_STREAM();

    /**
     * \if ENGLISH_LANG
     *  Measure temperature.
     * \else
     *  测温信息
     * \endif
     */
    public NET_CUSTOM_MEASURE_TEMPER					stuMeasureTemper = new NET_CUSTOM_MEASURE_TEMPER();

}