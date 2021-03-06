// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.baidu.carlife.protobuf;

public final class CarlifeVehicleInfoListProto {
  private CarlifeVehicleInfoListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeVehicleInfoList extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeVehicleInfoList.newBuilder() to construct.
    private CarlifeVehicleInfoList() {}
    
    private static final CarlifeVehicleInfoList defaultInstance = new CarlifeVehicleInfoList();
    public static CarlifeVehicleInfoList getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeVehicleInfoList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.internal_static_com_baidu_carlife_protobuf_CarlifeVehicleInfoList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.internal_static_com_baidu_carlife_protobuf_CarlifeVehicleInfoList_fieldAccessorTable;
    }

    // required int32 cnt = 1;
    public static final int CNT_FIELD_NUMBER = 1;
    private boolean hasCnt;
    private int cnt_ = 0;
    public boolean hasCnt() { return hasCnt; }
    public int getCnt() { return cnt_; }

    // repeated .com.baidu.carlife.protobuf.CarlifeVehicleInfo vehicleInfo = 2;
    public static final int VEHICLEINFO_FIELD_NUMBER = 2;
    private java.util.List<CarlifeVehicleInfoProto.CarlifeVehicleInfo> vehicleInfo_ =
      java.util.Collections.emptyList();
    public java.util.List<CarlifeVehicleInfoProto.CarlifeVehicleInfo> getVehicleInfoList() {
      return vehicleInfo_;
    }
    public int getVehicleInfoCount() { return vehicleInfo_.size(); }
    public com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfo getVehicleInfo(int index) {
      return vehicleInfo_.get(index);
    }

    public final boolean isInitialized() {
      if (!hasCnt) return false;
      for (com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfo element : getVehicleInfoList()) {
        if (!element.isInitialized()) return false;
      }
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasCnt()) {
        output.writeInt32(1, getCnt());
      }
      for (com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfo element : getVehicleInfoList()) {
        output.writeMessage(2, element);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasCnt()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getCnt());
      }
      for (com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfo element : getVehicleInfoList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, element);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList result;

      // Construct using com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList();
        return builder;
      }

      protected com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList.getDescriptor();
      }

      public com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList getDefaultInstanceForType() {
        return com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.vehicleInfo_ != java.util.Collections.EMPTY_LIST) {
          result.vehicleInfo_ =
            java.util.Collections.unmodifiableList(result.vehicleInfo_);
        }
        com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList) {
          return mergeFrom((com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList other) {
        if (other == com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList.getDefaultInstance()) return this;
        if (other.hasCnt()) {
          setCnt(other.getCnt());
        }
        if (!other.vehicleInfo_.isEmpty()) {
          if (result.vehicleInfo_.isEmpty()) {
            result.vehicleInfo_ = new java.util.ArrayList<CarlifeVehicleInfoProto.CarlifeVehicleInfo>();
          }
          result.vehicleInfo_.addAll(other.vehicleInfo_);
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setCnt(input.readInt32());
              break;
            }
            case 18: {
              com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfo.Builder subBuilder = com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfo.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addVehicleInfo(subBuilder.buildPartial());
              break;
            }
          }
        }
      }


      // required int32 cnt = 1;
      public boolean hasCnt() {
        return result.hasCnt();
      }
      public int getCnt() {
        return result.getCnt();
      }
      public Builder setCnt(int value) {
        result.hasCnt = true;
        result.cnt_ = value;
        return this;
      }
      public Builder clearCnt() {
        result.hasCnt = false;
        result.cnt_ = 0;
        return this;
      }

      // repeated .com.baidu.carlife.protobuf.CarlifeVehicleInfo vehicleInfo = 2;
      public java.util.List<CarlifeVehicleInfoProto.CarlifeVehicleInfo> getVehicleInfoList() {
        return java.util.Collections.unmodifiableList(result.vehicleInfo_);
      }
      public int getVehicleInfoCount() {
        return result.getVehicleInfoCount();
      }
      public com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfo getVehicleInfo(int index) {
        return result.getVehicleInfo(index);
      }
      public Builder setVehicleInfo(int index, com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfo value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.vehicleInfo_.set(index, value);
        return this;
      }
      public Builder setVehicleInfo(int index, com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfo.Builder builderForValue) {
        result.vehicleInfo_.set(index, builderForValue.build());
        return this;
      }
      public Builder addVehicleInfo(com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfo value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.vehicleInfo_.isEmpty()) {
          result.vehicleInfo_ = new java.util.ArrayList<CarlifeVehicleInfoProto.CarlifeVehicleInfo>();
        }
        result.vehicleInfo_.add(value);
        return this;
      }
      public Builder addVehicleInfo(com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfo.Builder builderForValue) {
        if (result.vehicleInfo_.isEmpty()) {
          result.vehicleInfo_ = new java.util.ArrayList<CarlifeVehicleInfoProto.CarlifeVehicleInfo>();
        }
        result.vehicleInfo_.add(builderForValue.build());
        return this;
      }
      public Builder addAllVehicleInfo(
          Iterable<? extends CarlifeVehicleInfoProto.CarlifeVehicleInfo> values) {
        if (result.vehicleInfo_.isEmpty()) {
          result.vehicleInfo_ = new java.util.ArrayList<CarlifeVehicleInfoProto.CarlifeVehicleInfo>();
        }
        super.addAll(values, result.vehicleInfo_);
        return this;
      }
      public Builder clearVehicleInfo() {
        result.vehicleInfo_ = java.util.Collections.emptyList();
        return this;
      }
    }

    static {
      com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.getDescriptor();
    }

    static {
      com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeVehicleInfoList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeVehicleInfoList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n!CarlifeVehicleInfoListProto.proto\022\032com" +
      ".baidu.carlife.protobuf\032\035CarlifeVehicleI" +
      "nfoProto.proto\"j\n\026CarlifeVehicleInfoList" +
      "\022\013\n\003cnt\030\001 \002(\005\022C\n\013vehicleInfo\030\002 \003(\0132..com" +
      ".baidu.carlife.protobuf.CarlifeVehicleIn" +
      "fo"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeVehicleInfoList_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeVehicleInfoList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeVehicleInfoList_descriptor,
              new String[] { "Cnt", "VehicleInfo", },
              com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList.class,
              com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoList.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
}
