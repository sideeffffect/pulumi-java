// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticache.inputs;

import com.pulumi.awsnative.elasticache.inputs.GlobalReplicationGroupReshardingConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalReplicationGroupRegionalConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalReplicationGroupRegionalConfigurationArgs Empty = new GlobalReplicationGroupRegionalConfigurationArgs();

    /**
     * The replication group id of the Global Datastore member.
     * 
     */
    @Import(name="replicationGroupId")
    private @Nullable Output<String> replicationGroupId;

    public Optional<Output<String>> replicationGroupId() {
        return Optional.ofNullable(this.replicationGroupId);
    }

    /**
     * The AWS region of the Global Datastore member.
     * 
     */
    @Import(name="replicationGroupRegion")
    private @Nullable Output<String> replicationGroupRegion;

    public Optional<Output<String>> replicationGroupRegion() {
        return Optional.ofNullable(this.replicationGroupRegion);
    }

    /**
     * A list of PreferredAvailabilityZones objects that specifies the configuration of a node group in the resharded cluster.
     * 
     */
    @Import(name="reshardingConfigurations")
    private @Nullable Output<List<GlobalReplicationGroupReshardingConfigurationArgs>> reshardingConfigurations;

    public Optional<Output<List<GlobalReplicationGroupReshardingConfigurationArgs>>> reshardingConfigurations() {
        return Optional.ofNullable(this.reshardingConfigurations);
    }

    private GlobalReplicationGroupRegionalConfigurationArgs() {}

    private GlobalReplicationGroupRegionalConfigurationArgs(GlobalReplicationGroupRegionalConfigurationArgs $) {
        this.replicationGroupId = $.replicationGroupId;
        this.replicationGroupRegion = $.replicationGroupRegion;
        this.reshardingConfigurations = $.reshardingConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalReplicationGroupRegionalConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalReplicationGroupRegionalConfigurationArgs $;

        public Builder() {
            $ = new GlobalReplicationGroupRegionalConfigurationArgs();
        }

        public Builder(GlobalReplicationGroupRegionalConfigurationArgs defaults) {
            $ = new GlobalReplicationGroupRegionalConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder replicationGroupId(@Nullable Output<String> replicationGroupId) {
            $.replicationGroupId = replicationGroupId;
            return this;
        }

        public Builder replicationGroupId(String replicationGroupId) {
            return replicationGroupId(Output.of(replicationGroupId));
        }

        public Builder replicationGroupRegion(@Nullable Output<String> replicationGroupRegion) {
            $.replicationGroupRegion = replicationGroupRegion;
            return this;
        }

        public Builder replicationGroupRegion(String replicationGroupRegion) {
            return replicationGroupRegion(Output.of(replicationGroupRegion));
        }

        public Builder reshardingConfigurations(@Nullable Output<List<GlobalReplicationGroupReshardingConfigurationArgs>> reshardingConfigurations) {
            $.reshardingConfigurations = reshardingConfigurations;
            return this;
        }

        public Builder reshardingConfigurations(List<GlobalReplicationGroupReshardingConfigurationArgs> reshardingConfigurations) {
            return reshardingConfigurations(Output.of(reshardingConfigurations));
        }

        public Builder reshardingConfigurations(GlobalReplicationGroupReshardingConfigurationArgs... reshardingConfigurations) {
            return reshardingConfigurations(List.of(reshardingConfigurations));
        }

        public GlobalReplicationGroupRegionalConfigurationArgs build() {
            return $;
        }
    }

}
