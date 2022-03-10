// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.enums.FieldCardinality;
import io.pulumi.googlenative.servicemanagement_v1.enums.FieldKind;
import io.pulumi.googlenative.servicemanagement_v1.inputs.OptionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A single field of a message type.
 * 
 */
public final class FieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldArgs Empty = new FieldArgs();

    /**
     * The field cardinality.
     * 
     */
    @InputImport(name="cardinality")
      private final @Nullable Input<FieldCardinality> cardinality;

    public Input<FieldCardinality> getCardinality() {
        return this.cardinality == null ? Input.empty() : this.cardinality;
    }

    /**
     * The string value of the default value of this field. Proto2 syntax only.
     * 
     */
    @InputImport(name="defaultValue")
      private final @Nullable Input<String> defaultValue;

    public Input<String> getDefaultValue() {
        return this.defaultValue == null ? Input.empty() : this.defaultValue;
    }

    /**
     * The field JSON name.
     * 
     */
    @InputImport(name="jsonName")
      private final @Nullable Input<String> jsonName;

    public Input<String> getJsonName() {
        return this.jsonName == null ? Input.empty() : this.jsonName;
    }

    /**
     * The field type.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<FieldKind> kind;

    public Input<FieldKind> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The field name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The field number.
     * 
     */
    @InputImport(name="number")
      private final @Nullable Input<Integer> number;

    public Input<Integer> getNumber() {
        return this.number == null ? Input.empty() : this.number;
    }

    /**
     * The index of the field type in `Type.oneofs`, for message or enumeration types. The first type has index 1; zero means the type is not in the list.
     * 
     */
    @InputImport(name="oneofIndex")
      private final @Nullable Input<Integer> oneofIndex;

    public Input<Integer> getOneofIndex() {
        return this.oneofIndex == null ? Input.empty() : this.oneofIndex;
    }

    /**
     * The protocol buffer options.
     * 
     */
    @InputImport(name="options")
      private final @Nullable Input<List<OptionArgs>> options;

    public Input<List<OptionArgs>> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    /**
     * Whether to use alternative packed wire representation.
     * 
     */
    @InputImport(name="packed")
      private final @Nullable Input<Boolean> packed;

    public Input<Boolean> getPacked() {
        return this.packed == null ? Input.empty() : this.packed;
    }

    /**
     * The field type URL, without the scheme, for message or enumeration types. Example: `"type.googleapis.com/google.protobuf.Timestamp"`.
     * 
     */
    @InputImport(name="typeUrl")
      private final @Nullable Input<String> typeUrl;

    public Input<String> getTypeUrl() {
        return this.typeUrl == null ? Input.empty() : this.typeUrl;
    }

    public FieldArgs(
        @Nullable Input<FieldCardinality> cardinality,
        @Nullable Input<String> defaultValue,
        @Nullable Input<String> jsonName,
        @Nullable Input<FieldKind> kind,
        @Nullable Input<String> name,
        @Nullable Input<Integer> number,
        @Nullable Input<Integer> oneofIndex,
        @Nullable Input<List<OptionArgs>> options,
        @Nullable Input<Boolean> packed,
        @Nullable Input<String> typeUrl) {
        this.cardinality = cardinality;
        this.defaultValue = defaultValue;
        this.jsonName = jsonName;
        this.kind = kind;
        this.name = name;
        this.number = number;
        this.oneofIndex = oneofIndex;
        this.options = options;
        this.packed = packed;
        this.typeUrl = typeUrl;
    }

    private FieldArgs() {
        this.cardinality = Input.empty();
        this.defaultValue = Input.empty();
        this.jsonName = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.number = Input.empty();
        this.oneofIndex = Input.empty();
        this.options = Input.empty();
        this.packed = Input.empty();
        this.typeUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FieldCardinality> cardinality;
        private @Nullable Input<String> defaultValue;
        private @Nullable Input<String> jsonName;
        private @Nullable Input<FieldKind> kind;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> number;
        private @Nullable Input<Integer> oneofIndex;
        private @Nullable Input<List<OptionArgs>> options;
        private @Nullable Input<Boolean> packed;
        private @Nullable Input<String> typeUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cardinality = defaults.cardinality;
    	      this.defaultValue = defaults.defaultValue;
    	      this.jsonName = defaults.jsonName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.number = defaults.number;
    	      this.oneofIndex = defaults.oneofIndex;
    	      this.options = defaults.options;
    	      this.packed = defaults.packed;
    	      this.typeUrl = defaults.typeUrl;
        }

        public Builder cardinality(@Nullable Input<FieldCardinality> cardinality) {
            this.cardinality = cardinality;
            return this;
        }

        public Builder cardinality(@Nullable FieldCardinality cardinality) {
            this.cardinality = Input.ofNullable(cardinality);
            return this;
        }

        public Builder defaultValue(@Nullable Input<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = Input.ofNullable(defaultValue);
            return this;
        }

        public Builder jsonName(@Nullable Input<String> jsonName) {
            this.jsonName = jsonName;
            return this;
        }

        public Builder jsonName(@Nullable String jsonName) {
            this.jsonName = Input.ofNullable(jsonName);
            return this;
        }

        public Builder kind(@Nullable Input<FieldKind> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable FieldKind kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder number(@Nullable Input<Integer> number) {
            this.number = number;
            return this;
        }

        public Builder number(@Nullable Integer number) {
            this.number = Input.ofNullable(number);
            return this;
        }

        public Builder oneofIndex(@Nullable Input<Integer> oneofIndex) {
            this.oneofIndex = oneofIndex;
            return this;
        }

        public Builder oneofIndex(@Nullable Integer oneofIndex) {
            this.oneofIndex = Input.ofNullable(oneofIndex);
            return this;
        }

        public Builder options(@Nullable Input<List<OptionArgs>> options) {
            this.options = options;
            return this;
        }

        public Builder options(@Nullable List<OptionArgs> options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder packed(@Nullable Input<Boolean> packed) {
            this.packed = packed;
            return this;
        }

        public Builder packed(@Nullable Boolean packed) {
            this.packed = Input.ofNullable(packed);
            return this;
        }

        public Builder typeUrl(@Nullable Input<String> typeUrl) {
            this.typeUrl = typeUrl;
            return this;
        }

        public Builder typeUrl(@Nullable String typeUrl) {
            this.typeUrl = Input.ofNullable(typeUrl);
            return this;
        }
        public FieldArgs build() {
            return new FieldArgs(cardinality, defaultValue, jsonName, kind, name, number, oneofIndex, options, packed, typeUrl);
        }
    }
}
