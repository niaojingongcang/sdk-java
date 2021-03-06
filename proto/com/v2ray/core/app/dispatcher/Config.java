// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/dispatcher/config.proto

package com.v2ray.core.app.dispatcher;

/**
 * Protobuf type {@code v2ray.core.app.dispatcher.Config}
 */
public  final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.app.dispatcher.Config)
    ConfigOrBuilder {
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Config(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.v2ray.core.app.dispatcher.SessionConfig.Builder subBuilder = null;
            if (settings_ != null) {
              subBuilder = settings_.toBuilder();
            }
            settings_ = input.readMessage(com.v2ray.core.app.dispatcher.SessionConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(settings_);
              settings_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.app.dispatcher.ConfigOuterClass.internal_static_v2ray_core_app_dispatcher_Config_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.app.dispatcher.ConfigOuterClass.internal_static_v2ray_core_app_dispatcher_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.app.dispatcher.Config.class, com.v2ray.core.app.dispatcher.Config.Builder.class);
  }

  public static final int SETTINGS_FIELD_NUMBER = 1;
  private com.v2ray.core.app.dispatcher.SessionConfig settings_;
  /**
   * <code>optional .v2ray.core.app.dispatcher.SessionConfig settings = 1;</code>
   */
  public boolean hasSettings() {
    return settings_ != null;
  }
  /**
   * <code>optional .v2ray.core.app.dispatcher.SessionConfig settings = 1;</code>
   */
  public com.v2ray.core.app.dispatcher.SessionConfig getSettings() {
    return settings_ == null ? com.v2ray.core.app.dispatcher.SessionConfig.getDefaultInstance() : settings_;
  }
  /**
   * <code>optional .v2ray.core.app.dispatcher.SessionConfig settings = 1;</code>
   */
  public com.v2ray.core.app.dispatcher.SessionConfigOrBuilder getSettingsOrBuilder() {
    return getSettings();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (settings_ != null) {
      output.writeMessage(1, getSettings());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (settings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSettings());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.v2ray.core.app.dispatcher.Config)) {
      return super.equals(obj);
    }
    com.v2ray.core.app.dispatcher.Config other = (com.v2ray.core.app.dispatcher.Config) obj;

    boolean result = true;
    result = result && (hasSettings() == other.hasSettings());
    if (hasSettings()) {
      result = result && getSettings()
          .equals(other.getSettings());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.app.dispatcher.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.dispatcher.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.dispatcher.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.dispatcher.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.dispatcher.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.dispatcher.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.dispatcher.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.dispatcher.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.dispatcher.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.dispatcher.Config parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.v2ray.core.app.dispatcher.Config prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code v2ray.core.app.dispatcher.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.app.dispatcher.Config)
      com.v2ray.core.app.dispatcher.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.app.dispatcher.ConfigOuterClass.internal_static_v2ray_core_app_dispatcher_Config_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.app.dispatcher.ConfigOuterClass.internal_static_v2ray_core_app_dispatcher_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.app.dispatcher.Config.class, com.v2ray.core.app.dispatcher.Config.Builder.class);
    }

    // Construct using com.v2ray.core.app.dispatcher.Config.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (settingsBuilder_ == null) {
        settings_ = null;
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.app.dispatcher.ConfigOuterClass.internal_static_v2ray_core_app_dispatcher_Config_descriptor;
    }

    public com.v2ray.core.app.dispatcher.Config getDefaultInstanceForType() {
      return com.v2ray.core.app.dispatcher.Config.getDefaultInstance();
    }

    public com.v2ray.core.app.dispatcher.Config build() {
      com.v2ray.core.app.dispatcher.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.app.dispatcher.Config buildPartial() {
      com.v2ray.core.app.dispatcher.Config result = new com.v2ray.core.app.dispatcher.Config(this);
      if (settingsBuilder_ == null) {
        result.settings_ = settings_;
      } else {
        result.settings_ = settingsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.v2ray.core.app.dispatcher.Config) {
        return mergeFrom((com.v2ray.core.app.dispatcher.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.app.dispatcher.Config other) {
      if (other == com.v2ray.core.app.dispatcher.Config.getDefaultInstance()) return this;
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.v2ray.core.app.dispatcher.Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.app.dispatcher.Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.v2ray.core.app.dispatcher.SessionConfig settings_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.app.dispatcher.SessionConfig, com.v2ray.core.app.dispatcher.SessionConfig.Builder, com.v2ray.core.app.dispatcher.SessionConfigOrBuilder> settingsBuilder_;
    /**
     * <code>optional .v2ray.core.app.dispatcher.SessionConfig settings = 1;</code>
     */
    public boolean hasSettings() {
      return settingsBuilder_ != null || settings_ != null;
    }
    /**
     * <code>optional .v2ray.core.app.dispatcher.SessionConfig settings = 1;</code>
     */
    public com.v2ray.core.app.dispatcher.SessionConfig getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? com.v2ray.core.app.dispatcher.SessionConfig.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .v2ray.core.app.dispatcher.SessionConfig settings = 1;</code>
     */
    public Builder setSettings(com.v2ray.core.app.dispatcher.SessionConfig value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
        onChanged();
      } else {
        settingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.app.dispatcher.SessionConfig settings = 1;</code>
     */
    public Builder setSettings(
        com.v2ray.core.app.dispatcher.SessionConfig.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
        onChanged();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.app.dispatcher.SessionConfig settings = 1;</code>
     */
    public Builder mergeSettings(com.v2ray.core.app.dispatcher.SessionConfig value) {
      if (settingsBuilder_ == null) {
        if (settings_ != null) {
          settings_ =
            com.v2ray.core.app.dispatcher.SessionConfig.newBuilder(settings_).mergeFrom(value).buildPartial();
        } else {
          settings_ = value;
        }
        onChanged();
      } else {
        settingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.app.dispatcher.SessionConfig settings = 1;</code>
     */
    public Builder clearSettings() {
      if (settingsBuilder_ == null) {
        settings_ = null;
        onChanged();
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.app.dispatcher.SessionConfig settings = 1;</code>
     */
    public com.v2ray.core.app.dispatcher.SessionConfig.Builder getSettingsBuilder() {
      
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .v2ray.core.app.dispatcher.SessionConfig settings = 1;</code>
     */
    public com.v2ray.core.app.dispatcher.SessionConfigOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            com.v2ray.core.app.dispatcher.SessionConfig.getDefaultInstance() : settings_;
      }
    }
    /**
     * <code>optional .v2ray.core.app.dispatcher.SessionConfig settings = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.app.dispatcher.SessionConfig, com.v2ray.core.app.dispatcher.SessionConfig.Builder, com.v2ray.core.app.dispatcher.SessionConfigOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.app.dispatcher.SessionConfig, com.v2ray.core.app.dispatcher.SessionConfig.Builder, com.v2ray.core.app.dispatcher.SessionConfigOrBuilder>(
                getSettings(),
                getParentForChildren(),
                isClean());
        settings_ = null;
      }
      return settingsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.app.dispatcher.Config)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.app.dispatcher.Config)
  private static final com.v2ray.core.app.dispatcher.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.app.dispatcher.Config();
  }

  public static com.v2ray.core.app.dispatcher.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    public Config parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Config(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.app.dispatcher.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

