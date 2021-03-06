/*     */ package com.linlongyx.sanguo.webgame.constant;
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum ResourceEvent
/*     */ {
/*   7 */   gmAdd(1, "GM获得"),
/*   8 */   gmUse(2, "GM消耗"),
/*   9 */   EquipStrengthUp(3, "装备强化"),
/*  10 */   BagSell(4, "卖道具获得"),
/*  11 */   MailExtract(5, "邮件获得"),
/*  12 */   charge(6, "充值"),
/*  13 */   EquipPurify(7, "装备精炼"),
/*  14 */   OnlineIncome(8, "挂机收益"),
/*  15 */   OfflineIncome(9, "离线收益"),
/*  16 */   SingleInsSweep(10, "日常副本扫荡"),
/*  17 */   ArenaClearCD(11, "竞技场消除CD"),
/*  18 */   ArenaBuyTime(12, "竞技场购买次数"),
/*  19 */   ArenaSweep(13, "竞技场扫荡"),
/*  20 */   ArenaFight(14, "竞技场挑战"),
/*  21 */   BossInsPass(15, "主线关卡boss副本通关固定奖励"),
/*  22 */   Recruit(16, "招募"),
/*  23 */   BagUseItem(17, "道具使用"),
/*  24 */   TaskReward(18, "完成任务"),
/*  25 */   BagBuyGrid(19, "购买格子"),
/*  26 */   MysteryBuy(20, "神秘商店购买"),
/*  27 */   RoutineBuy(21, "常规商店购买"),
/*  28 */   ShopRefresh(22, "商店刷新"),
/*  29 */   PartnerAddExp(23, "武将升级"),
/*  30 */   PartnerBreach(24, "武将突破"),
/*  31 */   HandBookBox(25, "图鉴宝箱"),
/*  32 */   RapidCombat(26, "快速作战"),
/*  33 */   FriendSendFlower(27, "好友送花"),
/*  34 */   RewardNotice(28, "奖励弹窗"),
/*  35 */   UnparBoxReward(29, "无双副本宝箱奖励"),
/*  36 */   UnparSweepReward(30, "无双副本扫荡奖励"),
/*  37 */   UnparReset(31, "无双副本重置"),
/*  38 */   WorldBossReward(32, "世界Boss奖励"),
/*  39 */   WorldBossTime(33, "世界Boss次数购买"),
/*  40 */   MainTaskBox(34, "主线章节宝箱奖励"),
/*  41 */   RecordStar(35, "激活命星奖励"),
/*  42 */   ActWarPet(36, "激活战宠"),
/*  43 */   TaskDailyReward(37, "日常奖励"),
/*  44 */   WarPetStarUp(38, "战宠升星"),
/*  45 */   AchieveReward(39, "成就奖励"),
/*  46 */   MainInsChallenge(40, "主线通关奖励"),
/*  47 */   WorshipReward(41, "膜拜奖励"),
/*  48 */   RecruitRed(42, "红将招募"),
/*  49 */   RecruitRedBuy(43, "快速购买"),
/*  50 */   RecruitRedBox(44, "红将招募宝箱"),
/*  51 */   EquipSell(45, "装备分解"),
/*  52 */   GeneralBoxReward(46, "名将副本宝箱奖励"),
/*  53 */   GeneralPointSweep(47, "名将副本扫荡"),
/*  54 */   GeneralBuyOrder(48, "名将副本购买军令"),
/*  55 */   GeneralPointReset(49, "名将副本关卡重置"),
/*  56 */   EquipZhuUp(50, "装备铸魂升级"),
/*  57 */   EquipStoneUp(51, "装备宝石升级"),
/*  58 */   PartnerReborn(52, "重生"),
/*  59 */   PartnerSell(53, "武将分解"),
/*  60 */   VipReward(54, "购买vip专享礼包"),
/*  61 */   WelfareVipDaily(55, "福利vip每日领取"),
/*  62 */   WelfareVipWeek(56, "福利vip每周购买"),
/*  63 */   BuySingleBoss(57, "购买个人boss次数"),
/*  64 */   SingleBossSweep(58, "个人boss扫荡"),
/*     */   
/*  66 */   RankActReward(59, "开服竞赛奖励"),
/*  67 */   ContinueRechargeReward(60, "开服连充领奖"),
/*  68 */   FirstChargeReward(61, "领取首充奖励"),
/*  69 */   LimitAct(62, "限时活动"),
/*  70 */   MultiUseItem(63, "多选一"),
/*  71 */   OverdueItem(64, "过期道具"),
/*  72 */   NormalInvite(65, "普通邀请"),
/*  73 */   DailySign(66, "每日签到"),
/*  74 */   LuxurySign(67, "豪华签到"),
/*  75 */   LevelPackage(68, "等级礼包"),
/*  76 */   MonthCardReward(69, "月卡奖励"),
/*  77 */   TitleActivate(70, "称号激活"),
/*  78 */   TitleDelay(71, "称号延期"),
/*  79 */   BuyGrowFund(72, "购买成长基金"),
/*  80 */   GetGrowFund(73, "领取成长基金奖励"),
/*  81 */   DailyShop(74, "每日特惠"),
/*  82 */   FortuneCatReward(75, "招财猫奖励"),
/*  83 */   FortuneCatCost(76, "招财猫花费"),
/*  84 */   RechargeAct(77, "限时累充活动"),
/*  85 */   TowerPassReward(78, "千层塔通关奖励"),
/*  86 */   TowerDailyReward(79, "千层塔结算奖励"),
/*  87 */   MountsBreak(80, "坐骑突破"),
/*  88 */   MountsUpgrade(81, "坐骑升级"),
/*  89 */   MountsActivity(82, "坐骑激活"),
/*  90 */   PiceRecovery(83, "碎片分解"),
/*  91 */   LuckyTurntable(84, "幸运转盘"),
/*  92 */   FirstRecruit(85, "第一次招募"),
/*  93 */   MountsStarUp(86, "坐骑升星"),
/*  94 */   ChangeNameSex(87, "改名或性别"),
/*  95 */   OnlineReward(88, "在线奖励"),
/*  96 */   CreatePlayer(89, "创角"),
/*  97 */   TeamFight(90, "组队副本"),
/*  98 */   GroupCreate(91, "军团创建"),
/*  99 */   GroupSacrificeAction(92, "进行祭天"),
/* 100 */   GroupSacrificeReward(93, "祭天宝箱"),
/* 101 */   GroupSkillLevelUp(94, "军团技能升级"),
/* 102 */   TowerBoxCost(95, "千层塔宝箱消耗"),
/* 103 */   GroupGrowFund(96, "成长基金团购奖励"),
/* 104 */   OneBuyReward(97, "一元购奖励"),
/*     */   
/* 106 */   GeneralGift(98, "武将送礼"),
/* 107 */   Turnplate(99, "天金轮盘"),
/* 108 */   OneyuanReward(100, "一元直购奖励"),
/* 109 */   groupChargeReward(101, "首充团购奖励"),
/* 110 */   NormalSweepBuy(102, "购买日常副本扫荡次数"),
/* 111 */   PetTurntable(103, "战宠转盘"),
/* 112 */   DestinyRefresh(104, "天命战场刷新"),
/* 113 */   DestinyBuyTimes(105, "天命战场购买挑战次数"),
/* 114 */   DestinyBattleTaskReward(106, "天命战场任务奖励"),
/* 115 */   DestinyBattleFight(107, "天命战场挑战"),
/* 116 */   RedundantCard(108, "重复外显道具转绑元"),
/* 117 */   DrawCardReward(109, "欢乐翻牌奖励"),
/* 118 */   DrawCardCost(110, "欢乐翻牌花费"),
/* 119 */   DrawCardTotalReward(111, "欢乐翻牌次数奖励"),
/* 120 */   RecruitRebateReward(112, "招募返利奖励"),
/* 121 */   RebateSorceReward(113, "充值抽奖壕气奖励"),
/* 122 */   ChargeRebateReward(114, "充值抽奖奖励"),
/* 123 */   QuickBuyItem(115, "快速购买道具"),
/* 124 */   CardColor(116, "卡牌着色消耗"),
/* 125 */   CardColorReward(117, "卡牌着色奖励"),
/* 126 */   CardColorProcess(118, "卡牌着色进度奖励"),
/* 127 */   GiveAskCost(119, "捐赠消耗"),
/* 128 */   DestinyMatchGuess(120, "巅峰赛竞猜"),
/* 129 */   EveryDayCharge(121, "每日首充奖励"),
/* 130 */   BaguaFight(122, "八阵图"),
/* 131 */   BaguaBuy(123, "八阵图宝箱"),
/* 132 */   BaguaSweep(124, "八阵图扫荡"),
/* 133 */   GroupBossFight(125, "军团boss"),
/* 134 */   RankbossRevive(126, "复活排行boss消耗"),
/* 135 */   NewActiveCode(127, "激活码奖励"),
/* 136 */   PartnerStarUp(128, "武将升星"),
/* 137 */   EquipArtificeUp(129, "装备炼化"),
/* 138 */   ActivityKungFu(130, "激活招式消耗"),
/* 139 */   KungFuStarUp(131, "招式升星消耗"),
/* 140 */   KungFuUpgrade(131, "招式升级消耗"),
/* 141 */   WarPetUpgrade(132, "战宠升级"),
/* 142 */   ActivityStage(133, "激活将台消耗"),
/* 143 */   StageStarUp(134, "将台升星消耗"),
/* 144 */   KungFuRebate(135, "招式返利"),
/* 145 */   StageRebate(136, "将台返利"),
/* 146 */   MilitaryStart(137, "军务府研究消耗"),
/* 147 */   MilitarySpeed(138, "军务府加速研究消耗"),
/* 148 */   AskShareReward(139, "求助大奖奖励"),
/* 149 */   InviteNum(140, "邀请大奖人数奖励"),
/* 150 */   InviteCharge(141, "邀请大奖充值奖励"),
/* 151 */   InviteLevel(142, "邀请大奖等级奖励"),
/* 152 */   TaxaTionCost(143, "征税消耗"),
/* 153 */   TaxaTionGet(144, "征税获得"),
/* 154 */   DailyHaoLi(145, "每日豪礼奖励"),
/* 155 */   DivineOneDraw(146, "占卜活动单抽"),
/* 156 */   DivineTenDraw(147, "占卜活动10连"),
/* 157 */   Questionnaire(148, "问卷调查奖励"),
/* 158 */   CrossBattleCollect(149, "跨服争霸赛采集奖励"),
/* 159 */   ShortCut(150, "收藏有礼"),
/* 160 */   RealName(151, "实名认证奖励"),
/* 161 */   partnerSoul(152, "武将魂引"),
/* 162 */   QQVIPShop(153, "QQvip特权购买"),
/* 163 */   ChannelGift(154, "QQvip特权礼包"),
/* 164 */   CrossRankAct(155, "跨服竞赛个人奖励"),
/* 165 */   MentalLotteryBox(156, "阵法殿宝箱"),
/* 166 */   Followawy(157, "关注奖励"),
/* 167 */   MentalLottery(158, "阵法殿寻宝"),
/* 168 */   ActWarZhenfa(159, "激活阵法"),
/* 169 */   WarZhenfaStarUp(160, "阵法升星"),
/* 170 */   WarZhenfaUpgrade(161, "阵法升级"),
/* 171 */   ZhenfaDian(162, "阵法殿抽奖"),
/* 172 */   ZhenFaRebate(163, "阵法返利"),
/* 173 */   WeixinGuide(164, "微信引导奖励"),
/* 174 */   SoulsUpgrade(165, "英魂升级"),
/* 175 */   StageUpgrade(166, "将台升级"),
/* 176 */   StageRecast(167, "英魂重铸"),
/* 177 */   ChangeGroupName(168, "军团改名"),
/* 178 */   CrossRace(169, "跨服段位赛"),
/* 179 */   WeixinFollow(170, "微信关注"),
/* 180 */   LuckyMoney(171, "压岁钱"),
/* 181 */   YearBeastBoss(172, "年兽boss奖励"),
/* 182 */   YearBeastBuyTime(173, "年兽购买次数"),
/* 183 */   FashionActivate(174, "激活时装"),
/* 184 */   FashionStrengthen(175, "时装强化"),
/*     */   
/* 186 */   TalismanRefresh(176, "宝物转盘刷新"),
/* 187 */   TalismanDraw(177, "宝物转盘抽取"),
/* 188 */   TalismanCost(178, "法宝升阶消耗"),
/* 189 */   AwyBindReward(179, "爱微游手机绑定奖励"),
/* 190 */   CrystalBuy(180, "晶魂商店购买"),
/* 191 */   FortunePigCost(181, "金猪纳福消耗"),
/* 192 */   MilitaryHelpReward(182, "军务府协助奖励"),
/* 193 */   BloodCrystalBuy(183, "晶魂商店购买"),
/* 194 */   EquipStarUp(183, "装备升星消耗"),
/* 195 */   ChargeReward(184, "手游充值返利奖励"),
/* 196 */   BloodShopRefresh(185, "血晶商店刷新"),
/* 197 */   TowerMobai(186, "塔主争夺膜拜奖励"),
/* 198 */   SecretShopBuy(187, "秘境商店购买"),
/* 199 */   SecretiReward(188, "逐鹿秘境进度奖励"),
/* 200 */   SecretiFightReward(189, "逐鹿秘境挑战奖励"),
/* 201 */   TimeLimit(190, "每日特惠"),
/* 202 */   ArtofactCost(191, "激活神器消耗"),
/*     */   
/* 204 */   ArtifactTrain(192, "神器培养"),
/* 205 */   RecruitGoldBox(193, "天金招募宝箱"),
/* 206 */   RecruitGoldRefresh(194, "天金招募刷新"),
/* 207 */   RecruitGold(195, "天金招募"),
/* 208 */   RuneLevelCost(196, "符文升级"),
/* 209 */   GoldBuy(197, "天金直购奖励"),
/* 210 */   PreviewReward(198, "功能预览奖励"),
/* 211 */   RuneRecovery(199, "符文分解"),
/* 212 */   XinYueReward(200, "玩吧心悦会员奖励"),
/* 213 */   RunewarDailyReward(201, "符文之地每日奖励"),
/* 214 */   RunewarStageReward(202, "符文之地段位奖励"),
/* 215 */   RunWander(203, "云游商人"),
/* 216 */   PcWbReward(204, "玩吧pc端每日奖励"),
/* 217 */   ReincarnCost(205, "转生消耗"),
/* 218 */   QQWbReward(206, "玩吧qqVIP每日奖励"),
/* 219 */   ZodiacReward(207, "完成对应的副本可以领取星座碎片"),
/* 220 */   FindReward(208, "找回奖励"),
/* 221 */   ReturnReward(209, "回归礼包"),
/* 222 */   FindCost(210, "找回消耗");
/*     */   
/*     */   private int type;
/*     */   private String detail;
/*     */   
/*     */   ResourceEvent(int type, String detail) {
/* 228 */     this.type = type;
/* 229 */     this.detail = detail;
/*     */   }
/*     */   
/*     */   public int getType() {
/* 233 */     return this.type;
/*     */   }
/*     */   
/*     */   public String getDetail() {
/* 237 */     return this.detail;
/*     */   }
/*     */ }


/* Location:              D:\xxsg_52gmsy\game\target\classes\!\com\linlongyx\sanguo\webgame\constant\ResourceEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */