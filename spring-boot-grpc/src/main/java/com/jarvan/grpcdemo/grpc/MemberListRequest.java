// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MemberListSerbice.proto

package com.jarvan.grpcdemo.grpc;

/**
 * Protobuf type {@code com.jarvan.grpcdemo.grpc.MemberListRequest}
 */
public  final class MemberListRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.jarvan.grpcdemo.grpc.MemberListRequest)
    MemberListRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MemberListRequest.newBuilder() to construct.
  private MemberListRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemberListRequest() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new MemberListRequest();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MemberListRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          case 8: {

            page_ = input.readInt32();
            break;
          }
          case 16: {

            perPage_ = input.readInt32();
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
    return MemberListSerbice.internal_static_com_jarvan_grpcdemo_grpc_MemberListRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MemberListSerbice.internal_static_com_jarvan_grpcdemo_grpc_MemberListRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MemberListRequest.class, Builder.class);
  }

  public static final int PAGE_FIELD_NUMBER = 1;
  private int page_;
  /**
   * <code>int32 page = 1;</code>
   */
  public int getPage() {
    return page_;
  }

  public static final int PER_PAGE_FIELD_NUMBER = 2;
  private int perPage_;
  /**
   * <code>int32 per_page = 2;</code>
   */
  public int getPerPage() {
    return perPage_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (page_ != 0) {
      output.writeInt32(1, page_);
    }
    if (perPage_ != 0) {
      output.writeInt32(2, perPage_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (page_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, page_);
    }
    if (perPage_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, perPage_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof MemberListRequest)) {
      return super.equals(obj);
    }
    MemberListRequest other = (MemberListRequest) obj;

    if (getPage()
        != other.getPage()) return false;
    if (getPerPage()
        != other.getPerPage()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage();
    hash = (37 * hash) + PER_PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPerPage();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static MemberListRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MemberListRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MemberListRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MemberListRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MemberListRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MemberListRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MemberListRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MemberListRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static MemberListRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static MemberListRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static MemberListRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MemberListRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(MemberListRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.jarvan.grpcdemo.grpc.MemberListRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.jarvan.grpcdemo.grpc.MemberListRequest)
      MemberListRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MemberListSerbice.internal_static_com_jarvan_grpcdemo_grpc_MemberListRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MemberListSerbice.internal_static_com_jarvan_grpcdemo_grpc_MemberListRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MemberListRequest.class, Builder.class);
    }

    // Construct using com.jarvan.grpcdemo.grpc.MemberListRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      page_ = 0;

      perPage_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MemberListSerbice.internal_static_com_jarvan_grpcdemo_grpc_MemberListRequest_descriptor;
    }

    @Override
    public MemberListRequest getDefaultInstanceForType() {
      return MemberListRequest.getDefaultInstance();
    }

    @Override
    public MemberListRequest build() {
      MemberListRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public MemberListRequest buildPartial() {
      MemberListRequest result = new MemberListRequest(this);
      result.page_ = page_;
      result.perPage_ = perPage_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof MemberListRequest) {
        return mergeFrom((MemberListRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MemberListRequest other) {
      if (other == MemberListRequest.getDefaultInstance()) return this;
      if (other.getPage() != 0) {
        setPage(other.getPage());
      }
      if (other.getPerPage() != 0) {
        setPerPage(other.getPerPage());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      MemberListRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (MemberListRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int page_ ;
    /**
     * <code>int32 page = 1;</code>
     */
    public int getPage() {
      return page_;
    }
    /**
     * <code>int32 page = 1;</code>
     */
    public Builder setPage(int value) {
      
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page = 1;</code>
     */
    public Builder clearPage() {
      
      page_ = 0;
      onChanged();
      return this;
    }

    private int perPage_ ;
    /**
     * <code>int32 per_page = 2;</code>
     */
    public int getPerPage() {
      return perPage_;
    }
    /**
     * <code>int32 per_page = 2;</code>
     */
    public Builder setPerPage(int value) {
      
      perPage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 per_page = 2;</code>
     */
    public Builder clearPerPage() {
      
      perPage_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.jarvan.grpcdemo.grpc.MemberListRequest)
  }

  // @@protoc_insertion_point(class_scope:com.jarvan.grpcdemo.grpc.MemberListRequest)
  private static final MemberListRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MemberListRequest();
  }

  public static MemberListRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemberListRequest>
      PARSER = new com.google.protobuf.AbstractParser<MemberListRequest>() {
    @Override
    public MemberListRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MemberListRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MemberListRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<MemberListRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public MemberListRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

