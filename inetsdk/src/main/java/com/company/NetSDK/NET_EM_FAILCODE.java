package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  error code
 * \else
 *  操作错误码
 * \endif
 */
public class NET_EM_FAILCODE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  no error
     * \else
     * 没有错误
     * \endif
     */
    public static final int NET_EM_FAILCODE_NOERROR = 0;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     * 未知错误
     * \endif
     */
    public static final int NET_EM_FAILCODE_UNKNOWN = 1;

    /**
     * \if ENGLISH_LANG
     *  invalid param
     * \else
     * 参数错误
     * \endif
     */
    public static final int NET_EM_FAILCODE_INVALID_PARAM = 2;

    /**
     * \if ENGLISH_LANG
     *  invalid password
     * \else
     * 无效密码
     * \endif
     */
    public static final int NET_EM_FAILCODE_INVALID_PASSWORD = 3;

    /**
     * \if ENGLISH_LANG
     *  invalid fingprint
     * \else
     * 无效信息数据
     * \endif
     */
    public static final int NET_EM_FAILCODE_INVALID_FP = 4;

    /**
     * \if ENGLISH_LANG
     *  invalid face date
     * \else
     * 无效人脸数据
     * \endif
     */
    public static final int NET_EM_FAILCODE_INVALID_FACE = 5;

    /**
     * \if ENGLISH_LANG
     *  invalid card date
     * \else
     * 无效卡数据
     * \endif
     */
    public static final int NET_EM_FAILCODE_INVALID_CARD = 6;

    /**
     * \if ENGLISH_LANG
     *  invalid user date
     * \else
     * 无效人数据
     * \endif
     */
    public static final int NET_EM_FAILCODE_INVALID_USER = 7;

    /**
     * \if ENGLISH_LANG
     *  get sub services failed
     * \else
     * 能力集子服务获取失败
     * \endif
     */
    public static final int NET_EM_FAILCODE_FAILED_GET_SUBSERVICE = 8;

    /**
     * \if ENGLISH_LANG
     *  get method failed
     * \else
     * 获取组件的方法集失败
     * \endif
     */
    public static final int NET_EM_FAILCODE_FAILED_GET_METHOD = 9;

    /**
     * \if ENGLISH_LANG
     *  get subcaps failed
     * \else
     * 获取资源实体能力集失败
     * \endif
     */
    public static final int NET_EM_FAILCODE_FAILED_GET_SUBCAPS = 10;

    /**
     * \if ENGLISH_LANG
     *  insert limit
     * \else
     * 已达插入上限
     * \endif
     */
    public static final int NET_EM_FAILCODE_ERROR_INSERT_LIMIT = 11;

    /**
     * \if ENGLISH_LANG
     *  max insert rate
     * \else
     * 已达最大插入速度
     * \endif
     */
    public static final int NET_EM_FAILCODE_ERROR_MAX_INSERT_RATE = 12;

    /**
     * \if ENGLISH_LANG
     *  erase fingprint date failed
     * \else
     * 清除信息数据失败
     * \endif
     */
    public static final int NET_EM_FAILCODE_FAILED_ERASE_FP = 13;

    /**
     * \if ENGLISH_LANG
     *  erase face  datefailed
     * \else
     * 清除人脸数据失败
     * \endif
     */
    public static final int NET_EM_FAILCODE_FAILED_ERASE_FACE = 14;

    /**
     * \if ENGLISH_LANG
     *  erase card date failed
     * \else
     * 清除卡数据失败
     * \endif
     */
    public static final int NET_EM_FAILCODE_FAILED_ERASE_CARD = 15;

    /**
     * \if ENGLISH_LANG
     *  no record
     * \else
     * 没有记录
     * \endif
     */
    public static final int NET_EM_FAILCODE_NO_RECORD = 16;

    /**
     * \if ENGLISH_LANG
     *  no more record
     * \else
     * 查找到最后，没有更多记录
     * \endif
     */
    public static final int NET_EM_FAILCODE_NOMORE_RECORD = 17;

    /**
     * \if ENGLISH_LANG
     *  record already
     * \else
     * 下发卡或信息时，数据重复
     * \endif
     */
    public static final int NET_EM_FAILCODE_RECORD_ALREADY_EXISTS = 18;

    /**
     * \if ENGLISH_LANG
     *  max fingprint per user
     * \else
     * 超过个人最大信息记录数
     * \endif
     */
    public static final int NET_EM_FAILCODE_MAX_FP_PERUSER = 19;

    /**
     * \if ENGLISH_LANG
     *  max card per user
     * \else
     * 超过个人最大卡片记录数
     * \endif
     */
    public static final int NET_EM_FAILCODE_MAX_CARD_PERUSER = 20;

    /**
     * \if ENGLISH_LANG
     *  exceed max picture size
     * \else
     * 超出最大照片大小
     * \endif
     */
    public static final int NET_EM_FAILCODE_EXCEED_MAX_PHOTOSIZE = 21;

    /**
     * \if ENGLISH_LANG
     *  invalid user id(not found user)
     * \else
     * 用户ID无效（未找到客户）
     * \endif
     */
    public static final int NET_EM_FAILCODE_INVALID_USERID = 22;

    /**
     * \if ENGLISH_LANG
     *  extract face feature fail
     * \else
     * 提取人脸特征失败
     * \endif
     */
    public static final int NET_EM_FAILCODE_EXTRACTFEATURE_FAIL = 23;

    /**
     * \if ENGLISH_LANG
     *  photo already exist
     * \else
     * 人脸照片已存在
     * \endif
     */
    public static final int NET_EM_FAILCODE_PHOTO_EXIST = 24;

    /**
     * \if ENGLISH_LANG
     *  exceed max photos
     * \else
     * 超出最大人脸照片数
     * \endif
     */
    public static final int NET_EM_FAILCODE_PHOTO_OVERFLOW = 25;

    /**
     * \if ENGLISH_LANG
     *  invalid photo format
     * \else
     * 照片格式无效
     * \endif
     */
    public static final int NET_EM_FAILCODE_INVALID_PHOTO_FORMAT = 26;

    /**
     * \if ENGLISH_LANG
     *  exceed administrator limit
     * \else
     * 超出管理员人数限制
     * \endif
     */
    public static final int NET_EM_FAILCODE_EXCEED_ADMINISTRATOR_LIMIT = 27;

    /**
     * \if ENGLISH_LANG
     *  Facial features already exist
     * \else
     * 人脸特征已存在
     * \endif
     */
    public static final int NET_EM_FAILECODE_FACE_FEATURE_ALREADY_EXIST = 28;

    /**
     * \if ENGLISH_LANG
     *  Fingprint already exist
     * \else
     * 信息已存在
     * \endif
     */
    public static final int NET_EM_FAILECODE_FINGERPRINT_EXIST = 29;

    /**
     * \if ENGLISH_LANG
     *  CitizenID already exist
     * \else
     * 证件号已存在
     * \endif
     */
    public static final int NET_EM_FAILECODE_CITIZENID_EXIST = 30;

    /**
     * \if ENGLISH_LANG
     *  Ordinary users do not support delivery
     * \else
     * 不支持普通用户下发
     * \endif
     */
    public static final int NET_EM_FAILECODE_NORMAL_USER_NOTSUPPORT = 31;

    /**
     * \if ENGLISH_LANG
     *  0 face targets detected in the picture
     * \else
     * 图片中检测到0个目标
     * \endif
     */
    public static final int NET_EM_FAILCODE_NO_FACE_DETECTED = 32;

    /**
     * \if ENGLISH_LANG
     *  Multiple faces are detected in the picture, and features cannot be returned
     * \else
     * 图片中检测到多个人脸，无法返回特征
     * \endif
     */
    public static final int NET_EM_FAILCODE_MULTI_FACE_DETECTED = 33;

    /**
     * \if ENGLISH_LANG
     *  Picture decoding error
     * \else
     * 图片解码错误
     * \endif
     */
    public static final int NET_EM_FAILCODE_PICTURE_DECODING_ERROR = 34;

    /**
     * \if ENGLISH_LANG
     *  Picture quality is too low
     * \else
     * 图片质量太低
     * \endif
     */
    public static final int NET_EM_FAILCODE_LOW_PICTURE_QUALITY = 35;

    /**
     * \if ENGLISH_LANG
     *  The result is not recommended, for example: for foreigners, the feature extraction is successful, but the algorithm support is not good, and it is easy to cause misidentification
     * \else
     * 结果不推荐使用，比如：对外国人，特征提取成功，但算法支持不好，容易造成误识别
     * \endif
     */
    public static final int NET_EM_FAILCODE_NOT_RECOMMENDED = 36;

    /**
     * \if ENGLISH_LANG
     *  The face angle exceeds the configured threshold
     * \else
     * 人脸角度超过配置阈值
     * \endif
     */
    public static final int NET_EM_FAILCODE_FACE_ANGLE_OVER_THRESHOLDS = 37;

    /**
     * \if ENGLISH_LANG
     *  The proportion of the face is out of range, the algorithm recommends the proportion: no more than 2/3; no less than 1/3
     * \else
     * 人脸占比超出范围，算法建议占比:不要超过2/3;不要小于1/3
     * \endif
     */
    public static final int NET_EM_FAILCODE_FACE_RADIO_EXCEEDS_RANGE = 38;

    /**
     * \if ENGLISH_LANG
     *  Overburdened face
     * \else
     * 人脸过爆
     * \endif
     */
    public static final int NET_EM_FAILCODE_FACE_OVER_EXPOSED = 39;

    /**
     * \if ENGLISH_LANG
     *  Face undershot
     * \else
     * 人脸欠爆
     * \endif
     */
    public static final int NET_EM_FAILCODE_FACE_UNDER_EXPOSED = 40;

    /**
     * \if ENGLISH_LANG
     *  Unbalanced face brightness, used to judge yin and yang faces
     * \else
     * 人脸亮度不均衡 ,用于判断阴阳脸
     * \endif
     */
    public static final int NET_EM_FAILCODE_BRIGHTNESS_IMBALANCE = 41;

    /**
     * \if ENGLISH_LANG
     *  Facial confidence is low
     * \else
     * 人脸的置信度低
     * \endif
     */
    public static final int NET_EM_FAILCODE_FACE_LOWER_CONFIDENCE = 42;

    /**
     * \if ENGLISH_LANG
     *  Low face alignment score
     * \else
     * 人脸对齐分数低
     * \endif
     */
    public static final int NET_EM_FAILCODE_FACE_LOW_ALIGN = 43;

    /**
     * \if ENGLISH_LANG
     *  The face is blocked or incomplete
     * \else
     * 人脸存在遮挡、残缺不全
     * \endif
     */
    public static final int NET_EM_FAILCODE_FRAGMENTARY_FACE_DETECTED = 44;

    /**
     * \if ENGLISH_LANG
     *  Face pupil distance is less than the threshold
     * \else
     * 人脸瞳距小于阈值
     * \endif
     */
    public static final int NET_EM_FAILCODE_PUPIL_DISTANCE_NOT_ENOUGH = 45;

    /**
     * \if ENGLISH_LANG
     *  Face data download failed
     * \else
     * 人脸数据下载失败
     * \endif
     */
    public static final int NET_EM_FAILCODE_FACE_DATA_DOWNLOAD_FAILED = 46;

    /**
     * \if ENGLISH_LANG
     *  The face can be detected, but the feature value extraction fails (algorithm scene)
     * \else
     * 人脸可检测，但特征值提取失败（算法场景）
     * \endif
     */
    public static final int NET_EM_FAILCODE_FACE_FFE_FAILED = 47;

    /**
     * \if ENGLISH_LANG
     *  The feature value extracted from the face photo is incorrect due to the inconsistency of face attributes such as masks, hats, sunglasses, etc.
     * \else
     * 人脸照片因口罩，帽子，墨镜等人脸属性不符合而提取特征值错误
     * \endif
     */
    public static final int NET_EM_FAILCODE_PHOTO_FEATURE_FAILED_FOR_FA = 48;

    /**
     * \if ENGLISH_LANG
     *  Incomplete face photo
     * \else
     * 人脸照片不完整
     * \endif
     */
    public static final int NET_EM_FAILCODE_FACE_DATA_PHOTO_INCOMPLETE = 49;

    /**
     * \if ENGLISH_LANG
     *  Database error insert overflow
     * \else
     * 	数据库插入越上限
     * \endif
     */
    public static final int NET_EM_FAILCODE_DATABASE_ERROR_INSERT_OVERFLOW = 50;

}
