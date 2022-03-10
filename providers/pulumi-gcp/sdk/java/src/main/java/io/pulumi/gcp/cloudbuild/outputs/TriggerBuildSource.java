// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudbuild.outputs.TriggerBuildSourceRepoSource;
import io.pulumi.gcp.cloudbuild.outputs.TriggerBuildSourceStorageSource;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerBuildSource {
    /**
     * Location of the source in a Google Cloud Source Repository.
     * Structure is documented below.
     * 
     */
    private final @Nullable TriggerBuildSourceRepoSource repoSource;
    /**
     * Location of the source in an archive file in Google Cloud Storage.
     * Structure is documented below.
     * 
     */
    private final @Nullable TriggerBuildSourceStorageSource storageSource;

    @OutputCustomType.Constructor
    private TriggerBuildSource(
        @OutputCustomType.Parameter("repoSource") @Nullable TriggerBuildSourceRepoSource repoSource,
        @OutputCustomType.Parameter("storageSource") @Nullable TriggerBuildSourceStorageSource storageSource) {
        this.repoSource = repoSource;
        this.storageSource = storageSource;
    }

    /**
     * Location of the source in a Google Cloud Source Repository.
     * Structure is documented below.
     * 
    */
    public Optional<TriggerBuildSourceRepoSource> getRepoSource() {
        return Optional.ofNullable(this.repoSource);
    }
    /**
     * Location of the source in an archive file in Google Cloud Storage.
     * Structure is documented below.
     * 
    */
    public Optional<TriggerBuildSourceStorageSource> getStorageSource() {
        return Optional.ofNullable(this.storageSource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TriggerBuildSourceRepoSource repoSource;
        private @Nullable TriggerBuildSourceStorageSource storageSource;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repoSource = defaults.repoSource;
    	      this.storageSource = defaults.storageSource;
        }

        public Builder repoSource(@Nullable TriggerBuildSourceRepoSource repoSource) {
            this.repoSource = repoSource;
            return this;
        }

        public Builder storageSource(@Nullable TriggerBuildSourceStorageSource storageSource) {
            this.storageSource = storageSource;
            return this;
        }
        public TriggerBuildSource build() {
            return new TriggerBuildSource(repoSource, storageSource);
        }
    }
}
