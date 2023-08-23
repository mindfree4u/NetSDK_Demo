package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief 事件类型 EVENT_IVS_TRAFFIC_DRIVERYAWN (开车打哈欠事件) 对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_DRIVERYAWN_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件名称
     * \endif
     */
    public byte					szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  时间戳(单位是毫秒)
     * \endif
     */
    public double					PTS;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件ID
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  GPS信息
     * \endif
     */
    public NET_GPS_STATUS_INFO					stuGPSStatus = new NET_GPS_STATUS_INFO();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  司机ID
     * \endif
     */
    public byte					szDriverID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  违章关联视频FTP上传路径
     * \endif
     */
    public byte					szVideoPath[] = new byte[256];

}