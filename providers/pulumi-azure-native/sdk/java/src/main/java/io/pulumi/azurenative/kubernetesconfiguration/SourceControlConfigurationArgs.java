// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration;

import io.pulumi.azurenative.kubernetesconfiguration.enums.OperatorScopeType;
import io.pulumi.azurenative.kubernetesconfiguration.enums.OperatorType;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.HelmOperatorPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SourceControlConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceControlConfigurationArgs Empty = new SourceControlConfigurationArgs();

    /**
     * The name of the kubernetes cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
     * 
     */
    @InputImport(name="clusterResourceName", required=true)
      private final Input<String> clusterResourceName;

    public Input<String> getClusterResourceName() {
        return this.clusterResourceName;
    }

    /**
     * The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
     * 
     */
    @InputImport(name="clusterRp", required=true)
      private final Input<String> clusterRp;

    public Input<String> getClusterRp() {
        return this.clusterRp;
    }

    /**
     * Name-value pairs of protected configuration settings for the configuration
     * 
     */
    @InputImport(name="configurationProtectedSettings")
      private final @Nullable Input<Map<String,String>> configurationProtectedSettings;

    public Input<Map<String,String>> getConfigurationProtectedSettings() {
        return this.configurationProtectedSettings == null ? Input.empty() : this.configurationProtectedSettings;
    }

    /**
     * Option to enable Helm Operator for this git configuration.
     * 
     */
    @InputImport(name="enableHelmOperator")
      private final @Nullable Input<Boolean> enableHelmOperator;

    public Input<Boolean> getEnableHelmOperator() {
        return this.enableHelmOperator == null ? Input.empty() : this.enableHelmOperator;
    }

    /**
     * Properties for Helm operator.
     * 
     */
    @InputImport(name="helmOperatorProperties")
      private final @Nullable Input<HelmOperatorPropertiesArgs> helmOperatorProperties;

    public Input<HelmOperatorPropertiesArgs> getHelmOperatorProperties() {
        return this.helmOperatorProperties == null ? Input.empty() : this.helmOperatorProperties;
    }

    /**
     * Instance name of the operator - identifying the specific configuration.
     * 
     */
    @InputImport(name="operatorInstanceName")
      private final @Nullable Input<String> operatorInstanceName;

    public Input<String> getOperatorInstanceName() {
        return this.operatorInstanceName == null ? Input.empty() : this.operatorInstanceName;
    }

    /**
     * The namespace to which this operator is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only.
     * 
     */
    @InputImport(name="operatorNamespace")
      private final @Nullable Input<String> operatorNamespace;

    public Input<String> getOperatorNamespace() {
        return this.operatorNamespace == null ? Input.empty() : this.operatorNamespace;
    }

    /**
     * Any Parameters for the Operator instance in string format.
     * 
     */
    @InputImport(name="operatorParams")
      private final @Nullable Input<String> operatorParams;

    public Input<String> getOperatorParams() {
        return this.operatorParams == null ? Input.empty() : this.operatorParams;
    }

    /**
     * Scope at which the operator will be installed.
     * 
     */
    @InputImport(name="operatorScope")
      private final @Nullable Input<Either<String,OperatorScopeType>> operatorScope;

    public Input<Either<String,OperatorScopeType>> getOperatorScope() {
        return this.operatorScope == null ? Input.empty() : this.operatorScope;
    }

    /**
     * Type of the operator
     * 
     */
    @InputImport(name="operatorType")
      private final @Nullable Input<Either<String,OperatorType>> operatorType;

    public Input<Either<String,OperatorType>> getOperatorType() {
        return this.operatorType == null ? Input.empty() : this.operatorType;
    }

    /**
     * Url of the SourceControl Repository.
     * 
     */
    @InputImport(name="repositoryUrl")
      private final @Nullable Input<String> repositoryUrl;

    public Input<String> getRepositoryUrl() {
        return this.repositoryUrl == null ? Input.empty() : this.repositoryUrl;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the Source Control Configuration.
     * 
     */
    @InputImport(name="sourceControlConfigurationName")
      private final @Nullable Input<String> sourceControlConfigurationName;

    public Input<String> getSourceControlConfigurationName() {
        return this.sourceControlConfigurationName == null ? Input.empty() : this.sourceControlConfigurationName;
    }

    /**
     * Base64-encoded known_hosts contents containing public SSH keys required to access private Git instances
     * 
     */
    @InputImport(name="sshKnownHostsContents")
      private final @Nullable Input<String> sshKnownHostsContents;

    public Input<String> getSshKnownHostsContents() {
        return this.sshKnownHostsContents == null ? Input.empty() : this.sshKnownHostsContents;
    }

    public SourceControlConfigurationArgs(
        Input<String> clusterName,
        Input<String> clusterResourceName,
        Input<String> clusterRp,
        @Nullable Input<Map<String,String>> configurationProtectedSettings,
        @Nullable Input<Boolean> enableHelmOperator,
        @Nullable Input<HelmOperatorPropertiesArgs> helmOperatorProperties,
        @Nullable Input<String> operatorInstanceName,
        @Nullable Input<String> operatorNamespace,
        @Nullable Input<String> operatorParams,
        @Nullable Input<Either<String,OperatorScopeType>> operatorScope,
        @Nullable Input<Either<String,OperatorType>> operatorType,
        @Nullable Input<String> repositoryUrl,
        Input<String> resourceGroupName,
        @Nullable Input<String> sourceControlConfigurationName,
        @Nullable Input<String> sshKnownHostsContents) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusterResourceName = Objects.requireNonNull(clusterResourceName, "expected parameter 'clusterResourceName' to be non-null");
        this.clusterRp = Objects.requireNonNull(clusterRp, "expected parameter 'clusterRp' to be non-null");
        this.configurationProtectedSettings = configurationProtectedSettings;
        this.enableHelmOperator = enableHelmOperator;
        this.helmOperatorProperties = helmOperatorProperties;
        this.operatorInstanceName = operatorInstanceName;
        this.operatorNamespace = operatorNamespace == null ? Input.ofNullable("default") : operatorNamespace;
        this.operatorParams = operatorParams;
        this.operatorScope = operatorScope;
        this.operatorType = operatorType;
        this.repositoryUrl = repositoryUrl;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sourceControlConfigurationName = sourceControlConfigurationName;
        this.sshKnownHostsContents = sshKnownHostsContents;
    }

    private SourceControlConfigurationArgs() {
        this.clusterName = Input.empty();
        this.clusterResourceName = Input.empty();
        this.clusterRp = Input.empty();
        this.configurationProtectedSettings = Input.empty();
        this.enableHelmOperator = Input.empty();
        this.helmOperatorProperties = Input.empty();
        this.operatorInstanceName = Input.empty();
        this.operatorNamespace = Input.empty();
        this.operatorParams = Input.empty();
        this.operatorScope = Input.empty();
        this.operatorType = Input.empty();
        this.repositoryUrl = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sourceControlConfigurationName = Input.empty();
        this.sshKnownHostsContents = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceControlConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterName;
        private Input<String> clusterResourceName;
        private Input<String> clusterRp;
        private @Nullable Input<Map<String,String>> configurationProtectedSettings;
        private @Nullable Input<Boolean> enableHelmOperator;
        private @Nullable Input<HelmOperatorPropertiesArgs> helmOperatorProperties;
        private @Nullable Input<String> operatorInstanceName;
        private @Nullable Input<String> operatorNamespace;
        private @Nullable Input<String> operatorParams;
        private @Nullable Input<Either<String,OperatorScopeType>> operatorScope;
        private @Nullable Input<Either<String,OperatorType>> operatorType;
        private @Nullable Input<String> repositoryUrl;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> sourceControlConfigurationName;
        private @Nullable Input<String> sshKnownHostsContents;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceControlConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.clusterResourceName = defaults.clusterResourceName;
    	      this.clusterRp = defaults.clusterRp;
    	      this.configurationProtectedSettings = defaults.configurationProtectedSettings;
    	      this.enableHelmOperator = defaults.enableHelmOperator;
    	      this.helmOperatorProperties = defaults.helmOperatorProperties;
    	      this.operatorInstanceName = defaults.operatorInstanceName;
    	      this.operatorNamespace = defaults.operatorNamespace;
    	      this.operatorParams = defaults.operatorParams;
    	      this.operatorScope = defaults.operatorScope;
    	      this.operatorType = defaults.operatorType;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sourceControlConfigurationName = defaults.sourceControlConfigurationName;
    	      this.sshKnownHostsContents = defaults.sshKnownHostsContents;
        }

        public Builder clusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder clusterResourceName(Input<String> clusterResourceName) {
            this.clusterResourceName = Objects.requireNonNull(clusterResourceName);
            return this;
        }

        public Builder clusterResourceName(String clusterResourceName) {
            this.clusterResourceName = Input.of(Objects.requireNonNull(clusterResourceName));
            return this;
        }

        public Builder clusterRp(Input<String> clusterRp) {
            this.clusterRp = Objects.requireNonNull(clusterRp);
            return this;
        }

        public Builder clusterRp(String clusterRp) {
            this.clusterRp = Input.of(Objects.requireNonNull(clusterRp));
            return this;
        }

        public Builder configurationProtectedSettings(@Nullable Input<Map<String,String>> configurationProtectedSettings) {
            this.configurationProtectedSettings = configurationProtectedSettings;
            return this;
        }

        public Builder configurationProtectedSettings(@Nullable Map<String,String> configurationProtectedSettings) {
            this.configurationProtectedSettings = Input.ofNullable(configurationProtectedSettings);
            return this;
        }

        public Builder enableHelmOperator(@Nullable Input<Boolean> enableHelmOperator) {
            this.enableHelmOperator = enableHelmOperator;
            return this;
        }

        public Builder enableHelmOperator(@Nullable Boolean enableHelmOperator) {
            this.enableHelmOperator = Input.ofNullable(enableHelmOperator);
            return this;
        }

        public Builder helmOperatorProperties(@Nullable Input<HelmOperatorPropertiesArgs> helmOperatorProperties) {
            this.helmOperatorProperties = helmOperatorProperties;
            return this;
        }

        public Builder helmOperatorProperties(@Nullable HelmOperatorPropertiesArgs helmOperatorProperties) {
            this.helmOperatorProperties = Input.ofNullable(helmOperatorProperties);
            return this;
        }

        public Builder operatorInstanceName(@Nullable Input<String> operatorInstanceName) {
            this.operatorInstanceName = operatorInstanceName;
            return this;
        }

        public Builder operatorInstanceName(@Nullable String operatorInstanceName) {
            this.operatorInstanceName = Input.ofNullable(operatorInstanceName);
            return this;
        }

        public Builder operatorNamespace(@Nullable Input<String> operatorNamespace) {
            this.operatorNamespace = operatorNamespace;
            return this;
        }

        public Builder operatorNamespace(@Nullable String operatorNamespace) {
            this.operatorNamespace = Input.ofNullable(operatorNamespace);
            return this;
        }

        public Builder operatorParams(@Nullable Input<String> operatorParams) {
            this.operatorParams = operatorParams;
            return this;
        }

        public Builder operatorParams(@Nullable String operatorParams) {
            this.operatorParams = Input.ofNullable(operatorParams);
            return this;
        }

        public Builder operatorScope(@Nullable Input<Either<String,OperatorScopeType>> operatorScope) {
            this.operatorScope = operatorScope;
            return this;
        }

        public Builder operatorScope(@Nullable Either<String,OperatorScopeType> operatorScope) {
            this.operatorScope = Input.ofNullable(operatorScope);
            return this;
        }

        public Builder operatorType(@Nullable Input<Either<String,OperatorType>> operatorType) {
            this.operatorType = operatorType;
            return this;
        }

        public Builder operatorType(@Nullable Either<String,OperatorType> operatorType) {
            this.operatorType = Input.ofNullable(operatorType);
            return this;
        }

        public Builder repositoryUrl(@Nullable Input<String> repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }

        public Builder repositoryUrl(@Nullable String repositoryUrl) {
            this.repositoryUrl = Input.ofNullable(repositoryUrl);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sourceControlConfigurationName(@Nullable Input<String> sourceControlConfigurationName) {
            this.sourceControlConfigurationName = sourceControlConfigurationName;
            return this;
        }

        public Builder sourceControlConfigurationName(@Nullable String sourceControlConfigurationName) {
            this.sourceControlConfigurationName = Input.ofNullable(sourceControlConfigurationName);
            return this;
        }

        public Builder sshKnownHostsContents(@Nullable Input<String> sshKnownHostsContents) {
            this.sshKnownHostsContents = sshKnownHostsContents;
            return this;
        }

        public Builder sshKnownHostsContents(@Nullable String sshKnownHostsContents) {
            this.sshKnownHostsContents = Input.ofNullable(sshKnownHostsContents);
            return this;
        }
        public SourceControlConfigurationArgs build() {
            return new SourceControlConfigurationArgs(clusterName, clusterResourceName, clusterRp, configurationProtectedSettings, enableHelmOperator, helmOperatorProperties, operatorInstanceName, operatorNamespace, operatorParams, operatorScope, operatorType, repositoryUrl, resourceGroupName, sourceControlConfigurationName, sshKnownHostsContents);
        }
    }
}
