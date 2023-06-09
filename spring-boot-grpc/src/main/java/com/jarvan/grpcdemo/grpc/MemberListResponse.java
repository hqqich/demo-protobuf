// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MemberListSerbice.proto

package com.jarvan.grpcdemo.grpc;

/**
 * Protobuf type {@code com.jarvan.grpcdemo.grpc.MemberListResponse}
 */
public  final class MemberListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.jarvan.grpcdemo.grpc.MemberListResponse)
    MemberListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MemberListResponse.newBuilder() to construct.
  private MemberListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemberListResponse() {
    member_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new MemberListResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MemberListResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              member_ = new java.util.ArrayList<Member>();
              mutable_bitField0_ |= 0x00000001;
            }
            member_.add(
                input.readMessage(Member.parser(), extensionRegistry));
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
        member_ = java.util.Collections.unmodifiableList(member_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MemberListSerbice.internal_static_com_jarvan_grpcdemo_grpc_MemberListResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MemberListSerbice.internal_static_com_jarvan_grpcdemo_grpc_MemberListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MemberListResponse.class, Builder.class);
  }

  public static final int MEMBER_FIELD_NUMBER = 1;
  private java.util.List<Member> member_;
  /**
   * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
   */
  public java.util.List<Member> getMemberList() {
    return member_;
  }
  /**
   * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
   */
  public java.util.List<? extends MemberOrBuilder>
      getMemberOrBuilderList() {
    return member_;
  }
  /**
   * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
   */
  public int getMemberCount() {
    return member_.size();
  }
  /**
   * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
   */
  public Member getMember(int index) {
    return member_.get(index);
  }
  /**
   * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
   */
  public MemberOrBuilder getMemberOrBuilder(
      int index) {
    return member_.get(index);
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
    for (int i = 0; i < member_.size(); i++) {
      output.writeMessage(1, member_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < member_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, member_.get(i));
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
    if (!(obj instanceof MemberListResponse)) {
      return super.equals(obj);
    }
    MemberListResponse other = (MemberListResponse) obj;

    if (!getMemberList()
        .equals(other.getMemberList())) return false;
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
    if (getMemberCount() > 0) {
      hash = (37 * hash) + MEMBER_FIELD_NUMBER;
      hash = (53 * hash) + getMemberList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static MemberListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MemberListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MemberListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MemberListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MemberListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MemberListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MemberListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MemberListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static MemberListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static MemberListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static MemberListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MemberListResponse parseFrom(
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
  public static Builder newBuilder(MemberListResponse prototype) {
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
   * Protobuf type {@code com.jarvan.grpcdemo.grpc.MemberListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.jarvan.grpcdemo.grpc.MemberListResponse)
      MemberListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MemberListSerbice.internal_static_com_jarvan_grpcdemo_grpc_MemberListResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MemberListSerbice.internal_static_com_jarvan_grpcdemo_grpc_MemberListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MemberListResponse.class, Builder.class);
    }

    // Construct using com.jarvan.grpcdemo.grpc.MemberListResponse.newBuilder()
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
        getMemberFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (memberBuilder_ == null) {
        member_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        memberBuilder_.clear();
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MemberListSerbice.internal_static_com_jarvan_grpcdemo_grpc_MemberListResponse_descriptor;
    }

    @Override
    public MemberListResponse getDefaultInstanceForType() {
      return MemberListResponse.getDefaultInstance();
    }

    @Override
    public MemberListResponse build() {
      MemberListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public MemberListResponse buildPartial() {
      MemberListResponse result = new MemberListResponse(this);
      int from_bitField0_ = bitField0_;
      if (memberBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          member_ = java.util.Collections.unmodifiableList(member_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.member_ = member_;
      } else {
        result.member_ = memberBuilder_.build();
      }
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
      if (other instanceof MemberListResponse) {
        return mergeFrom((MemberListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MemberListResponse other) {
      if (other == MemberListResponse.getDefaultInstance()) return this;
      if (memberBuilder_ == null) {
        if (!other.member_.isEmpty()) {
          if (member_.isEmpty()) {
            member_ = other.member_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMemberIsMutable();
            member_.addAll(other.member_);
          }
          onChanged();
        }
      } else {
        if (!other.member_.isEmpty()) {
          if (memberBuilder_.isEmpty()) {
            memberBuilder_.dispose();
            memberBuilder_ = null;
            member_ = other.member_;
            bitField0_ = (bitField0_ & ~0x00000001);
            memberBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMemberFieldBuilder() : null;
          } else {
            memberBuilder_.addAllMessages(other.member_);
          }
        }
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
      MemberListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (MemberListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<Member> member_ =
      java.util.Collections.emptyList();
    private void ensureMemberIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        member_ = new java.util.ArrayList<Member>(member_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        Member, Member.Builder, MemberOrBuilder> memberBuilder_;

    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public java.util.List<Member> getMemberList() {
      if (memberBuilder_ == null) {
        return java.util.Collections.unmodifiableList(member_);
      } else {
        return memberBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public int getMemberCount() {
      if (memberBuilder_ == null) {
        return member_.size();
      } else {
        return memberBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public Member getMember(int index) {
      if (memberBuilder_ == null) {
        return member_.get(index);
      } else {
        return memberBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public Builder setMember(
        int index, Member value) {
      if (memberBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMemberIsMutable();
        member_.set(index, value);
        onChanged();
      } else {
        memberBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public Builder setMember(
        int index, Member.Builder builderForValue) {
      if (memberBuilder_ == null) {
        ensureMemberIsMutable();
        member_.set(index, builderForValue.build());
        onChanged();
      } else {
        memberBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public Builder addMember(Member value) {
      if (memberBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMemberIsMutable();
        member_.add(value);
        onChanged();
      } else {
        memberBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public Builder addMember(
        int index, Member value) {
      if (memberBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMemberIsMutable();
        member_.add(index, value);
        onChanged();
      } else {
        memberBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public Builder addMember(
        Member.Builder builderForValue) {
      if (memberBuilder_ == null) {
        ensureMemberIsMutable();
        member_.add(builderForValue.build());
        onChanged();
      } else {
        memberBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public Builder addMember(
        int index, Member.Builder builderForValue) {
      if (memberBuilder_ == null) {
        ensureMemberIsMutable();
        member_.add(index, builderForValue.build());
        onChanged();
      } else {
        memberBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public Builder addAllMember(
        Iterable<? extends Member> values) {
      if (memberBuilder_ == null) {
        ensureMemberIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, member_);
        onChanged();
      } else {
        memberBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public Builder clearMember() {
      if (memberBuilder_ == null) {
        member_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        memberBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public Builder removeMember(int index) {
      if (memberBuilder_ == null) {
        ensureMemberIsMutable();
        member_.remove(index);
        onChanged();
      } else {
        memberBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public Member.Builder getMemberBuilder(
        int index) {
      return getMemberFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public MemberOrBuilder getMemberOrBuilder(
        int index) {
      if (memberBuilder_ == null) {
        return member_.get(index);  } else {
        return memberBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public java.util.List<? extends MemberOrBuilder>
         getMemberOrBuilderList() {
      if (memberBuilder_ != null) {
        return memberBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(member_);
      }
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public Member.Builder addMemberBuilder() {
      return getMemberFieldBuilder().addBuilder(
          Member.getDefaultInstance());
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public Member.Builder addMemberBuilder(
        int index) {
      return getMemberFieldBuilder().addBuilder(
          index, Member.getDefaultInstance());
    }
    /**
     * <code>repeated .com.jarvan.grpcdemo.grpc.Member member = 1;</code>
     */
    public java.util.List<Member.Builder>
         getMemberBuilderList() {
      return getMemberFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Member, Member.Builder, MemberOrBuilder>
        getMemberFieldBuilder() {
      if (memberBuilder_ == null) {
        memberBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            Member, Member.Builder, MemberOrBuilder>(
                member_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        member_ = null;
      }
      return memberBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.jarvan.grpcdemo.grpc.MemberListResponse)
  }

  // @@protoc_insertion_point(class_scope:com.jarvan.grpcdemo.grpc.MemberListResponse)
  private static final MemberListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MemberListResponse();
  }

  public static MemberListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemberListResponse>
      PARSER = new com.google.protobuf.AbstractParser<MemberListResponse>() {
    @Override
    public MemberListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MemberListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MemberListResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<MemberListResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public MemberListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

