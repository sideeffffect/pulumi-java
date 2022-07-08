// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBackendBucketArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackendBucketArgs Empty = new GetBackendBucketArgs();

    @Import(name="backendBucket", required=true)
    private Output<String> backendBucket;

    public Output<String> backendBucket() {
        return this.backendBucket;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetBackendBucketArgs() {}

    private GetBackendBucketArgs(GetBackendBucketArgs $) {
        this.backendBucket = $.backendBucket;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackendBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackendBucketArgs $;

        public Builder() {
            $ = new GetBackendBucketArgs();
        }

        public Builder(GetBackendBucketArgs defaults) {
            $ = new GetBackendBucketArgs(Objects.requireNonNull(defaults));
        }

        public Builder backendBucket(Output<String> backendBucket) {
            $.backendBucket = backendBucket;
            return this;
        }

        public Builder backendBucket(String backendBucket) {
            return backendBucket(Output.of(backendBucket));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetBackendBucketArgs build() {
            $.backendBucket = Objects.requireNonNull($.backendBucket, "expected parameter 'backendBucket' to be non-null");
            return $;
        }
    }

}
