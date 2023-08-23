/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_company_CodecSDK_ICodecSDK */

#ifndef _Included_com_company_CodecSDK_ICodecSDK
#define _Included_com_company_CodecSDK_ICodecSDK
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_company_CodecSDK_ICodecSDK
 * Method:    AACEncInit
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_com_company_CodecSDK_ICodecSDK_AACEncInit
  (JNIEnv *, jclass);

/*
 * Class:     com_company_CodecSDK_ICodecSDK
 * Method:    AACEncSetFormat
 * Signature: (Lcom/company/CodecSDK/AAC_ENC_Format;J)J
 */
JNIEXPORT jlong JNICALL Java_com_company_CodecSDK_ICodecSDK_AACEncSetFormat
  (JNIEnv *, jclass, jobject, jlong);

/*
 * Class:     com_company_CodecSDK_ICodecSDK
 * Method:    AACEncEncode
 * Signature: (JLcom/company/CodecSDK/AudioBuf;[BLjava/lang/Integer;)I
 */
JNIEXPORT jint JNICALL Java_com_company_CodecSDK_ICodecSDK_AACEncEncode
  (JNIEnv *, jclass, jlong, jobject, jbyteArray, jobject);

/*
 * Class:     com_company_CodecSDK_ICodecSDK
 * Method:    AACEncDeInit
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_company_CodecSDK_ICodecSDK_AACEncDeInit
  (JNIEnv *, jclass, jlong);

/*
 * Class:     com_company_CodecSDK_ICodecSDK
 * Method:    amrEncInit
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_com_company_CodecSDK_ICodecSDK_amrEncInit
  (JNIEnv *, jclass);

/*
 * Class:     com_company_CodecSDK_ICodecSDK
 * Method:    amrEncSetFormat
 * Signature: (JLcom/company/CodecSDK/Setformat;)I
 */
JNIEXPORT jint JNICALL Java_com_company_CodecSDK_ICodecSDK_amrEncSetFormat
  (JNIEnv *, jclass, jlong, jobject);

/*
 * Class:     com_company_CodecSDK_ICodecSDK
 * Method:    amrEncEncode
 * Signature: (JLcom/company/CodecSDK/AudioBuf;[BLjava/lang/Integer;)I
 */
JNIEXPORT jint JNICALL Java_com_company_CodecSDK_ICodecSDK_amrEncEncode
  (JNIEnv *, jclass, jlong, jobject, jbyteArray, jobject);

/*
 * Class:     com_company_CodecSDK_ICodecSDK
 * Method:    amrEncDeInit
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_company_CodecSDK_ICodecSDK_amrEncDeInit
  (JNIEnv *, jclass, jlong);

#ifdef __cplusplus
}
#endif
#endif