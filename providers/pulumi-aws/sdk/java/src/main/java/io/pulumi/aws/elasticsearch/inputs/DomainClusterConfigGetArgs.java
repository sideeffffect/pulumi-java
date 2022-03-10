// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.aws.elasticsearch.inputs.DomainClusterConfigZoneAwarenessConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainClusterConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainClusterConfigGetArgs Empty = new DomainClusterConfigGetArgs();

    /**
     * Number of dedicated main nodes in the cluster.
     * 
     */
    @InputImport(name="dedicatedMasterCount")
      private final @Nullable Input<Integer> dedicatedMasterCount;

    public Input<Integer> getDedicatedMasterCount() {
        return this.dedicatedMasterCount == null ? Input.empty() : this.dedicatedMasterCount;
    }

    /**
     * Whether dedicated main nodes are enabled for the cluster.
     * 
     */
    @InputImport(name="dedicatedMasterEnabled")
      private final @Nullable Input<Boolean> dedicatedMasterEnabled;

    public Input<Boolean> getDedicatedMasterEnabled() {
        return this.dedicatedMasterEnabled == null ? Input.empty() : this.dedicatedMasterEnabled;
    }

    /**
     * Instance type of the dedicated main nodes in the cluster.
     * 
     */
    @InputImport(name="dedicatedMasterType")
      private final @Nullable Input<String> dedicatedMasterType;

    public Input<String> getDedicatedMasterType() {
        return this.dedicatedMasterType == null ? Input.empty() : this.dedicatedMasterType;
    }

    /**
     * Number of instances in the cluster.
     * 
     */
    @InputImport(name="instanceCount")
      private final @Nullable Input<Integer> instanceCount;

    public Input<Integer> getInstanceCount() {
        return this.instanceCount == null ? Input.empty() : this.instanceCount;
    }

    /**
     * Instance type of data nodes in the cluster.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * Number of warm nodes in the cluster. Valid values are between `2` and `150`. `warm_count` can be only and must be set when `warm_enabled` is set to `true`.
     * 
     */
    @InputImport(name="warmCount")
      private final @Nullable Input<Integer> warmCount;

    public Input<Integer> getWarmCount() {
        return this.warmCount == null ? Input.empty() : this.warmCount;
    }

    /**
     * Whether to enable warm storage.
     * 
     */
    @InputImport(name="warmEnabled")
      private final @Nullable Input<Boolean> warmEnabled;

    public Input<Boolean> getWarmEnabled() {
        return this.warmEnabled == null ? Input.empty() : this.warmEnabled;
    }

    /**
     * Instance type for the Elasticsearch cluster's warm nodes. Valid values are `ultrawarm1.medium.elasticsearch`, `ultrawarm1.large.elasticsearch` and `ultrawarm1.xlarge.elasticsearch`. `warm_type` can be only and must be set when `warm_enabled` is set to `true`.
     * 
     */
    @InputImport(name="warmType")
      private final @Nullable Input<String> warmType;

    public Input<String> getWarmType() {
        return this.warmType == null ? Input.empty() : this.warmType;
    }

    /**
     * Configuration block containing zone awareness settings. Detailed below.
     * 
     */
    @InputImport(name="zoneAwarenessConfig")
      private final @Nullable Input<DomainClusterConfigZoneAwarenessConfigGetArgs> zoneAwarenessConfig;

    public Input<DomainClusterConfigZoneAwarenessConfigGetArgs> getZoneAwarenessConfig() {
        return this.zoneAwarenessConfig == null ? Input.empty() : this.zoneAwarenessConfig;
    }

    /**
     * Whether zone awareness is enabled, set to `true` for multi-az deployment. To enable awareness with three Availability Zones, the `availability_zone_count` within the `zone_awareness_config` must be set to `3`.
     * 
     */
    @InputImport(name="zoneAwarenessEnabled")
      private final @Nullable Input<Boolean> zoneAwarenessEnabled;

    public Input<Boolean> getZoneAwarenessEnabled() {
        return this.zoneAwarenessEnabled == null ? Input.empty() : this.zoneAwarenessEnabled;
    }

    public DomainClusterConfigGetArgs(
        @Nullable Input<Integer> dedicatedMasterCount,
        @Nullable Input<Boolean> dedicatedMasterEnabled,
        @Nullable Input<String> dedicatedMasterType,
        @Nullable Input<Integer> instanceCount,
        @Nullable Input<String> instanceType,
        @Nullable Input<Integer> warmCount,
        @Nullable Input<Boolean> warmEnabled,
        @Nullable Input<String> warmType,
        @Nullable Input<DomainClusterConfigZoneAwarenessConfigGetArgs> zoneAwarenessConfig,
        @Nullable Input<Boolean> zoneAwarenessEnabled) {
        this.dedicatedMasterCount = dedicatedMasterCount;
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
        this.dedicatedMasterType = dedicatedMasterType;
        this.instanceCount = instanceCount;
        this.instanceType = instanceType;
        this.warmCount = warmCount;
        this.warmEnabled = warmEnabled;
        this.warmType = warmType;
        this.zoneAwarenessConfig = zoneAwarenessConfig;
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
    }

    private DomainClusterConfigGetArgs() {
        this.dedicatedMasterCount = Input.empty();
        this.dedicatedMasterEnabled = Input.empty();
        this.dedicatedMasterType = Input.empty();
        this.instanceCount = Input.empty();
        this.instanceType = Input.empty();
        this.warmCount = Input.empty();
        this.warmEnabled = Input.empty();
        this.warmType = Input.empty();
        this.zoneAwarenessConfig = Input.empty();
        this.zoneAwarenessEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainClusterConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> dedicatedMasterCount;
        private @Nullable Input<Boolean> dedicatedMasterEnabled;
        private @Nullable Input<String> dedicatedMasterType;
        private @Nullable Input<Integer> instanceCount;
        private @Nullable Input<String> instanceType;
        private @Nullable Input<Integer> warmCount;
        private @Nullable Input<Boolean> warmEnabled;
        private @Nullable Input<String> warmType;
        private @Nullable Input<DomainClusterConfigZoneAwarenessConfigGetArgs> zoneAwarenessConfig;
        private @Nullable Input<Boolean> zoneAwarenessEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainClusterConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedicatedMasterCount = defaults.dedicatedMasterCount;
    	      this.dedicatedMasterEnabled = defaults.dedicatedMasterEnabled;
    	      this.dedicatedMasterType = defaults.dedicatedMasterType;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.warmCount = defaults.warmCount;
    	      this.warmEnabled = defaults.warmEnabled;
    	      this.warmType = defaults.warmType;
    	      this.zoneAwarenessConfig = defaults.zoneAwarenessConfig;
    	      this.zoneAwarenessEnabled = defaults.zoneAwarenessEnabled;
        }

        public Builder dedicatedMasterCount(@Nullable Input<Integer> dedicatedMasterCount) {
            this.dedicatedMasterCount = dedicatedMasterCount;
            return this;
        }

        public Builder dedicatedMasterCount(@Nullable Integer dedicatedMasterCount) {
            this.dedicatedMasterCount = Input.ofNullable(dedicatedMasterCount);
            return this;
        }

        public Builder dedicatedMasterEnabled(@Nullable Input<Boolean> dedicatedMasterEnabled) {
            this.dedicatedMasterEnabled = dedicatedMasterEnabled;
            return this;
        }

        public Builder dedicatedMasterEnabled(@Nullable Boolean dedicatedMasterEnabled) {
            this.dedicatedMasterEnabled = Input.ofNullable(dedicatedMasterEnabled);
            return this;
        }

        public Builder dedicatedMasterType(@Nullable Input<String> dedicatedMasterType) {
            this.dedicatedMasterType = dedicatedMasterType;
            return this;
        }

        public Builder dedicatedMasterType(@Nullable String dedicatedMasterType) {
            this.dedicatedMasterType = Input.ofNullable(dedicatedMasterType);
            return this;
        }

        public Builder instanceCount(@Nullable Input<Integer> instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = Input.ofNullable(instanceCount);
            return this;
        }

        public Builder instanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder warmCount(@Nullable Input<Integer> warmCount) {
            this.warmCount = warmCount;
            return this;
        }

        public Builder warmCount(@Nullable Integer warmCount) {
            this.warmCount = Input.ofNullable(warmCount);
            return this;
        }

        public Builder warmEnabled(@Nullable Input<Boolean> warmEnabled) {
            this.warmEnabled = warmEnabled;
            return this;
        }

        public Builder warmEnabled(@Nullable Boolean warmEnabled) {
            this.warmEnabled = Input.ofNullable(warmEnabled);
            return this;
        }

        public Builder warmType(@Nullable Input<String> warmType) {
            this.warmType = warmType;
            return this;
        }

        public Builder warmType(@Nullable String warmType) {
            this.warmType = Input.ofNullable(warmType);
            return this;
        }

        public Builder zoneAwarenessConfig(@Nullable Input<DomainClusterConfigZoneAwarenessConfigGetArgs> zoneAwarenessConfig) {
            this.zoneAwarenessConfig = zoneAwarenessConfig;
            return this;
        }

        public Builder zoneAwarenessConfig(@Nullable DomainClusterConfigZoneAwarenessConfigGetArgs zoneAwarenessConfig) {
            this.zoneAwarenessConfig = Input.ofNullable(zoneAwarenessConfig);
            return this;
        }

        public Builder zoneAwarenessEnabled(@Nullable Input<Boolean> zoneAwarenessEnabled) {
            this.zoneAwarenessEnabled = zoneAwarenessEnabled;
            return this;
        }

        public Builder zoneAwarenessEnabled(@Nullable Boolean zoneAwarenessEnabled) {
            this.zoneAwarenessEnabled = Input.ofNullable(zoneAwarenessEnabled);
            return this;
        }
        public DomainClusterConfigGetArgs build() {
            return new DomainClusterConfigGetArgs(dedicatedMasterCount, dedicatedMasterEnabled, dedicatedMasterType, instanceCount, instanceType, warmCount, warmEnabled, warmType, zoneAwarenessConfig, zoneAwarenessEnabled);
        }
    }
}
