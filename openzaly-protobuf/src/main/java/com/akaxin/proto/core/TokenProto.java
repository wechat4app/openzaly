// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/token.proto

package com.akaxin.proto.core;

public final class TokenProto {
  private TokenProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   *token类型
   * </pre>
   *
   * Protobuf enum {@code core.TokenType}
   */
  public enum TokenType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *未知token
     * </pre>
     *
     * <code>UNKNOW_TOKEN = 0;</code>
     */
    UNKNOW_TOKEN(0),
    /**
     * <pre>
     *用户token
     * </pre>
     *
     * <code>USER_TOKEN = 1;</code>
     */
    USER_TOKEN(1),
    /**
     * <pre>
     *手机token
     * </pre>
     *
     * <code>PHONE_TOKEN = 2;</code>
     */
    PHONE_TOKEN(2),
    /**
     * <pre>
     *群组token，用与二维码加群使用
     * </pre>
     *
     * <code>GROUP_TOKEN = 3;</code>
     */
    GROUP_TOKEN(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     *未知token
     * </pre>
     *
     * <code>UNKNOW_TOKEN = 0;</code>
     */
    public static final int UNKNOW_TOKEN_VALUE = 0;
    /**
     * <pre>
     *用户token
     * </pre>
     *
     * <code>USER_TOKEN = 1;</code>
     */
    public static final int USER_TOKEN_VALUE = 1;
    /**
     * <pre>
     *手机token
     * </pre>
     *
     * <code>PHONE_TOKEN = 2;</code>
     */
    public static final int PHONE_TOKEN_VALUE = 2;
    /**
     * <pre>
     *群组token，用与二维码加群使用
     * </pre>
     *
     * <code>GROUP_TOKEN = 3;</code>
     */
    public static final int GROUP_TOKEN_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TokenType valueOf(int value) {
      return forNumber(value);
    }

    public static TokenType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOW_TOKEN;
        case 1: return USER_TOKEN;
        case 2: return PHONE_TOKEN;
        case 3: return GROUP_TOKEN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TokenType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TokenType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TokenType>() {
            public TokenType findValueByNumber(int number) {
              return TokenType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.akaxin.proto.core.TokenProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final TokenType[] VALUES = values();

    public static TokenType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TokenType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:core.TokenType)
  }

  /**
   * Protobuf enum {@code core.GroupTokenStatus}
   */
  public enum GroupTokenStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *取消
     * </pre>
     *
     * <code>GROUP_TOKEN_ABOLISH = 0;</code>
     */
    GROUP_TOKEN_ABOLISH(0),
    /**
     * <pre>
     *所有用户可用
     * </pre>
     *
     * <code>GROUP_TOKEN_AVAILABLE = 1;</code>
     */
    GROUP_TOKEN_AVAILABLE(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     *取消
     * </pre>
     *
     * <code>GROUP_TOKEN_ABOLISH = 0;</code>
     */
    public static final int GROUP_TOKEN_ABOLISH_VALUE = 0;
    /**
     * <pre>
     *所有用户可用
     * </pre>
     *
     * <code>GROUP_TOKEN_AVAILABLE = 1;</code>
     */
    public static final int GROUP_TOKEN_AVAILABLE_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GroupTokenStatus valueOf(int value) {
      return forNumber(value);
    }

    public static GroupTokenStatus forNumber(int value) {
      switch (value) {
        case 0: return GROUP_TOKEN_ABOLISH;
        case 1: return GROUP_TOKEN_AVAILABLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GroupTokenStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GroupTokenStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GroupTokenStatus>() {
            public GroupTokenStatus findValueByNumber(int number) {
              return GroupTokenStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.akaxin.proto.core.TokenProto.getDescriptor().getEnumTypes().get(1);
    }

    private static final GroupTokenStatus[] VALUES = values();

    public static GroupTokenStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GroupTokenStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:core.GroupTokenStatus)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020core/token.proto\022\004core*O\n\tTokenType\022\020\n" +
      "\014UNKNOW_TOKEN\020\000\022\016\n\nUSER_TOKEN\020\001\022\017\n\013PHONE" +
      "_TOKEN\020\002\022\017\n\013GROUP_TOKEN\020\003*F\n\020GroupTokenS" +
      "tatus\022\027\n\023GROUP_TOKEN_ABOLISH\020\000\022\031\n\025GROUP_" +
      "TOKEN_AVAILABLE\020\001B#\n\025com.akaxin.proto.co" +
      "reB\nTokenProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
