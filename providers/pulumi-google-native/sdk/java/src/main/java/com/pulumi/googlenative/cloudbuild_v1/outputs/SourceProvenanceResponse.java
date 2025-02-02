// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudbuild_v1.outputs.RepoSourceResponse;
import com.pulumi.googlenative.cloudbuild_v1.outputs.StorageSourceManifestResponse;
import com.pulumi.googlenative.cloudbuild_v1.outputs.StorageSourceResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class SourceProvenanceResponse {
    /**
     * @return Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. Note that `FileHashes` will only be populated if `BuildOptions` has requested a `SourceProvenanceHash`. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (`.tar.gz`), the `FileHash` will be for the single path to that file.
     * 
     */
    private final Map<String,String> fileHashes;
    /**
     * @return A copy of the build&#39;s `source.repo_source`, if exists, with any revisions resolved.
     * 
     */
    private final RepoSourceResponse resolvedRepoSource;
    /**
     * @return A copy of the build&#39;s `source.storage_source`, if exists, with any generations resolved.
     * 
     */
    private final StorageSourceResponse resolvedStorageSource;
    /**
     * @return A copy of the build&#39;s `source.storage_source_manifest`, if exists, with any revisions resolved. This feature is in Preview.
     * 
     */
    private final StorageSourceManifestResponse resolvedStorageSourceManifest;

    @CustomType.Constructor
    private SourceProvenanceResponse(
        @CustomType.Parameter("fileHashes") Map<String,String> fileHashes,
        @CustomType.Parameter("resolvedRepoSource") RepoSourceResponse resolvedRepoSource,
        @CustomType.Parameter("resolvedStorageSource") StorageSourceResponse resolvedStorageSource,
        @CustomType.Parameter("resolvedStorageSourceManifest") StorageSourceManifestResponse resolvedStorageSourceManifest) {
        this.fileHashes = fileHashes;
        this.resolvedRepoSource = resolvedRepoSource;
        this.resolvedStorageSource = resolvedStorageSource;
        this.resolvedStorageSourceManifest = resolvedStorageSourceManifest;
    }

    /**
     * @return Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. Note that `FileHashes` will only be populated if `BuildOptions` has requested a `SourceProvenanceHash`. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (`.tar.gz`), the `FileHash` will be for the single path to that file.
     * 
     */
    public Map<String,String> fileHashes() {
        return this.fileHashes;
    }
    /**
     * @return A copy of the build&#39;s `source.repo_source`, if exists, with any revisions resolved.
     * 
     */
    public RepoSourceResponse resolvedRepoSource() {
        return this.resolvedRepoSource;
    }
    /**
     * @return A copy of the build&#39;s `source.storage_source`, if exists, with any generations resolved.
     * 
     */
    public StorageSourceResponse resolvedStorageSource() {
        return this.resolvedStorageSource;
    }
    /**
     * @return A copy of the build&#39;s `source.storage_source_manifest`, if exists, with any revisions resolved. This feature is in Preview.
     * 
     */
    public StorageSourceManifestResponse resolvedStorageSourceManifest() {
        return this.resolvedStorageSourceManifest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceProvenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> fileHashes;
        private RepoSourceResponse resolvedRepoSource;
        private StorageSourceResponse resolvedStorageSource;
        private StorageSourceManifestResponse resolvedStorageSourceManifest;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceProvenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileHashes = defaults.fileHashes;
    	      this.resolvedRepoSource = defaults.resolvedRepoSource;
    	      this.resolvedStorageSource = defaults.resolvedStorageSource;
    	      this.resolvedStorageSourceManifest = defaults.resolvedStorageSourceManifest;
        }

        public Builder fileHashes(Map<String,String> fileHashes) {
            this.fileHashes = Objects.requireNonNull(fileHashes);
            return this;
        }
        public Builder resolvedRepoSource(RepoSourceResponse resolvedRepoSource) {
            this.resolvedRepoSource = Objects.requireNonNull(resolvedRepoSource);
            return this;
        }
        public Builder resolvedStorageSource(StorageSourceResponse resolvedStorageSource) {
            this.resolvedStorageSource = Objects.requireNonNull(resolvedStorageSource);
            return this;
        }
        public Builder resolvedStorageSourceManifest(StorageSourceManifestResponse resolvedStorageSourceManifest) {
            this.resolvedStorageSourceManifest = Objects.requireNonNull(resolvedStorageSourceManifest);
            return this;
        }        public SourceProvenanceResponse build() {
            return new SourceProvenanceResponse(fileHashes, resolvedRepoSource, resolvedStorageSource, resolvedStorageSourceManifest);
        }
    }
}
