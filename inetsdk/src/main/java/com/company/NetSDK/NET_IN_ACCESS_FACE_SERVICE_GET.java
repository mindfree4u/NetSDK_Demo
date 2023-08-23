package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * the input param of getting face data(NET_EM_ACCESS_CTL_FACE_SERVICE_GET)
 * \else
 * 批量获取多用户多个人脸输入参数(NET_EM_ACCESS_CTL_FACE_SERVICE_GET)
 * \endif
 */
public class NET_IN_ACCESS_FACE_SERVICE_GET implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  user ID number,the max number is 100
     * \else
     *  用户ID数量,最大100
     * \endif
     */
    public int					nUserNum;

    /**
     * \if ENGLISH_LANG
     *  user ID
     * \else
     *  用户ID
     * \endif
     */
    public byte					szUserID[][] = new byte[100][32];

}