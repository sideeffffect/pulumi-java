// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TagField {
    /**
     * @return Holds the value for a tag field with boolean type.
     * 
     */
    private final @Nullable Boolean boolValue;
    /**
     * @return -
     * The display name of this field
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return Holds the value for a tag field with double type.
     * 
     */
    private final @Nullable Double doubleValue;
    /**
     * @return Holds the value for a tag field with enum type. This value must be one of the allowed values in the definition of this enum.
     * Structure is documented below.
     * 
     */
    private final @Nullable String enumValue;
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    private final String fieldName;
    /**
     * @return -
     * The order of this field with respect to other fields in this tag. For example, a higher value can indicate
     * a more important field. The value can be negative. Multiple fields can have the same order, and field orders
     * within a tag do not have to be sequential.
     * 
     */
    private final @Nullable Integer order;
    /**
     * @return Holds the value for a tag field with string type.
     * 
     */
    private final @Nullable String stringValue;
    /**
     * @return Holds the value for a tag field with timestamp type.
     * 
     */
    private final @Nullable String timestampValue;

    @CustomType.Constructor
    private TagField(
        @CustomType.Parameter("boolValue") @Nullable Boolean boolValue,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("doubleValue") @Nullable Double doubleValue,
        @CustomType.Parameter("enumValue") @Nullable String enumValue,
        @CustomType.Parameter("fieldName") String fieldName,
        @CustomType.Parameter("order") @Nullable Integer order,
        @CustomType.Parameter("stringValue") @Nullable String stringValue,
        @CustomType.Parameter("timestampValue") @Nullable String timestampValue) {
        this.boolValue = boolValue;
        this.displayName = displayName;
        this.doubleValue = doubleValue;
        this.enumValue = enumValue;
        this.fieldName = fieldName;
        this.order = order;
        this.stringValue = stringValue;
        this.timestampValue = timestampValue;
    }

    /**
     * @return Holds the value for a tag field with boolean type.
     * 
     */
    public Optional<Boolean> boolValue() {
        return Optional.ofNullable(this.boolValue);
    }
    /**
     * @return -
     * The display name of this field
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return Holds the value for a tag field with double type.
     * 
     */
    public Optional<Double> doubleValue() {
        return Optional.ofNullable(this.doubleValue);
    }
    /**
     * @return Holds the value for a tag field with enum type. This value must be one of the allowed values in the definition of this enum.
     * Structure is documented below.
     * 
     */
    public Optional<String> enumValue() {
        return Optional.ofNullable(this.enumValue);
    }
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public String fieldName() {
        return this.fieldName;
    }
    /**
     * @return -
     * The order of this field with respect to other fields in this tag. For example, a higher value can indicate
     * a more important field. The value can be negative. Multiple fields can have the same order, and field orders
     * within a tag do not have to be sequential.
     * 
     */
    public Optional<Integer> order() {
        return Optional.ofNullable(this.order);
    }
    /**
     * @return Holds the value for a tag field with string type.
     * 
     */
    public Optional<String> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }
    /**
     * @return Holds the value for a tag field with timestamp type.
     * 
     */
    public Optional<String> timestampValue() {
        return Optional.ofNullable(this.timestampValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagField defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean boolValue;
        private @Nullable String displayName;
        private @Nullable Double doubleValue;
        private @Nullable String enumValue;
        private String fieldName;
        private @Nullable Integer order;
        private @Nullable String stringValue;
        private @Nullable String timestampValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TagField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boolValue = defaults.boolValue;
    	      this.displayName = defaults.displayName;
    	      this.doubleValue = defaults.doubleValue;
    	      this.enumValue = defaults.enumValue;
    	      this.fieldName = defaults.fieldName;
    	      this.order = defaults.order;
    	      this.stringValue = defaults.stringValue;
    	      this.timestampValue = defaults.timestampValue;
        }

        public Builder boolValue(@Nullable Boolean boolValue) {
            this.boolValue = boolValue;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder doubleValue(@Nullable Double doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }
        public Builder enumValue(@Nullable String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public Builder fieldName(String fieldName) {
            this.fieldName = Objects.requireNonNull(fieldName);
            return this;
        }
        public Builder order(@Nullable Integer order) {
            this.order = order;
            return this;
        }
        public Builder stringValue(@Nullable String stringValue) {
            this.stringValue = stringValue;
            return this;
        }
        public Builder timestampValue(@Nullable String timestampValue) {
            this.timestampValue = timestampValue;
            return this;
        }        public TagField build() {
            return new TagField(boolValue, displayName, doubleValue, enumValue, fieldName, order, stringValue, timestampValue);
        }
    }
}
