// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.inputs;

import com.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplicationConfigurationState extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationState Empty = new ReplicationConfigurationState();

    /**
     * The account ID of the destination registry to replicate to.
     * 
     */
    @Import(name="registryId")
    private @Nullable Output<String> registryId;

    public Optional<Output<String>> registryId() {
        return Optional.ofNullable(this.registryId);
    }

    /**
     * Replication configuration for a registry. See Replication Configuration.
     * 
     */
    @Import(name="replicationConfiguration")
    private @Nullable Output<ReplicationConfigurationReplicationConfigurationGetArgs> replicationConfiguration;

    public Optional<Output<ReplicationConfigurationReplicationConfigurationGetArgs>> replicationConfiguration() {
        return Optional.ofNullable(this.replicationConfiguration);
    }

    private ReplicationConfigurationState() {}

    private ReplicationConfigurationState(ReplicationConfigurationState $) {
        this.registryId = $.registryId;
        this.replicationConfiguration = $.replicationConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationConfigurationState $;

        public Builder() {
            $ = new ReplicationConfigurationState();
        }

        public Builder(ReplicationConfigurationState defaults) {
            $ = new ReplicationConfigurationState(Objects.requireNonNull(defaults));
        }

        public Builder registryId(@Nullable Output<String> registryId) {
            $.registryId = registryId;
            return this;
        }

        public Builder registryId(String registryId) {
            return registryId(Output.of(registryId));
        }

        public Builder replicationConfiguration(@Nullable Output<ReplicationConfigurationReplicationConfigurationGetArgs> replicationConfiguration) {
            $.replicationConfiguration = replicationConfiguration;
            return this;
        }

        public Builder replicationConfiguration(ReplicationConfigurationReplicationConfigurationGetArgs replicationConfiguration) {
            return replicationConfiguration(Output.of(replicationConfiguration));
        }

        public ReplicationConfigurationState build() {
            return $;
        }
    }

}
