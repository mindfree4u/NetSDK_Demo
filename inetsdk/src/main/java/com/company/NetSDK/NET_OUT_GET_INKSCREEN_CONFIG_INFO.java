package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetFaceBoardInkScreenConfig Output param
 * \else
 * @brief CLIENT_GetFaceBoardInkScreenConfig 出参
 * \endif
 */
public class NET_OUT_GET_INKSCREEN_CONFIG_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  mode config
     * \else
     *  配置
     * \endif
     */
    public NET_FACE_BOARD_MODES					stuMode = new NET_FACE_BOARD_MODES();

}