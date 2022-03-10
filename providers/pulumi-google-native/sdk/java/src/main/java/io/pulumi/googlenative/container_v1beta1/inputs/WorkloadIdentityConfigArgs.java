// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for the use of Kubernetes Service Accounts in GCP IAM policies.
 * 
 */
public final class WorkloadIdentityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadIdentityConfigArgs Empty = new WorkloadIdentityConfigArgs();

    /**
     * IAM Identity Namespace to attach all Kubernetes Service Accounts to.
     * 
     */
    @InputImport(name="identityNamespace")
      private final @Nullable Input<String> identityNamespace;

    public Input<String> getIdentityNamespace() {
        return this.identityNamespace == null ? Input.empty() : this.identityNamespace;
    }

    /**
     * identity provider is the third party identity provider.
     * 
     */
    @InputImport(name="identityProvider")
      private final @Nullable Input<String> identityProvider;

    public Input<String> getIdentityProvider() {
        return this.identityProvider == null ? Input.empty() : this.identityProvider;
    }

    /**
     * The workload pool to attach all Kubernetes service accounts to.
     * 
     */
    @InputImport(name="workloadPool")
      private final @Nullable Input<String> workloadPool;

    public Input<String> getWorkloadPool() {
        return this.workloadPool == null ? Input.empty() : this.workloadPool;
    }

    public WorkloadIdentityConfigArgs(
        @Nullable Input<String> identityNamespace,
        @Nullable Input<String> identityProvider,
        @Nullable Input<String> workloadPool) {
        this.identityNamespace = identityNamespace;
        this.identityProvider = identityProvider;
        this.workloadPool = workloadPool;
    }

    private WorkloadIdentityConfigArgs() {
        this.identityNamespace = Input.empty();
        this.identityProvider = Input.empty();
        this.workloadPool = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadIdentityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> identityNamespace;
        private @Nullable Input<String> identityProvider;
        private @Nullable Input<String> workloadPool;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadIdentityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityNamespace = defaults.identityNamespace;
    	      this.identityProvider = defaults.identityProvider;
    	      this.workloadPool = defaults.workloadPool;
        }

        public Builder identityNamespace(@Nullable Input<String> identityNamespace) {
            this.identityNamespace = identityNamespace;
            return this;
        }

        public Builder identityNamespace(@Nullable String identityNamespace) {
            this.identityNamespace = Input.ofNullable(identityNamespace);
            return this;
        }

        public Builder identityProvider(@Nullable Input<String> identityProvider) {
            this.identityProvider = identityProvider;
            return this;
        }

        public Builder identityProvider(@Nullable String identityProvider) {
            this.identityProvider = Input.ofNullable(identityProvider);
            return this;
        }

        public Builder workloadPool(@Nullable Input<String> workloadPool) {
            this.workloadPool = workloadPool;
            return this;
        }

        public Builder workloadPool(@Nullable String workloadPool) {
            this.workloadPool = Input.ofNullable(workloadPool);
            return this;
        }
        public WorkloadIdentityConfigArgs build() {
            return new WorkloadIdentityConfigArgs(identityNamespace, identityProvider, workloadPool);
        }
    }
}
