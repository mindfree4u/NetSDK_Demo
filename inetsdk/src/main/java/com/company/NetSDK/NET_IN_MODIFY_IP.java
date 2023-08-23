package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#ModifyDeviceEx} input parameter
 * \else
 *  接口 {@link INetSDK#ModifyDeviceEx} 接口输入参数
 * \endif
 */
public class NET_IN_MODIFY_IP implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * device net info
     * \else
     * 设备信息结构体
     * \endif
     */
    public DEVICE_NET_INFO_EX2     stuDevNetInfo = new DEVICE_NET_INFO_EX2();
}
