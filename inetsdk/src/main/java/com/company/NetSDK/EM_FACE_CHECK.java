package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief When swiping the card to open the door, the access control background checks whether the face is the same person
 * \else
 * @brief 刷卡开门时，门禁后台校验人脸是否是同一个人
 * \endif
 */
public class EM_FACE_CHECK implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_FACE_CHECK_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  The person has no face data
     * \else
     *  该人员无人脸数据
     * \endif
     */
    public static final int					EM_FACE_CHECK_NODATA = 0;

    /**
     * \if ENGLISH_LANG
     *  Swiping card is consistent with face personnel
     * \else
     *  刷卡和人脸人员一致
     * \endif
     */
    public static final int					EM_FACE_CHECK_CONSISTENT = 1;

    /**
     * \if ENGLISH_LANG
     *  Card swiping and face personnel are inconsistent
     * \else
     *  刷卡和人脸人员不一致
     * \endif
     */
    public static final int					EM_FACE_CHECK_NOT_CONSISTENT = 2;

}