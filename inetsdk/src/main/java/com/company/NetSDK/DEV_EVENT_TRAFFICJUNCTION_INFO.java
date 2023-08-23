package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The describe of {@link FinalVar#EVENT_IVS_TRAFFICJUNCTION}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_TRAFFICJUNCTION} (交通路口事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFICJUNCTION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ChannelId
	 * \else
	 * 通道号
	 * \endif
	 */
	public int				nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Event name
	 * \else
	 * 事件名称
	 * \endif
	 */
	public byte				szName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 *  main driver, seat, safety belt , 1-fastened, 2-unfastened
	 * \else
	 *  主驾驶座,系安全带状态,1-系安全带,2-未系安全带
	 * \endif
	 */
	public byte					byMainSeatBelt;

	/**
	 * \if ENGLISH_LANG
	 *  co-drvier, seat, safety belt, 1-fastened, 2-unfastened
	 * \else
	 *  副驾驶座,系安全带状态,1-系安全带,2-未系安全带
	 * \endif
	 */
	public byte					bySlaveSeatBelt;

	/**
	 * \if ENGLISH_LANG
	 *  Current snapshot is head or rear, see  EM_VEHICLE_DIRECTION
	 * \else
	 *  当前被抓拍到的车辆是车头还是车尾,具体请见 EM_VEHICLE_DIRECTION
	 * \endif
	 */
	public byte					byVehicleDirection;

	/**
	 * \if ENGLISH_LANG
	 *  Open status, see EM_OPEN_STROBE_STATE
	 * \else
	 *  开闸状态,具体请见 EM_OPEN_STROBE_STATE
	 * \endif
	 */
	public byte					byOpenStrobeState;
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * 时间戳(单位是毫秒)
	 * \endif
	 */
	public double			PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * The event happen time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX		UTC = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Event ID
	 * \else
	 * 事件ID
	 * \endif
	 */
	public int				nEventID;
	
	/**
	 * \if ENGLISH_LANG
	 * Have being detected object
	 * \else
	 * 检测到的物体
	 * \endif
	 */
	public SDK_MSG_OBJECT	stuObject = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Road number
	 * \else
	 * 对应车道号
	 * \endif
	 */
	public int				nLane;
	
	/**
	 * \if ENGLISH_LANG
	 * <pre>
	 * BreakingRule's mask,first byte: crash red light; 
	 * secend byte:break the rule of driving road number; 
	 * the third byte:converse; the forth byte:break rule to turn around;
	 * the five byte:traffic jam; the six byte:traffic vacancy; 
	 * the seven byte: Overline; defalt:trafficJunction    
	 * </pre>
	 * \else
	 * <pre>
  	 * 违反规则掩码,第一位:闯红灯; 
     * 第二位:不按规定车道行驶;
     * 第三位:逆行; 第四位：违章掉头;
	 * 第五位:交通堵塞; 第六位:交通异常空闲
     * 第七位:压线行驶; 否则默认为:交通路口事件
     * </pre>
	 * \endif
	 */
	public int				dwBreakingRule;
	
	/**
	 * \if ENGLISH_LANG
	 * The begin time of red light
	 * \else
	 * 红灯开始UTC时间
	 * \endif
	 */
	public NET_TIME_EX			RedLightUTC = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Event file info
	 * \else
	 * 事件对应文件信息
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO  	stuFileInfo = new SDK_EVENT_FILE_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Snap index,such as 3,2,1,1 means the last one,0 means there has some exception and snap stop
	 * \else
	 * 表示抓拍序号，如3,2,1,1表示抓拍结束,0表示异常结束
	 * \endif
	 */
	public int                 	nSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Car's speed (km/h)
	 * \else
	 * 端车辆实际速度Km/h  
	 * \endif
	 */
	public int                 	nSpeed;
	
	/**
	 * \if ENGLISH_LANG
	 * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
	 * \else
	 * 事件动作，0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
	 * \endif
	 */
	public byte                	bEventAction;

	/**
	 * \if ENGLISH_LANG
	 *  Intersection direction 1 - denotes the forward 2 - indicates the opposite
	 * \else
	 *  路口方向,1-表示正向,2-表示反向
	 * \endif
	 */
	public byte					byDirection;

	/**
	 * \if ENGLISH_LANG
	 *  LightState means red light status:0 unknown,1 green,2 red,3 yellow
	 * \else
	 *  LightState表示红绿灯状态:0 未知,1 绿灯,2 红灯,3 黄灯
	 * \endif
	 */
	public byte					byLightState;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture no.,, within same time(second)may have multiple pictures, from 0 to
	 * \else
	 * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
	 * \endif
	 */
	public byte					byImageIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle info
	 * \else
	 * 车身信息
	 * \endif
	 */
	public SDK_MSG_OBJECT       	stuVehicle = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Flag(by bit),see {@link NET_RESERVED_COMMON}
	 * \else
	 * 抓图标志(按位)，具体见 {@link NET_RESERVED_COMMON}	
	 * \endif
	 */
    public int               	dwSnapFlagMask;
    
	/**
	 * \if ENGLISH_LANG
	 * Picture resolution
	 * \else
	 * 对应图片的分辨率
	 * \endif
	 */
	public SDK_RESOLUTION_INFO 	stuResolution = new SDK_RESOLUTION_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 报警对应的原始录像文件信息
	 * \endif
	 */
	public byte                	szRecordFile[] = new byte[FinalVar.SDK_COMMON_STRING_128];

	/**
	 * \if ENGLISH_LANG
	 *  custom info
	 * \else
	 *  自定义信息
	 * \endif
	 */
	public EVENT_JUNCTION_CUSTOM_INFO					stuCustomInfo = new EVENT_JUNCTION_CUSTOM_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  the source of plate text, 0:Local,1:Server
	 * \else
	 *  车牌识别来源, 0:本地算法识别,1:后端服务器算法识别
	 * \endif
	 */
	public byte					byPlateTextSource;

	/**
	 * \if ENGLISH_LANG
	 *  GPS info ,use in mobile DVR/NVR
	 * \else
	 *  GPS信息 车载
	 * \endif
	 */
	public NET_GPS_INFO					stuGPSInfo = new NET_GPS_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  specified the person info of none motor
	 * \else
	 *  0-无非机动车人员信息信息,1-有非机动车人员信息信息
	 * \endif
	 */
	public byte					byNoneMotorInfo;

	/**
	 * \if ENGLISH_LANG
	 *  0-unknown 1-no bag   2-bag
	 * \else
	 *  是否背包, 0-未知 1-不背包   2-背包
	 * \endif
	 */
	public byte					byBag;

	/**
	 * \if ENGLISH_LANG
	 *  0-unknown 1-no umbrella   2-Umbrella
	 * \else
	 *  是否打伞, 0-未知 1-不打伞   2-打伞
	 * \endif
	 */
	public byte					byUmbrella;

	/**
	 * \if ENGLISH_LANG
	 *  0-unknown 1-no carrierBag 2-carrierBag
	 * \else
	 *  手提包状态,0-未知 1-没有 2-有
	 * \endif
	 */
	public byte					byCarrierBag;

	/**
	 * \if ENGLISH_LANG
	 *  0-unknown 1-no helmet 2-helmet
	 * \else
	 *  是否戴帽子, 0-未知 1-不戴帽子 2-戴帽子
	 * \endif
	 */
	public byte					byHat;

	/**
	 * \if ENGLISH_LANG
	 *  0-unknown 1-no hat 2-hat
	 * \else
	 *  头盔状态,0-未知 1-没有 2-有
	 * \endif
	 */
	public byte					byHelmet;

	/**
	 * \if ENGLISH_LANG
	 *  0-unknown 1-man 2-woman
	 * \else
	 *  性别,0-未知 1-男性 2-女性
	 * \endif
	 */
	public byte					bySex;

	/**
	 * \if ENGLISH_LANG
	 *  age
	 * \else
	 *  年龄
	 * \endif
	 */
	public byte					byAge;

	/**
	 * \if ENGLISH_LANG
	 *  upper body color
	 * \else
	 *  上身颜色
	 * \endif
	 */
	public NET_COLOR_RGBA					stuUpperBodyColor = new NET_COLOR_RGBA();

	/**
	 * \if ENGLISH_LANG
	 *  lower body color
	 * \else
	 *  下身颜色
	 * \endif
	 */
	public NET_COLOR_RGBA					stuLowerBodyColor = new NET_COLOR_RGBA();

	/**
	 * \if ENGLISH_LANG
	 *  upper clothes 0:unknown 1:long sleeve 2:short sleeve 3:trousers 4:breeches 5:skirt 6:vest 7:minipants 8:miniskirt
	 * \else
	 *  上身衣服类型 0:未知 1:长袖 2:短袖 3:长裤 4:短裤 5:裙子 6:背心 7:超短裤 8:超短裙
	 * \endif
	 */
	public byte					byUpClothes;

	/**
	 * \if ENGLISH_LANG
	 *  lower clothes 0:unknown 1:long sleeve 2:short sleeve 3:trousers 4:breeches 5:skirt 6:vest 7:minipants 8:miniskirt
	 * \else
	 *  下身衣服类型 0:未知 1:长袖 2:短袖 3:长裤 4:短裤 5:裙子 6:背心 7:超短裤 8:超短裙
	 * \endif
	 */
	public byte					byDownClothes;

	/**
	 * \if ENGLISH_LANG
	 *  Extension info
	 * \else
	 *  扩展信息
	 * \endif
	 */
	public NET_EXTENSION_INFO					stuExtensionInfo = new NET_EXTENSION_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  Trigger Type:0 vehicle inspection device, 1 radar, 2 video, 3 RSU
	 * \else
	 *  TriggerType:触发类型,0车检器,1雷达,2视频,3RSU
	 * \endif
	 */
	public int					nTriggerType;

	/**
	 * \if ENGLISH_LANG
	 * Traffic vehicle info
	 * \else
	 * 交通车辆信息
	 * \endif
	 */
	public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Card quantity
	 * \else
	 * 卡片个数
	 * \endif
	 */
	public int               	dwRetCardNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * Card Info
	 * \else
	 * 卡片信息
	 * \endif
	 */
    public EVENT_CARD_INFO     	stuCardInfo[] = new EVENT_CARD_INFO[FinalVar.SDK_EVENT_MAX_CARD_NUM];

	/**
	 * \if ENGLISH_LANG
	 *  public info
	 * \else
	 *  公共信息
	 * \endif
	 */
	public EVENT_COMM_INFO					stCommInfo = new EVENT_COMM_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  Non-motor info enable
	 * \else
	 *  是否有非机动车信息
	 * \endif
	 */
	public boolean					bNonMotorInfoEx;

	/**
	 * \if ENGLISH_LANG
	 *  Non-motor information
	 * \else
	 *  非机动车信息
	 * \endif
	 */
	public VA_OBJECT_NONMOTOR					stuNonMotor = new VA_OBJECT_NONMOTOR();

	/**
	 * \if ENGLISH_LANG
	 *  intelli comm info
	 * \else
	 *  智能事件公共信息
	 * \endif
	 */
	public EVENT_INTELLI_COMM_INFO					stuIntelliCommInfo = new EVENT_INTELLI_COMM_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  Plate info, Record the plate number and color of the front and back of the car
	 * \else
	 *  车辆信息，记录了车头、车尾车牌号和车牌颜色
	 * \endif
	 */
	public EVENT_PLATE_INFO					stuPlateInfo = new EVENT_PLATE_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  Scene Image valid or invalid
	 * \else
	 *  全景图是否有效
	 * \endif
	 */
	public boolean					bSceneImage;

	/**
	 * \if ENGLISH_LANG
	 *  Scene Image
	 * \else
	 *  全景图
	 * \endif
	 */
	public SCENE_IMAGE_INFO_EX					stuSceneImage = new SCENE_IMAGE_INFO_EX();

	/**
	 * \if ENGLISH_LANG
	 *  detected objects
	 * \else
	 *  检测到的多个车牌信息
	 * \endif
	 */
	public SDK_MSG_OBJECT[]					pstObjects;

	/**
	 * \if ENGLISH_LANG
	 *  detected objects numbers
	 * \else
	 *  检测到的多个车牌个数
	 * \endif
	 */
	public int					nObjectNum;

	/**
	 * \if ENGLISH_LANG
	 *  vehicle posture
	 * \else
	 *  车辆姿势
	 * \endif
	 */
	public int					emVehiclePosture;

	/**
	 * \if ENGLISH_LANG
	 *  vehicle sign confidence(range:0~100)
	 * \else
	 *  车标置信度（范围：0~100）
	 * \endif
	 */
	public int					nVehicleSignConfidence;

	/**
	 * \if ENGLISH_LANG
	 *  vehicle category confidence(range:0~100)
	 * \else
	 *  车型置信度（范围：0~100）
	 * \endif
	 */
	public int					nVehicleCategoryConfidence;

	/**
	 * \if ENGLISH_LANG
	 * Driving direction of vehicles in the regular area
	 * \else
	 *  规则区内车辆行驶方向
	 * \endif
	 */
	public int					emCarDrivingDirection;

	/**
	 * \if ENGLISH_LANG
	 *  image information array
	 * \else
	 *  图片信息数组
	 * \endif
	 */
	public NET_IMAGE_INFO_EX2					stuImageInfo[] = new NET_IMAGE_INFO_EX2[32];

	/**
	 * \if ENGLISH_LANG
	 *  the number of image information
	 * \else
	 *  图片信息个数
	 * \endif
	 */
	public int					nImageInfoNum;

	/**
	 * \if ENGLISH_LANG
	 *  Corresponds to the snapshot serial number requested by the client
	 * \else
	 *  和客户端请求的抓图序列号对应
	 * \endif
	 */
	public byte					szSerialNo[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 *  Alarm Compliance, 0:Unknown, 1:Not Compliant, 2:Compliant
	 * \else
	 *  报警合规, 0:未知, 1:不合规, 2:合规
	 * \endif
	 */
	public int					nAlarmCompliance;

	/**
	 * \if ENGLISH_LANG
	 *  Event public extension field structure
	 * \else
	 *  事件公共扩展字段结构体
	 * \endif
	 */
	public NET_EVENT_INFO_EXTEND					stuEventInfoEx = new NET_EVENT_INFO_EXTEND();
    
    public DEV_EVENT_TRAFFICJUNCTION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_EVENT_MAX_CARD_NUM; i++) {
    		stuCardInfo[i] = new EVENT_CARD_INFO();
    	}
		for (int i = 0; i < nImageInfoNum; i++) {
			stuImageInfo[i] = new NET_IMAGE_INFO_EX2();
		}
		for (int i = 0; i < nObjectNum; i++) {
			pstObjects[i] = new SDK_MSG_OBJECT();
		}
    }
}
