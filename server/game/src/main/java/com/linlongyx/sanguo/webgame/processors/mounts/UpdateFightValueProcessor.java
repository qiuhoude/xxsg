/*    */ package com.linlongyx.sanguo.webgame.processors.mounts;
/*    */ 
/*    */ import com.linlongyx.core.framework.base.ProcessorBase;
/*    */ import com.linlongyx.core.framework.logic.IPlayerSession;
/*    */ import com.linlongyx.core.framework.protocol.RequestBase;
/*    */ import com.linlongyx.core.framework.protocol.ResponseBase;
/*    */ import com.linlongyx.sanguo.webgame.proto.binary.mounts.UpdateFightValueRequest;
/*    */ import com.linlongyx.sanguo.webgame.proto.binary.mounts.UpdateFightValueResponse;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UpdateFightValueProcessor
/*    */   extends ProcessorBase<UpdateFightValueRequest, UpdateFightValueResponse>
/*    */ {
/*    */   protected void initResponse() {
/* 16 */     this.response = (ResponseBase)new UpdateFightValueResponse();
/*    */   }
/*    */ 
/*    */   
/*    */   protected short handleRequest(IPlayerSession playerSession, UpdateFightValueRequest request) {
/* 21 */     return 0;
/*    */   }
/*    */ }


/* Location:              D:\xxsg_52gmsy\game\target\classes\!\com\linlongyx\sanguo\webgame\processors\mounts\UpdateFightValueProcessor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */