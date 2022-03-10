// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureFileShareConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFileShareConfigurationArgs Empty = new AzureFileShareConfigurationArgs();

    @InputImport(name="accountKey", required=true)
      private final Input<String> accountKey;

    public Input<String> getAccountKey() {
        return this.accountKey;
    }

    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * This is of the form 'https://{account}.file.core.windows.net/'.
     * 
     */
    @InputImport(name="azureFileUrl", required=true)
      private final Input<String> azureFileUrl;

    public Input<String> getAzureFileUrl() {
        return this.azureFileUrl;
    }

    /**
     * These are 'net use' options in Windows and 'mount' options in Linux.
     * 
     */
    @InputImport(name="mountOptions")
      private final @Nullable Input<String> mountOptions;

    public Input<String> getMountOptions() {
        return this.mountOptions == null ? Input.empty() : this.mountOptions;
    }

    /**
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    @InputImport(name="relativeMountPath", required=true)
      private final Input<String> relativeMountPath;

    public Input<String> getRelativeMountPath() {
        return this.relativeMountPath;
    }

    public AzureFileShareConfigurationArgs(
        Input<String> accountKey,
        Input<String> accountName,
        Input<String> azureFileUrl,
        @Nullable Input<String> mountOptions,
        Input<String> relativeMountPath) {
        this.accountKey = Objects.requireNonNull(accountKey, "expected parameter 'accountKey' to be non-null");
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.azureFileUrl = Objects.requireNonNull(azureFileUrl, "expected parameter 'azureFileUrl' to be non-null");
        this.mountOptions = mountOptions;
        this.relativeMountPath = Objects.requireNonNull(relativeMountPath, "expected parameter 'relativeMountPath' to be non-null");
    }

    private AzureFileShareConfigurationArgs() {
        this.accountKey = Input.empty();
        this.accountName = Input.empty();
        this.azureFileUrl = Input.empty();
        this.mountOptions = Input.empty();
        this.relativeMountPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileShareConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountKey;
        private Input<String> accountName;
        private Input<String> azureFileUrl;
        private @Nullable Input<String> mountOptions;
        private Input<String> relativeMountPath;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileShareConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.azureFileUrl = defaults.azureFileUrl;
    	      this.mountOptions = defaults.mountOptions;
    	      this.relativeMountPath = defaults.relativeMountPath;
        }

        public Builder accountKey(Input<String> accountKey) {
            this.accountKey = Objects.requireNonNull(accountKey);
            return this;
        }

        public Builder accountKey(String accountKey) {
            this.accountKey = Input.of(Objects.requireNonNull(accountKey));
            return this;
        }

        public Builder accountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder azureFileUrl(Input<String> azureFileUrl) {
            this.azureFileUrl = Objects.requireNonNull(azureFileUrl);
            return this;
        }

        public Builder azureFileUrl(String azureFileUrl) {
            this.azureFileUrl = Input.of(Objects.requireNonNull(azureFileUrl));
            return this;
        }

        public Builder mountOptions(@Nullable Input<String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder mountOptions(@Nullable String mountOptions) {
            this.mountOptions = Input.ofNullable(mountOptions);
            return this;
        }

        public Builder relativeMountPath(Input<String> relativeMountPath) {
            this.relativeMountPath = Objects.requireNonNull(relativeMountPath);
            return this;
        }

        public Builder relativeMountPath(String relativeMountPath) {
            this.relativeMountPath = Input.of(Objects.requireNonNull(relativeMountPath));
            return this;
        }
        public AzureFileShareConfigurationArgs build() {
            return new AzureFileShareConfigurationArgs(accountKey, accountName, azureFileUrl, mountOptions, relativeMountPath);
        }
    }
}
