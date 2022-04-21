// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild_v1.inputs.TimeSpanResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Files in the workspace to upload to Cloud Storage upon successful completion of all build steps.
 * 
 */
public final class ArtifactObjectsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ArtifactObjectsResponse Empty = new ArtifactObjectsResponse();

    /**
     * Cloud Storage bucket and optional object path, in the form &#34;gs://bucket/path/to/somewhere/&#34;. (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Files in the workspace matching any path pattern will be uploaded to Cloud Storage with this location as a prefix.
     * 
     */
    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    /**
     * Path globs used to match files in the build&#39;s workspace.
     * 
     */
    @Import(name="paths", required=true)
    private List<String> paths;

    public List<String> paths() {
        return this.paths;
    }

    /**
     * Stores timing information for pushing all artifact objects.
     * 
     */
    @Import(name="timing", required=true)
    private TimeSpanResponse timing;

    public TimeSpanResponse timing() {
        return this.timing;
    }

    private ArtifactObjectsResponse() {}

    private ArtifactObjectsResponse(ArtifactObjectsResponse $) {
        this.location = $.location;
        this.paths = $.paths;
        this.timing = $.timing;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArtifactObjectsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArtifactObjectsResponse $;

        public Builder() {
            $ = new ArtifactObjectsResponse();
        }

        public Builder(ArtifactObjectsResponse defaults) {
            $ = new ArtifactObjectsResponse(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder paths(List<String> paths) {
            $.paths = paths;
            return this;
        }

        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }

        public Builder timing(TimeSpanResponse timing) {
            $.timing = timing;
            return this;
        }

        public ArtifactObjectsResponse build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.paths = Objects.requireNonNull($.paths, "expected parameter 'paths' to be non-null");
            $.timing = Objects.requireNonNull($.timing, "expected parameter 'timing' to be non-null");
            return $;
        }
    }

}
