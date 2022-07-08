// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.container.v1.outputs.BlueGreenSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UpgradeSettingsResponse {
    /**
     * @return Settings for blue-green upgrade strategy.
     * 
     */
    private final BlueGreenSettingsResponse blueGreenSettings;
    /**
     * @return The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process.
     * 
     */
    private final Integer maxSurge;
    /**
     * @return The maximum number of nodes that can be simultaneously unavailable during the upgrade process. A node is considered available if its status is Ready.
     * 
     */
    private final Integer maxUnavailable;
    /**
     * @return Update strategy of the node pool.
     * 
     */
    private final String strategy;

    @CustomType.Constructor
    private UpgradeSettingsResponse(
        @CustomType.Parameter("blueGreenSettings") BlueGreenSettingsResponse blueGreenSettings,
        @CustomType.Parameter("maxSurge") Integer maxSurge,
        @CustomType.Parameter("maxUnavailable") Integer maxUnavailable,
        @CustomType.Parameter("strategy") String strategy) {
        this.blueGreenSettings = blueGreenSettings;
        this.maxSurge = maxSurge;
        this.maxUnavailable = maxUnavailable;
        this.strategy = strategy;
    }

    /**
     * @return Settings for blue-green upgrade strategy.
     * 
     */
    public BlueGreenSettingsResponse blueGreenSettings() {
        return this.blueGreenSettings;
    }
    /**
     * @return The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process.
     * 
     */
    public Integer maxSurge() {
        return this.maxSurge;
    }
    /**
     * @return The maximum number of nodes that can be simultaneously unavailable during the upgrade process. A node is considered available if its status is Ready.
     * 
     */
    public Integer maxUnavailable() {
        return this.maxUnavailable;
    }
    /**
     * @return Update strategy of the node pool.
     * 
     */
    public String strategy() {
        return this.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlueGreenSettingsResponse blueGreenSettings;
        private Integer maxSurge;
        private Integer maxUnavailable;
        private String strategy;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blueGreenSettings = defaults.blueGreenSettings;
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.strategy = defaults.strategy;
        }

        public Builder blueGreenSettings(BlueGreenSettingsResponse blueGreenSettings) {
            this.blueGreenSettings = Objects.requireNonNull(blueGreenSettings);
            return this;
        }
        public Builder maxSurge(Integer maxSurge) {
            this.maxSurge = Objects.requireNonNull(maxSurge);
            return this;
        }
        public Builder maxUnavailable(Integer maxUnavailable) {
            this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
            return this;
        }
        public Builder strategy(String strategy) {
            this.strategy = Objects.requireNonNull(strategy);
            return this;
        }        public UpgradeSettingsResponse build() {
            return new UpgradeSettingsResponse(blueGreenSettings, maxSurge, maxUnavailable, strategy);
        }
    }
}
