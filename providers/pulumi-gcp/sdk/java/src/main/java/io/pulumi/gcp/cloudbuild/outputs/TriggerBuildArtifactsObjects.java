// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudbuild.outputs.TriggerBuildArtifactsObjectsTiming;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerBuildArtifactsObjects {
    /**
     * Cloud Storage bucket and optional object path, in the form "gs://bucket/path/to/somewhere/".
     * Files in the workspace matching any path pattern will be uploaded to Cloud Storage with
     * this location as a prefix.
     * 
     */
    private final @Nullable String location;
    /**
     * Path globs used to match files in the build's workspace.
     * 
     */
    private final @Nullable List<String> paths;
    /**
     * - 
     * Output only. Stores timing information for pushing all artifact objects.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<TriggerBuildArtifactsObjectsTiming> timings;

    @OutputCustomType.Constructor
    private TriggerBuildArtifactsObjects(
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("paths") @Nullable List<String> paths,
        @OutputCustomType.Parameter("timings") @Nullable List<TriggerBuildArtifactsObjectsTiming> timings) {
        this.location = location;
        this.paths = paths;
        this.timings = timings;
    }

    /**
     * Cloud Storage bucket and optional object path, in the form "gs://bucket/path/to/somewhere/".
     * Files in the workspace matching any path pattern will be uploaded to Cloud Storage with
     * this location as a prefix.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Path globs used to match files in the build's workspace.
     * 
    */
    public List<String> getPaths() {
        return this.paths == null ? List.of() : this.paths;
    }
    /**
     * - 
     * Output only. Stores timing information for pushing all artifact objects.
     * Structure is documented below.
     * 
    */
    public List<TriggerBuildArtifactsObjectsTiming> getTimings() {
        return this.timings == null ? List.of() : this.timings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildArtifactsObjects defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String location;
        private @Nullable List<String> paths;
        private @Nullable List<TriggerBuildArtifactsObjectsTiming> timings;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildArtifactsObjects defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.paths = defaults.paths;
    	      this.timings = defaults.timings;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder paths(@Nullable List<String> paths) {
            this.paths = paths;
            return this;
        }

        public Builder timings(@Nullable List<TriggerBuildArtifactsObjectsTiming> timings) {
            this.timings = timings;
            return this;
        }
        public TriggerBuildArtifactsObjects build() {
            return new TriggerBuildArtifactsObjects(location, paths, timings);
        }
    }
}
