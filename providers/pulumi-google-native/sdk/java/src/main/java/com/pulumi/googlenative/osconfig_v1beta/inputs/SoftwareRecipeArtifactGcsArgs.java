// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies an artifact available as a Google Cloud Storage object.
 * 
 */
public final class SoftwareRecipeArtifactGcsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeArtifactGcsArgs Empty = new SoftwareRecipeArtifactGcsArgs();

    /**
     * Bucket of the Google Cloud Storage object. Given an example URL: `https://storage.googleapis.com/my-bucket/foo/bar#1234567` this value would be `my-bucket`.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Must be provided if allow_insecure is false. Generation number of the Google Cloud Storage object. `https://storage.googleapis.com/my-bucket/foo/bar#1234567` this value would be `1234567`.
     * 
     */
    @Import(name="generation")
    private @Nullable Output<String> generation;

    public Optional<Output<String>> generation() {
        return Optional.ofNullable(this.generation);
    }

    /**
     * Name of the Google Cloud Storage object. As specified [here] (https://cloud.google.com/storage/docs/naming#objectnames) Given an example URL: `https://storage.googleapis.com/my-bucket/foo/bar#1234567` this value would be `foo/bar`.
     * 
     */
    @Import(name="object")
    private @Nullable Output<String> object;

    public Optional<Output<String>> object() {
        return Optional.ofNullable(this.object);
    }

    private SoftwareRecipeArtifactGcsArgs() {}

    private SoftwareRecipeArtifactGcsArgs(SoftwareRecipeArtifactGcsArgs $) {
        this.bucket = $.bucket;
        this.generation = $.generation;
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SoftwareRecipeArtifactGcsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SoftwareRecipeArtifactGcsArgs $;

        public Builder() {
            $ = new SoftwareRecipeArtifactGcsArgs();
        }

        public Builder(SoftwareRecipeArtifactGcsArgs defaults) {
            $ = new SoftwareRecipeArtifactGcsArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder generation(@Nullable Output<String> generation) {
            $.generation = generation;
            return this;
        }

        public Builder generation(String generation) {
            return generation(Output.of(generation));
        }

        public Builder object(@Nullable Output<String> object) {
            $.object = object;
            return this;
        }

        public Builder object(String object) {
            return object(Output.of(object));
        }

        public SoftwareRecipeArtifactGcsArgs build() {
            return $;
        }
    }

}
