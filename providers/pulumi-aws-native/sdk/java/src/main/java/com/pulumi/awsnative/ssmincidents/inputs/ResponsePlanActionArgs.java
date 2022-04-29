// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmincidents.inputs;

import com.pulumi.awsnative.ssmincidents.inputs.ResponsePlanSsmAutomationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The automation configuration to launch.
 * 
 */
public final class ResponsePlanActionArgs extends ResourceArgs {

    public static final ResponsePlanActionArgs Empty = new ResponsePlanActionArgs();

    @Import(name="ssmAutomation")
    private @Nullable Output<ResponsePlanSsmAutomationArgs> ssmAutomation;

    public Optional<Output<ResponsePlanSsmAutomationArgs>> ssmAutomation() {
        return Optional.ofNullable(this.ssmAutomation);
    }

    private ResponsePlanActionArgs() {}

    private ResponsePlanActionArgs(ResponsePlanActionArgs $) {
        this.ssmAutomation = $.ssmAutomation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponsePlanActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponsePlanActionArgs $;

        public Builder() {
            $ = new ResponsePlanActionArgs();
        }

        public Builder(ResponsePlanActionArgs defaults) {
            $ = new ResponsePlanActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder ssmAutomation(@Nullable Output<ResponsePlanSsmAutomationArgs> ssmAutomation) {
            $.ssmAutomation = ssmAutomation;
            return this;
        }

        public Builder ssmAutomation(ResponsePlanSsmAutomationArgs ssmAutomation) {
            return ssmAutomation(Output.of(ssmAutomation));
        }

        public ResponsePlanActionArgs build() {
            return $;
        }
    }

}
