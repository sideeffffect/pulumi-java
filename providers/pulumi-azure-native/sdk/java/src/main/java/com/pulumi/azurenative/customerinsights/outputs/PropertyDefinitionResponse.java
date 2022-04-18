// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.outputs;

import com.pulumi.azurenative.customerinsights.outputs.DataSourcePrecedenceResponse;
import com.pulumi.azurenative.customerinsights.outputs.ProfileEnumValidValuesFormatResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PropertyDefinitionResponse {
    /**
     * Array value separator for properties with isArray set.
     * 
     */
    private final @Nullable String arrayValueSeparator;
    /**
     * This is specific to interactions modeled as activities. Data sources are used to determine where data is stored and also in precedence rules.
     * 
     */
    private final List<DataSourcePrecedenceResponse> dataSourcePrecedenceRules;
    /**
     * Describes valid values for an enum property.
     * 
     */
    private final @Nullable List<ProfileEnumValidValuesFormatResponse> enumValidValues;
    /**
     * Name of the property.
     * 
     */
    private final String fieldName;
    /**
     * Type of the property.
     * 
     */
    private final String fieldType;
    /**
     * Indicates if the property is actually an array of the fieldType above on the data api.
     * 
     */
    private final @Nullable Boolean isArray;
    /**
     * Whether property is available in graph or not.
     * 
     */
    private final @Nullable Boolean isAvailableInGraph;
    /**
     * Indicates if the property is an enum.
     * 
     */
    private final @Nullable Boolean isEnum;
    /**
     * Indicates if the property is an flag enum.
     * 
     */
    private final @Nullable Boolean isFlagEnum;
    /**
     * Whether the property is an Image.
     * 
     */
    private final @Nullable Boolean isImage;
    /**
     * Whether the property is a localized string.
     * 
     */
    private final @Nullable Boolean isLocalizedString;
    /**
     * Whether the property is a name or a part of name.
     * 
     */
    private final @Nullable Boolean isName;
    /**
     * Whether property value is required on instances, IsRequired field only for Interaction. Profile Instance will not check for required field.
     * 
     */
    private final @Nullable Boolean isRequired;
    /**
     * Max length of string. Used only if type is string.
     * 
     */
    private final @Nullable Integer maxLength;
    /**
     * The ID associated with the property.
     * 
     */
    private final @Nullable String propertyId;
    /**
     * URL encoded schema.org item prop link for the property.
     * 
     */
    private final @Nullable String schemaItemPropLink;

    @CustomType.Constructor
    private PropertyDefinitionResponse(
        @CustomType.Parameter("arrayValueSeparator") @Nullable String arrayValueSeparator,
        @CustomType.Parameter("dataSourcePrecedenceRules") List<DataSourcePrecedenceResponse> dataSourcePrecedenceRules,
        @CustomType.Parameter("enumValidValues") @Nullable List<ProfileEnumValidValuesFormatResponse> enumValidValues,
        @CustomType.Parameter("fieldName") String fieldName,
        @CustomType.Parameter("fieldType") String fieldType,
        @CustomType.Parameter("isArray") @Nullable Boolean isArray,
        @CustomType.Parameter("isAvailableInGraph") @Nullable Boolean isAvailableInGraph,
        @CustomType.Parameter("isEnum") @Nullable Boolean isEnum,
        @CustomType.Parameter("isFlagEnum") @Nullable Boolean isFlagEnum,
        @CustomType.Parameter("isImage") @Nullable Boolean isImage,
        @CustomType.Parameter("isLocalizedString") @Nullable Boolean isLocalizedString,
        @CustomType.Parameter("isName") @Nullable Boolean isName,
        @CustomType.Parameter("isRequired") @Nullable Boolean isRequired,
        @CustomType.Parameter("maxLength") @Nullable Integer maxLength,
        @CustomType.Parameter("propertyId") @Nullable String propertyId,
        @CustomType.Parameter("schemaItemPropLink") @Nullable String schemaItemPropLink) {
        this.arrayValueSeparator = arrayValueSeparator;
        this.dataSourcePrecedenceRules = dataSourcePrecedenceRules;
        this.enumValidValues = enumValidValues;
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.isArray = isArray;
        this.isAvailableInGraph = isAvailableInGraph;
        this.isEnum = isEnum;
        this.isFlagEnum = isFlagEnum;
        this.isImage = isImage;
        this.isLocalizedString = isLocalizedString;
        this.isName = isName;
        this.isRequired = isRequired;
        this.maxLength = maxLength;
        this.propertyId = propertyId;
        this.schemaItemPropLink = schemaItemPropLink;
    }

    /**
     * Array value separator for properties with isArray set.
     * 
    */
    public Optional<String> arrayValueSeparator() {
        return Optional.ofNullable(this.arrayValueSeparator);
    }
    /**
     * This is specific to interactions modeled as activities. Data sources are used to determine where data is stored and also in precedence rules.
     * 
    */
    public List<DataSourcePrecedenceResponse> dataSourcePrecedenceRules() {
        return this.dataSourcePrecedenceRules;
    }
    /**
     * Describes valid values for an enum property.
     * 
    */
    public List<ProfileEnumValidValuesFormatResponse> enumValidValues() {
        return this.enumValidValues == null ? List.of() : this.enumValidValues;
    }
    /**
     * Name of the property.
     * 
    */
    public String fieldName() {
        return this.fieldName;
    }
    /**
     * Type of the property.
     * 
    */
    public String fieldType() {
        return this.fieldType;
    }
    /**
     * Indicates if the property is actually an array of the fieldType above on the data api.
     * 
    */
    public Optional<Boolean> isArray() {
        return Optional.ofNullable(this.isArray);
    }
    /**
     * Whether property is available in graph or not.
     * 
    */
    public Optional<Boolean> isAvailableInGraph() {
        return Optional.ofNullable(this.isAvailableInGraph);
    }
    /**
     * Indicates if the property is an enum.
     * 
    */
    public Optional<Boolean> isEnum() {
        return Optional.ofNullable(this.isEnum);
    }
    /**
     * Indicates if the property is an flag enum.
     * 
    */
    public Optional<Boolean> isFlagEnum() {
        return Optional.ofNullable(this.isFlagEnum);
    }
    /**
     * Whether the property is an Image.
     * 
    */
    public Optional<Boolean> isImage() {
        return Optional.ofNullable(this.isImage);
    }
    /**
     * Whether the property is a localized string.
     * 
    */
    public Optional<Boolean> isLocalizedString() {
        return Optional.ofNullable(this.isLocalizedString);
    }
    /**
     * Whether the property is a name or a part of name.
     * 
    */
    public Optional<Boolean> isName() {
        return Optional.ofNullable(this.isName);
    }
    /**
     * Whether property value is required on instances, IsRequired field only for Interaction. Profile Instance will not check for required field.
     * 
    */
    public Optional<Boolean> isRequired() {
        return Optional.ofNullable(this.isRequired);
    }
    /**
     * Max length of string. Used only if type is string.
     * 
    */
    public Optional<Integer> maxLength() {
        return Optional.ofNullable(this.maxLength);
    }
    /**
     * The ID associated with the property.
     * 
    */
    public Optional<String> propertyId() {
        return Optional.ofNullable(this.propertyId);
    }
    /**
     * URL encoded schema.org item prop link for the property.
     * 
    */
    public Optional<String> schemaItemPropLink() {
        return Optional.ofNullable(this.schemaItemPropLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropertyDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arrayValueSeparator;
        private List<DataSourcePrecedenceResponse> dataSourcePrecedenceRules;
        private @Nullable List<ProfileEnumValidValuesFormatResponse> enumValidValues;
        private String fieldName;
        private String fieldType;
        private @Nullable Boolean isArray;
        private @Nullable Boolean isAvailableInGraph;
        private @Nullable Boolean isEnum;
        private @Nullable Boolean isFlagEnum;
        private @Nullable Boolean isImage;
        private @Nullable Boolean isLocalizedString;
        private @Nullable Boolean isName;
        private @Nullable Boolean isRequired;
        private @Nullable Integer maxLength;
        private @Nullable String propertyId;
        private @Nullable String schemaItemPropLink;

        public Builder() {
    	      // Empty
        }

        public Builder(PropertyDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arrayValueSeparator = defaults.arrayValueSeparator;
    	      this.dataSourcePrecedenceRules = defaults.dataSourcePrecedenceRules;
    	      this.enumValidValues = defaults.enumValidValues;
    	      this.fieldName = defaults.fieldName;
    	      this.fieldType = defaults.fieldType;
    	      this.isArray = defaults.isArray;
    	      this.isAvailableInGraph = defaults.isAvailableInGraph;
    	      this.isEnum = defaults.isEnum;
    	      this.isFlagEnum = defaults.isFlagEnum;
    	      this.isImage = defaults.isImage;
    	      this.isLocalizedString = defaults.isLocalizedString;
    	      this.isName = defaults.isName;
    	      this.isRequired = defaults.isRequired;
    	      this.maxLength = defaults.maxLength;
    	      this.propertyId = defaults.propertyId;
    	      this.schemaItemPropLink = defaults.schemaItemPropLink;
        }

        public Builder arrayValueSeparator(@Nullable String arrayValueSeparator) {
            this.arrayValueSeparator = arrayValueSeparator;
            return this;
        }
        public Builder dataSourcePrecedenceRules(List<DataSourcePrecedenceResponse> dataSourcePrecedenceRules) {
            this.dataSourcePrecedenceRules = Objects.requireNonNull(dataSourcePrecedenceRules);
            return this;
        }
        public Builder dataSourcePrecedenceRules(DataSourcePrecedenceResponse... dataSourcePrecedenceRules) {
            return dataSourcePrecedenceRules(List.of(dataSourcePrecedenceRules));
        }
        public Builder enumValidValues(@Nullable List<ProfileEnumValidValuesFormatResponse> enumValidValues) {
            this.enumValidValues = enumValidValues;
            return this;
        }
        public Builder enumValidValues(ProfileEnumValidValuesFormatResponse... enumValidValues) {
            return enumValidValues(List.of(enumValidValues));
        }
        public Builder fieldName(String fieldName) {
            this.fieldName = Objects.requireNonNull(fieldName);
            return this;
        }
        public Builder fieldType(String fieldType) {
            this.fieldType = Objects.requireNonNull(fieldType);
            return this;
        }
        public Builder isArray(@Nullable Boolean isArray) {
            this.isArray = isArray;
            return this;
        }
        public Builder isAvailableInGraph(@Nullable Boolean isAvailableInGraph) {
            this.isAvailableInGraph = isAvailableInGraph;
            return this;
        }
        public Builder isEnum(@Nullable Boolean isEnum) {
            this.isEnum = isEnum;
            return this;
        }
        public Builder isFlagEnum(@Nullable Boolean isFlagEnum) {
            this.isFlagEnum = isFlagEnum;
            return this;
        }
        public Builder isImage(@Nullable Boolean isImage) {
            this.isImage = isImage;
            return this;
        }
        public Builder isLocalizedString(@Nullable Boolean isLocalizedString) {
            this.isLocalizedString = isLocalizedString;
            return this;
        }
        public Builder isName(@Nullable Boolean isName) {
            this.isName = isName;
            return this;
        }
        public Builder isRequired(@Nullable Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Builder maxLength(@Nullable Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Builder propertyId(@Nullable String propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Builder schemaItemPropLink(@Nullable String schemaItemPropLink) {
            this.schemaItemPropLink = schemaItemPropLink;
            return this;
        }        public PropertyDefinitionResponse build() {
            return new PropertyDefinitionResponse(arrayValueSeparator, dataSourcePrecedenceRules, enumValidValues, fieldName, fieldType, isArray, isAvailableInGraph, isEnum, isFlagEnum, isImage, isLocalizedString, isName, isRequired, maxLength, propertyId, schemaItemPropLink);
        }
    }
}
