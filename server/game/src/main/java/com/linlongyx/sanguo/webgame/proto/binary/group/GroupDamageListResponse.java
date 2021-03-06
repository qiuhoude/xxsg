/*    */ package com.linlongyx.sanguo.webgame.proto.binary.group;
/*    */ 
/*    */ import com.linlongyx.core.framework.protocol.ResponseBase;
/*    */ import com.linlongyx.sanguo.webgame.proto.ProtocolUtil;
/*    */ import com.linlongyx.sanguo.webgame.proto.binary.struct.GroupDamageData;
/*    */ import io.netty.buffer.ByteBuf;
/*    */ import java.util.ArrayList;
/*    */ import org.msgpack.annotation.Message;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Message
/*    */ public class GroupDamageListResponse
/*    */   extends ResponseBase
/*    */ {
/* 20 */   public ArrayList<GroupDamageData> datas = new ArrayList<>();
/*    */   
/*    */   public GroupDamageListResponse() {
/* 23 */     this.eventResponseId = 21117;
/* 24 */     this.codeType = 2;
/*    */   }
/*    */   
/*    */   public GroupDamageListResponse(short retCode) {
/* 28 */     this.eventResponseId = 21117;
/* 29 */     this.codeType = 2;
/* 30 */     this.retCode = retCode;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void serial(ByteBuf out) {
/* 36 */     int size_0 = this.datas.size();
/* 37 */     ProtocolUtil.writeStrArraySize(out, size_0);
/* 38 */     for (int index_0 = 0; index_0 < size_0; index_0++) {
/*    */       
/* 40 */       GroupDamageData tmp_0 = this.datas.get(index_0);
/* 41 */       tmp_0.serial(out);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void unserial(ByteBuf in) {
/* 48 */     int size_0 = ProtocolUtil.readStrArraySize(in);
/* 49 */     for (int index_0 = 0; index_0 < size_0; index_0++) {
/*    */       
/* 51 */       GroupDamageData tmp_0 = new GroupDamageData();
/* 52 */       tmp_0.unserial(in);
/* 53 */       this.datas.add(tmp_0);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public GroupDamageListResponse clone() throws CloneNotSupportedException {
/* 59 */     GroupDamageListResponse clone = (GroupDamageListResponse)super.clone();
/* 60 */     int size_0 = this.datas.size();
/* 61 */     for (int index_0 = 0; index_0 < size_0; index_0++) {
/*    */       
/* 63 */       GroupDamageData tmp_0 = this.datas.get(index_0);
/* 64 */       clone.datas.add(tmp_0.clone());
/*    */     } 
/* 66 */     return clone;
/*    */   }
/*    */ 
/*    */   
/*    */   public void reset() {
/* 71 */     this.datas.clear();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 76 */     String retVal = "{\"datas\":" + this.datas.toString() + "}";
/* 77 */     return retVal;
/*    */   }
/*    */ }


/* Location:              D:\xxsg_52gmsy\game\target\classes\!\com\linlongyx\sanguo\webgame\proto\binary\group\GroupDamageListResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */