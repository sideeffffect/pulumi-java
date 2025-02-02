// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinkedServiceAzureDatabricksNewClusterConfig {
    /**
     * @return Spark version of a the cluster.
     * 
     */
    private final String clusterVersion;
    /**
     * @return Tags for the cluster resource.
     * 
     */
    private final @Nullable Map<String,String> customTags;
    /**
     * @return Driver node type for the cluster.
     * 
     */
    private final @Nullable String driverNodeType;
    /**
     * @return User defined initialization scripts for the cluster.
     * 
     */
    private final @Nullable List<String> initScripts;
    /**
     * @return Location to deliver Spark driver, worker, and event logs.
     * 
     */
    private final @Nullable String logDestination;
    /**
     * @return The max number of worker nodes. Set this value if you want to enable autoscaling between the `min_number_of_workers` and this value. Omit this value to use a fixed number of workers defined in the `min_number_of_workers` property.
     * 
     */
    private final @Nullable Integer maxNumberOfWorkers;
    /**
     * @return The minimum number of worker nodes. Defaults to 1.
     * 
     */
    private final @Nullable Integer minNumberOfWorkers;
    /**
     * @return Node type for the new cluster.
     * 
     */
    private final String nodeType;
    /**
     * @return User-specified Spark configuration variables key-value pairs.
     * 
     */
    private final @Nullable Map<String,String> sparkConfig;
    /**
     * @return User-specified Spark environment variables key-value pairs.
     * 
     */
    private final @Nullable Map<String,String> sparkEnvironmentVariables;

    @CustomType.Constructor
    private LinkedServiceAzureDatabricksNewClusterConfig(
        @CustomType.Parameter("clusterVersion") String clusterVersion,
        @CustomType.Parameter("customTags") @Nullable Map<String,String> customTags,
        @CustomType.Parameter("driverNodeType") @Nullable String driverNodeType,
        @CustomType.Parameter("initScripts") @Nullable List<String> initScripts,
        @CustomType.Parameter("logDestination") @Nullable String logDestination,
        @CustomType.Parameter("maxNumberOfWorkers") @Nullable Integer maxNumberOfWorkers,
        @CustomType.Parameter("minNumberOfWorkers") @Nullable Integer minNumberOfWorkers,
        @CustomType.Parameter("nodeType") String nodeType,
        @CustomType.Parameter("sparkConfig") @Nullable Map<String,String> sparkConfig,
        @CustomType.Parameter("sparkEnvironmentVariables") @Nullable Map<String,String> sparkEnvironmentVariables) {
        this.clusterVersion = clusterVersion;
        this.customTags = customTags;
        this.driverNodeType = driverNodeType;
        this.initScripts = initScripts;
        this.logDestination = logDestination;
        this.maxNumberOfWorkers = maxNumberOfWorkers;
        this.minNumberOfWorkers = minNumberOfWorkers;
        this.nodeType = nodeType;
        this.sparkConfig = sparkConfig;
        this.sparkEnvironmentVariables = sparkEnvironmentVariables;
    }

    /**
     * @return Spark version of a the cluster.
     * 
     */
    public String clusterVersion() {
        return this.clusterVersion;
    }
    /**
     * @return Tags for the cluster resource.
     * 
     */
    public Map<String,String> customTags() {
        return this.customTags == null ? Map.of() : this.customTags;
    }
    /**
     * @return Driver node type for the cluster.
     * 
     */
    public Optional<String> driverNodeType() {
        return Optional.ofNullable(this.driverNodeType);
    }
    /**
     * @return User defined initialization scripts for the cluster.
     * 
     */
    public List<String> initScripts() {
        return this.initScripts == null ? List.of() : this.initScripts;
    }
    /**
     * @return Location to deliver Spark driver, worker, and event logs.
     * 
     */
    public Optional<String> logDestination() {
        return Optional.ofNullable(this.logDestination);
    }
    /**
     * @return The max number of worker nodes. Set this value if you want to enable autoscaling between the `min_number_of_workers` and this value. Omit this value to use a fixed number of workers defined in the `min_number_of_workers` property.
     * 
     */
    public Optional<Integer> maxNumberOfWorkers() {
        return Optional.ofNullable(this.maxNumberOfWorkers);
    }
    /**
     * @return The minimum number of worker nodes. Defaults to 1.
     * 
     */
    public Optional<Integer> minNumberOfWorkers() {
        return Optional.ofNullable(this.minNumberOfWorkers);
    }
    /**
     * @return Node type for the new cluster.
     * 
     */
    public String nodeType() {
        return this.nodeType;
    }
    /**
     * @return User-specified Spark configuration variables key-value pairs.
     * 
     */
    public Map<String,String> sparkConfig() {
        return this.sparkConfig == null ? Map.of() : this.sparkConfig;
    }
    /**
     * @return User-specified Spark environment variables key-value pairs.
     * 
     */
    public Map<String,String> sparkEnvironmentVariables() {
        return this.sparkEnvironmentVariables == null ? Map.of() : this.sparkEnvironmentVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedServiceAzureDatabricksNewClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterVersion;
        private @Nullable Map<String,String> customTags;
        private @Nullable String driverNodeType;
        private @Nullable List<String> initScripts;
        private @Nullable String logDestination;
        private @Nullable Integer maxNumberOfWorkers;
        private @Nullable Integer minNumberOfWorkers;
        private String nodeType;
        private @Nullable Map<String,String> sparkConfig;
        private @Nullable Map<String,String> sparkEnvironmentVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedServiceAzureDatabricksNewClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.customTags = defaults.customTags;
    	      this.driverNodeType = defaults.driverNodeType;
    	      this.initScripts = defaults.initScripts;
    	      this.logDestination = defaults.logDestination;
    	      this.maxNumberOfWorkers = defaults.maxNumberOfWorkers;
    	      this.minNumberOfWorkers = defaults.minNumberOfWorkers;
    	      this.nodeType = defaults.nodeType;
    	      this.sparkConfig = defaults.sparkConfig;
    	      this.sparkEnvironmentVariables = defaults.sparkEnvironmentVariables;
        }

        public Builder clusterVersion(String clusterVersion) {
            this.clusterVersion = Objects.requireNonNull(clusterVersion);
            return this;
        }
        public Builder customTags(@Nullable Map<String,String> customTags) {
            this.customTags = customTags;
            return this;
        }
        public Builder driverNodeType(@Nullable String driverNodeType) {
            this.driverNodeType = driverNodeType;
            return this;
        }
        public Builder initScripts(@Nullable List<String> initScripts) {
            this.initScripts = initScripts;
            return this;
        }
        public Builder initScripts(String... initScripts) {
            return initScripts(List.of(initScripts));
        }
        public Builder logDestination(@Nullable String logDestination) {
            this.logDestination = logDestination;
            return this;
        }
        public Builder maxNumberOfWorkers(@Nullable Integer maxNumberOfWorkers) {
            this.maxNumberOfWorkers = maxNumberOfWorkers;
            return this;
        }
        public Builder minNumberOfWorkers(@Nullable Integer minNumberOfWorkers) {
            this.minNumberOfWorkers = minNumberOfWorkers;
            return this;
        }
        public Builder nodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }
        public Builder sparkConfig(@Nullable Map<String,String> sparkConfig) {
            this.sparkConfig = sparkConfig;
            return this;
        }
        public Builder sparkEnvironmentVariables(@Nullable Map<String,String> sparkEnvironmentVariables) {
            this.sparkEnvironmentVariables = sparkEnvironmentVariables;
            return this;
        }        public LinkedServiceAzureDatabricksNewClusterConfig build() {
            return new LinkedServiceAzureDatabricksNewClusterConfig(clusterVersion, customTags, driverNodeType, initScripts, logDestination, maxNumberOfWorkers, minNumberOfWorkers, nodeType, sparkConfig, sparkEnvironmentVariables);
        }
    }
}
