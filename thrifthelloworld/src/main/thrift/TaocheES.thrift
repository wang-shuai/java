namespace java Taoche.ES


struct SearchQuestionCondition{
	101: i32 CommonFlag	#全局标识位
	102: i32 RequestSource	#访问来源
	103: list<string> ReturnFieldArray	#[必填]返回结果集字段,如果不填寫默認只返回 id.
	104: list<string> OrderByFieldArray	#排序字段(与 IsDESC 同时使用)
	105: list<bool> OrderByIsDESCArray	#是否倒序 true desc, false asc ;(与 OrderByFieldArray 同时使用)
	106: i32 SortBoostFlag	#排序标识：0为常规
	107: i32 PageSize	#页大小，即需要返回的数据记录条数
	108: i32 PageIndex	#当前页码，最大值为500
	109: bool IsHightLight	#是否高亮显示
	112: bool IsCountSearch	#是否只返回符合条件的记录条数，不返回具体数据
	113: string RequestParametersLog #是否返回请求日志：get为返回日志
	114: list<AggrCondition> AggrFieldList	#切面聚合检索条件 
	1: list<i32> QoIdArray	#问题ID检索数组
	2: list<i32> NoQoIdArray	#排除问题ID数组
	3: string KeyWord	#检索关键词
	4: string Title		#标题检索
	5: string Body		#提问内容检索
	6: string ReplyBody	#最佳答案检索
	7: list<string> TagsArray	#标签检索
	8: list<i32> MainBrandIdArray	#主品牌ID数组
	9: list<i32> BrandIdArray		#车系ID数组
	10: list<string> CategoriesArray	#问题分类数组
	11: list<string> CategoriesGroupArray	#问题分类分组检索
	12: list<i32> AreaIdArray		#地区城市ID等值检索

	13: i32 MaxReplyCount	#最大回复数:小于等于N检索

	14: i32 MinReplyCount	#最小回复数:大于等于N检索
	15: i32 MinViewCount	#最小浏览数：大于等于N检索
	16: i32 MaxViewCount	#最大浏览数：小于等于N检索
	17: list<i32> ProvinceIdArray	#省份ID数组
	18: list<i32> CityIdArray		#城市Id数组
	19: list<i32> IsSolveArray	#问题解决状态检索 isSolve(0：未解决，1：已解决(有最佳答案)，2：已关闭)
	51: list<string> CutLengthFieldNameArray		#截取字段名数组(要截取的字段名)(与CutLengthFieldValueArray成对出现)
	52: list<i32> CutLengthFieldValueArray	#截取字段长度数组(要截取的字段长度设置)(与CutLengthFieldNameArray 成对出现)
}

struct SearchCondition {   #  车源检索条件实体
	101: i32 CommonFlag	#全局标识位
	102: i32 RequestSource	#访问来源
	103: list<string> ReturnFieldArray	#[必填]返回结果集字段,如果不填寫默認只返回 id.
	104: list<string> OrderByFieldArray	#排序字段(与 IsDESC 同时使用)
	105: list<bool> OrderByIsDESCArray	#是否倒序 true desc, false asc ;(与 OrderByFieldArray 同时使用)
	106: i32 SortBoostFlag	#排序标识：0为常规；1为以boostapp为基础权重，刷新时间权重衰减(Groovy脚本方式)；2为boostapp为基础权重，刷新时间衰减（jar包方式）
	107: i32 PageSize	#页大小，即需要返回的数据记录条数
	108: i32 PageIndex	#当前页码，最大值为500
	110: double DistanceKm	#距离检索：20151201
	111: string Location	#当前坐标点，用于按距离筛选或排序：----20151201  数据格式：X,Y，示例：112.124,332.22
	112: bool IsCountSearch	#是否只返回符合条件的记录条数，不返回具体数据
	113: string RequestParametersLog #是否返回请求日志：get为返回日志
	114: list<AggrCondition> AggrFieldList	#切面聚合检索条件

    1: list<i32> UcarIdArray	#包含车源ID数组【谨慎使用,控制Length】
    2: list<i32> SiteId		#车源数据来源：1	58二手车，2	车168，3	51汽车，4	第一车网，5	淘车网 【默认为5】
    3: list<i32> UcarStatusArray	#车源状态(1为在售,4为售出,100 为查询所有车源)  
    4: list<i32> NoUcarIdArray	#排除车源ID数组【谨慎使用,控制Length】
    5: i32 IsAuthenticated	#是否是品牌认证车：-1-未知 0-否 1-是 (厂商认证)
    6: i32 Source	#是否可跨区(1为不可跨区,2为可跨区(即全国营销车源)) 
    8: list<i32> UserIdArray	#用户ID(经销商ID)【谨慎使用,控制Length】
	9: list<i32> NoUserIdArray	#排除用户ID(经销商ID)【谨慎使用,控制Length】
    10: list<string> UcarSerialNumberArray	#包含车源编号数组【谨慎使用,控制Length】
    11: string KeyWord	#搜索关键词
    17: list<string> ColorArray	#车辆颜色
    18: i32 CarSource1L	#车辆来源（1为个人；2为商家） 
    19: i32 PictureCount	#车源图片数量,搜索包含图片最小数量,搜索有图车源时传入1,无图车源传入0,
    20: list<i32> BigAreaIdArray	#大区ID数组【谨慎使用,控制Length】
    21: list<i32> ProvinceIdArray	#车源所在地--省份ID ,注意只有CityIdArray不傳參數時改屬性才生效
	22: list<i32> CityIdArray	#车源所在城市ID
	23: list<i32> NoCityIdArray	#排除车源所在城市ID【谨慎使用,控制Length】
	24: list<i32> RelateCityArray	#周边城市ID
	25: list<double> PriceLowerArray	#价格范围--最低价(单位"万") 
	26: list<double> PriceHighArray	#价格范围--最高价(单位"万") 
	27: list<double> CPriceLowerArray	#厂商指导>价格范围--最低价(单位"万") 
	28: list<double> CPriceHighArray	#厂商指导>价格范围--最高价(单位"万") 
	29: list<double> B2BPriceLowerArray	#批发价（B2BPrice）-价格范围--最低价(单位"万")  --2016-04-28
	30: list<double> B2BPriceHighArray	#批发价（B2BPrice）-价格范围--最高价(单位"万")   --2016-04-28
	31: list<i32> CarAgeLowerArray	#车龄范围--最低值 
	32: list<i32> CarAgeHighArray	#车龄范围--最高值 
	36: list<i32> DrivingMileageLowerArray	#行驶里程--最低值（单位：万公里）
	37: list<i32> DrivingMileageHighArray	#行驶里程--最高值（单位：万公里）
	39: i32 SuperiorId	#经销商上级公司ID（即厂商ID）(针对商家车源)
	41: i32 UserType	#商家车源来源类型(UserType字段)
	42: i32 IsNeglect	#审核状态 0为待审核；1为已审核；2为待复审；-1为暂不审核；-2为暂不复审   
	43: i32 IsVideo	#是否包含视频(参数含义：按照数据库中IsVideoCar定义)
	44: i32 IsFirstPicTrue	#是否首图确认  -1为不合格；0为待审核；1为首图合格
	45: i32 IsDealerRecommend	#是否商家推荐车源
	46: list<i32> CarSourceTypeArray	#车源来源类型  车辆类别(用途)：0-非营运 1-营运 2-营转非 3-租赁
	50: list<i32> CarTypeConfig	#车型配置 ： 010100000110111110 共计18位,将参数转化为18位的数组传入,如果那“一位”不参与查询 设置为-1 ,例如：new int[] { 0, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	51: i32 IsRecommendGL	#是否豪车：  1 是
	52: i32 IsWarranty	#是否保障车：  1 是 ,默认0(不参与查询)
	53: list<i32> WarrantyTypeArray	#保障服务类型 ： 101 共计3位,将参数转化为3位的数组传入,如果那“一位”不参与查询 设置为-1 ,例如：new int[] { 0, 1, -1};  注：可能会大于3位长度(查询会自适应)  lijunhao 2015-02-26
	54: i32 IsTop	#是否置顶车源（车源营销---置顶推广）：  1 是,默认0(不参与查询)
	55: i32 IsActivity	#是否参加特定活动的车源：1为参加，0为不参加    --- 20151016 当前：2015年双十一活动,2016年66购车节活动
	56: i32 IsBangmai	#是否帮买车源：1为参加，0为不参加    --- 20151208
	57: i32 IsBangmaiche	#是否参加淘车的帮买车APP车源：1为参加，0为不参加    --- 20160217
	58: i32 IsShowMr	#是否显示维保记录：1为显示，0为不显示    --- 20160202
	59: i32 IsCarId	#是否包含车型ID，即车型ID是否大于0    ----2016-02-22
	60: i32 IsB2B	#是否B2B串车车源：1为是  ----20160413
	61: list<i32> CrmCustomerIdArray	#客户编号数组检索
	62: i32 IsCheckReportJson	#是否显示车源质检报告

	201: list<i32> EnvirStandardArray	#排放标准：1:国2, 2:国3, 3:国4, 4:国5, 5:欧3, 6:欧4, 7:欧5, 8:京5, 9:OBD   ---  20150629  用0,1设置搜索条件，如“0,0,0,1,0,0,0,0,1” 代表 “国5或OBD”
	202: list<double> ConsumptionLowerArray	#综合工况油耗>范围--最低(单位"升/百公里")    ---- 20140828
	203: list<double> ConsumptionHighArray	#综合工况油耗>范围--最高(单位"升/百公里")    ---- 20140828
	204: list<i32> OilTypeArray	#能源类型：OilTypeEnum   ---  20150828
	205: list<i32> EngineLocationArray	#发动机位置：EngineLocationEnum   ---  20150828
	206: list<i32> BodyDoorsLowerArray	#车门数--最低值（单位：个）    ---  20150828
	207: list<i32> BodyDoorsHighArray	#车门数--最高值（单位：个）    ---  20150828
	208: list<i32> SeatNumLowerArray	#座位数/乘员人数--最低值（单位：个）    ---  20150828
	209: list<i32> SeatNumHighArray	#座位数/乘员人数--最高值（单位：个）    ---  20150828
	210: i32 IsWagon	#是否旅行版：1是    ---  20150828
	211: list<i32> DriveTypeArray	#驱动方式：DriveTypeEnum   ---  20150901
	212: list<i32> CsBodyFormArray	#车身形式：CsBodyFormEnum   ---  20150907
	213: list<i32> CarLevelArray	#车辆类型数组(豪华车 = 1,微型车 = 2,中大型车 = 3,小型车 = 4,MPV = 5,中型车 = 6,紧凑型车 = 7,SUV = 8,跑车 = 9,其他 = 10,面包车 = 11,皮卡 = 12,概念车=13,客车=14,卡车=15)
	214: list<i32> CarLevelSecondArray	#车系二级级别  0:无,1:小型suv,2:紧凑型suv,3:中型suv,4:中大型suv,5:全尺寸suv,6:微客,7:小客,8:中客,9:大客,10:微卡,11:轻卡,12:中卡,13:重卡
	215: list<string> CarYearArray	#车型年款
	216: list<i32> MainBrandArray	#搜索主品牌(mainbrandid)数组【谨慎使用,控制Length】
    217: list<i32> BrandArray	#搜索品牌(producerid)数组【谨慎使用,控制Length】
    218: list<i32> CarSerialArray	#搜索车系(brandid)数组【谨慎使用,控制Length】
    219: list<i32> CarIDArray	#搜索车型数组【谨慎使用,控制Length】
    220: list<i32> GearBoxTypeArray	#变速箱
	221: list<double> ExhaustLevelLowerArray	#排气量--最低值(参数名称为exhaustlower)
	222: list<double> ExhaustLevelHighArray	#排气量--最高值
	223: list<i32> ExhaustLevelArray	#1.0升以下、1.1-1.5升、1.6-2.0升、2.1-3.0升、3.1升以上 （2014-03-03）
	224: list<i32> CountryArray	#品牌国别(参数名称为country)按枚举值进行检索：澳大利亚 = 1, 德国 = 2, 法国 = 3, 韩国 = 4,荷兰 = 5, 捷克 = 6, 美国 = 7, 日本 = 8, 瑞典 = 9, 西班牙 = 10, 意大利 = 11, 英国 = 12, 中国 = 13
	225: list<i32> BrandAttrArray	# 品牌属性(自主 = 1, 合资 = 2, 进口 = 3)
}

struct AggrCondition{
	1: string FieldName
	2: i32 TopNumber
	3: i32 AggregationType
	4: string RangeConfig
	5: string SubKeyField
	6: string SubValueField
}

struct SearchResult {
    100: list<DTOCarInfoIndexField> CarList	#返回车源集合
	101: list<AggrFieldResult> Facet	#切面聚合信息
	102: list<DTOQuestionIndexField> QuestionList	#返回问答数据集合
	1: i64 Count	#搜索结果总记录条数
    2: string Message	#异常信息返回
	3: string RequestParametersLog	#请求参数string 化, RequestParametersLog="get" 将返回请求参数集合.
	4: list<i32> StepCount	#分步检索时，每一步的记录条数
	5: i64 TotalElapsedMilliseconds	#总耗时
}

struct AggrFieldResultItem{
	1: string TermName		#聚合结果项名称
	2: i32 Count	#数据条数
	3: double Min	#统计聚合：最小值
	4: double Max	#统计聚合：最大值
	5: double Total	#统计聚合：求和
	6: double Mean	#统计聚合：中位数
}

struct AggrFieldResult{
	1: string FieldName		#聚合字段名称
	2: i32 AggrType		#字段类型：Term = 1,DoubleRange = 2,IntRange = 3,DateRange = 4 
	3: list<AggrFieldResultItem> AggrValue	#聚合结果
}

struct DTOQuestionIndexField {   #  问答实体
	1: i32 qoid		#问题ID
	2: string title	#标题
	3: string body		#问题内容
	4: i32 areaid	#问题所在大区
	5: string areatype	#大区类型
	6: string areaname	#大区名称
	7: i32 replycount	#回复次数
	8: i32 viewcount	#浏览次数
	9: i32 active	#问题状态
	12: string categories	#分类
	13: string tags		#标签
	14: string replybody	#最佳答案
	15: i32 lastreplyusertype	#最后修改人类型
	16: i32 lastreplyuserid		#最后回复人ID
	17: i32 masterbrandid	#主品牌ID
	19: i32 brandid	#品牌
	20: string brandname	#品牌名称
	21: i32 pvcid	#省份ID
	22: string pvcname	#省份名称
	23: i32 cityid	#城市ID
	24: string cityname	#城市名称
	25: i32 userid		#提问人用户ID
	26: string username	#提问人用户名称
	27: i32 usertype	#提问人用户类型
	28: i32 issolve		#解决状态
	29: i32 status		#问题状态
	30: string brandspell	#车系拼音
	31: string catespell	#分类拼音
	32: string categroup	#分类分组
	33: string createtime	#提问时间
	34: string lastmodifytime	#最后修改时间
	35: string lastreplytime	#最后回复时间
	100: i32 id	#id
	101: string fullinfo	#描述信息
}


struct DTOCarInfoIndexField {   #  车源实体 
    1: i32 ucarid #  车源ID
    2: string ucarserialnumber #  车源编号
    3: i32 ucarstatus  #  车源状态
    4: i32 carproviceid #  车源所在地省份
    5: i32 carcityid  #  车源所在城市
    6: string color #  车源颜色
    7: i32 drivingmileage #  行驶里程(单位：公里)
    8: i32 completerate #  资料完整度
    9: i32 carsource1l #  车辆来源1级分类(1: 个人 2：商家)
    10: i32 isvideo #  是否视频车源(-2视频删除, -1视频不合格, 0无视频, 1为待审核, 2视频合格 )
    11: i32 firstpictrue #  首图是否确认合格
    12: i32 cartype #  车辆用途(用途 0:非营运;1:营运;2:营转非;3:租赁;)
    13: i32 source #  商家车源是否可跨区(1是不可跨区 2是可跨区)
    15: i32 isneglect #  车源审核状态：0为未审核；1为已审核；2为待复审；
    16: i32 picturecount #  是否有图：1为有图；0为无图 
    17: i32 picturenumber #  图片数量
    18: double displayprice #  显示价格(单位：万元)
    19: string statusmodifytime #  状态更改时间
    20: string createtime #  创建时间
    21: string buycardate #  原始购车日期
    22: string carpublishtime #  车辆发布时间
    23: string ucarpicwholepath #  车源首图
    24: i32 isdealerrecommend #  是否是商家推荐车源
    25: i32 isauthenticated #  是否是厂商认证车
    26: i32 isrecommendgl #  是否豪车
    27: i32 isowncar #  是否自有车源
    28: double c2bprice #  车源评估价-精真估,用于计算车源权重（价格合理度）
    29: i32 istop #  是否置顶车源 1为是，0或空为否
    30: string statedescription #  车况描述
    31: i32 iswarranty #  是否保障车
    32: string warrantytypes #  保障服务类型
    33: i32 isshowmr #  是否显示维保记录
    34: string carprovincename #  车源所在省份名称
    35: string carcityname #  车源所在城市名称
    36: i32 cardistrictid #  车源所在区县ID
    37: string cardistrictname #  车车源所在区县名称
    38: string slogan #  广告语（商家推荐）
    39: double b2bprice #  B2B串车价格：20160331
    40: i32 isb2b #  isb2b
    41: i32 mainbrandid #  主品牌Id
    42: i32 producerid #  所属品牌Id
    43: string country #  品牌所属国籍
    44: i32 brandid #  说明:车系ID
    45: string carlevel #  车辆类型（级别）
    46: i32 carlevelvalue #  车辆类型（级别）枚举值
    47: i64 carid #  车型ID
    48: i32 gearboxtype # 变速箱类型
    49: string gearboxtypestring #  搜索无效，仅用于创建索引
    50: double exhaustvalue #  排气量数值
    51: i32 caryear #  车型年款的年份
    52: double carreferprice #  新车厂商指导价(单位：万元)
    53: string envirstandard #  排放标准：{ "国2", "国3", "国4", "国5", "欧3", "欧4", "欧5", "京5", "OBD" }
    54: double consumption #  综合工况油耗
    55: i32 oiltype #  能源类型：柴油、CNG、待查、油气混合动力、NULL、汽油、LPG、油电混合动力、电力
    56: i32 enginelocation #  发动机位置 中置、待查、NULL、前置、后置
    57: i32 bodydoors #  车门数
    58: i32 seatnummin #  最少座位数
    59: i32 seatnummax #  最多座位数
    60: i32 iswagon #  是否旅行版
    61: i32 drivetype #  驱动方式 -1 待查 0前轮驱动 1 后轮驱动 2 全时四驱 3 分时四驱4适时四驱
    62: i32 isagency #  是否中介商家
    63: i32 csbodyform #  车系--车身形式 待查 = -1,两厢轿车 = 0,三厢轿车 = 1,Wagon旅行车 = 2,Pickup皮卡 = 3,MPV = 4,Cross混型车 = 5,跑车 = 6,MicroBus厢式车 = 7,SUV = 8,其他 = 9
    64: i32 brandattr #  品牌属性：自主、合资、进口       
    65: i32 ismarkingvendor #  是否屏蔽商家：针对虚假商家，做特殊处理，车源不下架，但是不显示在车源列表页   
    66: i32 countryvalue #  国别的value值（CountryEnum），用于快速检索      
    67: i32 userid #  [商家车源]经销商ID|[个人车源]注册用户ID</para>              
    68: i32 superiorid #  [商家车源]经销商分类ID（上级公司ID，即厂商ID）</para>        
    69: string vendorname #  [商家车源]经销商简称</para>      
    70: i32 vendortype #  [商家车源]经销商类型         
    71: string contact #  联系电话         
    72: i32 isjdvendor #  是否是京东招商商家        
    73: i32 isinctransfer #  是否包含过户费：1为含过户费；0为不含过户费   
    74: i32 usertype #  车辆来源
    75: i32 isactivity #  是否参加特定活动的车源：20151015:2015年双十一活动201604:2016年66购车节活动
    76: i32 membertype #  会员版本：0为免费版；10为付费版；20为试用版
    77: i32 isbangmai #  是否帮买车源：1为是，0为否  2015-12-07
    78: i32 dvqflag #  是否有资质：1为是，0为否  2016-02-17
    79: i32 isbangmaiche #  是否参加帮买车app车源：1为是，0为否  2016-02-17
    80: string baidumap #  百度地图坐标点，冗余，用于返回值
    81: double distance #  距离值，适用于地理位置检索和排序  2016-03-25
    82: string linkman #  第一联系人名称
    83: string cartypeconfig #  车型配置
    84: i32 siteid #  车源数据来源(1 58二手车，2 车168，351汽车，4 第一车网，5 淘车网)
    85: string cartitle #  车源标题
	86: i32 carlevelsecond #车辆二级级别(Car_Serial.ModelLevelSecond)
    87: i32 ischeckreportjson  #是否有json车检报告  2016-07-07
	88: i64 clickcount #  车源7天内点击量：20160429
	89: i32 crmcustomerid	#客户编号：2016-09-30
	100: double boost #  车源基本权重
    101: double boostc #  可控资源权重，即各车源区块、对外推广等
    102: double boostapp #  app权重，实时评分机制
	103: double score	#得分
	104: double costrate	#成本比值=经销商千次币成本/城市平均千次币成本
}


service TaocheESService { 
  SearchResult SearchTaocheCar(1: SearchCondition param),
  SearchResult SearchJDCar(1: SearchCondition param),
  SearchResult SearchCPCCar(1: SearchCondition param),
  SearchResult SearchQuestion(1: SearchQuestionCondition param)
}