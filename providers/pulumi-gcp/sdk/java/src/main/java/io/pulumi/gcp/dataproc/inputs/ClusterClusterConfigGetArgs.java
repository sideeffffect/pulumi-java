// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAutoscalingConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigEncryptionConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigEndpointConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigInitializationActionGetArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigLifecycleConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMetastoreConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSecurityConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSoftwareConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigGetArgs Empty = new ClusterClusterConfigGetArgs();

    /**
     * The autoscaling policy config associated with the cluster.
     * Note that once set, if `autoscaling_config` is the only field set in `cluster_config`, it can
     * only be removed by setting `policy_uri = ""`, rather than removing the whole block.
     * Structure defined below.
     * 
     */
    @Import(name="autoscalingConfig")
      private final @Nullable Output<ClusterClusterConfigAutoscalingConfigGetArgs> autoscalingConfig;

    public Output<ClusterClusterConfigAutoscalingConfigGetArgs> autoscalingConfig() {
        return this.autoscalingConfig == null ? Codegen.empty() : this.autoscalingConfig;
    }

    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket == null ? Codegen.empty() : this.bucket;
    }

    /**
     * The Customer managed encryption keys settings for the cluster.
     * Structure defined below.
     * 
     */
    @Import(name="encryptionConfig")
      private final @Nullable Output<ClusterClusterConfigEncryptionConfigGetArgs> encryptionConfig;

    public Output<ClusterClusterConfigEncryptionConfigGetArgs> encryptionConfig() {
        return this.encryptionConfig == null ? Codegen.empty() : this.encryptionConfig;
    }

    /**
     * The config settings for port access on the cluster.
     * Structure defined below.
     * 
     */
    @Import(name="endpointConfig")
      private final @Nullable Output<ClusterClusterConfigEndpointConfigGetArgs> endpointConfig;

    public Output<ClusterClusterConfigEndpointConfigGetArgs> endpointConfig() {
        return this.endpointConfig == null ? Codegen.empty() : this.endpointConfig;
    }

    /**
     * Common config settings for resources of Google Compute Engine cluster
     * instances, applicable to all instances in the cluster. Structure defined below.
     * 
     */
    @Import(name="gceClusterConfig")
      private final @Nullable Output<ClusterClusterConfigGceClusterConfigGetArgs> gceClusterConfig;

    public Output<ClusterClusterConfigGceClusterConfigGetArgs> gceClusterConfig() {
        return this.gceClusterConfig == null ? Codegen.empty() : this.gceClusterConfig;
    }

    /**
     * Commands to execute on each node after config is completed.
     * You can specify multiple versions of these. Structure defined below.
     * 
     */
    @Import(name="initializationActions")
      private final @Nullable Output<List<ClusterClusterConfigInitializationActionGetArgs>> initializationActions;

    public Output<List<ClusterClusterConfigInitializationActionGetArgs>> initializationActions() {
        return this.initializationActions == null ? Codegen.empty() : this.initializationActions;
    }

    /**
     * The settings for auto deletion cluster schedule.
     * Structure defined below.
     * 
     */
    @Import(name="lifecycleConfig")
      private final @Nullable Output<ClusterClusterConfigLifecycleConfigGetArgs> lifecycleConfig;

    public Output<ClusterClusterConfigLifecycleConfigGetArgs> lifecycleConfig() {
        return this.lifecycleConfig == null ? Codegen.empty() : this.lifecycleConfig;
    }

    /**
     * The Google Compute Engine config settings for the master instances
     * in a cluster. Structure defined below.
     * 
     */
    @Import(name="masterConfig")
      private final @Nullable Output<ClusterClusterConfigMasterConfigGetArgs> masterConfig;

    public Output<ClusterClusterConfigMasterConfigGetArgs> masterConfig() {
        return this.masterConfig == null ? Codegen.empty() : this.masterConfig;
    }

    /**
     * The config setting for metastore service with the cluster.
     * Structure defined below.
     * ***
     * 
     */
    @Import(name="metastoreConfig")
      private final @Nullable Output<ClusterClusterConfigMetastoreConfigGetArgs> metastoreConfig;

    public Output<ClusterClusterConfigMetastoreConfigGetArgs> metastoreConfig() {
        return this.metastoreConfig == null ? Codegen.empty() : this.metastoreConfig;
    }

    /**
     * The Google Compute Engine config settings for the additional
     * instances in a cluster. Structure defined below.
     * * **NOTE** : `preemptible_worker_config` is
     *   an alias for the api's [secondaryWorkerConfig](https://cloud.google.com/dataproc/docs/reference/rest/v1/ClusterConfig#InstanceGroupConfig). The name doesn't necessarily mean it is preemptible and is named as
     *   such for legacy/compatibility reasons.
     * 
     */
    @Import(name="preemptibleWorkerConfig")
      private final @Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigGetArgs> preemptibleWorkerConfig;

    public Output<ClusterClusterConfigPreemptibleWorkerConfigGetArgs> preemptibleWorkerConfig() {
        return this.preemptibleWorkerConfig == null ? Codegen.empty() : this.preemptibleWorkerConfig;
    }

    /**
     * Security related configuration. Structure defined below.
     * 
     */
    @Import(name="securityConfig")
      private final @Nullable Output<ClusterClusterConfigSecurityConfigGetArgs> securityConfig;

    public Output<ClusterClusterConfigSecurityConfigGetArgs> securityConfig() {
        return this.securityConfig == null ? Codegen.empty() : this.securityConfig;
    }

    /**
     * The config settings for software inside the cluster.
     * Structure defined below.
     * 
     */
    @Import(name="softwareConfig")
      private final @Nullable Output<ClusterClusterConfigSoftwareConfigGetArgs> softwareConfig;

    public Output<ClusterClusterConfigSoftwareConfigGetArgs> softwareConfig() {
        return this.softwareConfig == null ? Codegen.empty() : this.softwareConfig;
    }

    /**
     * The Cloud Storage staging bucket used to stage files,
     * such as Hadoop jars, between client machines and the cluster.
     * Note: If you don't explicitly specify a `staging_bucket`
     * then GCP will auto create / assign one for you. However, you are not guaranteed
     * an auto generated bucket which is solely dedicated to your cluster; it may be shared
     * with other clusters in the same region/zone also choosing to use the auto generation
     * option.
     * 
     */
    @Import(name="stagingBucket")
      private final @Nullable Output<String> stagingBucket;

    public Output<String> stagingBucket() {
        return this.stagingBucket == null ? Codegen.empty() : this.stagingBucket;
    }

    /**
     * The Cloud Storage temp bucket used to store ephemeral cluster
     * and jobs data, such as Spark and MapReduce history files.
     * Note: If you don't explicitly specify a `temp_bucket` then GCP will auto create / assign one for you.
     * 
     */
    @Import(name="tempBucket")
      private final @Nullable Output<String> tempBucket;

    public Output<String> tempBucket() {
        return this.tempBucket == null ? Codegen.empty() : this.tempBucket;
    }

    /**
     * The Google Compute Engine config settings for the worker instances
     * in a cluster. Structure defined below.
     * 
     */
    @Import(name="workerConfig")
      private final @Nullable Output<ClusterClusterConfigWorkerConfigGetArgs> workerConfig;

    public Output<ClusterClusterConfigWorkerConfigGetArgs> workerConfig() {
        return this.workerConfig == null ? Codegen.empty() : this.workerConfig;
    }

    public ClusterClusterConfigGetArgs(
        @Nullable Output<ClusterClusterConfigAutoscalingConfigGetArgs> autoscalingConfig,
        @Nullable Output<String> bucket,
        @Nullable Output<ClusterClusterConfigEncryptionConfigGetArgs> encryptionConfig,
        @Nullable Output<ClusterClusterConfigEndpointConfigGetArgs> endpointConfig,
        @Nullable Output<ClusterClusterConfigGceClusterConfigGetArgs> gceClusterConfig,
        @Nullable Output<List<ClusterClusterConfigInitializationActionGetArgs>> initializationActions,
        @Nullable Output<ClusterClusterConfigLifecycleConfigGetArgs> lifecycleConfig,
        @Nullable Output<ClusterClusterConfigMasterConfigGetArgs> masterConfig,
        @Nullable Output<ClusterClusterConfigMetastoreConfigGetArgs> metastoreConfig,
        @Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigGetArgs> preemptibleWorkerConfig,
        @Nullable Output<ClusterClusterConfigSecurityConfigGetArgs> securityConfig,
        @Nullable Output<ClusterClusterConfigSoftwareConfigGetArgs> softwareConfig,
        @Nullable Output<String> stagingBucket,
        @Nullable Output<String> tempBucket,
        @Nullable Output<ClusterClusterConfigWorkerConfigGetArgs> workerConfig) {
        this.autoscalingConfig = autoscalingConfig;
        this.bucket = bucket;
        this.encryptionConfig = encryptionConfig;
        this.endpointConfig = endpointConfig;
        this.gceClusterConfig = gceClusterConfig;
        this.initializationActions = initializationActions;
        this.lifecycleConfig = lifecycleConfig;
        this.masterConfig = masterConfig;
        this.metastoreConfig = metastoreConfig;
        this.preemptibleWorkerConfig = preemptibleWorkerConfig;
        this.securityConfig = securityConfig;
        this.softwareConfig = softwareConfig;
        this.stagingBucket = stagingBucket;
        this.tempBucket = tempBucket;
        this.workerConfig = workerConfig;
    }

    private ClusterClusterConfigGetArgs() {
        this.autoscalingConfig = Codegen.empty();
        this.bucket = Codegen.empty();
        this.encryptionConfig = Codegen.empty();
        this.endpointConfig = Codegen.empty();
        this.gceClusterConfig = Codegen.empty();
        this.initializationActions = Codegen.empty();
        this.lifecycleConfig = Codegen.empty();
        this.masterConfig = Codegen.empty();
        this.metastoreConfig = Codegen.empty();
        this.preemptibleWorkerConfig = Codegen.empty();
        this.securityConfig = Codegen.empty();
        this.softwareConfig = Codegen.empty();
        this.stagingBucket = Codegen.empty();
        this.tempBucket = Codegen.empty();
        this.workerConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterClusterConfigAutoscalingConfigGetArgs> autoscalingConfig;
        private @Nullable Output<String> bucket;
        private @Nullable Output<ClusterClusterConfigEncryptionConfigGetArgs> encryptionConfig;
        private @Nullable Output<ClusterClusterConfigEndpointConfigGetArgs> endpointConfig;
        private @Nullable Output<ClusterClusterConfigGceClusterConfigGetArgs> gceClusterConfig;
        private @Nullable Output<List<ClusterClusterConfigInitializationActionGetArgs>> initializationActions;
        private @Nullable Output<ClusterClusterConfigLifecycleConfigGetArgs> lifecycleConfig;
        private @Nullable Output<ClusterClusterConfigMasterConfigGetArgs> masterConfig;
        private @Nullable Output<ClusterClusterConfigMetastoreConfigGetArgs> metastoreConfig;
        private @Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigGetArgs> preemptibleWorkerConfig;
        private @Nullable Output<ClusterClusterConfigSecurityConfigGetArgs> securityConfig;
        private @Nullable Output<ClusterClusterConfigSoftwareConfigGetArgs> softwareConfig;
        private @Nullable Output<String> stagingBucket;
        private @Nullable Output<String> tempBucket;
        private @Nullable Output<ClusterClusterConfigWorkerConfigGetArgs> workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingConfig = defaults.autoscalingConfig;
    	      this.bucket = defaults.bucket;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.endpointConfig = defaults.endpointConfig;
    	      this.gceClusterConfig = defaults.gceClusterConfig;
    	      this.initializationActions = defaults.initializationActions;
    	      this.lifecycleConfig = defaults.lifecycleConfig;
    	      this.masterConfig = defaults.masterConfig;
    	      this.metastoreConfig = defaults.metastoreConfig;
    	      this.preemptibleWorkerConfig = defaults.preemptibleWorkerConfig;
    	      this.securityConfig = defaults.securityConfig;
    	      this.softwareConfig = defaults.softwareConfig;
    	      this.stagingBucket = defaults.stagingBucket;
    	      this.tempBucket = defaults.tempBucket;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder autoscalingConfig(@Nullable Output<ClusterClusterConfigAutoscalingConfigGetArgs> autoscalingConfig) {
            this.autoscalingConfig = autoscalingConfig;
            return this;
        }
        public Builder autoscalingConfig(@Nullable ClusterClusterConfigAutoscalingConfigGetArgs autoscalingConfig) {
            this.autoscalingConfig = Codegen.ofNullable(autoscalingConfig);
            return this;
        }
        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder bucket(@Nullable String bucket) {
            this.bucket = Codegen.ofNullable(bucket);
            return this;
        }
        public Builder encryptionConfig(@Nullable Output<ClusterClusterConfigEncryptionConfigGetArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public Builder encryptionConfig(@Nullable ClusterClusterConfigEncryptionConfigGetArgs encryptionConfig) {
            this.encryptionConfig = Codegen.ofNullable(encryptionConfig);
            return this;
        }
        public Builder endpointConfig(@Nullable Output<ClusterClusterConfigEndpointConfigGetArgs> endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }
        public Builder endpointConfig(@Nullable ClusterClusterConfigEndpointConfigGetArgs endpointConfig) {
            this.endpointConfig = Codegen.ofNullable(endpointConfig);
            return this;
        }
        public Builder gceClusterConfig(@Nullable Output<ClusterClusterConfigGceClusterConfigGetArgs> gceClusterConfig) {
            this.gceClusterConfig = gceClusterConfig;
            return this;
        }
        public Builder gceClusterConfig(@Nullable ClusterClusterConfigGceClusterConfigGetArgs gceClusterConfig) {
            this.gceClusterConfig = Codegen.ofNullable(gceClusterConfig);
            return this;
        }
        public Builder initializationActions(@Nullable Output<List<ClusterClusterConfigInitializationActionGetArgs>> initializationActions) {
            this.initializationActions = initializationActions;
            return this;
        }
        public Builder initializationActions(@Nullable List<ClusterClusterConfigInitializationActionGetArgs> initializationActions) {
            this.initializationActions = Codegen.ofNullable(initializationActions);
            return this;
        }
        public Builder initializationActions(ClusterClusterConfigInitializationActionGetArgs... initializationActions) {
            return initializationActions(List.of(initializationActions));
        }
        public Builder lifecycleConfig(@Nullable Output<ClusterClusterConfigLifecycleConfigGetArgs> lifecycleConfig) {
            this.lifecycleConfig = lifecycleConfig;
            return this;
        }
        public Builder lifecycleConfig(@Nullable ClusterClusterConfigLifecycleConfigGetArgs lifecycleConfig) {
            this.lifecycleConfig = Codegen.ofNullable(lifecycleConfig);
            return this;
        }
        public Builder masterConfig(@Nullable Output<ClusterClusterConfigMasterConfigGetArgs> masterConfig) {
            this.masterConfig = masterConfig;
            return this;
        }
        public Builder masterConfig(@Nullable ClusterClusterConfigMasterConfigGetArgs masterConfig) {
            this.masterConfig = Codegen.ofNullable(masterConfig);
            return this;
        }
        public Builder metastoreConfig(@Nullable Output<ClusterClusterConfigMetastoreConfigGetArgs> metastoreConfig) {
            this.metastoreConfig = metastoreConfig;
            return this;
        }
        public Builder metastoreConfig(@Nullable ClusterClusterConfigMetastoreConfigGetArgs metastoreConfig) {
            this.metastoreConfig = Codegen.ofNullable(metastoreConfig);
            return this;
        }
        public Builder preemptibleWorkerConfig(@Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigGetArgs> preemptibleWorkerConfig) {
            this.preemptibleWorkerConfig = preemptibleWorkerConfig;
            return this;
        }
        public Builder preemptibleWorkerConfig(@Nullable ClusterClusterConfigPreemptibleWorkerConfigGetArgs preemptibleWorkerConfig) {
            this.preemptibleWorkerConfig = Codegen.ofNullable(preemptibleWorkerConfig);
            return this;
        }
        public Builder securityConfig(@Nullable Output<ClusterClusterConfigSecurityConfigGetArgs> securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }
        public Builder securityConfig(@Nullable ClusterClusterConfigSecurityConfigGetArgs securityConfig) {
            this.securityConfig = Codegen.ofNullable(securityConfig);
            return this;
        }
        public Builder softwareConfig(@Nullable Output<ClusterClusterConfigSoftwareConfigGetArgs> softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }
        public Builder softwareConfig(@Nullable ClusterClusterConfigSoftwareConfigGetArgs softwareConfig) {
            this.softwareConfig = Codegen.ofNullable(softwareConfig);
            return this;
        }
        public Builder stagingBucket(@Nullable Output<String> stagingBucket) {
            this.stagingBucket = stagingBucket;
            return this;
        }
        public Builder stagingBucket(@Nullable String stagingBucket) {
            this.stagingBucket = Codegen.ofNullable(stagingBucket);
            return this;
        }
        public Builder tempBucket(@Nullable Output<String> tempBucket) {
            this.tempBucket = tempBucket;
            return this;
        }
        public Builder tempBucket(@Nullable String tempBucket) {
            this.tempBucket = Codegen.ofNullable(tempBucket);
            return this;
        }
        public Builder workerConfig(@Nullable Output<ClusterClusterConfigWorkerConfigGetArgs> workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }
        public Builder workerConfig(@Nullable ClusterClusterConfigWorkerConfigGetArgs workerConfig) {
            this.workerConfig = Codegen.ofNullable(workerConfig);
            return this;
        }        public ClusterClusterConfigGetArgs build() {
            return new ClusterClusterConfigGetArgs(autoscalingConfig, bucket, encryptionConfig, endpointConfig, gceClusterConfig, initializationActions, lifecycleConfig, masterConfig, metastoreConfig, preemptibleWorkerConfig, securityConfig, softwareConfig, stagingBucket, tempBucket, workerConfig);
        }
    }
}
