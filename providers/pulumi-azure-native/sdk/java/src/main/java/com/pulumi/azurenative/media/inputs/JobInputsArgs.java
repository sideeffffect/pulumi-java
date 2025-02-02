// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.JobInputAssetArgs;
import com.pulumi.azurenative.media.inputs.JobInputClipArgs;
import com.pulumi.azurenative.media.inputs.JobInputHttpArgs;
import com.pulumi.azurenative.media.inputs.JobInputSequenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a list of inputs to a Job.
 * 
 */
public final class JobInputsArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobInputsArgs Empty = new JobInputsArgs();

    /**
     * List of inputs to a Job.
     * 
     */
    @Import(name="inputs")
    private @Nullable Output<List<Object>> inputs;

    /**
     * @return List of inputs to a Job.
     * 
     */
    public Optional<Output<List<Object>>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.JobInputs&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.JobInputs&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    private JobInputsArgs() {}

    private JobInputsArgs(JobInputsArgs $) {
        this.inputs = $.inputs;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobInputsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobInputsArgs $;

        public Builder() {
            $ = new JobInputsArgs();
        }

        public Builder(JobInputsArgs defaults) {
            $ = new JobInputsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inputs List of inputs to a Job.
         * 
         * @return builder
         * 
         */
        public Builder inputs(@Nullable Output<List<Object>> inputs) {
            $.inputs = inputs;
            return this;
        }

        /**
         * @param inputs List of inputs to a Job.
         * 
         * @return builder
         * 
         */
        public Builder inputs(List<Object> inputs) {
            return inputs(Output.of(inputs));
        }

        /**
         * @param inputs List of inputs to a Job.
         * 
         * @return builder
         * 
         */
        public Builder inputs(Object... inputs) {
            return inputs(List.of(inputs));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.JobInputs&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.JobInputs&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public JobInputsArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
