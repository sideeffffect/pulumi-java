// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devops.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Template used to bootstrap the pipeline.
 * 
 */
public final class PipelineTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineTemplateArgs Empty = new PipelineTemplateArgs();

    /**
     * Unique identifier of the pipeline template.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Unique identifier of the pipeline template.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Dictionary of input parameters used in the pipeline template.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return Dictionary of input parameters used in the pipeline template.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private PipelineTemplateArgs() {}

    private PipelineTemplateArgs(PipelineTemplateArgs $) {
        this.id = $.id;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineTemplateArgs $;

        public Builder() {
            $ = new PipelineTemplateArgs();
        }

        public Builder(PipelineTemplateArgs defaults) {
            $ = new PipelineTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Unique identifier of the pipeline template.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique identifier of the pipeline template.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param parameters Dictionary of input parameters used in the pipeline template.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Dictionary of input parameters used in the pipeline template.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        public PipelineTemplateArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
