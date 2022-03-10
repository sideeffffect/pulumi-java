// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.SourceContextResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SourceResponse {
    /**
     * If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.
     * 
     */
    private final List<SourceContextResponse> additionalContexts;
    /**
     * If provided, the input binary artifacts for the build came from this location.
     * 
     */
    private final String artifactStorageSourceUri;
    /**
     * If provided, the source code used for the build came from this location.
     * 
     */
    private final SourceContextResponse context;
    /**
     * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.
     * 
     */
    private final Map<String,String> fileHashes;

    @OutputCustomType.Constructor
    private SourceResponse(
        @OutputCustomType.Parameter("additionalContexts") List<SourceContextResponse> additionalContexts,
        @OutputCustomType.Parameter("artifactStorageSourceUri") String artifactStorageSourceUri,
        @OutputCustomType.Parameter("context") SourceContextResponse context,
        @OutputCustomType.Parameter("fileHashes") Map<String,String> fileHashes) {
        this.additionalContexts = additionalContexts;
        this.artifactStorageSourceUri = artifactStorageSourceUri;
        this.context = context;
        this.fileHashes = fileHashes;
    }

    /**
     * If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.
     * 
    */
    public List<SourceContextResponse> getAdditionalContexts() {
        return this.additionalContexts;
    }
    /**
     * If provided, the input binary artifacts for the build came from this location.
     * 
    */
    public String getArtifactStorageSourceUri() {
        return this.artifactStorageSourceUri;
    }
    /**
     * If provided, the source code used for the build came from this location.
     * 
    */
    public SourceContextResponse getContext() {
        return this.context;
    }
    /**
     * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.
     * 
    */
    public Map<String,String> getFileHashes() {
        return this.fileHashes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SourceContextResponse> additionalContexts;
        private String artifactStorageSourceUri;
        private SourceContextResponse context;
        private Map<String,String> fileHashes;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalContexts = defaults.additionalContexts;
    	      this.artifactStorageSourceUri = defaults.artifactStorageSourceUri;
    	      this.context = defaults.context;
    	      this.fileHashes = defaults.fileHashes;
        }

        public Builder additionalContexts(List<SourceContextResponse> additionalContexts) {
            this.additionalContexts = Objects.requireNonNull(additionalContexts);
            return this;
        }

        public Builder artifactStorageSourceUri(String artifactStorageSourceUri) {
            this.artifactStorageSourceUri = Objects.requireNonNull(artifactStorageSourceUri);
            return this;
        }

        public Builder context(SourceContextResponse context) {
            this.context = Objects.requireNonNull(context);
            return this;
        }

        public Builder fileHashes(Map<String,String> fileHashes) {
            this.fileHashes = Objects.requireNonNull(fileHashes);
            return this;
        }
        public SourceResponse build() {
            return new SourceResponse(additionalContexts, artifactStorageSourceUri, context, fileHashes);
        }
    }
}
