package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encode widget-Self-defined title
 * \else
 * 编码物件-自定义标题
 * \endif
 */
public class AV_CFG_VideoWidgetCustomTitle implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Overlay to main stream 
	 * \else
	 * 叠加到主码流
	 * \endif
	 */
	public boolean				bEncodeBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 1
	 * \else
	 * 叠加到辅码流1
	 * \endif
	 */
	public boolean				bEncodeBlendExtra1;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 2
	 * \else
	 * 叠加到辅码流2
	 * \endif
	 */
	public boolean				bEncodeBlendExtra2;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 3
	 * \else
	 * 叠加到辅码流3
	 * \endif
	 */
	public boolean				bEncodeBlendExtra3;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to snap
	 * \else
	 * 叠加到抓图
	 * \endif
	 */
	public boolean				bEncodeBlendSnapshot;
	
	/**
	 * \if ENGLISH_LANG
	 * Foreground color
	 * \else
	 * 前景色
	 * \endif
	 */
	public AV_CFG_Color			stuFrontColor = new AV_CFG_Color();
	
	/**
	 * \if ENGLISH_LANG
	 * Background color 
	 * \else
	 * 背景色
	 * \endif
	 */
	public AV_CFG_Color			stuBackColor = new AV_CFG_Color();
	
	/**
	 * \if ENGLISH_LANG
	 * Zone. The coordinates value ranges from  0 to 8191. Only use left value and top value.The point (left,top) shall be the same as the point(right,bottom).
	 * \else
	 * 区域, 坐标取值0~8191, 仅使用left和top值, 点(left,top)应和(right,bottom)设置成同样的点
	 * \endif
	 */
	public AV_CFG_Rect			stuRect = new AV_CFG_Rect();
	
	/**
	 * \if ENGLISH_LANG
	 * Title contents
	 * \else
	 * 标题内容
	 * \endif
	 */
	public byte			szText[] = new byte[FinalVar.AV_CFG_Custom_Title_Len];
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to preview mode
	 * \else
	 * 叠加到预览视频
	 * \endif
	 */
	public boolean				bPreviewBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Title type "Rtinfo" real-time recorder information, "Custom" custom overlay, temperature and humidity overlay, "Title": credit information "Check" check code
	 * \else
	 * 标题类型 "Rtinfo" 实时刻录信息 "Custom" 自定义叠加、温湿度叠加 "Title" :片头信息 "Check"  校验码
	 * \endif
	 */
    public byte         szType[] = new byte[FinalVar.AV_CFG_Custom_TitleType_Len];

	/**
	 * \if ENGLISH_LANG
	 * Update the overlay content on the device side or not (used by Yuantong Express video surveillance camera OSD customization project) true: update false: do not update
	 * \else
	 * 是否需要设备端更新叠加内容（圆通速递视频监控相机OSD项目使用） true:更新  false:不更新
	 * \endif
	 */
	public boolean				bUpdate;
}
