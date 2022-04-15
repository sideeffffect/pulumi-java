// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VaultLockConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final VaultLockConfigurationState Empty = new VaultLockConfigurationState();

    /**
     * The ARN of the vault.
     * 
     */
    @Import(name="backupVaultArn")
      private final @Nullable Output<String> backupVaultArn;

    public Output<String> backupVaultArn() {
        return this.backupVaultArn == null ? Codegen.empty() : this.backupVaultArn;
    }

    /**
     * Name of the backup vault to add a lock configuration for.
     * 
     */
    @Import(name="backupVaultName")
      private final @Nullable Output<String> backupVaultName;

    public Output<String> backupVaultName() {
        return this.backupVaultName == null ? Codegen.empty() : this.backupVaultName;
    }

    /**
     * The number of days before the lock date.
     * 
     */
    @Import(name="changeableForDays")
      private final @Nullable Output<Integer> changeableForDays;

    public Output<Integer> changeableForDays() {
        return this.changeableForDays == null ? Codegen.empty() : this.changeableForDays;
    }

    /**
     * The maximum retention period that the vault retains its recovery points.
     * 
     */
    @Import(name="maxRetentionDays")
      private final @Nullable Output<Integer> maxRetentionDays;

    public Output<Integer> maxRetentionDays() {
        return this.maxRetentionDays == null ? Codegen.empty() : this.maxRetentionDays;
    }

    /**
     * The minimum retention period that the vault retains its recovery points.
     * 
     */
    @Import(name="minRetentionDays")
      private final @Nullable Output<Integer> minRetentionDays;

    public Output<Integer> minRetentionDays() {
        return this.minRetentionDays == null ? Codegen.empty() : this.minRetentionDays;
    }

    public VaultLockConfigurationState(
        @Nullable Output<String> backupVaultArn,
        @Nullable Output<String> backupVaultName,
        @Nullable Output<Integer> changeableForDays,
        @Nullable Output<Integer> maxRetentionDays,
        @Nullable Output<Integer> minRetentionDays) {
        this.backupVaultArn = backupVaultArn;
        this.backupVaultName = backupVaultName;
        this.changeableForDays = changeableForDays;
        this.maxRetentionDays = maxRetentionDays;
        this.minRetentionDays = minRetentionDays;
    }

    private VaultLockConfigurationState() {
        this.backupVaultArn = Codegen.empty();
        this.backupVaultName = Codegen.empty();
        this.changeableForDays = Codegen.empty();
        this.maxRetentionDays = Codegen.empty();
        this.minRetentionDays = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultLockConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> backupVaultArn;
        private @Nullable Output<String> backupVaultName;
        private @Nullable Output<Integer> changeableForDays;
        private @Nullable Output<Integer> maxRetentionDays;
        private @Nullable Output<Integer> minRetentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultLockConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupVaultArn = defaults.backupVaultArn;
    	      this.backupVaultName = defaults.backupVaultName;
    	      this.changeableForDays = defaults.changeableForDays;
    	      this.maxRetentionDays = defaults.maxRetentionDays;
    	      this.minRetentionDays = defaults.minRetentionDays;
        }

        public Builder backupVaultArn(@Nullable Output<String> backupVaultArn) {
            this.backupVaultArn = backupVaultArn;
            return this;
        }
        public Builder backupVaultArn(@Nullable String backupVaultArn) {
            this.backupVaultArn = Codegen.ofNullable(backupVaultArn);
            return this;
        }
        public Builder backupVaultName(@Nullable Output<String> backupVaultName) {
            this.backupVaultName = backupVaultName;
            return this;
        }
        public Builder backupVaultName(@Nullable String backupVaultName) {
            this.backupVaultName = Codegen.ofNullable(backupVaultName);
            return this;
        }
        public Builder changeableForDays(@Nullable Output<Integer> changeableForDays) {
            this.changeableForDays = changeableForDays;
            return this;
        }
        public Builder changeableForDays(@Nullable Integer changeableForDays) {
            this.changeableForDays = Codegen.ofNullable(changeableForDays);
            return this;
        }
        public Builder maxRetentionDays(@Nullable Output<Integer> maxRetentionDays) {
            this.maxRetentionDays = maxRetentionDays;
            return this;
        }
        public Builder maxRetentionDays(@Nullable Integer maxRetentionDays) {
            this.maxRetentionDays = Codegen.ofNullable(maxRetentionDays);
            return this;
        }
        public Builder minRetentionDays(@Nullable Output<Integer> minRetentionDays) {
            this.minRetentionDays = minRetentionDays;
            return this;
        }
        public Builder minRetentionDays(@Nullable Integer minRetentionDays) {
            this.minRetentionDays = Codegen.ofNullable(minRetentionDays);
            return this;
        }        public VaultLockConfigurationState build() {
            return new VaultLockConfigurationState(backupVaultArn, backupVaultName, changeableForDays, maxRetentionDays, minRetentionDays);
        }
    }
}
