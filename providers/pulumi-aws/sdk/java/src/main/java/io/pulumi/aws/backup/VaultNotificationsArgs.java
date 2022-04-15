// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VaultNotificationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultNotificationsArgs Empty = new VaultNotificationsArgs();

    /**
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     * 
     */
    @Import(name="backupVaultEvents", required=true)
      private final Output<List<String>> backupVaultEvents;

    public Output<List<String>> backupVaultEvents() {
        return this.backupVaultEvents;
    }

    /**
     * Name of the backup vault to add notifications for.
     * 
     */
    @Import(name="backupVaultName", required=true)
      private final Output<String> backupVaultName;

    public Output<String> backupVaultName() {
        return this.backupVaultName;
    }

    /**
     * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
     * 
     */
    @Import(name="snsTopicArn", required=true)
      private final Output<String> snsTopicArn;

    public Output<String> snsTopicArn() {
        return this.snsTopicArn;
    }

    public VaultNotificationsArgs(
        Output<List<String>> backupVaultEvents,
        Output<String> backupVaultName,
        Output<String> snsTopicArn) {
        this.backupVaultEvents = Objects.requireNonNull(backupVaultEvents, "expected parameter 'backupVaultEvents' to be non-null");
        this.backupVaultName = Objects.requireNonNull(backupVaultName, "expected parameter 'backupVaultName' to be non-null");
        this.snsTopicArn = Objects.requireNonNull(snsTopicArn, "expected parameter 'snsTopicArn' to be non-null");
    }

    private VaultNotificationsArgs() {
        this.backupVaultEvents = Codegen.empty();
        this.backupVaultName = Codegen.empty();
        this.snsTopicArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> backupVaultEvents;
        private Output<String> backupVaultName;
        private Output<String> snsTopicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultNotificationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupVaultEvents = defaults.backupVaultEvents;
    	      this.backupVaultName = defaults.backupVaultName;
    	      this.snsTopicArn = defaults.snsTopicArn;
        }

        public Builder backupVaultEvents(Output<List<String>> backupVaultEvents) {
            this.backupVaultEvents = Objects.requireNonNull(backupVaultEvents);
            return this;
        }
        public Builder backupVaultEvents(List<String> backupVaultEvents) {
            this.backupVaultEvents = Output.of(Objects.requireNonNull(backupVaultEvents));
            return this;
        }
        public Builder backupVaultEvents(String... backupVaultEvents) {
            return backupVaultEvents(List.of(backupVaultEvents));
        }
        public Builder backupVaultName(Output<String> backupVaultName) {
            this.backupVaultName = Objects.requireNonNull(backupVaultName);
            return this;
        }
        public Builder backupVaultName(String backupVaultName) {
            this.backupVaultName = Output.of(Objects.requireNonNull(backupVaultName));
            return this;
        }
        public Builder snsTopicArn(Output<String> snsTopicArn) {
            this.snsTopicArn = Objects.requireNonNull(snsTopicArn);
            return this;
        }
        public Builder snsTopicArn(String snsTopicArn) {
            this.snsTopicArn = Output.of(Objects.requireNonNull(snsTopicArn));
            return this;
        }        public VaultNotificationsArgs build() {
            return new VaultNotificationsArgs(backupVaultEvents, backupVaultName, snsTopicArn);
        }
    }
}
