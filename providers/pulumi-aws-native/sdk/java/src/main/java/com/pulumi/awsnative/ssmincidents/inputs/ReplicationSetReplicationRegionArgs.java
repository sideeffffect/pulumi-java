// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmincidents.inputs;

import com.pulumi.awsnative.ssmincidents.inputs.ReplicationSetRegionConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The ReplicationSet regional configuration.
 * 
 */
public final class ReplicationSetReplicationRegionArgs extends ResourceArgs {

    public static final ReplicationSetReplicationRegionArgs Empty = new ReplicationSetReplicationRegionArgs();

    @Import(name="regionConfiguration")
    private @Nullable Output<ReplicationSetRegionConfigurationArgs> regionConfiguration;

    public Optional<Output<ReplicationSetRegionConfigurationArgs>> regionConfiguration() {
        return Optional.ofNullable(this.regionConfiguration);
    }

    @Import(name="regionName")
    private @Nullable Output<String> regionName;

    public Optional<Output<String>> regionName() {
        return Optional.ofNullable(this.regionName);
    }

    private ReplicationSetReplicationRegionArgs() {}

    private ReplicationSetReplicationRegionArgs(ReplicationSetReplicationRegionArgs $) {
        this.regionConfiguration = $.regionConfiguration;
        this.regionName = $.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationSetReplicationRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationSetReplicationRegionArgs $;

        public Builder() {
            $ = new ReplicationSetReplicationRegionArgs();
        }

        public Builder(ReplicationSetReplicationRegionArgs defaults) {
            $ = new ReplicationSetReplicationRegionArgs(Objects.requireNonNull(defaults));
        }

        public Builder regionConfiguration(@Nullable Output<ReplicationSetRegionConfigurationArgs> regionConfiguration) {
            $.regionConfiguration = regionConfiguration;
            return this;
        }

        public Builder regionConfiguration(ReplicationSetRegionConfigurationArgs regionConfiguration) {
            return regionConfiguration(Output.of(regionConfiguration));
        }

        public Builder regionName(@Nullable Output<String> regionName) {
            $.regionName = regionName;
            return this;
        }

        public Builder regionName(String regionName) {
            return regionName(Output.of(regionName));
        }

        public ReplicationSetReplicationRegionArgs build() {
            return $;
        }
    }

}
