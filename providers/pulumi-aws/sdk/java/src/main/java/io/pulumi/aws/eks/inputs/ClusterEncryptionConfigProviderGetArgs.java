// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ClusterEncryptionConfigProviderGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterEncryptionConfigProviderGetArgs Empty = new ClusterEncryptionConfigProviderGetArgs();

    /**
     * ARN of the Key Management Service (KMS) customer master key (CMK). The CMK must be symmetric, created in the same region as the cluster, and if the CMK was created in a different account, the user must have access to the CMK. For more information, see [Allowing Users in Other Accounts to Use a CMK in the AWS Key Management Service Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html).
     * 
     */
    @InputImport(name="keyArn", required=true)
      private final Input<String> keyArn;

    public Input<String> getKeyArn() {
        return this.keyArn;
    }

    public ClusterEncryptionConfigProviderGetArgs(Input<String> keyArn) {
        this.keyArn = Objects.requireNonNull(keyArn, "expected parameter 'keyArn' to be non-null");
    }

    private ClusterEncryptionConfigProviderGetArgs() {
        this.keyArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEncryptionConfigProviderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEncryptionConfigProviderGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyArn = defaults.keyArn;
        }

        public Builder keyArn(Input<String> keyArn) {
            this.keyArn = Objects.requireNonNull(keyArn);
            return this;
        }

        public Builder keyArn(String keyArn) {
            this.keyArn = Input.of(Objects.requireNonNull(keyArn));
            return this;
        }
        public ClusterEncryptionConfigProviderGetArgs build() {
            return new ClusterEncryptionConfigProviderGetArgs(keyArn);
        }
    }
}
