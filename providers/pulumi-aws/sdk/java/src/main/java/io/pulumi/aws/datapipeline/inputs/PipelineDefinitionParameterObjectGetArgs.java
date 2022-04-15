// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.inputs;

import io.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectAttributeGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineDefinitionParameterObjectGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineDefinitionParameterObjectGetArgs Empty = new PipelineDefinitionParameterObjectGetArgs();

    @Import(name="attributes")
      private final @Nullable Output<List<PipelineDefinitionParameterObjectAttributeGetArgs>> attributes;

    public Output<List<PipelineDefinitionParameterObjectAttributeGetArgs>> attributes() {
        return this.attributes == null ? Codegen.empty() : this.attributes;
    }

    /**
     * ID of the parameter value.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    public PipelineDefinitionParameterObjectGetArgs(
        @Nullable Output<List<PipelineDefinitionParameterObjectAttributeGetArgs>> attributes,
        Output<String> id) {
        this.attributes = attributes;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private PipelineDefinitionParameterObjectGetArgs() {
        this.attributes = Codegen.empty();
        this.id = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDefinitionParameterObjectGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<PipelineDefinitionParameterObjectAttributeGetArgs>> attributes;
        private Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDefinitionParameterObjectGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.id = defaults.id;
        }

        public Builder attributes(@Nullable Output<List<PipelineDefinitionParameterObjectAttributeGetArgs>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder attributes(@Nullable List<PipelineDefinitionParameterObjectAttributeGetArgs> attributes) {
            this.attributes = Codegen.ofNullable(attributes);
            return this;
        }
        public Builder attributes(PipelineDefinitionParameterObjectAttributeGetArgs... attributes) {
            return attributes(List.of(attributes));
        }
        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }        public PipelineDefinitionParameterObjectGetArgs build() {
            return new PipelineDefinitionParameterObjectGetArgs(attributes, id);
        }
    }
}
