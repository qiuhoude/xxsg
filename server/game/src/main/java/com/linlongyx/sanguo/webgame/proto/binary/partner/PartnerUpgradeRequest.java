/*    */ package com.linlongyx.sanguo.webgame.proto.binary.partner;
/*    */ 
/*    */ import com.linlongyx.core.framework.protocol.RequestBase;
/*    */ import com.linlongyx.sanguo.webgame.proto.ProtocolUtil;
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
/*    */ public class PartnerUpgradeRequest
/*    */   extends RequestBase
/*    */ {
/*    */   public long pid;
/* 20 */   public ArrayList<Integer> itemId = new ArrayList<>();
/* 21 */   public ArrayList<Integer> ItemNum = new ArrayList<>();
/*    */ 
/*    */   
/*    */   public PartnerUpgradeRequest() {
/* 25 */     this.eventRequestId = 13304;
/* 26 */     this.codeType = 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void serial(ByteBuf out) {
/* 31 */     ProtocolUtil.writeLong(out, this.pid);
/*    */     
/* 33 */     int size_0 = this.itemId.size();
/* 34 */     ProtocolUtil.writeStrArraySize(out, size_0);
/* 35 */     for (int index_0 = 0; index_0 < size_0; index_0++) {
/*    */       
/* 37 */       int tmp_0 = ((Integer)this.itemId.get(index_0)).intValue();
/* 38 */       ProtocolUtil.writeInt(out, tmp_0);
/*    */     } 
/*    */     
/* 41 */     int size_1 = this.ItemNum.size();
/* 42 */     ProtocolUtil.writeStrArraySize(out, size_1);
/* 43 */     for (int index_1 = 0; index_1 < size_1; index_1++) {
/*    */       
/* 45 */       int tmp_1 = ((Integer)this.ItemNum.get(index_1)).intValue();
/* 46 */       ProtocolUtil.writeInt(out, tmp_1);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void unserial(ByteBuf in) {
/* 52 */     this.pid = ProtocolUtil.readUTFBinLong(in);
/*    */     
/* 54 */     int size_0 = ProtocolUtil.readStrArraySize(in);
/* 55 */     for (int index_0 = 0; index_0 < size_0; index_0++) {
/*    */       
/* 57 */       int tmp_0 = ProtocolUtil.readUTFBinInt(in);
/* 58 */       this.itemId.add(Integer.valueOf(tmp_0));
/*    */     } 
/*    */     
/* 61 */     int size_1 = ProtocolUtil.readStrArraySize(in);
/* 62 */     for (int index_1 = 0; index_1 < size_1; index_1++) {
/*    */       
/* 64 */       int tmp_1 = ProtocolUtil.readUTFBinInt(in);
/* 65 */       this.ItemNum.add(Integer.valueOf(tmp_1));
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public PartnerUpgradeRequest clone() throws CloneNotSupportedException {
/* 71 */     PartnerUpgradeRequest clone = (PartnerUpgradeRequest)super.clone();
/* 72 */     int size_0 = this.itemId.size();
/* 73 */     for (int index_0 = 0; index_0 < size_0; index_0++) {
/*    */       
/* 75 */       int tmp_0 = ((Integer)this.itemId.get(index_0)).intValue();
/* 76 */       clone.itemId.add(Integer.valueOf(tmp_0));
/*    */     } 
/* 78 */     int size_1 = this.ItemNum.size();
/* 79 */     for (int index_1 = 0; index_1 < size_1; index_1++) {
/*    */       
/* 81 */       int tmp_1 = ((Integer)this.ItemNum.get(index_1)).intValue();
/* 82 */       clone.ItemNum.add(Integer.valueOf(tmp_1));
/*    */     } 
/* 84 */     return clone;
/*    */   }
/*    */ 
/*    */   
/*    */   public void reset() {
/* 89 */     this.pid = 0L;
/* 90 */     this.itemId.clear();
/* 91 */     this.ItemNum.clear();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 96 */     String retVal = "{\"pid\":" + this.pid + ",\"itemId\":" + this.itemId.toString() + ",\"ItemNum\":" + this.ItemNum.toString() + "}";
/* 97 */     return retVal;
/*    */   }
/*    */ }


/* Location:              D:\xxsg_52gmsy\game\target\classes\!\com\linlongyx\sanguo\webgame\proto\binary\partner\PartnerUpgradeRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */