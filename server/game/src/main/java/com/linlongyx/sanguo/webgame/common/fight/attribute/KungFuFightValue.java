/*    */ package com.linlongyx.sanguo.webgame.common.fight.attribute;
/*    */ 
/*    */ import com.linlongyx.core.framework.dao.entity.IMapEntity;
/*    */ import com.linlongyx.core.framework.logic.IPlayerSession;
/*    */ import com.linlongyx.sanguo.webgame.app.kungfu.KungFuEntity;
/*    */ import com.linlongyx.sanguo.webgame.app.partner.PartnerComponent;
/*    */ import com.linlongyx.sanguo.webgame.app.partner.PartnerEntity;
/*    */ import com.linlongyx.sanguo.webgame.app.player.PlayerComponent;
/*    */ import com.linlongyx.sanguo.webgame.common.attribute.AttrUpBase;
/*    */ import com.linlongyx.sanguo.webgame.config.bean.FighterBean;
/*    */ import com.linlongyx.sanguo.webgame.service.JsonTableService;
/*    */ import java.util.Arrays;
/*    */ import java.util.HashSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class KungFuFightValue
/*    */   extends AttrUpBase
/*    */ {
/*    */   public KungFuFightValue(int type, boolean isBaseAffect) {
/* 28 */     super(type, isBaseAffect);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getKungfuFightValue(KungFuEntity kungFuEntity, IPlayerSession iPlayerSession) {
/* 36 */     Arrays.fill(this.attrs, 0L);
/* 37 */     PlayerComponent playerComponent = (PlayerComponent)iPlayerSession.getPlayer().createIfNotExist(PlayerComponent.class);
/* 38 */     FighterBean fighterBean1 = (FighterBean)JsonTableService.getJsonData(playerComponent.getLeaderId(), FighterBean.class);
/* 39 */     AttrUpdateUtil.oneKungFuAttr(fighterBean1, kungFuEntity, this.attrs, new HashSet<>(), -1L);
/* 40 */     PartnerComponent partnerComponent = (PartnerComponent)iPlayerSession.getPlayer().createIfNotExist(PartnerComponent.class);
/* 41 */     partnerComponent.getEntityMap().values().forEach(iMapEntity -> {
/*    */           PartnerEntity partnerEntity = (PartnerEntity)iMapEntity;
/*    */           FighterBean fighterBean = (FighterBean)JsonTableService.getJsonData(partnerEntity.getTableId(), FighterBean.class);
/*    */           if (null != fighterBean) {
/*    */             AttrUpdateUtil.oneKungFuAttr(fighterBean, kungFuEntity, this.attrs, new HashSet<>(), partnerEntity.getPid());
/*    */           }
/*    */         });
/* 48 */     return getFightValue() / 10000L;
/*    */   }
/*    */ }


/* Location:              D:\xxsg_52gmsy\game\target\classes\!\com\linlongyx\sanguo\webgame\common\fight\attribute\KungFuFightValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */