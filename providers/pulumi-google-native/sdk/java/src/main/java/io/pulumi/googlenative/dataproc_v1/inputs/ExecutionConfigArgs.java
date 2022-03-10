// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Execution configuration for a workload.
 * 
 */
public final class ExecutionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecutionConfigArgs Empty = new ExecutionConfigArgs();

    /**
     * Optional. The Cloud KMS key to use for encryption.
     * 
     */
    @InputImport(name="kmsKey")
      private final @Nullable Input<String> kmsKey;

    public Input<String> getKmsKey() {
        return this.kmsKey == null ? Input.empty() : this.kmsKey;
    }

    /**
     * Optional. Tags used for network traffic control.
     * 
     */
    @InputImport(name="networkTags")
      private final @Nullable Input<List<String>> networkTags;

    public Input<List<String>> getNetworkTags() {
        return this.networkTags == null ? Input.empty() : this.networkTags;
    }

    /**
     * Optional. Network URI to connect workload to.
     * 
     */
    @InputImport(name="networkUri")
      private final @Nullable Input<String> networkUri;

    public Input<String> getNetworkUri() {
        return this.networkUri == null ? Input.empty() : this.networkUri;
    }

    /**
     * Optional. Service account that used to execute workload.
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Optional. Subnetwork URI to connect workload to.
     * 
     */
    @InputImport(name="subnetworkUri")
      private final @Nullable Input<String> subnetworkUri;

    public Input<String> getSubnetworkUri() {
        return this.subnetworkUri == null ? Input.empty() : this.subnetworkUri;
    }

    public ExecutionConfigArgs(
        @Nullable Input<String> kmsKey,
        @Nullable Input<List<String>> networkTags,
        @Nullable Input<String> networkUri,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<String> subnetworkUri) {
        this.kmsKey = kmsKey;
        this.networkTags = networkTags;
        this.networkUri = networkUri;
        this.serviceAccount = serviceAccount;
        this.subnetworkUri = subnetworkUri;
    }

    private ExecutionConfigArgs() {
        this.kmsKey = Input.empty();
        this.networkTags = Input.empty();
        this.networkUri = Input.empty();
        this.serviceAccount = Input.empty();
        this.subnetworkUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKey;
        private @Nullable Input<List<String>> networkTags;
        private @Nullable Input<String> networkUri;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<String> subnetworkUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
    	      this.networkTags = defaults.networkTags;
    	      this.networkUri = defaults.networkUri;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.subnetworkUri = defaults.subnetworkUri;
        }

        public Builder kmsKey(@Nullable Input<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = Input.ofNullable(kmsKey);
            return this;
        }

        public Builder networkTags(@Nullable Input<List<String>> networkTags) {
            this.networkTags = networkTags;
            return this;
        }

        public Builder networkTags(@Nullable List<String> networkTags) {
            this.networkTags = Input.ofNullable(networkTags);
            return this;
        }

        public Builder networkUri(@Nullable Input<String> networkUri) {
            this.networkUri = networkUri;
            return this;
        }

        public Builder networkUri(@Nullable String networkUri) {
            this.networkUri = Input.ofNullable(networkUri);
            return this;
        }

        public Builder serviceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder subnetworkUri(@Nullable Input<String> subnetworkUri) {
            this.subnetworkUri = subnetworkUri;
            return this;
        }

        public Builder subnetworkUri(@Nullable String subnetworkUri) {
            this.subnetworkUri = Input.ofNullable(subnetworkUri);
            return this;
        }
        public ExecutionConfigArgs build() {
            return new ExecutionConfigArgs(kmsKey, networkTags, networkUri, serviceAccount, subnetworkUri);
        }
    }
}
