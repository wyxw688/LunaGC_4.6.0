// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAvatarTalkFinishInfoNotify.proto

package emu.grasscutter.net.proto;

public final class HomeAvatarTalkFinishInfoNotifyOuterClass {
  private HomeAvatarTalkFinishInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeAvatarTalkFinishInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeAvatarTalkFinishInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
     */
    java.util.List<emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo> 
        getAvatarTalkInfoListList();
    /**
     * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
     */
    emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo getAvatarTalkInfoList(int index);
    /**
     * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
     */
    int getAvatarTalkInfoListCount();
    /**
     * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder> 
        getAvatarTalkInfoListOrBuilderList();
    /**
     * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
     */
    emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder getAvatarTalkInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 1817
   * Obf: NBLCEJMJBPL
   * </pre>
   *
   * Protobuf type {@code HomeAvatarTalkFinishInfoNotify}
   */
  public static final class HomeAvatarTalkFinishInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeAvatarTalkFinishInfoNotify)
      HomeAvatarTalkFinishInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeAvatarTalkFinishInfoNotify.newBuilder() to construct.
    private HomeAvatarTalkFinishInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeAvatarTalkFinishInfoNotify() {
      avatarTalkInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeAvatarTalkFinishInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeAvatarTalkFinishInfoNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                avatarTalkInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              avatarTalkInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          avatarTalkInfoList_ = java.util.Collections.unmodifiableList(avatarTalkInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.internal_static_HomeAvatarTalkFinishInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.internal_static_HomeAvatarTalkFinishInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify.class, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify.Builder.class);
    }

    public static final int AVATAR_TALK_INFO_LIST_FIELD_NUMBER = 12;
    private java.util.List<emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo> avatarTalkInfoList_;
    /**
     * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo> getAvatarTalkInfoListList() {
      return avatarTalkInfoList_;
    }
    /**
     * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder> 
        getAvatarTalkInfoListOrBuilderList() {
      return avatarTalkInfoList_;
    }
    /**
     * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
     */
    @java.lang.Override
    public int getAvatarTalkInfoListCount() {
      return avatarTalkInfoList_.size();
    }
    /**
     * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo getAvatarTalkInfoList(int index) {
      return avatarTalkInfoList_.get(index);
    }
    /**
     * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder getAvatarTalkInfoListOrBuilder(
        int index) {
      return avatarTalkInfoList_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < avatarTalkInfoList_.size(); i++) {
        output.writeMessage(12, avatarTalkInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < avatarTalkInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, avatarTalkInfoList_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify other = (emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify) obj;

      if (!getAvatarTalkInfoListList()
          .equals(other.getAvatarTalkInfoListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getAvatarTalkInfoListCount() > 0) {
        hash = (37 * hash) + AVATAR_TALK_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarTalkInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 1817
     * Obf: NBLCEJMJBPL
     * </pre>
     *
     * Protobuf type {@code HomeAvatarTalkFinishInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeAvatarTalkFinishInfoNotify)
        emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.internal_static_HomeAvatarTalkFinishInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.internal_static_HomeAvatarTalkFinishInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify.class, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getAvatarTalkInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (avatarTalkInfoListBuilder_ == null) {
          avatarTalkInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          avatarTalkInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.internal_static_HomeAvatarTalkFinishInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify build() {
        emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify buildPartial() {
        emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify result = new emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify(this);
        int from_bitField0_ = bitField0_;
        if (avatarTalkInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            avatarTalkInfoList_ = java.util.Collections.unmodifiableList(avatarTalkInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.avatarTalkInfoList_ = avatarTalkInfoList_;
        } else {
          result.avatarTalkInfoList_ = avatarTalkInfoListBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify other) {
        if (other == emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify.getDefaultInstance()) return this;
        if (avatarTalkInfoListBuilder_ == null) {
          if (!other.avatarTalkInfoList_.isEmpty()) {
            if (avatarTalkInfoList_.isEmpty()) {
              avatarTalkInfoList_ = other.avatarTalkInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAvatarTalkInfoListIsMutable();
              avatarTalkInfoList_.addAll(other.avatarTalkInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.avatarTalkInfoList_.isEmpty()) {
            if (avatarTalkInfoListBuilder_.isEmpty()) {
              avatarTalkInfoListBuilder_.dispose();
              avatarTalkInfoListBuilder_ = null;
              avatarTalkInfoList_ = other.avatarTalkInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              avatarTalkInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAvatarTalkInfoListFieldBuilder() : null;
            } else {
              avatarTalkInfoListBuilder_.addAllMessages(other.avatarTalkInfoList_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo> avatarTalkInfoList_ =
        java.util.Collections.emptyList();
      private void ensureAvatarTalkInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarTalkInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo>(avatarTalkInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder> avatarTalkInfoListBuilder_;

      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo> getAvatarTalkInfoListList() {
        if (avatarTalkInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(avatarTalkInfoList_);
        } else {
          return avatarTalkInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public int getAvatarTalkInfoListCount() {
        if (avatarTalkInfoListBuilder_ == null) {
          return avatarTalkInfoList_.size();
        } else {
          return avatarTalkInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo getAvatarTalkInfoList(int index) {
        if (avatarTalkInfoListBuilder_ == null) {
          return avatarTalkInfoList_.get(index);
        } else {
          return avatarTalkInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public Builder setAvatarTalkInfoList(
          int index, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo value) {
        if (avatarTalkInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarTalkInfoListIsMutable();
          avatarTalkInfoList_.set(index, value);
          onChanged();
        } else {
          avatarTalkInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public Builder setAvatarTalkInfoList(
          int index, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder builderForValue) {
        if (avatarTalkInfoListBuilder_ == null) {
          ensureAvatarTalkInfoListIsMutable();
          avatarTalkInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          avatarTalkInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public Builder addAvatarTalkInfoList(emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo value) {
        if (avatarTalkInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarTalkInfoListIsMutable();
          avatarTalkInfoList_.add(value);
          onChanged();
        } else {
          avatarTalkInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public Builder addAvatarTalkInfoList(
          int index, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo value) {
        if (avatarTalkInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarTalkInfoListIsMutable();
          avatarTalkInfoList_.add(index, value);
          onChanged();
        } else {
          avatarTalkInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public Builder addAvatarTalkInfoList(
          emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder builderForValue) {
        if (avatarTalkInfoListBuilder_ == null) {
          ensureAvatarTalkInfoListIsMutable();
          avatarTalkInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          avatarTalkInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public Builder addAvatarTalkInfoList(
          int index, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder builderForValue) {
        if (avatarTalkInfoListBuilder_ == null) {
          ensureAvatarTalkInfoListIsMutable();
          avatarTalkInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          avatarTalkInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public Builder addAllAvatarTalkInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo> values) {
        if (avatarTalkInfoListBuilder_ == null) {
          ensureAvatarTalkInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, avatarTalkInfoList_);
          onChanged();
        } else {
          avatarTalkInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public Builder clearAvatarTalkInfoList() {
        if (avatarTalkInfoListBuilder_ == null) {
          avatarTalkInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          avatarTalkInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public Builder removeAvatarTalkInfoList(int index) {
        if (avatarTalkInfoListBuilder_ == null) {
          ensureAvatarTalkInfoListIsMutable();
          avatarTalkInfoList_.remove(index);
          onChanged();
        } else {
          avatarTalkInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder getAvatarTalkInfoListBuilder(
          int index) {
        return getAvatarTalkInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder getAvatarTalkInfoListOrBuilder(
          int index) {
        if (avatarTalkInfoListBuilder_ == null) {
          return avatarTalkInfoList_.get(index);  } else {
          return avatarTalkInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder> 
           getAvatarTalkInfoListOrBuilderList() {
        if (avatarTalkInfoListBuilder_ != null) {
          return avatarTalkInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(avatarTalkInfoList_);
        }
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder addAvatarTalkInfoListBuilder() {
        return getAvatarTalkInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder addAvatarTalkInfoListBuilder(
          int index) {
        return getAvatarTalkInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeAvatarTalkFinishInfo avatar_talk_info_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder> 
           getAvatarTalkInfoListBuilderList() {
        return getAvatarTalkInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder> 
          getAvatarTalkInfoListFieldBuilder() {
        if (avatarTalkInfoListBuilder_ == null) {
          avatarTalkInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder>(
                  avatarTalkInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          avatarTalkInfoList_ = null;
        }
        return avatarTalkInfoListBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HomeAvatarTalkFinishInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeAvatarTalkFinishInfoNotify)
    private static final emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify();
    }

    public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeAvatarTalkFinishInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeAvatarTalkFinishInfoNotify>() {
      @java.lang.Override
      public HomeAvatarTalkFinishInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeAvatarTalkFinishInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeAvatarTalkFinishInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeAvatarTalkFinishInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoNotifyOuterClass.HomeAvatarTalkFinishInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeAvatarTalkFinishInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeAvatarTalkFinishInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$HomeAvatarTalkFinishInfoNotify.proto\032\036" +
      "HomeAvatarTalkFinishInfo.proto\"Z\n\036HomeAv" +
      "atarTalkFinishInfoNotify\0228\n\025avatar_talk_" +
      "info_list\030\014 \003(\0132\031.HomeAvatarTalkFinishIn" +
      "foB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeAvatarTalkFinishInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeAvatarTalkFinishInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeAvatarTalkFinishInfoNotify_descriptor,
        new java.lang.String[] { "AvatarTalkInfoList", });
    emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}