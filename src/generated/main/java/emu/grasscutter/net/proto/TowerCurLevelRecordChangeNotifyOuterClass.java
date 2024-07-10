// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerCurLevelRecordChangeNotify.proto

package emu.grasscutter.net.proto;

public final class TowerCurLevelRecordChangeNotifyOuterClass {
  private TowerCurLevelRecordChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerCurLevelRecordChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerCurLevelRecordChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
     * @return Whether the curLevelRecord field is set.
     */
    boolean hasCurLevelRecord();
    /**
     * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
     * @return The curLevelRecord.
     */
    emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord getCurLevelRecord();
    /**
     * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
     */
    emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder getCurLevelRecordOrBuilder();
  }
  /**
   * <pre>
   * 4.6.0
   * CmdId: 24979
   * </pre>
   *
   * Protobuf type {@code TowerCurLevelRecordChangeNotify}
   */
  public static final class TowerCurLevelRecordChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerCurLevelRecordChangeNotify)
      TowerCurLevelRecordChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerCurLevelRecordChangeNotify.newBuilder() to construct.
    private TowerCurLevelRecordChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerCurLevelRecordChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerCurLevelRecordChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TowerCurLevelRecordChangeNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 74: {
              emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder subBuilder = null;
              if (curLevelRecord_ != null) {
                subBuilder = curLevelRecord_.toBuilder();
              }
              curLevelRecord_ = input.readMessage(emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(curLevelRecord_);
                curLevelRecord_ = subBuilder.buildPartial();
              }

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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.internal_static_TowerCurLevelRecordChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.internal_static_TowerCurLevelRecordChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify.class, emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify.Builder.class);
    }

    public static final int CUR_LEVEL_RECORD_FIELD_NUMBER = 9;
    private emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord curLevelRecord_;
    /**
     * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
     * @return Whether the curLevelRecord field is set.
     */
    @java.lang.Override
    public boolean hasCurLevelRecord() {
      return curLevelRecord_ != null;
    }
    /**
     * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
     * @return The curLevelRecord.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord getCurLevelRecord() {
      return curLevelRecord_ == null ? emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord.getDefaultInstance() : curLevelRecord_;
    }
    /**
     * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder getCurLevelRecordOrBuilder() {
      return getCurLevelRecord();
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
      if (curLevelRecord_ != null) {
        output.writeMessage(9, getCurLevelRecord());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curLevelRecord_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getCurLevelRecord());
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify other = (emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify) obj;

      if (hasCurLevelRecord() != other.hasCurLevelRecord()) return false;
      if (hasCurLevelRecord()) {
        if (!getCurLevelRecord()
            .equals(other.getCurLevelRecord())) return false;
      }
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
      if (hasCurLevelRecord()) {
        hash = (37 * hash) + CUR_LEVEL_RECORD_FIELD_NUMBER;
        hash = (53 * hash) + getCurLevelRecord().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify prototype) {
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
     * 4.6.0
     * CmdId: 24979
     * </pre>
     *
     * Protobuf type {@code TowerCurLevelRecordChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerCurLevelRecordChangeNotify)
        emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.internal_static_TowerCurLevelRecordChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.internal_static_TowerCurLevelRecordChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify.class, emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (curLevelRecordBuilder_ == null) {
          curLevelRecord_ = null;
        } else {
          curLevelRecord_ = null;
          curLevelRecordBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.internal_static_TowerCurLevelRecordChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify build() {
        emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify buildPartial() {
        emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify result = new emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify(this);
        if (curLevelRecordBuilder_ == null) {
          result.curLevelRecord_ = curLevelRecord_;
        } else {
          result.curLevelRecord_ = curLevelRecordBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify other) {
        if (other == emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify.getDefaultInstance()) return this;
        if (other.hasCurLevelRecord()) {
          mergeCurLevelRecord(other.getCurLevelRecord());
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
        emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord curLevelRecord_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord, emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder, emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder> curLevelRecordBuilder_;
      /**
       * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
       * @return Whether the curLevelRecord field is set.
       */
      public boolean hasCurLevelRecord() {
        return curLevelRecordBuilder_ != null || curLevelRecord_ != null;
      }
      /**
       * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
       * @return The curLevelRecord.
       */
      public emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord getCurLevelRecord() {
        if (curLevelRecordBuilder_ == null) {
          return curLevelRecord_ == null ? emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord.getDefaultInstance() : curLevelRecord_;
        } else {
          return curLevelRecordBuilder_.getMessage();
        }
      }
      /**
       * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
       */
      public Builder setCurLevelRecord(emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord value) {
        if (curLevelRecordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          curLevelRecord_ = value;
          onChanged();
        } else {
          curLevelRecordBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
       */
      public Builder setCurLevelRecord(
          emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder builderForValue) {
        if (curLevelRecordBuilder_ == null) {
          curLevelRecord_ = builderForValue.build();
          onChanged();
        } else {
          curLevelRecordBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
       */
      public Builder mergeCurLevelRecord(emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord value) {
        if (curLevelRecordBuilder_ == null) {
          if (curLevelRecord_ != null) {
            curLevelRecord_ =
              emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord.newBuilder(curLevelRecord_).mergeFrom(value).buildPartial();
          } else {
            curLevelRecord_ = value;
          }
          onChanged();
        } else {
          curLevelRecordBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
       */
      public Builder clearCurLevelRecord() {
        if (curLevelRecordBuilder_ == null) {
          curLevelRecord_ = null;
          onChanged();
        } else {
          curLevelRecord_ = null;
          curLevelRecordBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
       */
      public emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder getCurLevelRecordBuilder() {
        
        onChanged();
        return getCurLevelRecordFieldBuilder().getBuilder();
      }
      /**
       * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
       */
      public emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder getCurLevelRecordOrBuilder() {
        if (curLevelRecordBuilder_ != null) {
          return curLevelRecordBuilder_.getMessageOrBuilder();
        } else {
          return curLevelRecord_ == null ?
              emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord.getDefaultInstance() : curLevelRecord_;
        }
      }
      /**
       * <code>.TowerCurLevelRecord cur_level_record = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord, emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder, emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder> 
          getCurLevelRecordFieldBuilder() {
        if (curLevelRecordBuilder_ == null) {
          curLevelRecordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord, emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder, emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder>(
                  getCurLevelRecord(),
                  getParentForChildren(),
                  isClean());
          curLevelRecord_ = null;
        }
        return curLevelRecordBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TowerCurLevelRecordChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:TowerCurLevelRecordChangeNotify)
    private static final emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify();
    }

    public static emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerCurLevelRecordChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<TowerCurLevelRecordChangeNotify>() {
      @java.lang.Override
      public TowerCurLevelRecordChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TowerCurLevelRecordChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TowerCurLevelRecordChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerCurLevelRecordChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerCurLevelRecordChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerCurLevelRecordChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%TowerCurLevelRecordChangeNotify.proto\032" +
      "\031TowerCurLevelRecord.proto\"Q\n\037TowerCurLe" +
      "velRecordChangeNotify\022.\n\020cur_level_recor" +
      "d\030\t \001(\0132\024.TowerCurLevelRecordB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.getDescriptor(),
        });
    internal_static_TowerCurLevelRecordChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerCurLevelRecordChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerCurLevelRecordChangeNotify_descriptor,
        new java.lang.String[] { "CurLevelRecord", });
    emu.grasscutter.net.proto.TowerCurLevelRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
