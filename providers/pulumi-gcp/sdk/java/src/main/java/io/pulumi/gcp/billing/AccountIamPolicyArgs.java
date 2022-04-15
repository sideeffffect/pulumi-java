// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class AccountIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountIamPolicyArgs Empty = new AccountIamPolicyArgs();

    @Import(name="billingAccountId", required=true)
      private final Output<String> billingAccountId;

    public Output<String> billingAccountId() {
        return this.billingAccountId;
    }

    @Import(name="policyData", required=true)
      private final Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData;
    }

    public AccountIamPolicyArgs(
        Output<String> billingAccountId,
        Output<String> policyData) {
        this.billingAccountId = Objects.requireNonNull(billingAccountId, "expected parameter 'billingAccountId' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
    }

    private AccountIamPolicyArgs() {
        this.billingAccountId = Codegen.empty();
        this.policyData = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> billingAccountId;
        private Output<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.policyData = defaults.policyData;
        }

        public Builder billingAccountId(Output<String> billingAccountId) {
            this.billingAccountId = Objects.requireNonNull(billingAccountId);
            return this;
        }
        public Builder billingAccountId(String billingAccountId) {
            this.billingAccountId = Output.of(Objects.requireNonNull(billingAccountId));
            return this;
        }
        public Builder policyData(Output<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }
        public Builder policyData(String policyData) {
            this.policyData = Output.of(Objects.requireNonNull(policyData));
            return this;
        }        public AccountIamPolicyArgs build() {
            return new AccountIamPolicyArgs(billingAccountId, policyData);
        }
    }
}
