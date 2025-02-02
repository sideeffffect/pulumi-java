// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbilling_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBillingAccountIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBillingAccountIamPolicyArgs Empty = new GetBillingAccountIamPolicyArgs();

    @Import(name="billingAccountId", required=true)
    private Output<String> billingAccountId;

    public Output<String> billingAccountId() {
        return this.billingAccountId;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable Output<String> optionsRequestedPolicyVersion;

    public Optional<Output<String>> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    private GetBillingAccountIamPolicyArgs() {}

    private GetBillingAccountIamPolicyArgs(GetBillingAccountIamPolicyArgs $) {
        this.billingAccountId = $.billingAccountId;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBillingAccountIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBillingAccountIamPolicyArgs $;

        public Builder() {
            $ = new GetBillingAccountIamPolicyArgs();
        }

        public Builder(GetBillingAccountIamPolicyArgs defaults) {
            $ = new GetBillingAccountIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder billingAccountId(Output<String> billingAccountId) {
            $.billingAccountId = billingAccountId;
            return this;
        }

        public Builder billingAccountId(String billingAccountId) {
            return billingAccountId(Output.of(billingAccountId));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable Output<String> optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(String optionsRequestedPolicyVersion) {
            return optionsRequestedPolicyVersion(Output.of(optionsRequestedPolicyVersion));
        }

        public GetBillingAccountIamPolicyArgs build() {
            $.billingAccountId = Objects.requireNonNull($.billingAccountId, "expected parameter 'billingAccountId' to be non-null");
            return $;
        }
    }

}
