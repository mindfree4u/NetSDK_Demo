package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Extended Information
 * \else
 * @brief 扩展信息
 * \endif
 */
public class NET_MULTI_APPEND_EXTENDED_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The token value of this face import
     * \else
     *  该次人脸导入的token值
     * \endif
     */
    public int					nToken;

    /**
     * \if ENGLISH_LANG
     *  Face append state,{@link EM_FACE_APPEND_STATE}
     * \else
     *  人脸导入状态,{@link EM_FACE_APPEND_STATE}
     * \endif
     */
    public int					emState;


}