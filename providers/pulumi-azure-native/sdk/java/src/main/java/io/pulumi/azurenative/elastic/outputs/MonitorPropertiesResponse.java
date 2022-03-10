// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.outputs;

import io.pulumi.azurenative.elastic.outputs.ElasticPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MonitorPropertiesResponse {
    /**
     * Elastic cloud properties.
     * 
     */
    private final @Nullable ElasticPropertiesResponse elasticProperties;
    private final String liftrResourceCategory;
    /**
     * The priority of the resource.
     * 
     */
    private final Integer liftrResourcePreference;
    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
     */
    private final @Nullable String monitoringStatus;
    /**
     * Provisioning state of the monitor resource.
     * 
     */
    private final @Nullable String provisioningState;

    @OutputCustomType.Constructor
    private MonitorPropertiesResponse(
        @OutputCustomType.Parameter("elasticProperties") @Nullable ElasticPropertiesResponse elasticProperties,
        @OutputCustomType.Parameter("liftrResourceCategory") String liftrResourceCategory,
        @OutputCustomType.Parameter("liftrResourcePreference") Integer liftrResourcePreference,
        @OutputCustomType.Parameter("monitoringStatus") @Nullable String monitoringStatus,
        @OutputCustomType.Parameter("provisioningState") @Nullable String provisioningState) {
        this.elasticProperties = elasticProperties;
        this.liftrResourceCategory = liftrResourceCategory;
        this.liftrResourcePreference = liftrResourcePreference;
        this.monitoringStatus = monitoringStatus;
        this.provisioningState = provisioningState;
    }

    /**
     * Elastic cloud properties.
     * 
    */
    public Optional<ElasticPropertiesResponse> getElasticProperties() {
        return Optional.ofNullable(this.elasticProperties);
    }
    public String getLiftrResourceCategory() {
        return this.liftrResourceCategory;
    }
    /**
     * The priority of the resource.
     * 
    */
    public Integer getLiftrResourcePreference() {
        return this.liftrResourcePreference;
    }
    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
    */
    public Optional<String> getMonitoringStatus() {
        return Optional.ofNullable(this.monitoringStatus);
    }
    /**
     * Provisioning state of the monitor resource.
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ElasticPropertiesResponse elasticProperties;
        private String liftrResourceCategory;
        private Integer liftrResourcePreference;
        private @Nullable String monitoringStatus;
        private @Nullable String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elasticProperties = defaults.elasticProperties;
    	      this.liftrResourceCategory = defaults.liftrResourceCategory;
    	      this.liftrResourcePreference = defaults.liftrResourcePreference;
    	      this.monitoringStatus = defaults.monitoringStatus;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder elasticProperties(@Nullable ElasticPropertiesResponse elasticProperties) {
            this.elasticProperties = elasticProperties;
            return this;
        }

        public Builder liftrResourceCategory(String liftrResourceCategory) {
            this.liftrResourceCategory = Objects.requireNonNull(liftrResourceCategory);
            return this;
        }

        public Builder liftrResourcePreference(Integer liftrResourcePreference) {
            this.liftrResourcePreference = Objects.requireNonNull(liftrResourcePreference);
            return this;
        }

        public Builder monitoringStatus(@Nullable String monitoringStatus) {
            this.monitoringStatus = monitoringStatus;
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public MonitorPropertiesResponse build() {
            return new MonitorPropertiesResponse(elasticProperties, liftrResourceCategory, liftrResourcePreference, monitoringStatus, provisioningState);
        }
    }
}
