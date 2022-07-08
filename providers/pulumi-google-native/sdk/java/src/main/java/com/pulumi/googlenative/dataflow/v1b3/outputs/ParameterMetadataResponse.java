// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ParameterMetadataResponse {
    /**
     * @return Optional. Additional metadata for describing this parameter.
     * 
     */
    private final Map<String,String> customMetadata;
    /**
     * @return The help text to display for the parameter.
     * 
     */
    private final String helpText;
    /**
     * @return Optional. Whether the parameter is optional. Defaults to false.
     * 
     */
    private final Boolean isOptional;
    /**
     * @return The label to display for the parameter.
     * 
     */
    private final String label;
    /**
     * @return The name of the parameter.
     * 
     */
    private final String name;
    /**
     * @return Optional. The type of the parameter. Used for selecting input picker.
     * 
     */
    private final String paramType;
    /**
     * @return Optional. Regexes that the parameter must match.
     * 
     */
    private final List<String> regexes;

    @CustomType.Constructor
    private ParameterMetadataResponse(
        @CustomType.Parameter("customMetadata") Map<String,String> customMetadata,
        @CustomType.Parameter("helpText") String helpText,
        @CustomType.Parameter("isOptional") Boolean isOptional,
        @CustomType.Parameter("label") String label,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("paramType") String paramType,
        @CustomType.Parameter("regexes") List<String> regexes) {
        this.customMetadata = customMetadata;
        this.helpText = helpText;
        this.isOptional = isOptional;
        this.label = label;
        this.name = name;
        this.paramType = paramType;
        this.regexes = regexes;
    }

    /**
     * @return Optional. Additional metadata for describing this parameter.
     * 
     */
    public Map<String,String> customMetadata() {
        return this.customMetadata;
    }
    /**
     * @return The help text to display for the parameter.
     * 
     */
    public String helpText() {
        return this.helpText;
    }
    /**
     * @return Optional. Whether the parameter is optional. Defaults to false.
     * 
     */
    public Boolean isOptional() {
        return this.isOptional;
    }
    /**
     * @return The label to display for the parameter.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return The name of the parameter.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Optional. The type of the parameter. Used for selecting input picker.
     * 
     */
    public String paramType() {
        return this.paramType;
    }
    /**
     * @return Optional. Regexes that the parameter must match.
     * 
     */
    public List<String> regexes() {
        return this.regexes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> customMetadata;
        private String helpText;
        private Boolean isOptional;
        private String label;
        private String name;
        private String paramType;
        private List<String> regexes;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customMetadata = defaults.customMetadata;
    	      this.helpText = defaults.helpText;
    	      this.isOptional = defaults.isOptional;
    	      this.label = defaults.label;
    	      this.name = defaults.name;
    	      this.paramType = defaults.paramType;
    	      this.regexes = defaults.regexes;
        }

        public Builder customMetadata(Map<String,String> customMetadata) {
            this.customMetadata = Objects.requireNonNull(customMetadata);
            return this;
        }
        public Builder helpText(String helpText) {
            this.helpText = Objects.requireNonNull(helpText);
            return this;
        }
        public Builder isOptional(Boolean isOptional) {
            this.isOptional = Objects.requireNonNull(isOptional);
            return this;
        }
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder paramType(String paramType) {
            this.paramType = Objects.requireNonNull(paramType);
            return this;
        }
        public Builder regexes(List<String> regexes) {
            this.regexes = Objects.requireNonNull(regexes);
            return this;
        }
        public Builder regexes(String... regexes) {
            return regexes(List.of(regexes));
        }        public ParameterMetadataResponse build() {
            return new ParameterMetadataResponse(customMetadata, helpText, isOptional, label, name, paramType, regexes);
        }
    }
}
