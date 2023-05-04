package data;

public final class StudentOuterClass {
  private StudentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StudentOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Student)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <code>optional string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional string surname = 2;</code>
     * @return Whether the surname field is set.
     */
    boolean hasSurname();
    /**
     * <code>optional string surname = 2;</code>
     * @return The surname.
     */
    java.lang.String getSurname();
    /**
     * <code>optional string surname = 2;</code>
     * @return The bytes for surname.
     */
    com.google.protobuf.ByteString
        getSurnameBytes();

    /**
     * <code>optional int32 yeadOfBirth = 3;</code>
     * @return Whether the yeadOfBirth field is set.
     */
    boolean hasYeadOfBirth();
    /**
     * <code>optional int32 yeadOfBirth = 3;</code>
     * @return The yeadOfBirth.
     */
    int getYeadOfBirth();

    /**
     * <code>optional .Student.Residence residence = 4;</code>
     * @return Whether the residence field is set.
     */
    boolean hasResidence();
    /**
     * <code>optional .Student.Residence residence = 4;</code>
     * @return The residence.
     */
    StudentOuterClass.Student.Residence getResidence();
    /**
     * <code>optional .Student.Residence residence = 4;</code>
     */
    StudentOuterClass.Student.ResidenceOrBuilder getResidenceOrBuilder();

    /**
     * <code>repeated .Student.Exam exams = 5;</code>
     */
    java.util.List<StudentOuterClass.Student.Exam> 
        getExamsList();
    /**
     * <code>repeated .Student.Exam exams = 5;</code>
     */
    StudentOuterClass.Student.Exam getExams(int index);
    /**
     * <code>repeated .Student.Exam exams = 5;</code>
     */
    int getExamsCount();
    /**
     * <code>repeated .Student.Exam exams = 5;</code>
     */
    java.util.List<? extends StudentOuterClass.Student.ExamOrBuilder> 
        getExamsOrBuilderList();
    /**
     * <code>repeated .Student.Exam exams = 5;</code>
     */
    StudentOuterClass.Student.ExamOrBuilder getExamsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code Student}
   */
  public static final class Student extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Student)
      StudentOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Student.newBuilder() to construct.
    private Student(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Student() {
      name_ = "";
      surname_ = "";
      exams_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Student();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return StudentOuterClass.internal_static_Student_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return StudentOuterClass.internal_static_Student_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StudentOuterClass.Student.class, StudentOuterClass.Student.Builder.class);
    }

    public interface ResidenceOrBuilder extends
        // @@protoc_insertion_point(interface_extends:Student.Residence)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <code>optional string street = 1;</code>
       * @return Whether the street field is set.
       */
      boolean hasStreet();
      /**
       * <code>optional string street = 1;</code>
       * @return The street.
       */
      java.lang.String getStreet();
      /**
       * <code>optional string street = 1;</code>
       * @return The bytes for street.
       */
      com.google.protobuf.ByteString
          getStreetBytes();

      /**
       * <code>optional int32 buildingNumber = 2;</code>
       * @return Whether the buildingNumber field is set.
       */
      boolean hasBuildingNumber();
      /**
       * <code>optional int32 buildingNumber = 2;</code>
       * @return The buildingNumber.
       */
      int getBuildingNumber();
    }
    /**
     * Protobuf type {@code Student.Residence}
     */
    public static final class Residence extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:Student.Residence)
        ResidenceOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use Residence.newBuilder() to construct.
      private Residence(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private Residence() {
        street_ = "";
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new Residence();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return StudentOuterClass.internal_static_Student_Residence_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return StudentOuterClass.internal_static_Student_Residence_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                StudentOuterClass.Student.Residence.class, StudentOuterClass.Student.Residence.Builder.class);
      }

      private int bitField0_;
      public static final int STREET_FIELD_NUMBER = 1;
      @SuppressWarnings("serial")
      private volatile java.lang.Object street_ = "";
      /**
       * <code>optional string street = 1;</code>
       * @return Whether the street field is set.
       */
      @java.lang.Override
      public boolean hasStreet() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string street = 1;</code>
       * @return The street.
       */
      @java.lang.Override
      public java.lang.String getStreet() {
        java.lang.Object ref = street_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            street_ = s;
          }
          return s;
        }
      }
      /**
       * <code>optional string street = 1;</code>
       * @return The bytes for street.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getStreetBytes() {
        java.lang.Object ref = street_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          street_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int BUILDINGNUMBER_FIELD_NUMBER = 2;
      private int buildingNumber_ = 0;
      /**
       * <code>optional int32 buildingNumber = 2;</code>
       * @return Whether the buildingNumber field is set.
       */
      @java.lang.Override
      public boolean hasBuildingNumber() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int32 buildingNumber = 2;</code>
       * @return The buildingNumber.
       */
      @java.lang.Override
      public int getBuildingNumber() {
        return buildingNumber_;
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
        if (((bitField0_ & 0x00000001) != 0)) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 1, street_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          output.writeInt32(2, buildingNumber_);
        }
        getUnknownFields().writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, street_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt32Size(2, buildingNumber_);
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof StudentOuterClass.Student.Residence)) {
          return super.equals(obj);
        }
        StudentOuterClass.Student.Residence other = (StudentOuterClass.Student.Residence) obj;

        if (hasStreet() != other.hasStreet()) return false;
        if (hasStreet()) {
          if (!getStreet()
              .equals(other.getStreet())) return false;
        }
        if (hasBuildingNumber() != other.hasBuildingNumber()) return false;
        if (hasBuildingNumber()) {
          if (getBuildingNumber()
              != other.getBuildingNumber()) return false;
        }
        if (!getUnknownFields().equals(other.getUnknownFields())) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasStreet()) {
          hash = (37 * hash) + STREET_FIELD_NUMBER;
          hash = (53 * hash) + getStreet().hashCode();
        }
        if (hasBuildingNumber()) {
          hash = (37 * hash) + BUILDINGNUMBER_FIELD_NUMBER;
          hash = (53 * hash) + getBuildingNumber();
        }
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static StudentOuterClass.Student.Residence parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static StudentOuterClass.Student.Residence parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static StudentOuterClass.Student.Residence parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static StudentOuterClass.Student.Residence parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static StudentOuterClass.Student.Residence parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static StudentOuterClass.Student.Residence parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static StudentOuterClass.Student.Residence parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static StudentOuterClass.Student.Residence parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static StudentOuterClass.Student.Residence parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static StudentOuterClass.Student.Residence parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static StudentOuterClass.Student.Residence parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static StudentOuterClass.Student.Residence parseFrom(
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
      public static Builder newBuilder(StudentOuterClass.Student.Residence prototype) {
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
       * Protobuf type {@code Student.Residence}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:Student.Residence)
          StudentOuterClass.Student.ResidenceOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return StudentOuterClass.internal_static_Student_Residence_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return StudentOuterClass.internal_static_Student_Residence_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  StudentOuterClass.Student.Residence.class, StudentOuterClass.Student.Residence.Builder.class);
        }

        // Construct using StudentOuterClass.Student.Residence.newBuilder()
        private Builder() {

        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);

        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          bitField0_ = 0;
          street_ = "";
          buildingNumber_ = 0;
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return StudentOuterClass.internal_static_Student_Residence_descriptor;
        }

        @java.lang.Override
        public StudentOuterClass.Student.Residence getDefaultInstanceForType() {
          return StudentOuterClass.Student.Residence.getDefaultInstance();
        }

        @java.lang.Override
        public StudentOuterClass.Student.Residence build() {
          StudentOuterClass.Student.Residence result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public StudentOuterClass.Student.Residence buildPartial() {
          StudentOuterClass.Student.Residence result = new StudentOuterClass.Student.Residence(this);
          if (bitField0_ != 0) { buildPartial0(result); }
          onBuilt();
          return result;
        }

        private void buildPartial0(StudentOuterClass.Student.Residence result) {
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            result.street_ = street_;
            to_bitField0_ |= 0x00000001;
          }
          if (((from_bitField0_ & 0x00000002) != 0)) {
            result.buildingNumber_ = buildingNumber_;
            to_bitField0_ |= 0x00000002;
          }
          result.bitField0_ |= to_bitField0_;
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
          if (other instanceof StudentOuterClass.Student.Residence) {
            return mergeFrom((StudentOuterClass.Student.Residence)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(StudentOuterClass.Student.Residence other) {
          if (other == StudentOuterClass.Student.Residence.getDefaultInstance()) return this;
          if (other.hasStreet()) {
            street_ = other.street_;
            bitField0_ |= 0x00000001;
            onChanged();
          }
          if (other.hasBuildingNumber()) {
            setBuildingNumber(other.getBuildingNumber());
          }
          this.mergeUnknownFields(other.getUnknownFields());
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
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 10: {
                  street_ = input.readBytes();
                  bitField0_ |= 0x00000001;
                  break;
                } // case 10
                case 16: {
                  buildingNumber_ = input.readInt32();
                  bitField0_ |= 0x00000002;
                  break;
                } // case 16
                default: {
                  if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                    done = true; // was an endgroup tag
                  }
                  break;
                } // default:
              } // switch (tag)
            } // while (!done)
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
          } finally {
            onChanged();
          } // finally
          return this;
        }
        private int bitField0_;

        private java.lang.Object street_ = "";
        /**
         * <code>optional string street = 1;</code>
         * @return Whether the street field is set.
         */
        public boolean hasStreet() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>optional string street = 1;</code>
         * @return The street.
         */
        public java.lang.String getStreet() {
          java.lang.Object ref = street_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              street_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>optional string street = 1;</code>
         * @return The bytes for street.
         */
        public com.google.protobuf.ByteString
            getStreetBytes() {
          java.lang.Object ref = street_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            street_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>optional string street = 1;</code>
         * @param value The street to set.
         * @return This builder for chaining.
         */
        public Builder setStreet(
            java.lang.String value) {
          if (value == null) { throw new NullPointerException(); }
          street_ = value;
          bitField0_ |= 0x00000001;
          onChanged();
          return this;
        }
        /**
         * <code>optional string street = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearStreet() {
          street_ = getDefaultInstance().getStreet();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
          return this;
        }
        /**
         * <code>optional string street = 1;</code>
         * @param value The bytes for street to set.
         * @return This builder for chaining.
         */
        public Builder setStreetBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) { throw new NullPointerException(); }
          street_ = value;
          bitField0_ |= 0x00000001;
          onChanged();
          return this;
        }

        private int buildingNumber_ ;
        /**
         * <code>optional int32 buildingNumber = 2;</code>
         * @return Whether the buildingNumber field is set.
         */
        @java.lang.Override
        public boolean hasBuildingNumber() {
          return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <code>optional int32 buildingNumber = 2;</code>
         * @return The buildingNumber.
         */
        @java.lang.Override
        public int getBuildingNumber() {
          return buildingNumber_;
        }
        /**
         * <code>optional int32 buildingNumber = 2;</code>
         * @param value The buildingNumber to set.
         * @return This builder for chaining.
         */
        public Builder setBuildingNumber(int value) {
          
          buildingNumber_ = value;
          bitField0_ |= 0x00000002;
          onChanged();
          return this;
        }
        /**
         * <code>optional int32 buildingNumber = 2;</code>
         * @return This builder for chaining.
         */
        public Builder clearBuildingNumber() {
          bitField0_ = (bitField0_ & ~0x00000002);
          buildingNumber_ = 0;
          onChanged();
          return this;
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


        // @@protoc_insertion_point(builder_scope:Student.Residence)
      }

      // @@protoc_insertion_point(class_scope:Student.Residence)
      private static final StudentOuterClass.Student.Residence DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new StudentOuterClass.Student.Residence();
      }

      public static StudentOuterClass.Student.Residence getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<Residence>
          PARSER = new com.google.protobuf.AbstractParser<Residence>() {
        @java.lang.Override
        public Residence parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

      public static com.google.protobuf.Parser<Residence> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<Residence> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public StudentOuterClass.Student.Residence getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface ExamOrBuilder extends
        // @@protoc_insertion_point(interface_extends:Student.Exam)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <code>optional string name = 1;</code>
       * @return Whether the name field is set.
       */
      boolean hasName();
      /**
       * <code>optional string name = 1;</code>
       * @return The name.
       */
      java.lang.String getName();
      /**
       * <code>optional string name = 1;</code>
       * @return The bytes for name.
       */
      com.google.protobuf.ByteString
          getNameBytes();

      /**
       * <code>optional int32 mark = 2;</code>
       * @return Whether the mark field is set.
       */
      boolean hasMark();
      /**
       * <code>optional int32 mark = 2;</code>
       * @return The mark.
       */
      int getMark();

      /**
       * <code>optional string verbalization = 3;</code>
       * @return Whether the verbalization field is set.
       */
      boolean hasVerbalization();
      /**
       * <code>optional string verbalization = 3;</code>
       * @return The verbalization.
       */
      java.lang.String getVerbalization();
      /**
       * <code>optional string verbalization = 3;</code>
       * @return The bytes for verbalization.
       */
      com.google.protobuf.ByteString
          getVerbalizationBytes();
    }
    /**
     * Protobuf type {@code Student.Exam}
     */
    public static final class Exam extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:Student.Exam)
        ExamOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use Exam.newBuilder() to construct.
      private Exam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private Exam() {
        name_ = "";
        verbalization_ = "";
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new Exam();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return StudentOuterClass.internal_static_Student_Exam_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return StudentOuterClass.internal_static_Student_Exam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                StudentOuterClass.Student.Exam.class, StudentOuterClass.Student.Exam.Builder.class);
      }

      private int bitField0_;
      public static final int NAME_FIELD_NUMBER = 1;
      @SuppressWarnings("serial")
      private volatile java.lang.Object name_ = "";
      /**
       * <code>optional string name = 1;</code>
       * @return Whether the name field is set.
       */
      @java.lang.Override
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string name = 1;</code>
       * @return The name.
       */
      @java.lang.Override
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       * @return The bytes for name.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int MARK_FIELD_NUMBER = 2;
      private int mark_ = 0;
      /**
       * <code>optional int32 mark = 2;</code>
       * @return Whether the mark field is set.
       */
      @java.lang.Override
      public boolean hasMark() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int32 mark = 2;</code>
       * @return The mark.
       */
      @java.lang.Override
      public int getMark() {
        return mark_;
      }

      public static final int VERBALIZATION_FIELD_NUMBER = 3;
      @SuppressWarnings("serial")
      private volatile java.lang.Object verbalization_ = "";
      /**
       * <code>optional string verbalization = 3;</code>
       * @return Whether the verbalization field is set.
       */
      @java.lang.Override
      public boolean hasVerbalization() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string verbalization = 3;</code>
       * @return The verbalization.
       */
      @java.lang.Override
      public java.lang.String getVerbalization() {
        java.lang.Object ref = verbalization_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            verbalization_ = s;
          }
          return s;
        }
      }
      /**
       * <code>optional string verbalization = 3;</code>
       * @return The bytes for verbalization.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getVerbalizationBytes() {
        java.lang.Object ref = verbalization_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          verbalization_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
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
        if (((bitField0_ & 0x00000001) != 0)) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          output.writeInt32(2, mark_);
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 3, verbalization_);
        }
        getUnknownFields().writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt32Size(2, mark_);
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, verbalization_);
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof StudentOuterClass.Student.Exam)) {
          return super.equals(obj);
        }
        StudentOuterClass.Student.Exam other = (StudentOuterClass.Student.Exam) obj;

        if (hasName() != other.hasName()) return false;
        if (hasName()) {
          if (!getName()
              .equals(other.getName())) return false;
        }
        if (hasMark() != other.hasMark()) return false;
        if (hasMark()) {
          if (getMark()
              != other.getMark()) return false;
        }
        if (hasVerbalization() != other.hasVerbalization()) return false;
        if (hasVerbalization()) {
          if (!getVerbalization()
              .equals(other.getVerbalization())) return false;
        }
        if (!getUnknownFields().equals(other.getUnknownFields())) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasName()) {
          hash = (37 * hash) + NAME_FIELD_NUMBER;
          hash = (53 * hash) + getName().hashCode();
        }
        if (hasMark()) {
          hash = (37 * hash) + MARK_FIELD_NUMBER;
          hash = (53 * hash) + getMark();
        }
        if (hasVerbalization()) {
          hash = (37 * hash) + VERBALIZATION_FIELD_NUMBER;
          hash = (53 * hash) + getVerbalization().hashCode();
        }
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static StudentOuterClass.Student.Exam parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static StudentOuterClass.Student.Exam parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static StudentOuterClass.Student.Exam parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static StudentOuterClass.Student.Exam parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static StudentOuterClass.Student.Exam parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static StudentOuterClass.Student.Exam parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static StudentOuterClass.Student.Exam parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static StudentOuterClass.Student.Exam parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static StudentOuterClass.Student.Exam parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static StudentOuterClass.Student.Exam parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static StudentOuterClass.Student.Exam parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static StudentOuterClass.Student.Exam parseFrom(
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
      public static Builder newBuilder(StudentOuterClass.Student.Exam prototype) {
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
       * Protobuf type {@code Student.Exam}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:Student.Exam)
          StudentOuterClass.Student.ExamOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return StudentOuterClass.internal_static_Student_Exam_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return StudentOuterClass.internal_static_Student_Exam_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  StudentOuterClass.Student.Exam.class, StudentOuterClass.Student.Exam.Builder.class);
        }

        // Construct using StudentOuterClass.Student.Exam.newBuilder()
        private Builder() {

        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);

        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          bitField0_ = 0;
          name_ = "";
          mark_ = 0;
          verbalization_ = "";
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return StudentOuterClass.internal_static_Student_Exam_descriptor;
        }

        @java.lang.Override
        public StudentOuterClass.Student.Exam getDefaultInstanceForType() {
          return StudentOuterClass.Student.Exam.getDefaultInstance();
        }

        @java.lang.Override
        public StudentOuterClass.Student.Exam build() {
          StudentOuterClass.Student.Exam result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public StudentOuterClass.Student.Exam buildPartial() {
          StudentOuterClass.Student.Exam result = new StudentOuterClass.Student.Exam(this);
          if (bitField0_ != 0) { buildPartial0(result); }
          onBuilt();
          return result;
        }

        private void buildPartial0(StudentOuterClass.Student.Exam result) {
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            result.name_ = name_;
            to_bitField0_ |= 0x00000001;
          }
          if (((from_bitField0_ & 0x00000002) != 0)) {
            result.mark_ = mark_;
            to_bitField0_ |= 0x00000002;
          }
          if (((from_bitField0_ & 0x00000004) != 0)) {
            result.verbalization_ = verbalization_;
            to_bitField0_ |= 0x00000004;
          }
          result.bitField0_ |= to_bitField0_;
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
          if (other instanceof StudentOuterClass.Student.Exam) {
            return mergeFrom((StudentOuterClass.Student.Exam)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(StudentOuterClass.Student.Exam other) {
          if (other == StudentOuterClass.Student.Exam.getDefaultInstance()) return this;
          if (other.hasName()) {
            name_ = other.name_;
            bitField0_ |= 0x00000001;
            onChanged();
          }
          if (other.hasMark()) {
            setMark(other.getMark());
          }
          if (other.hasVerbalization()) {
            verbalization_ = other.verbalization_;
            bitField0_ |= 0x00000004;
            onChanged();
          }
          this.mergeUnknownFields(other.getUnknownFields());
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
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 10: {
                  name_ = input.readBytes();
                  bitField0_ |= 0x00000001;
                  break;
                } // case 10
                case 16: {
                  mark_ = input.readInt32();
                  bitField0_ |= 0x00000002;
                  break;
                } // case 16
                case 26: {
                  verbalization_ = input.readBytes();
                  bitField0_ |= 0x00000004;
                  break;
                } // case 26
                default: {
                  if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                    done = true; // was an endgroup tag
                  }
                  break;
                } // default:
              } // switch (tag)
            } // while (!done)
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
          } finally {
            onChanged();
          } // finally
          return this;
        }
        private int bitField0_;

        private java.lang.Object name_ = "";
        /**
         * <code>optional string name = 1;</code>
         * @return Whether the name field is set.
         */
        public boolean hasName() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>optional string name = 1;</code>
         * @return The name.
         */
        public java.lang.String getName() {
          java.lang.Object ref = name_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              name_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>optional string name = 1;</code>
         * @return The bytes for name.
         */
        public com.google.protobuf.ByteString
            getNameBytes() {
          java.lang.Object ref = name_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            name_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>optional string name = 1;</code>
         * @param value The name to set.
         * @return This builder for chaining.
         */
        public Builder setName(
            java.lang.String value) {
          if (value == null) { throw new NullPointerException(); }
          name_ = value;
          bitField0_ |= 0x00000001;
          onChanged();
          return this;
        }
        /**
         * <code>optional string name = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearName() {
          name_ = getDefaultInstance().getName();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
          return this;
        }
        /**
         * <code>optional string name = 1;</code>
         * @param value The bytes for name to set.
         * @return This builder for chaining.
         */
        public Builder setNameBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) { throw new NullPointerException(); }
          name_ = value;
          bitField0_ |= 0x00000001;
          onChanged();
          return this;
        }

        private int mark_ ;
        /**
         * <code>optional int32 mark = 2;</code>
         * @return Whether the mark field is set.
         */
        @java.lang.Override
        public boolean hasMark() {
          return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <code>optional int32 mark = 2;</code>
         * @return The mark.
         */
        @java.lang.Override
        public int getMark() {
          return mark_;
        }
        /**
         * <code>optional int32 mark = 2;</code>
         * @param value The mark to set.
         * @return This builder for chaining.
         */
        public Builder setMark(int value) {
          
          mark_ = value;
          bitField0_ |= 0x00000002;
          onChanged();
          return this;
        }
        /**
         * <code>optional int32 mark = 2;</code>
         * @return This builder for chaining.
         */
        public Builder clearMark() {
          bitField0_ = (bitField0_ & ~0x00000002);
          mark_ = 0;
          onChanged();
          return this;
        }

        private java.lang.Object verbalization_ = "";
        /**
         * <code>optional string verbalization = 3;</code>
         * @return Whether the verbalization field is set.
         */
        public boolean hasVerbalization() {
          return ((bitField0_ & 0x00000004) != 0);
        }
        /**
         * <code>optional string verbalization = 3;</code>
         * @return The verbalization.
         */
        public java.lang.String getVerbalization() {
          java.lang.Object ref = verbalization_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              verbalization_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>optional string verbalization = 3;</code>
         * @return The bytes for verbalization.
         */
        public com.google.protobuf.ByteString
            getVerbalizationBytes() {
          java.lang.Object ref = verbalization_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            verbalization_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>optional string verbalization = 3;</code>
         * @param value The verbalization to set.
         * @return This builder for chaining.
         */
        public Builder setVerbalization(
            java.lang.String value) {
          if (value == null) { throw new NullPointerException(); }
          verbalization_ = value;
          bitField0_ |= 0x00000004;
          onChanged();
          return this;
        }
        /**
         * <code>optional string verbalization = 3;</code>
         * @return This builder for chaining.
         */
        public Builder clearVerbalization() {
          verbalization_ = getDefaultInstance().getVerbalization();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
          return this;
        }
        /**
         * <code>optional string verbalization = 3;</code>
         * @param value The bytes for verbalization to set.
         * @return This builder for chaining.
         */
        public Builder setVerbalizationBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) { throw new NullPointerException(); }
          verbalization_ = value;
          bitField0_ |= 0x00000004;
          onChanged();
          return this;
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


        // @@protoc_insertion_point(builder_scope:Student.Exam)
      }

      // @@protoc_insertion_point(class_scope:Student.Exam)
      private static final StudentOuterClass.Student.Exam DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new StudentOuterClass.Student.Exam();
      }

      public static StudentOuterClass.Student.Exam getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<Exam>
          PARSER = new com.google.protobuf.AbstractParser<Exam>() {
        @java.lang.Override
        public Exam parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

      public static com.google.protobuf.Parser<Exam> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<Exam> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public StudentOuterClass.Student.Exam getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SURNAME_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object surname_ = "";
    /**
     * <code>optional string surname = 2;</code>
     * @return Whether the surname field is set.
     */
    @java.lang.Override
    public boolean hasSurname() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string surname = 2;</code>
     * @return The surname.
     */
    @java.lang.Override
    public java.lang.String getSurname() {
      java.lang.Object ref = surname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          surname_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string surname = 2;</code>
     * @return The bytes for surname.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSurnameBytes() {
      java.lang.Object ref = surname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        surname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int YEADOFBIRTH_FIELD_NUMBER = 3;
    private int yeadOfBirth_ = 0;
    /**
     * <code>optional int32 yeadOfBirth = 3;</code>
     * @return Whether the yeadOfBirth field is set.
     */
    @java.lang.Override
    public boolean hasYeadOfBirth() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 yeadOfBirth = 3;</code>
     * @return The yeadOfBirth.
     */
    @java.lang.Override
    public int getYeadOfBirth() {
      return yeadOfBirth_;
    }

    public static final int RESIDENCE_FIELD_NUMBER = 4;
    private StudentOuterClass.Student.Residence residence_;
    /**
     * <code>optional .Student.Residence residence = 4;</code>
     * @return Whether the residence field is set.
     */
    @java.lang.Override
    public boolean hasResidence() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .Student.Residence residence = 4;</code>
     * @return The residence.
     */
    @java.lang.Override
    public StudentOuterClass.Student.Residence getResidence() {
      return residence_ == null ? StudentOuterClass.Student.Residence.getDefaultInstance() : residence_;
    }
    /**
     * <code>optional .Student.Residence residence = 4;</code>
     */
    @java.lang.Override
    public StudentOuterClass.Student.ResidenceOrBuilder getResidenceOrBuilder() {
      return residence_ == null ? StudentOuterClass.Student.Residence.getDefaultInstance() : residence_;
    }

    public static final int EXAMS_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private java.util.List<StudentOuterClass.Student.Exam> exams_;
    /**
     * <code>repeated .Student.Exam exams = 5;</code>
     */
    @java.lang.Override
    public java.util.List<StudentOuterClass.Student.Exam> getExamsList() {
      return exams_;
    }
    /**
     * <code>repeated .Student.Exam exams = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends StudentOuterClass.Student.ExamOrBuilder> 
        getExamsOrBuilderList() {
      return exams_;
    }
    /**
     * <code>repeated .Student.Exam exams = 5;</code>
     */
    @java.lang.Override
    public int getExamsCount() {
      return exams_.size();
    }
    /**
     * <code>repeated .Student.Exam exams = 5;</code>
     */
    @java.lang.Override
    public StudentOuterClass.Student.Exam getExams(int index) {
      return exams_.get(index);
    }
    /**
     * <code>repeated .Student.Exam exams = 5;</code>
     */
    @java.lang.Override
    public StudentOuterClass.Student.ExamOrBuilder getExamsOrBuilder(
        int index) {
      return exams_.get(index);
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
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, surname_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeInt32(3, yeadOfBirth_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(4, getResidence());
      }
      for (int i = 0; i < exams_.size(); i++) {
        output.writeMessage(5, exams_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, surname_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, yeadOfBirth_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getResidence());
      }
      for (int i = 0; i < exams_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, exams_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof StudentOuterClass.Student)) {
        return super.equals(obj);
      }
      StudentOuterClass.Student other = (StudentOuterClass.Student) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasSurname() != other.hasSurname()) return false;
      if (hasSurname()) {
        if (!getSurname()
            .equals(other.getSurname())) return false;
      }
      if (hasYeadOfBirth() != other.hasYeadOfBirth()) return false;
      if (hasYeadOfBirth()) {
        if (getYeadOfBirth()
            != other.getYeadOfBirth()) return false;
      }
      if (hasResidence() != other.hasResidence()) return false;
      if (hasResidence()) {
        if (!getResidence()
            .equals(other.getResidence())) return false;
      }
      if (!getExamsList()
          .equals(other.getExamsList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasSurname()) {
        hash = (37 * hash) + SURNAME_FIELD_NUMBER;
        hash = (53 * hash) + getSurname().hashCode();
      }
      if (hasYeadOfBirth()) {
        hash = (37 * hash) + YEADOFBIRTH_FIELD_NUMBER;
        hash = (53 * hash) + getYeadOfBirth();
      }
      if (hasResidence()) {
        hash = (37 * hash) + RESIDENCE_FIELD_NUMBER;
        hash = (53 * hash) + getResidence().hashCode();
      }
      if (getExamsCount() > 0) {
        hash = (37 * hash) + EXAMS_FIELD_NUMBER;
        hash = (53 * hash) + getExamsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static StudentOuterClass.Student parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StudentOuterClass.Student parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StudentOuterClass.Student parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StudentOuterClass.Student parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StudentOuterClass.Student parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StudentOuterClass.Student parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StudentOuterClass.Student parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static StudentOuterClass.Student parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static StudentOuterClass.Student parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static StudentOuterClass.Student parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static StudentOuterClass.Student parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static StudentOuterClass.Student parseFrom(
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
    public static Builder newBuilder(StudentOuterClass.Student prototype) {
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
     * Protobuf type {@code Student}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Student)
        StudentOuterClass.StudentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return StudentOuterClass.internal_static_Student_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return StudentOuterClass.internal_static_Student_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                StudentOuterClass.Student.class, StudentOuterClass.Student.Builder.class);
      }

      // Construct using StudentOuterClass.Student.newBuilder()
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
          getResidenceFieldBuilder();
          getExamsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        name_ = "";
        surname_ = "";
        yeadOfBirth_ = 0;
        residence_ = null;
        if (residenceBuilder_ != null) {
          residenceBuilder_.dispose();
          residenceBuilder_ = null;
        }
        if (examsBuilder_ == null) {
          exams_ = java.util.Collections.emptyList();
        } else {
          exams_ = null;
          examsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return StudentOuterClass.internal_static_Student_descriptor;
      }

      @java.lang.Override
      public StudentOuterClass.Student getDefaultInstanceForType() {
        return StudentOuterClass.Student.getDefaultInstance();
      }

      @java.lang.Override
      public StudentOuterClass.Student build() {
        StudentOuterClass.Student result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public StudentOuterClass.Student buildPartial() {
        StudentOuterClass.Student result = new StudentOuterClass.Student(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(StudentOuterClass.Student result) {
        if (examsBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0)) {
            exams_ = java.util.Collections.unmodifiableList(exams_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.exams_ = exams_;
        } else {
          result.exams_ = examsBuilder_.build();
        }
      }

      private void buildPartial0(StudentOuterClass.Student result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.surname_ = surname_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.yeadOfBirth_ = yeadOfBirth_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.residence_ = residenceBuilder_ == null
              ? residence_
              : residenceBuilder_.build();
          to_bitField0_ |= 0x00000008;
        }
        result.bitField0_ |= to_bitField0_;
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
        if (other instanceof StudentOuterClass.Student) {
          return mergeFrom((StudentOuterClass.Student)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(StudentOuterClass.Student other) {
        if (other == StudentOuterClass.Student.getDefaultInstance()) return this;
        if (other.hasName()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasSurname()) {
          surname_ = other.surname_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.hasYeadOfBirth()) {
          setYeadOfBirth(other.getYeadOfBirth());
        }
        if (other.hasResidence()) {
          mergeResidence(other.getResidence());
        }
        if (examsBuilder_ == null) {
          if (!other.exams_.isEmpty()) {
            if (exams_.isEmpty()) {
              exams_ = other.exams_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureExamsIsMutable();
              exams_.addAll(other.exams_);
            }
            onChanged();
          }
        } else {
          if (!other.exams_.isEmpty()) {
            if (examsBuilder_.isEmpty()) {
              examsBuilder_.dispose();
              examsBuilder_ = null;
              exams_ = other.exams_;
              bitField0_ = (bitField0_ & ~0x00000010);
              examsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getExamsFieldBuilder() : null;
            } else {
              examsBuilder_.addAllMessages(other.exams_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                surname_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                yeadOfBirth_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 34: {
                input.readMessage(
                    getResidenceFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 42: {
                StudentOuterClass.Student.Exam m =
                    input.readMessage(
                        StudentOuterClass.Student.Exam.PARSER,
                        extensionRegistry);
                if (examsBuilder_ == null) {
                  ensureExamsIsMutable();
                  exams_.add(m);
                } else {
                  examsBuilder_.addMessage(m);
                }
                break;
              } // case 42
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 1;</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object surname_ = "";
      /**
       * <code>optional string surname = 2;</code>
       * @return Whether the surname field is set.
       */
      public boolean hasSurname() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string surname = 2;</code>
       * @return The surname.
       */
      public java.lang.String getSurname() {
        java.lang.Object ref = surname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            surname_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string surname = 2;</code>
       * @return The bytes for surname.
       */
      public com.google.protobuf.ByteString
          getSurnameBytes() {
        java.lang.Object ref = surname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          surname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string surname = 2;</code>
       * @param value The surname to set.
       * @return This builder for chaining.
       */
      public Builder setSurname(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        surname_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional string surname = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSurname() {
        surname_ = getDefaultInstance().getSurname();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>optional string surname = 2;</code>
       * @param value The bytes for surname to set.
       * @return This builder for chaining.
       */
      public Builder setSurnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        surname_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private int yeadOfBirth_ ;
      /**
       * <code>optional int32 yeadOfBirth = 3;</code>
       * @return Whether the yeadOfBirth field is set.
       */
      @java.lang.Override
      public boolean hasYeadOfBirth() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional int32 yeadOfBirth = 3;</code>
       * @return The yeadOfBirth.
       */
      @java.lang.Override
      public int getYeadOfBirth() {
        return yeadOfBirth_;
      }
      /**
       * <code>optional int32 yeadOfBirth = 3;</code>
       * @param value The yeadOfBirth to set.
       * @return This builder for chaining.
       */
      public Builder setYeadOfBirth(int value) {
        
        yeadOfBirth_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 yeadOfBirth = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearYeadOfBirth() {
        bitField0_ = (bitField0_ & ~0x00000004);
        yeadOfBirth_ = 0;
        onChanged();
        return this;
      }

      private StudentOuterClass.Student.Residence residence_;
      private com.google.protobuf.SingleFieldBuilderV3<
          StudentOuterClass.Student.Residence, StudentOuterClass.Student.Residence.Builder, StudentOuterClass.Student.ResidenceOrBuilder> residenceBuilder_;
      /**
       * <code>optional .Student.Residence residence = 4;</code>
       * @return Whether the residence field is set.
       */
      public boolean hasResidence() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional .Student.Residence residence = 4;</code>
       * @return The residence.
       */
      public StudentOuterClass.Student.Residence getResidence() {
        if (residenceBuilder_ == null) {
          return residence_ == null ? StudentOuterClass.Student.Residence.getDefaultInstance() : residence_;
        } else {
          return residenceBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Student.Residence residence = 4;</code>
       */
      public Builder setResidence(StudentOuterClass.Student.Residence value) {
        if (residenceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          residence_ = value;
        } else {
          residenceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional .Student.Residence residence = 4;</code>
       */
      public Builder setResidence(
          StudentOuterClass.Student.Residence.Builder builderForValue) {
        if (residenceBuilder_ == null) {
          residence_ = builderForValue.build();
        } else {
          residenceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional .Student.Residence residence = 4;</code>
       */
      public Builder mergeResidence(StudentOuterClass.Student.Residence value) {
        if (residenceBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
            residence_ != null &&
            residence_ != StudentOuterClass.Student.Residence.getDefaultInstance()) {
            getResidenceBuilder().mergeFrom(value);
          } else {
            residence_ = value;
          }
        } else {
          residenceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional .Student.Residence residence = 4;</code>
       */
      public Builder clearResidence() {
        bitField0_ = (bitField0_ & ~0x00000008);
        residence_ = null;
        if (residenceBuilder_ != null) {
          residenceBuilder_.dispose();
          residenceBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>optional .Student.Residence residence = 4;</code>
       */
      public StudentOuterClass.Student.Residence.Builder getResidenceBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getResidenceFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Student.Residence residence = 4;</code>
       */
      public StudentOuterClass.Student.ResidenceOrBuilder getResidenceOrBuilder() {
        if (residenceBuilder_ != null) {
          return residenceBuilder_.getMessageOrBuilder();
        } else {
          return residence_ == null ?
              StudentOuterClass.Student.Residence.getDefaultInstance() : residence_;
        }
      }
      /**
       * <code>optional .Student.Residence residence = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          StudentOuterClass.Student.Residence, StudentOuterClass.Student.Residence.Builder, StudentOuterClass.Student.ResidenceOrBuilder> 
          getResidenceFieldBuilder() {
        if (residenceBuilder_ == null) {
          residenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              StudentOuterClass.Student.Residence, StudentOuterClass.Student.Residence.Builder, StudentOuterClass.Student.ResidenceOrBuilder>(
                  getResidence(),
                  getParentForChildren(),
                  isClean());
          residence_ = null;
        }
        return residenceBuilder_;
      }

      private java.util.List<StudentOuterClass.Student.Exam> exams_ =
        java.util.Collections.emptyList();
      private void ensureExamsIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          exams_ = new java.util.ArrayList<StudentOuterClass.Student.Exam>(exams_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          StudentOuterClass.Student.Exam, StudentOuterClass.Student.Exam.Builder, StudentOuterClass.Student.ExamOrBuilder> examsBuilder_;

      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public java.util.List<StudentOuterClass.Student.Exam> getExamsList() {
        if (examsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(exams_);
        } else {
          return examsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public int getExamsCount() {
        if (examsBuilder_ == null) {
          return exams_.size();
        } else {
          return examsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public StudentOuterClass.Student.Exam getExams(int index) {
        if (examsBuilder_ == null) {
          return exams_.get(index);
        } else {
          return examsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public Builder setExams(
          int index, StudentOuterClass.Student.Exam value) {
        if (examsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExamsIsMutable();
          exams_.set(index, value);
          onChanged();
        } else {
          examsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public Builder setExams(
          int index, StudentOuterClass.Student.Exam.Builder builderForValue) {
        if (examsBuilder_ == null) {
          ensureExamsIsMutable();
          exams_.set(index, builderForValue.build());
          onChanged();
        } else {
          examsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public Builder addExams(StudentOuterClass.Student.Exam value) {
        if (examsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExamsIsMutable();
          exams_.add(value);
          onChanged();
        } else {
          examsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public Builder addExams(
          int index, StudentOuterClass.Student.Exam value) {
        if (examsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExamsIsMutable();
          exams_.add(index, value);
          onChanged();
        } else {
          examsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public Builder addExams(
          StudentOuterClass.Student.Exam.Builder builderForValue) {
        if (examsBuilder_ == null) {
          ensureExamsIsMutable();
          exams_.add(builderForValue.build());
          onChanged();
        } else {
          examsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public Builder addExams(
          int index, StudentOuterClass.Student.Exam.Builder builderForValue) {
        if (examsBuilder_ == null) {
          ensureExamsIsMutable();
          exams_.add(index, builderForValue.build());
          onChanged();
        } else {
          examsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public Builder addAllExams(
          java.lang.Iterable<? extends StudentOuterClass.Student.Exam> values) {
        if (examsBuilder_ == null) {
          ensureExamsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, exams_);
          onChanged();
        } else {
          examsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public Builder clearExams() {
        if (examsBuilder_ == null) {
          exams_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          examsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public Builder removeExams(int index) {
        if (examsBuilder_ == null) {
          ensureExamsIsMutable();
          exams_.remove(index);
          onChanged();
        } else {
          examsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public StudentOuterClass.Student.Exam.Builder getExamsBuilder(
          int index) {
        return getExamsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public StudentOuterClass.Student.ExamOrBuilder getExamsOrBuilder(
          int index) {
        if (examsBuilder_ == null) {
          return exams_.get(index);  } else {
          return examsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public java.util.List<? extends StudentOuterClass.Student.ExamOrBuilder> 
           getExamsOrBuilderList() {
        if (examsBuilder_ != null) {
          return examsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(exams_);
        }
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public StudentOuterClass.Student.Exam.Builder addExamsBuilder() {
        return getExamsFieldBuilder().addBuilder(
            StudentOuterClass.Student.Exam.getDefaultInstance());
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public StudentOuterClass.Student.Exam.Builder addExamsBuilder(
          int index) {
        return getExamsFieldBuilder().addBuilder(
            index, StudentOuterClass.Student.Exam.getDefaultInstance());
      }
      /**
       * <code>repeated .Student.Exam exams = 5;</code>
       */
      public java.util.List<StudentOuterClass.Student.Exam.Builder> 
           getExamsBuilderList() {
        return getExamsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          StudentOuterClass.Student.Exam, StudentOuterClass.Student.Exam.Builder, StudentOuterClass.Student.ExamOrBuilder> 
          getExamsFieldBuilder() {
        if (examsBuilder_ == null) {
          examsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              StudentOuterClass.Student.Exam, StudentOuterClass.Student.Exam.Builder, StudentOuterClass.Student.ExamOrBuilder>(
                  exams_,
                  ((bitField0_ & 0x00000010) != 0),
                  getParentForChildren(),
                  isClean());
          exams_ = null;
        }
        return examsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Student)
    }

    // @@protoc_insertion_point(class_scope:Student)
    private static final StudentOuterClass.Student DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new StudentOuterClass.Student();
    }

    public static StudentOuterClass.Student getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Student>
        PARSER = new com.google.protobuf.AbstractParser<Student>() {
      @java.lang.Override
      public Student parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Student> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Student> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public StudentOuterClass.Student getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Student_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Student_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Student_Residence_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Student_Residence_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Student_Exam_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Student_Exam_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rStudent.proto\"\362\001\n\007Student\022\014\n\004name\030\001 \001(" +
      "\t\022\017\n\007surname\030\002 \001(\t\022\023\n\013yeadOfBirth\030\003 \001(\005\022" +
      "%\n\tresidence\030\004 \001(\0132\022.Student.Residence\022\034" +
      "\n\005exams\030\005 \003(\0132\r.Student.Exam\0323\n\tResidenc" +
      "e\022\016\n\006street\030\001 \001(\t\022\026\n\016buildingNumber\030\002 \001(" +
      "\005\0329\n\004Exam\022\014\n\004name\030\001 \001(\t\022\014\n\004mark\030\002 \001(\005\022\025\n" +
      "\rverbalization\030\003 \001(\t"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Student_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Student_descriptor,
        new java.lang.String[] { "Name", "Surname", "YeadOfBirth", "Residence", "Exams", });
    internal_static_Student_Residence_descriptor =
      internal_static_Student_descriptor.getNestedTypes().get(0);
    internal_static_Student_Residence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Student_Residence_descriptor,
        new java.lang.String[] { "Street", "BuildingNumber", });
    internal_static_Student_Exam_descriptor =
      internal_static_Student_descriptor.getNestedTypes().get(1);
    internal_static_Student_Exam_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Student_Exam_descriptor,
        new java.lang.String[] { "Name", "Mark", "Verbalization", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
