// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PrivatePoolResponse {
    /**
     * @return Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket (&#34;gs://my-bucket&#34;) or a path within a bucket (&#34;gs://my-bucket/my-dir&#34;). If unspecified, a default bucket located in the same region will be used.
     * 
     */
    private final String artifactStorage;
    /**
     * @return Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    private final String serviceAccount;
    /**
     * @return Resource name of the Cloud Build worker pool to use. The format is `projects/{project}/locations/{location}/workerPools/{pool}`.
     * 
     */
    private final String workerPool;

    @CustomType.Constructor
    private PrivatePoolResponse(
        @CustomType.Parameter("artifactStorage") String artifactStorage,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("workerPool") String workerPool) {
        this.artifactStorage = artifactStorage;
        this.serviceAccount = serviceAccount;
        this.workerPool = workerPool;
    }

    /**
     * @return Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket (&#34;gs://my-bucket&#34;) or a path within a bucket (&#34;gs://my-bucket/my-dir&#34;). If unspecified, a default bucket located in the same region will be used.
     * 
     */
    public String artifactStorage() {
        return this.artifactStorage;
    }
    /**
     * @return Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return Resource name of the Cloud Build worker pool to use. The format is `projects/{project}/locations/{location}/workerPools/{pool}`.
     * 
     */
    public String workerPool() {
        return this.workerPool;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivatePoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactStorage;
        private String serviceAccount;
        private String workerPool;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivatePoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactStorage = defaults.artifactStorage;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.workerPool = defaults.workerPool;
        }

        public Builder artifactStorage(String artifactStorage) {
            this.artifactStorage = Objects.requireNonNull(artifactStorage);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder workerPool(String workerPool) {
            this.workerPool = Objects.requireNonNull(workerPool);
            return this;
        }        public PrivatePoolResponse build() {
            return new PrivatePoolResponse(artifactStorage, serviceAccount, workerPool);
        }
    }
}
