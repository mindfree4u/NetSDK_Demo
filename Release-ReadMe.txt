NetSDK Android 开发包说明

1). 依赖库说明
  - 其中P2P登录功能需要依赖于 P2P 库.
  - 涉及播放（预览和回放）功能依赖于 PlaySDK 库.
  - Wifi配置，设备连接Wifi，把设备配置到网络上需要依赖于 SmartConfig 库.

  - jar包以及库的路径： NetSDK_Chn_Android\DemoSource\AndroidDemo\app\libs
  - NetSDK的jar包：     INetSDK.jar      
  - NetSDK库：	        libconfigsdk.so  libjninetsdk.so  libnetsdk.so

  - PlaySDK的jar包：    IPlaySDK.jar 
  - PlaySDK库：         libplay.so   libjniplay.so   libgnustl_shared.so   libhwdec.so

  - P2P的jar包：        libToUProxy.jar  
  - P2P库：             libToUProxy.so
			 
  - SmartConfig的jar包：SmartConfig.jar
  - SmartConfig库：     libjnismartconfig.so

  - 声波配对的jar包     audiopairsdk.jar
  - 声波配对库          libAudioPairSDK.so
			 
			 
    
2). 开发包目录说明
  - Demo目录 
    包含可安装的apk文件及demo功能快照
    
  - DemoSource目录
    包含AndroidDemo的示例源码
    
  - ProgrammingManual目录
    NetSDK库的接口说明文档
    
3). 注意事项
  - 需要额外配置模块的build.gradle文件，用于加载so文件。（gradle 版本大于0.5）
    
    在app的build.gradle的android节点下设置
    android {
        ...
        sourceSets {
            main {
                jniLibs.srcDirs = ['libs']
            }
        }
    } 
    
    
NetSDK Android Development Kit Description

1). Dependents
  - The P2P Login Module depends on the P2P library.
  - The functionality involved in playback and monitoring depend on the PlaySDK library.    
  - WifiConfig，Device connect Wifi，config device to Wifi depend on the SmartConfig library.    

  - Path of jar and library： NetSDK_Chn_Android\DemoSource\AndroidDemo\app\libs
  - NetSDK jar：           INetSDK.jar      
  - NetSDK library：	   libconfigsdk.so  libjninetsdk.so  libnetsdk.so

  - PlaySDK jar：          IPlaySDK.jar 
  - PlaySDK library：      libplay.so   libjniplay.so   libgnustl_shared.so   libhwdec.so

  - P2P jar ：             libToUProxy.jar  
  - P2P library：          libToUProxy.so
			 
  - SmartConfig jar：      SmartConfig.jar
  - SmartConfig library：  libjnismartconfig.so

  - AudioPair   jar        audiopairsdk.jar
  - AudioPair library：    libAudioPairSDK.so
    
2). The Directories
  - Demo Directory
    Includes installable apk file and Demo snapshots.
    
  - DemoSource Directory
    Includes AndroidDemo sample source code.
    
  - ProgrammingManual Directory
    Includes the documentation of INetSDK.jar
    
3). Precautions
  - Requires other configuration of the module's build.gradle to load *.so.
    In build.gradle, modify as follows:
    android {
        ...
        sourceSets {
            main {
                jniLibs.srcDirs = ['libs']
            }
        }
    } 
    