// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datapipeline.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineDefinitionPipelineObjectFieldGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineDefinitionPipelineObjectFieldGetArgs Empty = new PipelineDefinitionPipelineObjectFieldGetArgs();

    /**
     * Field identifier.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * Field value, expressed as the identifier of another object
     * 
     */
    @Import(name="refValue")
    private @Nullable Output<String> refValue;

    public Optional<Output<String>> refValue() {
        return Optional.ofNullable(this.refValue);
    }

    /**
     * Field value, expressed as a String.
     * 
     */
    @Import(name="stringValue")
    private @Nullable Output<String> stringValue;

    public Optional<Output<String>> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }

    private PipelineDefinitionPipelineObjectFieldGetArgs() {}

    private PipelineDefinitionPipelineObjectFieldGetArgs(PipelineDefinitionPipelineObjectFieldGetArgs $) {
        this.key = $.key;
        this.refValue = $.refValue;
        this.stringValue = $.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineDefinitionPipelineObjectFieldGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineDefinitionPipelineObjectFieldGetArgs $;

        public Builder() {
            $ = new PipelineDefinitionPipelineObjectFieldGetArgs();
        }

        public Builder(PipelineDefinitionPipelineObjectFieldGetArgs defaults) {
            $ = new PipelineDefinitionPipelineObjectFieldGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder refValue(@Nullable Output<String> refValue) {
            $.refValue = refValue;
            return this;
        }

        public Builder refValue(String refValue) {
            return refValue(Output.of(refValue));
        }

        public Builder stringValue(@Nullable Output<String> stringValue) {
            $.stringValue = stringValue;
            return this;
        }

        public Builder stringValue(String stringValue) {
            return stringValue(Output.of(stringValue));
        }

        public PipelineDefinitionPipelineObjectFieldGetArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
