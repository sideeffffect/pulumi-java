// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Execution using a private Cloud Build pool.
 * 
 */
public final class PrivatePoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivatePoolArgs Empty = new PrivatePoolArgs();

    /**
     * Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket (&#34;gs://my-bucket&#34;) or a path within a bucket (&#34;gs://my-bucket/my-dir&#34;). If unspecified, a default bucket located in the same region will be used.
     * 
     */
    @Import(name="artifactStorage")
    private @Nullable Output<String> artifactStorage;

    /**
     * @return Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket (&#34;gs://my-bucket&#34;) or a path within a bucket (&#34;gs://my-bucket/my-dir&#34;). If unspecified, a default bucket located in the same region will be used.
     * 
     */
    public Optional<Output<String>> artifactStorage() {
        return Optional.ofNullable(this.artifactStorage);
    }

    /**
     * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Resource name of the Cloud Build worker pool to use. The format is `projects/{project}/locations/{location}/workerPools/{pool}`.
     * 
     */
    @Import(name="workerPool", required=true)
    private Output<String> workerPool;

    /**
     * @return Resource name of the Cloud Build worker pool to use. The format is `projects/{project}/locations/{location}/workerPools/{pool}`.
     * 
     */
    public Output<String> workerPool() {
        return this.workerPool;
    }

    private PrivatePoolArgs() {}

    private PrivatePoolArgs(PrivatePoolArgs $) {
        this.artifactStorage = $.artifactStorage;
        this.serviceAccount = $.serviceAccount;
        this.workerPool = $.workerPool;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivatePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivatePoolArgs $;

        public Builder() {
            $ = new PrivatePoolArgs();
        }

        public Builder(PrivatePoolArgs defaults) {
            $ = new PrivatePoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactStorage Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket (&#34;gs://my-bucket&#34;) or a path within a bucket (&#34;gs://my-bucket/my-dir&#34;). If unspecified, a default bucket located in the same region will be used.
         * 
         * @return builder
         * 
         */
        public Builder artifactStorage(@Nullable Output<String> artifactStorage) {
            $.artifactStorage = artifactStorage;
            return this;
        }

        /**
         * @param artifactStorage Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket (&#34;gs://my-bucket&#34;) or a path within a bucket (&#34;gs://my-bucket/my-dir&#34;). If unspecified, a default bucket located in the same region will be used.
         * 
         * @return builder
         * 
         */
        public Builder artifactStorage(String artifactStorage) {
            return artifactStorage(Output.of(artifactStorage));
        }

        /**
         * @param serviceAccount Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param workerPool Resource name of the Cloud Build worker pool to use. The format is `projects/{project}/locations/{location}/workerPools/{pool}`.
         * 
         * @return builder
         * 
         */
        public Builder workerPool(Output<String> workerPool) {
            $.workerPool = workerPool;
            return this;
        }

        /**
         * @param workerPool Resource name of the Cloud Build worker pool to use. The format is `projects/{project}/locations/{location}/workerPools/{pool}`.
         * 
         * @return builder
         * 
         */
        public Builder workerPool(String workerPool) {
            return workerPool(Output.of(workerPool));
        }

        public PrivatePoolArgs build() {
            $.workerPool = Objects.requireNonNull($.workerPool, "expected parameter 'workerPool' to be non-null");
            return $;
        }
    }

}
