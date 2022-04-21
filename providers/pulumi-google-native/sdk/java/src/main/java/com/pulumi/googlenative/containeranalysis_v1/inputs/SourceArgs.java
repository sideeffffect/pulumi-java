// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.inputs.SourceContextArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Source describes the location of the source used for the build.
 * 
 */
public final class SourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceArgs Empty = new SourceArgs();

    /**
     * If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.
     * 
     */
    @Import(name="additionalContexts")
    private @Nullable Output<List<SourceContextArgs>> additionalContexts;

    public Optional<Output<List<SourceContextArgs>>> additionalContexts() {
        return Optional.ofNullable(this.additionalContexts);
    }

    /**
     * If provided, the input binary artifacts for the build came from this location.
     * 
     */
    @Import(name="artifactStorageSourceUri")
    private @Nullable Output<String> artifactStorageSourceUri;

    public Optional<Output<String>> artifactStorageSourceUri() {
        return Optional.ofNullable(this.artifactStorageSourceUri);
    }

    /**
     * If provided, the source code used for the build came from this location.
     * 
     */
    @Import(name="context")
    private @Nullable Output<SourceContextArgs> context;

    public Optional<Output<SourceContextArgs>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.
     * 
     */
    @Import(name="fileHashes")
    private @Nullable Output<Map<String,String>> fileHashes;

    public Optional<Output<Map<String,String>>> fileHashes() {
        return Optional.ofNullable(this.fileHashes);
    }

    private SourceArgs() {}

    private SourceArgs(SourceArgs $) {
        this.additionalContexts = $.additionalContexts;
        this.artifactStorageSourceUri = $.artifactStorageSourceUri;
        this.context = $.context;
        this.fileHashes = $.fileHashes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceArgs $;

        public Builder() {
            $ = new SourceArgs();
        }

        public Builder(SourceArgs defaults) {
            $ = new SourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalContexts(@Nullable Output<List<SourceContextArgs>> additionalContexts) {
            $.additionalContexts = additionalContexts;
            return this;
        }

        public Builder additionalContexts(List<SourceContextArgs> additionalContexts) {
            return additionalContexts(Output.of(additionalContexts));
        }

        public Builder additionalContexts(SourceContextArgs... additionalContexts) {
            return additionalContexts(List.of(additionalContexts));
        }

        public Builder artifactStorageSourceUri(@Nullable Output<String> artifactStorageSourceUri) {
            $.artifactStorageSourceUri = artifactStorageSourceUri;
            return this;
        }

        public Builder artifactStorageSourceUri(String artifactStorageSourceUri) {
            return artifactStorageSourceUri(Output.of(artifactStorageSourceUri));
        }

        public Builder context(@Nullable Output<SourceContextArgs> context) {
            $.context = context;
            return this;
        }

        public Builder context(SourceContextArgs context) {
            return context(Output.of(context));
        }

        public Builder fileHashes(@Nullable Output<Map<String,String>> fileHashes) {
            $.fileHashes = fileHashes;
            return this;
        }

        public Builder fileHashes(Map<String,String> fileHashes) {
            return fileHashes(Output.of(fileHashes));
        }

        public SourceArgs build() {
            return $;
        }
    }

}
