// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VaultPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultPolicyArgs Empty = new VaultPolicyArgs();

    /**
     * Name of the backup vault to add policy for.
     * 
     */
    @InputImport(name="backupVaultName", required=true)
      private final Input<String> backupVaultName;

    public Input<String> getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * The backup vault access policy document in JSON format.
     * 
     */
    @InputImport(name="policy", required=true)
      private final Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy;
    }

    public VaultPolicyArgs(
        Input<String> backupVaultName,
        Input<String> policy) {
        this.backupVaultName = Objects.requireNonNull(backupVaultName, "expected parameter 'backupVaultName' to be non-null");
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
    }

    private VaultPolicyArgs() {
        this.backupVaultName = Input.empty();
        this.policy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> backupVaultName;
        private Input<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupVaultName = defaults.backupVaultName;
    	      this.policy = defaults.policy;
        }

        public Builder backupVaultName(Input<String> backupVaultName) {
            this.backupVaultName = Objects.requireNonNull(backupVaultName);
            return this;
        }

        public Builder backupVaultName(String backupVaultName) {
            this.backupVaultName = Input.of(Objects.requireNonNull(backupVaultName));
            return this;
        }

        public Builder policy(Input<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder policy(String policy) {
            this.policy = Input.of(Objects.requireNonNull(policy));
            return this;
        }
        public VaultPolicyArgs build() {
            return new VaultPolicyArgs(backupVaultName, policy);
        }
    }
}
