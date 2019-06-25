// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: taochees.proto

package TaocheES;

public interface DTOCarInfoIndexFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TaocheES.DTOCarInfoIndexField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *  车源ID
   * </pre>
   *
   * <code>int32 ucarid = 1;</code>
   */
  int getUcarid();

  /**
   * <pre>
   *  车源编号
   * </pre>
   *
   * <code>string ucarserialnumber = 2;</code>
   */
  java.lang.String getUcarserialnumber();
  /**
   * <pre>
   *  车源编号
   * </pre>
   *
   * <code>string ucarserialnumber = 2;</code>
   */
  com.google.protobuf.ByteString
      getUcarserialnumberBytes();

  /**
   * <pre>
   *  车源状态
   * </pre>
   *
   * <code>int32 ucarstatus = 3;</code>
   */
  int getUcarstatus();

  /**
   * <pre>
   *  车源所在地省份
   * </pre>
   *
   * <code>int32 carproviceid = 4;</code>
   */
  int getCarproviceid();

  /**
   * <pre>
   *  车源所在城市
   * </pre>
   *
   * <code>int32 carcityid = 5;</code>
   */
  int getCarcityid();

  /**
   * <pre>
   *  车源颜色
   * </pre>
   *
   * <code>string color = 6;</code>
   */
  java.lang.String getColor();
  /**
   * <pre>
   *  车源颜色
   * </pre>
   *
   * <code>string color = 6;</code>
   */
  com.google.protobuf.ByteString
      getColorBytes();

  /**
   * <pre>
   *  行驶里程(单位：公里)
   * </pre>
   *
   * <code>int32 drivingmileage = 7;</code>
   */
  int getDrivingmileage();

  /**
   * <pre>
   *  资料完整度
   * </pre>
   *
   * <code>int32 completerate = 8;</code>
   */
  int getCompleterate();

  /**
   * <pre>
   *  车辆来源1级分类(1: 个人 2：商家)
   * </pre>
   *
   * <code>int32 carsource1l = 9;</code>
   */
  int getCarsource1L();

  /**
   * <pre>
   *  是否视频车源(-2视频删除, -1视频不合格, 0无视频, 1为待审核, 2视频合格 )
   * </pre>
   *
   * <code>int32 isvideo = 10;</code>
   */
  int getIsvideo();

  /**
   * <pre>
   *  首图是否确认合格
   * </pre>
   *
   * <code>int32 firstpictrue = 11;</code>
   */
  int getFirstpictrue();

  /**
   * <pre>
   *  车辆用途(用途 0:非营运;1:营运;2:营转非;3:租赁;)
   * </pre>
   *
   * <code>int32 cartype = 12;</code>
   */
  int getCartype();

  /**
   * <pre>
   *  商家车源是否可跨区(1是不可跨区 2是可跨区)
   * </pre>
   *
   * <code>int32 source = 13;</code>
   */
  int getSource();

  /**
   * <pre>
   *  车源审核状态：0为未审核；1为已审核；2为待复审；
   * </pre>
   *
   * <code>int32 isneglect = 14;</code>
   */
  int getIsneglect();

  /**
   * <pre>
   *  是否有图：1为有图；0为无图 
   * </pre>
   *
   * <code>int32 picturecount = 15;</code>
   */
  int getPicturecount();

  /**
   * <pre>
   *  图片数量
   * </pre>
   *
   * <code>int32 picturenumber = 16;</code>
   */
  int getPicturenumber();

  /**
   * <pre>
   *  显示价格(单位：万元)
   * </pre>
   *
   * <code>double displayprice = 17;</code>
   */
  double getDisplayprice();

  /**
   * <pre>
   *  状态更改时间
   * </pre>
   *
   * <code>string statusmodifytime = 18;</code>
   */
  java.lang.String getStatusmodifytime();
  /**
   * <pre>
   *  状态更改时间
   * </pre>
   *
   * <code>string statusmodifytime = 18;</code>
   */
  com.google.protobuf.ByteString
      getStatusmodifytimeBytes();

  /**
   * <pre>
   *  创建时间
   * </pre>
   *
   * <code>string createtime = 19;</code>
   */
  java.lang.String getCreatetime();
  /**
   * <pre>
   *  创建时间
   * </pre>
   *
   * <code>string createtime = 19;</code>
   */
  com.google.protobuf.ByteString
      getCreatetimeBytes();

  /**
   * <pre>
   *  原始购车日期
   * </pre>
   *
   * <code>string buycardate = 20;</code>
   */
  java.lang.String getBuycardate();
  /**
   * <pre>
   *  原始购车日期
   * </pre>
   *
   * <code>string buycardate = 20;</code>
   */
  com.google.protobuf.ByteString
      getBuycardateBytes();

  /**
   * <pre>
   *  车辆发布时间
   * </pre>
   *
   * <code>string carpublishtime = 21;</code>
   */
  java.lang.String getCarpublishtime();
  /**
   * <pre>
   *  车辆发布时间
   * </pre>
   *
   * <code>string carpublishtime = 21;</code>
   */
  com.google.protobuf.ByteString
      getCarpublishtimeBytes();

  /**
   * <pre>
   *  车源首图
   * </pre>
   *
   * <code>string ucarpicwholepath = 22;</code>
   */
  java.lang.String getUcarpicwholepath();
  /**
   * <pre>
   *  车源首图
   * </pre>
   *
   * <code>string ucarpicwholepath = 22;</code>
   */
  com.google.protobuf.ByteString
      getUcarpicwholepathBytes();

  /**
   * <pre>
   *  是否是商家推荐车源
   * </pre>
   *
   * <code>int32 isdealerrecommend = 23;</code>
   */
  int getIsdealerrecommend();

  /**
   * <pre>
   *  是否是厂商认证车
   * </pre>
   *
   * <code>int32 isauthenticated = 24;</code>
   */
  int getIsauthenticated();

  /**
   * <pre>
   *  是否豪车
   * </pre>
   *
   * <code>int32 isrecommendgl = 25;</code>
   */
  int getIsrecommendgl();

  /**
   * <pre>
   *  是否自有车源
   * </pre>
   *
   * <code>int32 isowncar = 26;</code>
   */
  int getIsowncar();

  /**
   * <pre>
   *  车源评估价-精真估,用于计算车源权重（价格合理度）
   * </pre>
   *
   * <code>double c2bprice = 27;</code>
   */
  double getC2Bprice();

  /**
   * <pre>
   *  是否置顶车源 1为是，0或空为否
   * </pre>
   *
   * <code>int32 istop = 28;</code>
   */
  int getIstop();

  /**
   * <pre>
   *  车况描述
   * </pre>
   *
   * <code>string statedescription = 29;</code>
   */
  java.lang.String getStatedescription();
  /**
   * <pre>
   *  车况描述
   * </pre>
   *
   * <code>string statedescription = 29;</code>
   */
  com.google.protobuf.ByteString
      getStatedescriptionBytes();

  /**
   * <pre>
   *  是否保障车
   * </pre>
   *
   * <code>int32 iswarranty = 30;</code>
   */
  int getIswarranty();

  /**
   * <pre>
   *  保障服务类型
   * </pre>
   *
   * <code>string warrantytypes = 31;</code>
   */
  java.lang.String getWarrantytypes();
  /**
   * <pre>
   *  保障服务类型
   * </pre>
   *
   * <code>string warrantytypes = 31;</code>
   */
  com.google.protobuf.ByteString
      getWarrantytypesBytes();

  /**
   * <pre>
   *  是否显示维保记录
   * </pre>
   *
   * <code>int32 isshowmr = 32;</code>
   */
  int getIsshowmr();

  /**
   * <pre>
   *  车源所在省份名称
   * </pre>
   *
   * <code>string carprovincename = 33;</code>
   */
  java.lang.String getCarprovincename();
  /**
   * <pre>
   *  车源所在省份名称
   * </pre>
   *
   * <code>string carprovincename = 33;</code>
   */
  com.google.protobuf.ByteString
      getCarprovincenameBytes();

  /**
   * <pre>
   *  车源所在城市名称
   * </pre>
   *
   * <code>string carcityname = 34;</code>
   */
  java.lang.String getCarcityname();
  /**
   * <pre>
   *  车源所在城市名称
   * </pre>
   *
   * <code>string carcityname = 34;</code>
   */
  com.google.protobuf.ByteString
      getCarcitynameBytes();

  /**
   * <pre>
   *  车源所在区县ID
   * </pre>
   *
   * <code>int32 cardistrictid = 35;</code>
   */
  int getCardistrictid();

  /**
   * <pre>
   *  车车源所在区县名称
   * </pre>
   *
   * <code>string cardistrictname = 36;</code>
   */
  java.lang.String getCardistrictname();
  /**
   * <pre>
   *  车车源所在区县名称
   * </pre>
   *
   * <code>string cardistrictname = 36;</code>
   */
  com.google.protobuf.ByteString
      getCardistrictnameBytes();

  /**
   * <pre>
   *  广告语（商家推荐）
   * </pre>
   *
   * <code>string slogan = 37;</code>
   */
  java.lang.String getSlogan();
  /**
   * <pre>
   *  广告语（商家推荐）
   * </pre>
   *
   * <code>string slogan = 37;</code>
   */
  com.google.protobuf.ByteString
      getSloganBytes();

  /**
   * <pre>
   *  B2B串车价格：20160331
   * </pre>
   *
   * <code>double b2bprice = 38;</code>
   */
  double getB2Bprice();

  /**
   * <pre>
   *  isb2b
   * </pre>
   *
   * <code>int32 isb2b = 39;</code>
   */
  int getIsb2B();

  /**
   * <pre>
   *  主品牌Id
   * </pre>
   *
   * <code>int32 mainbrandid = 40;</code>
   */
  int getMainbrandid();

  /**
   * <pre>
   *  所属品牌Id
   * </pre>
   *
   * <code>int32 producerid = 41;</code>
   */
  int getProducerid();

  /**
   * <pre>
   *  品牌所属国籍
   * </pre>
   *
   * <code>string country = 42;</code>
   */
  java.lang.String getCountry();
  /**
   * <pre>
   *  品牌所属国籍
   * </pre>
   *
   * <code>string country = 42;</code>
   */
  com.google.protobuf.ByteString
      getCountryBytes();

  /**
   * <pre>
   *  说明:车系ID
   * </pre>
   *
   * <code>int32 brandid = 43;</code>
   */
  int getBrandid();

  /**
   * <pre>
   *  车辆类型（级别）
   * </pre>
   *
   * <code>string carlevel = 44;</code>
   */
  java.lang.String getCarlevel();
  /**
   * <pre>
   *  车辆类型（级别）
   * </pre>
   *
   * <code>string carlevel = 44;</code>
   */
  com.google.protobuf.ByteString
      getCarlevelBytes();

  /**
   * <pre>
   *  车辆类型（级别）枚举值
   * </pre>
   *
   * <code>int32 carlevelvalue = 45;</code>
   */
  int getCarlevelvalue();

  /**
   * <pre>
   *  车型ID
   * </pre>
   *
   * <code>int64 carid = 46;</code>
   */
  long getCarid();

  /**
   * <pre>
   * 变速箱类型
   * </pre>
   *
   * <code>int32 gearboxtype = 47;</code>
   */
  int getGearboxtype();

  /**
   * <pre>
   *  搜索无效，仅用于创建索引
   * </pre>
   *
   * <code>string gearboxtypestring = 48;</code>
   */
  java.lang.String getGearboxtypestring();
  /**
   * <pre>
   *  搜索无效，仅用于创建索引
   * </pre>
   *
   * <code>string gearboxtypestring = 48;</code>
   */
  com.google.protobuf.ByteString
      getGearboxtypestringBytes();

  /**
   * <pre>
   *  排气量数值
   * </pre>
   *
   * <code>double exhaustvalue = 49;</code>
   */
  double getExhaustvalue();

  /**
   * <pre>
   *  车型年款的年份
   * </pre>
   *
   * <code>int32 caryear = 50;</code>
   */
  int getCaryear();

  /**
   * <pre>
   *  新车厂商指导价(单位：万元)
   * </pre>
   *
   * <code>double carreferprice = 51;</code>
   */
  double getCarreferprice();

  /**
   * <pre>
   *  排放标准：{ "国2", "国3", "国4", "国5", "欧3", "欧4", "欧5", "京5", "OBD" }
   * </pre>
   *
   * <code>string envirstandard = 52;</code>
   */
  java.lang.String getEnvirstandard();
  /**
   * <pre>
   *  排放标准：{ "国2", "国3", "国4", "国5", "欧3", "欧4", "欧5", "京5", "OBD" }
   * </pre>
   *
   * <code>string envirstandard = 52;</code>
   */
  com.google.protobuf.ByteString
      getEnvirstandardBytes();

  /**
   * <pre>
   *  综合工况油耗
   * </pre>
   *
   * <code>double consumption = 53;</code>
   */
  double getConsumption();

  /**
   * <pre>
   *  能源类型：柴油、CNG、待查、油气混合动力、NULL、汽油、LPG、油电混合动力、电力
   * </pre>
   *
   * <code>int32 oiltype = 54;</code>
   */
  int getOiltype();

  /**
   * <pre>
   *  发动机位置 中置、待查、NULL、前置、后置
   * </pre>
   *
   * <code>int32 enginelocation = 55;</code>
   */
  int getEnginelocation();

  /**
   * <pre>
   *  车门数
   * </pre>
   *
   * <code>int32 bodydoors = 56;</code>
   */
  int getBodydoors();

  /**
   * <pre>
   *  最少座位数
   * </pre>
   *
   * <code>int32 seatnummin = 57;</code>
   */
  int getSeatnummin();

  /**
   * <pre>
   *  最多座位数
   * </pre>
   *
   * <code>int32 seatnummax = 58;</code>
   */
  int getSeatnummax();

  /**
   * <pre>
   *  是否旅行版
   * </pre>
   *
   * <code>int32 iswagon = 59;</code>
   */
  int getIswagon();

  /**
   * <pre>
   *  驱动方式 -1 待查 0前轮驱动 1 后轮驱动 2 全时四驱 3 分时四驱4适时四驱
   * </pre>
   *
   * <code>int32 drivetype = 60;</code>
   */
  int getDrivetype();

  /**
   * <pre>
   *  是否中介商家
   * </pre>
   *
   * <code>int32 isagency = 61;</code>
   */
  int getIsagency();

  /**
   * <pre>
   *  车系--车身形式 待查 = -1,两厢轿车 = 0,三厢轿车 = 1,Wagon旅行车 = 2,Pickup皮卡 = 3,MPV = 4,Cross混型车 = 5,跑车 = 6,MicroBus厢式车 = 7,SUV = 8,其他 = 9
   * </pre>
   *
   * <code>int32 csbodyform = 62;</code>
   */
  int getCsbodyform();

  /**
   * <pre>
   *  品牌属性：自主、合资、进口       
   * </pre>
   *
   * <code>int32 brandattr = 63;</code>
   */
  int getBrandattr();

  /**
   * <pre>
   *  是否屏蔽商家：针对虚假商家，做特殊处理，车源不下架，但是不显示在车源列表页   
   * </pre>
   *
   * <code>int32 ismarkingvendor = 64;</code>
   */
  int getIsmarkingvendor();

  /**
   * <pre>
   *  国别的value值（CountryEnum），用于快速检索      
   * </pre>
   *
   * <code>int32 countryvalue = 65;</code>
   */
  int getCountryvalue();

  /**
   * <pre>
   *  [商家车源]经销商ID|[个人车源]注册用户ID&lt;/para&gt;              
   * </pre>
   *
   * <code>int32 userid = 66;</code>
   */
  int getUserid();

  /**
   * <pre>
   *  [商家车源]经销商分类ID（上级公司ID，即厂商ID）&lt;/para&gt;        
   * </pre>
   *
   * <code>int32 superiorid = 67;</code>
   */
  int getSuperiorid();

  /**
   * <pre>
   *  [商家车源]经销商简称&lt;/para&gt;      
   * </pre>
   *
   * <code>string vendorname = 68;</code>
   */
  java.lang.String getVendorname();
  /**
   * <pre>
   *  [商家车源]经销商简称&lt;/para&gt;      
   * </pre>
   *
   * <code>string vendorname = 68;</code>
   */
  com.google.protobuf.ByteString
      getVendornameBytes();

  /**
   * <pre>
   *  [商家车源]经销商类型         
   * </pre>
   *
   * <code>int32 vendortype = 69;</code>
   */
  int getVendortype();

  /**
   * <pre>
   *  联系电话         
   * </pre>
   *
   * <code>string contact = 70;</code>
   */
  java.lang.String getContact();
  /**
   * <pre>
   *  联系电话         
   * </pre>
   *
   * <code>string contact = 70;</code>
   */
  com.google.protobuf.ByteString
      getContactBytes();

  /**
   * <pre>
   *  是否是京东招商商家        
   * </pre>
   *
   * <code>int32 isjdvendor = 71;</code>
   */
  int getIsjdvendor();

  /**
   * <pre>
   *  是否包含过户费：1为含过户费；0为不含过户费   
   * </pre>
   *
   * <code>int32 isinctransfer = 72;</code>
   */
  int getIsinctransfer();

  /**
   * <pre>
   *  车辆来源
   * </pre>
   *
   * <code>int32 usertype = 73;</code>
   */
  int getUsertype();

  /**
   * <pre>
   *  是否参加特定活动的车源：20151015:2015年双十一活动201604:2016年66购车节活动
   * </pre>
   *
   * <code>int32 isactivity = 74;</code>
   */
  int getIsactivity();

  /**
   * <pre>
   *  会员版本：0为免费版；10为付费版；20为试用版
   * </pre>
   *
   * <code>int32 membertype = 75;</code>
   */
  int getMembertype();

  /**
   * <pre>
   *  是否帮买车源：1为是，0为否  2015-12-07
   * </pre>
   *
   * <code>int32 isbangmai = 76;</code>
   */
  int getIsbangmai();

  /**
   * <pre>
   *  是否有资质：1为是，0为否  2016-02-17
   * </pre>
   *
   * <code>int32 dvqflag = 77;</code>
   */
  int getDvqflag();

  /**
   * <pre>
   *  是否参加帮买车app车源：1为是，0为否  2016-02-17
   * </pre>
   *
   * <code>int32 isbangmaiche = 78;</code>
   */
  int getIsbangmaiche();

  /**
   * <pre>
   *  百度地图坐标点，冗余，用于返回值
   * </pre>
   *
   * <code>string baidumap = 79;</code>
   */
  java.lang.String getBaidumap();
  /**
   * <pre>
   *  百度地图坐标点，冗余，用于返回值
   * </pre>
   *
   * <code>string baidumap = 79;</code>
   */
  com.google.protobuf.ByteString
      getBaidumapBytes();

  /**
   * <pre>
   *  距离值，适用于地理位置检索和排序  2016-03-25
   * </pre>
   *
   * <code>double distance = 80;</code>
   */
  double getDistance();

  /**
   * <pre>
   *  第一联系人名称
   * </pre>
   *
   * <code>string linkman = 81;</code>
   */
  java.lang.String getLinkman();
  /**
   * <pre>
   *  第一联系人名称
   * </pre>
   *
   * <code>string linkman = 81;</code>
   */
  com.google.protobuf.ByteString
      getLinkmanBytes();

  /**
   * <pre>
   *  车型配置
   * </pre>
   *
   * <code>string cartypeconfig = 82;</code>
   */
  java.lang.String getCartypeconfig();
  /**
   * <pre>
   *  车型配置
   * </pre>
   *
   * <code>string cartypeconfig = 82;</code>
   */
  com.google.protobuf.ByteString
      getCartypeconfigBytes();

  /**
   * <pre>
   *  车源数据来源(1 58二手车，2 车168，351汽车，4 第一车网，5 淘车网)
   * </pre>
   *
   * <code>int32 siteid = 83;</code>
   */
  int getSiteid();

  /**
   * <pre>
   *  车源标题
   * </pre>
   *
   * <code>string cartitle = 84;</code>
   */
  java.lang.String getCartitle();
  /**
   * <pre>
   *  车源标题
   * </pre>
   *
   * <code>string cartitle = 84;</code>
   */
  com.google.protobuf.ByteString
      getCartitleBytes();

  /**
   * <pre>
   *车辆二级级别(Car_Serial.ModelLevelSecond)
   * </pre>
   *
   * <code>int32 carlevelsecond = 85;</code>
   */
  int getCarlevelsecond();

  /**
   * <pre>
   *是否显示json车检报告  2016-07-07
   * </pre>
   *
   * <code>int32 ischeckreportjson = 86;</code>
   */
  int getIscheckreportjson();

  /**
   * <pre>
   *  车源7天内点击量：20160429
   * </pre>
   *
   * <code>int64 clickcount = 87;</code>
   */
  long getClickcount();

  /**
   * <pre>
   *客户编号：2016-09-30
   * </pre>
   *
   * <code>int32 crmcustomerid = 88;</code>
   */
  int getCrmcustomerid();

  /**
   * <pre>
   *  车源基本权重
   * </pre>
   *
   * <code>double boost = 89;</code>
   */
  double getBoost();

  /**
   * <pre>
   *  可控资源权重，即各车源区块、对外推广等
   * </pre>
   *
   * <code>double boostc = 90;</code>
   */
  double getBoostc();

  /**
   * <pre>
   *  app权重，实时评分机制
   * </pre>
   *
   * <code>double boostapp = 91;</code>
   */
  double getBoostapp();

  /**
   * <pre>
   *得分
   * </pre>
   *
   * <code>double score = 92;</code>
   */
  double getScore();

  /**
   * <pre>
   *成本比值=经销商千次币成本/城市平均千次币成本
   * </pre>
   *
   * <code>double costrate = 93;</code>
   */
  double getCostrate();

  /**
   * <pre>
   *索引ID
   * </pre>
   *
   * <code>int32 id = 94;</code>
   */
  int getId();

  /**
   * <pre>
   *是否CPC车源
   * </pre>
   *
   * <code>int32 iscpc = 95;</code>
   */
  int getIscpc();

  /**
   * <pre>
   *会员本季度电话量平均差值系数
   * </pre>
   *
   * <code>double callnodeviationrate = 96;</code>
   */
  double getCallnodeviationrate();

  /**
   * <pre>
   *车源超值系数【车源售价/(新车指导价+购置税)】
   * </pre>
   *
   * <code>double carbenefitrate = 97;</code>
   */
  double getCarbenefitrate();

  /**
   * <pre>
   *经销商近7天接通率 2017-03-30
   * </pre>
   *
   * <code>double callconnectrate = 98;</code>
   */
  double getCallconnectrate();

  /**
   * <pre>
   *VIN码 2017-03-30
   * </pre>
   *
   * <code>string vincode = 99;</code>
   */
  java.lang.String getVincode();
  /**
   * <pre>
   *VIN码 2017-03-30
   * </pre>
   *
   * <code>string vincode = 99;</code>
   */
  com.google.protobuf.ByteString
      getVincodeBytes();

  /**
   * <pre>
   *历史价格 2017-03-30
   * </pre>
   *
   * <code>double lastprice = 100;</code>
   */
  double getLastprice();

  /**
   * <pre>
   *上次价格修改时间 2017-03-30
   * </pre>
   *
   * <code>string pricechangetime = 101;</code>
   */
  java.lang.String getPricechangetime();
  /**
   * <pre>
   *上次价格修改时间 2017-03-30
   * </pre>
   *
   * <code>string pricechangetime = 101;</code>
   */
  com.google.protobuf.ByteString
      getPricechangetimeBytes();

  /**
   * <pre>
   *车牌所在城市 2017-04-10
   * </pre>
   *
   * <code>int32 licensecityid = 102;</code>
   */
  int getLicensecityid();

  /**
   * <pre>
   *车牌所在省份 2017-04-10
   * </pre>
   *
   * <code>int32 licenseproviceid = 103;</code>
   */
  int getLicenseproviceid();

  /**
   * <pre>
   *是否上牌 2017-04-11
   * </pre>
   *
   * <code>int32 islicensed = 104;</code>
   */
  int getIslicensed();

  /**
   * <pre>
   *是否淘车认证车 2017-07-26
   * </pre>
   *
   * <code>int32 isdealerauthorized = 105;</code>
   */
  int getIsdealerauthorized();

  /**
   * <pre>
   *贷款首付额 2017-07-26
   * </pre>
   *
   * <code>double loanfirstpay = 106;</code>
   */
  double getLoanfirstpay();

  /**
   * <pre>
   *贷款日还款额 2017-07-26
   * </pre>
   *
   * <code>double loandailypay = 107;</code>
   */
  double getLoandailypay();

  /**
   * <pre>
   *贷款月还款额 2017-07-26
   * </pre>
   *
   * <code>double loanmonthpay = 108;</code>
   */
  double getLoanmonthpay();

  /**
   * <pre>
   *保险有效期 2017-11-29
   * </pre>
   *
   * <code>string insuranceexpiredate = 109;</code>
   */
  java.lang.String getInsuranceexpiredate();
  /**
   * <pre>
   *保险有效期 2017-11-29
   * </pre>
   *
   * <code>string insuranceexpiredate = 109;</code>
   */
  com.google.protobuf.ByteString
      getInsuranceexpiredateBytes();

  /**
   * <pre>
   *  保障服务类型明细
   * </pre>
   *
   * <code>int32 warrantytypes_1 = 201;</code>
   */
  int getWarrantytypes1();

  /**
   * <pre>
   *  保障服务类型明细
   * </pre>
   *
   * <code>int32 warrantytypes_2 = 202;</code>
   */
  int getWarrantytypes2();

  /**
   * <pre>
   *  保障服务类型明细
   * </pre>
   *
   * <code>int32 warrantytypes_3 = 203;</code>
   */
  int getWarrantytypes3();

  /**
   * <pre>
   *  环保标准明细
   * </pre>
   *
   * <code>int32 envirstandard_1 = 204;</code>
   */
  int getEnvirstandard1();

  /**
   * <pre>
   *  环保标准明细
   * </pre>
   *
   * <code>int32 envirstandard_2 = 205;</code>
   */
  int getEnvirstandard2();

  /**
   * <pre>
   *  环保标准明细
   * </pre>
   *
   * <code>int32 envirstandard_3 = 206;</code>
   */
  int getEnvirstandard3();

  /**
   * <pre>
   *  环保标准明细
   * </pre>
   *
   * <code>int32 envirstandard_4 = 207;</code>
   */
  int getEnvirstandard4();

  /**
   * <pre>
   *  环保标准明细
   * </pre>
   *
   * <code>int32 envirstandard_5 = 208;</code>
   */
  int getEnvirstandard5();

  /**
   * <pre>
   *  环保标准明细
   * </pre>
   *
   * <code>int32 envirstandard_6 = 209;</code>
   */
  int getEnvirstandard6();

  /**
   * <pre>
   *  环保标准明细
   * </pre>
   *
   * <code>int32 envirstandard_7 = 210;</code>
   */
  int getEnvirstandard7();

  /**
   * <pre>
   *  环保标准明细
   * </pre>
   *
   * <code>int32 envirstandard_8 = 211;</code>
   */
  int getEnvirstandard8();

  /**
   * <pre>
   *  环保标准明细
   * </pre>
   *
   * <code>int32 envirstandard_9 = 212;</code>
   */
  int getEnvirstandard9();

  /**
   * <pre>
   *  进气方式（-1：待查；0：自然吸气；1：涡轮增压；2：机械增压；3：双增压）
   * </pre>
   *
   * <code>int32 inhaletype = 213;</code>
   */
  int getInhaletype();

  /**
   * <pre>
   *  新车源权重，评分机制
   * </pre>
   *
   * <code>double boostnew = 214;</code>
   */
  double getBoostnew();

  /**
   * <pre>
   *  本地推荐显示位置 2018-08-23
   * </pre>
   *
   * <code>int32 showposition = 215;</code>
   */
  int getShowposition();
}