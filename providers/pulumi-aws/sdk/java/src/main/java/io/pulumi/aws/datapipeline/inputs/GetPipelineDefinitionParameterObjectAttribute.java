// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPipelineDefinitionParameterObjectAttribute extends io.pulumi.resources.InvokeArgs {

    public static final GetPipelineDefinitionParameterObjectAttribute Empty = new GetPipelineDefinitionParameterObjectAttribute();

    /**
     * Field identifier.
     * 
     */
    @Import(name="key", required=true)
      private final String key;

    public String key() {
        return this.key;
    }

    /**
     * Field value, expressed as a String.
     * 
     */
    @Import(name="stringValue", required=true)
      private final String stringValue;

    public String stringValue() {
        return this.stringValue;
    }

    public GetPipelineDefinitionParameterObjectAttribute(
        String key,
        String stringValue) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.stringValue = Objects.requireNonNull(stringValue, "expected parameter 'stringValue' to be non-null");
    }

    private GetPipelineDefinitionParameterObjectAttribute() {
        this.key = null;
        this.stringValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineDefinitionParameterObjectAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineDefinitionParameterObjectAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder stringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }        public GetPipelineDefinitionParameterObjectAttribute build() {
            return new GetPipelineDefinitionParameterObjectAttribute(key, stringValue);
        }
    }
}
