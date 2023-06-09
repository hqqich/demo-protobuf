// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc/Person.proto

package org.example.protobuf;

/**
 * Protobuf type {@code org.example.PersonList}
 */
public final class PersonList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.example.PersonList)
    PersonListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersonList.newBuilder() to construct.
  private PersonList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersonList() {
    person_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PersonList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PersonList(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              person_ = new java.util.ArrayList<org.example.protobuf.Person>();
              mutable_bitField0_ |= 0x00000001;
            }
            person_.add(
                input.readMessage(org.example.protobuf.Person.parser(), extensionRegistry));
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        person_ = java.util.Collections.unmodifiableList(person_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.protobuf.PersonListProtos.internal_static_org_example_PersonList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.protobuf.PersonListProtos.internal_static_org_example_PersonList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.protobuf.PersonList.class, org.example.protobuf.PersonList.Builder.class);
  }

  public static final int PERSON_FIELD_NUMBER = 1;
  private java.util.List<org.example.protobuf.Person> person_;
  /**
   * <code>repeated .org.example.Person person = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.example.protobuf.Person> getPersonList() {
    return person_;
  }
  /**
   * <code>repeated .org.example.Person person = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.example.protobuf.PersonOrBuilder> 
      getPersonOrBuilderList() {
    return person_;
  }
  /**
   * <code>repeated .org.example.Person person = 1;</code>
   */
  @java.lang.Override
  public int getPersonCount() {
    return person_.size();
  }
  /**
   * <code>repeated .org.example.Person person = 1;</code>
   */
  @java.lang.Override
  public org.example.protobuf.Person getPerson(int index) {
    return person_.get(index);
  }
  /**
   * <code>repeated .org.example.Person person = 1;</code>
   */
  @java.lang.Override
  public org.example.protobuf.PersonOrBuilder getPersonOrBuilder(
      int index) {
    return person_.get(index);
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
    for (int i = 0; i < person_.size(); i++) {
      output.writeMessage(1, person_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < person_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, person_.get(i));
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
    if (!(obj instanceof org.example.protobuf.PersonList)) {
      return super.equals(obj);
    }
    org.example.protobuf.PersonList other = (org.example.protobuf.PersonList) obj;

    if (!getPersonList()
        .equals(other.getPersonList())) return false;
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
    if (getPersonCount() > 0) {
      hash = (37 * hash) + PERSON_FIELD_NUMBER;
      hash = (53 * hash) + getPersonList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.protobuf.PersonList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.protobuf.PersonList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.protobuf.PersonList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.protobuf.PersonList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.protobuf.PersonList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.protobuf.PersonList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.protobuf.PersonList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.protobuf.PersonList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.protobuf.PersonList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.protobuf.PersonList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.protobuf.PersonList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.protobuf.PersonList parseFrom(
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
  public static Builder newBuilder(org.example.protobuf.PersonList prototype) {
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
   * Protobuf type {@code org.example.PersonList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.example.PersonList)
      org.example.protobuf.PersonListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.protobuf.PersonListProtos.internal_static_org_example_PersonList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.protobuf.PersonListProtos.internal_static_org_example_PersonList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.protobuf.PersonList.class, org.example.protobuf.PersonList.Builder.class);
    }

    // Construct using org.example.protobuf.PersonList.newBuilder()
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
        getPersonFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (personBuilder_ == null) {
        person_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        personBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.protobuf.PersonListProtos.internal_static_org_example_PersonList_descriptor;
    }

    @java.lang.Override
    public org.example.protobuf.PersonList getDefaultInstanceForType() {
      return org.example.protobuf.PersonList.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.protobuf.PersonList build() {
      org.example.protobuf.PersonList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.protobuf.PersonList buildPartial() {
      org.example.protobuf.PersonList result = new org.example.protobuf.PersonList(this);
      int from_bitField0_ = bitField0_;
      if (personBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          person_ = java.util.Collections.unmodifiableList(person_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.person_ = person_;
      } else {
        result.person_ = personBuilder_.build();
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
      if (other instanceof org.example.protobuf.PersonList) {
        return mergeFrom((org.example.protobuf.PersonList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.protobuf.PersonList other) {
      if (other == org.example.protobuf.PersonList.getDefaultInstance()) return this;
      if (personBuilder_ == null) {
        if (!other.person_.isEmpty()) {
          if (person_.isEmpty()) {
            person_ = other.person_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePersonIsMutable();
            person_.addAll(other.person_);
          }
          onChanged();
        }
      } else {
        if (!other.person_.isEmpty()) {
          if (personBuilder_.isEmpty()) {
            personBuilder_.dispose();
            personBuilder_ = null;
            person_ = other.person_;
            bitField0_ = (bitField0_ & ~0x00000001);
            personBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPersonFieldBuilder() : null;
          } else {
            personBuilder_.addAllMessages(other.person_);
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
      org.example.protobuf.PersonList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.protobuf.PersonList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.example.protobuf.Person> person_ =
      java.util.Collections.emptyList();
    private void ensurePersonIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        person_ = new java.util.ArrayList<org.example.protobuf.Person>(person_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.protobuf.Person, org.example.protobuf.Person.Builder, org.example.protobuf.PersonOrBuilder> personBuilder_;

    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public java.util.List<org.example.protobuf.Person> getPersonList() {
      if (personBuilder_ == null) {
        return java.util.Collections.unmodifiableList(person_);
      } else {
        return personBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public int getPersonCount() {
      if (personBuilder_ == null) {
        return person_.size();
      } else {
        return personBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public org.example.protobuf.Person getPerson(int index) {
      if (personBuilder_ == null) {
        return person_.get(index);
      } else {
        return personBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public Builder setPerson(
        int index, org.example.protobuf.Person value) {
      if (personBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonIsMutable();
        person_.set(index, value);
        onChanged();
      } else {
        personBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public Builder setPerson(
        int index, org.example.protobuf.Person.Builder builderForValue) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.set(index, builderForValue.build());
        onChanged();
      } else {
        personBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public Builder addPerson(org.example.protobuf.Person value) {
      if (personBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonIsMutable();
        person_.add(value);
        onChanged();
      } else {
        personBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public Builder addPerson(
        int index, org.example.protobuf.Person value) {
      if (personBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonIsMutable();
        person_.add(index, value);
        onChanged();
      } else {
        personBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public Builder addPerson(
        org.example.protobuf.Person.Builder builderForValue) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.add(builderForValue.build());
        onChanged();
      } else {
        personBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public Builder addPerson(
        int index, org.example.protobuf.Person.Builder builderForValue) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.add(index, builderForValue.build());
        onChanged();
      } else {
        personBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public Builder addAllPerson(
        java.lang.Iterable<? extends org.example.protobuf.Person> values) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, person_);
        onChanged();
      } else {
        personBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public Builder clearPerson() {
      if (personBuilder_ == null) {
        person_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        personBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public Builder removePerson(int index) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.remove(index);
        onChanged();
      } else {
        personBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public org.example.protobuf.Person.Builder getPersonBuilder(
        int index) {
      return getPersonFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public org.example.protobuf.PersonOrBuilder getPersonOrBuilder(
        int index) {
      if (personBuilder_ == null) {
        return person_.get(index);  } else {
        return personBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public java.util.List<? extends org.example.protobuf.PersonOrBuilder> 
         getPersonOrBuilderList() {
      if (personBuilder_ != null) {
        return personBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(person_);
      }
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public org.example.protobuf.Person.Builder addPersonBuilder() {
      return getPersonFieldBuilder().addBuilder(
          org.example.protobuf.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public org.example.protobuf.Person.Builder addPersonBuilder(
        int index) {
      return getPersonFieldBuilder().addBuilder(
          index, org.example.protobuf.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .org.example.Person person = 1;</code>
     */
    public java.util.List<org.example.protobuf.Person.Builder> 
         getPersonBuilderList() {
      return getPersonFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.protobuf.Person, org.example.protobuf.Person.Builder, org.example.protobuf.PersonOrBuilder> 
        getPersonFieldBuilder() {
      if (personBuilder_ == null) {
        personBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.example.protobuf.Person, org.example.protobuf.Person.Builder, org.example.protobuf.PersonOrBuilder>(
                person_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        person_ = null;
      }
      return personBuilder_;
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


    // @@protoc_insertion_point(builder_scope:org.example.PersonList)
  }

  // @@protoc_insertion_point(class_scope:org.example.PersonList)
  private static final org.example.protobuf.PersonList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.protobuf.PersonList();
  }

  public static org.example.protobuf.PersonList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonList>
      PARSER = new com.google.protobuf.AbstractParser<PersonList>() {
    @java.lang.Override
    public PersonList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PersonList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PersonList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.protobuf.PersonList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

