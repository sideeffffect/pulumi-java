// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class InstanceFromTemplateConfidentialInstanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateConfidentialInstanceConfigArgs Empty = new InstanceFromTemplateConfidentialInstanceConfigArgs();

    @Import(name="enableConfidentialCompute", required=true)
    private Output<Boolean> enableConfidentialCompute;

    public Output<Boolean> enableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    private InstanceFromTemplateConfidentialInstanceConfigArgs() {}

    private InstanceFromTemplateConfidentialInstanceConfigArgs(InstanceFromTemplateConfidentialInstanceConfigArgs $) {
        this.enableConfidentialCompute = $.enableConfidentialCompute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromTemplateConfidentialInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromTemplateConfidentialInstanceConfigArgs $;

        public Builder() {
            $ = new InstanceFromTemplateConfidentialInstanceConfigArgs();
        }

        public Builder(InstanceFromTemplateConfidentialInstanceConfigArgs defaults) {
            $ = new InstanceFromTemplateConfidentialInstanceConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableConfidentialCompute(Output<Boolean> enableConfidentialCompute) {
            $.enableConfidentialCompute = enableConfidentialCompute;
            return this;
        }

        public Builder enableConfidentialCompute(Boolean enableConfidentialCompute) {
            return enableConfidentialCompute(Output.of(enableConfidentialCompute));
        }

        public InstanceFromTemplateConfidentialInstanceConfigArgs build() {
            $.enableConfidentialCompute = Objects.requireNonNull($.enableConfidentialCompute, "expected parameter 'enableConfidentialCompute' to be non-null");
            return $;
        }
    }

}
