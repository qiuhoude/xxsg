/*    */ package com.linlongyx.sanguo.webgame.processors.cat;
/*    */ 
/*    */ import com.linlongyx.core.framework.base.ProcessorBase;
/*    */ import com.linlongyx.core.framework.logic.IPlayerSession;
/*    */ import com.linlongyx.core.framework.protocol.RequestBase;
/*    */ import com.linlongyx.core.framework.protocol.ResponseBase;
/*    */ import com.linlongyx.sanguo.webgame.proto.binary.cat.FortuneCatPushRequest;
/*    */ import com.linlongyx.sanguo.webgame.proto.binary.cat.FortuneCatPushResponse;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FortuneCatPushProcessor
/*    */   extends ProcessorBase<FortuneCatPushRequest, FortuneCatPushResponse>
/*    */ {
/*    */   protected void initResponse() {
/* 16 */     this.response = (ResponseBase)new FortuneCatPushResponse();
/*    */   }
/*    */ 
/*    */   
/*    */   protected short handleRequest(IPlayerSession playerSession, FortuneCatPushRequest request) {
/* 21 */     return 0;
/*    */   }
/*    */ }


/* Location:              D:\xxsg_52gmsy\game\target\classes\!\com\linlongyx\sanguo\webgame\processors\cat\FortuneCatPushProcessor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */