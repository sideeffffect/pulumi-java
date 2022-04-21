// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureBlobFileSystemConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureBlobFileSystemConfigurationResponse Empty = new AzureBlobFileSystemConfigurationResponse();

    /**
     * This property is mutually exclusive with sasKey and one must be specified.
     * 
     */
    @Import(name="accountKey")
    private @Nullable String accountKey;

    public Optional<String> accountKey() {
        return Optional.ofNullable(this.accountKey);
    }

    @Import(name="accountName", required=true)
    private String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    @Import(name="blobfuseOptions")
    private @Nullable String blobfuseOptions;

    public Optional<String> blobfuseOptions() {
        return Optional.ofNullable(this.blobfuseOptions);
    }

    @Import(name="containerName", required=true)
    private String containerName;

    public String containerName() {
        return this.containerName;
    }

    /**
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    @Import(name="relativeMountPath", required=true)
    private String relativeMountPath;

    public String relativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * This property is mutually exclusive with accountKey and one must be specified.
     * 
     */
    @Import(name="sasKey")
    private @Nullable String sasKey;

    public Optional<String> sasKey() {
        return Optional.ofNullable(this.sasKey);
    }

    private AzureBlobFileSystemConfigurationResponse() {}

    private AzureBlobFileSystemConfigurationResponse(AzureBlobFileSystemConfigurationResponse $) {
        this.accountKey = $.accountKey;
        this.accountName = $.accountName;
        this.blobfuseOptions = $.blobfuseOptions;
        this.containerName = $.containerName;
        this.relativeMountPath = $.relativeMountPath;
        this.sasKey = $.sasKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureBlobFileSystemConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureBlobFileSystemConfigurationResponse $;

        public Builder() {
            $ = new AzureBlobFileSystemConfigurationResponse();
        }

        public Builder(AzureBlobFileSystemConfigurationResponse defaults) {
            $ = new AzureBlobFileSystemConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder accountKey(@Nullable String accountKey) {
            $.accountKey = accountKey;
            return this;
        }

        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder blobfuseOptions(@Nullable String blobfuseOptions) {
            $.blobfuseOptions = blobfuseOptions;
            return this;
        }

        public Builder containerName(String containerName) {
            $.containerName = containerName;
            return this;
        }

        public Builder relativeMountPath(String relativeMountPath) {
            $.relativeMountPath = relativeMountPath;
            return this;
        }

        public Builder sasKey(@Nullable String sasKey) {
            $.sasKey = sasKey;
            return this;
        }

        public AzureBlobFileSystemConfigurationResponse build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.relativeMountPath = Objects.requireNonNull($.relativeMountPath, "expected parameter 'relativeMountPath' to be non-null");
            return $;
        }
    }

}
