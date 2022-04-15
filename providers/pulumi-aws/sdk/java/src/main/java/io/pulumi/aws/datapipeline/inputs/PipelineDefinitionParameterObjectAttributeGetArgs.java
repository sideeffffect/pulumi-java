// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class PipelineDefinitionParameterObjectAttributeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineDefinitionParameterObjectAttributeGetArgs Empty = new PipelineDefinitionParameterObjectAttributeGetArgs();

    /**
     * Field identifier.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * Field value, expressed as a String.
     * 
     */
    @Import(name="stringValue", required=true)
      private final Output<String> stringValue;

    public Output<String> stringValue() {
        return this.stringValue;
    }

    public PipelineDefinitionParameterObjectAttributeGetArgs(
        Output<String> key,
        Output<String> stringValue) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.stringValue = Objects.requireNonNull(stringValue, "expected parameter 'stringValue' to be non-null");
    }

    private PipelineDefinitionParameterObjectAttributeGetArgs() {
        this.key = Codegen.empty();
        this.stringValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDefinitionParameterObjectAttributeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private Output<String> stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDefinitionParameterObjectAttributeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder stringValue(Output<String> stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }
        public Builder stringValue(String stringValue) {
            this.stringValue = Output.of(Objects.requireNonNull(stringValue));
            return this;
        }        public PipelineDefinitionParameterObjectAttributeGetArgs build() {
            return new PipelineDefinitionParameterObjectAttributeGetArgs(key, stringValue);
        }
    }
}
