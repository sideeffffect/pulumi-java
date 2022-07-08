// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions.v2alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudfunctions.v2alpha.outputs.RepoSourceResponse;
import com.pulumi.googlenative.cloudfunctions.v2alpha.outputs.StorageSourceResponse;
import java.util.Objects;

@CustomType
public final class SourceResponse {
    /**
     * @return If provided, get the source from this location in a Cloud Source Repository.
     * 
     */
    private final RepoSourceResponse repoSource;
    /**
     * @return If provided, get the source from this location in Google Cloud Storage.
     * 
     */
    private final StorageSourceResponse storageSource;

    @CustomType.Constructor
    private SourceResponse(
        @CustomType.Parameter("repoSource") RepoSourceResponse repoSource,
        @CustomType.Parameter("storageSource") StorageSourceResponse storageSource) {
        this.repoSource = repoSource;
        this.storageSource = storageSource;
    }

    /**
     * @return If provided, get the source from this location in a Cloud Source Repository.
     * 
     */
    public RepoSourceResponse repoSource() {
        return this.repoSource;
    }
    /**
     * @return If provided, get the source from this location in Google Cloud Storage.
     * 
     */
    public StorageSourceResponse storageSource() {
        return this.storageSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepoSourceResponse repoSource;
        private StorageSourceResponse storageSource;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repoSource = defaults.repoSource;
    	      this.storageSource = defaults.storageSource;
        }

        public Builder repoSource(RepoSourceResponse repoSource) {
            this.repoSource = Objects.requireNonNull(repoSource);
            return this;
        }
        public Builder storageSource(StorageSourceResponse storageSource) {
            this.storageSource = Objects.requireNonNull(storageSource);
            return this;
        }        public SourceResponse build() {
            return new SourceResponse(repoSource, storageSource);
        }
    }
}
