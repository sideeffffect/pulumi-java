// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.BackendBucketCompressionMode;
import com.pulumi.googlenative.compute_beta.inputs.BackendBucketCdnPolicyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendBucketArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendBucketArgs Empty = new BackendBucketArgs();

    /**
     * Cloud Storage bucket name.
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * Cloud CDN configuration for this BackendBucket.
     * 
     */
    @Import(name="cdnPolicy")
    private @Nullable Output<BackendBucketCdnPolicyArgs> cdnPolicy;

    public Optional<Output<BackendBucketCdnPolicyArgs>> cdnPolicy() {
        return Optional.ofNullable(this.cdnPolicy);
    }

    /**
     * Compress text responses using Brotli or gzip compression, based on the client&#39;s Accept-Encoding header.
     * 
     */
    @Import(name="compressionMode")
    private @Nullable Output<BackendBucketCompressionMode> compressionMode;

    public Optional<Output<BackendBucketCompressionMode>> compressionMode() {
        return Optional.ofNullable(this.compressionMode);
    }

    /**
     * Headers that the HTTP/S load balancer should add to proxied responses.
     * 
     */
    @Import(name="customResponseHeaders")
    private @Nullable Output<List<String>> customResponseHeaders;

    public Optional<Output<List<String>>> customResponseHeaders() {
        return Optional.ofNullable(this.customResponseHeaders);
    }

    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * If true, enable Cloud CDN for this BackendBucket.
     * 
     */
    @Import(name="enableCdn")
    private @Nullable Output<Boolean> enableCdn;

    public Optional<Output<Boolean>> enableCdn() {
        return Optional.ofNullable(this.enableCdn);
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    private BackendBucketArgs() {}

    private BackendBucketArgs(BackendBucketArgs $) {
        this.bucketName = $.bucketName;
        this.cdnPolicy = $.cdnPolicy;
        this.compressionMode = $.compressionMode;
        this.customResponseHeaders = $.customResponseHeaders;
        this.description = $.description;
        this.enableCdn = $.enableCdn;
        this.kind = $.kind;
        this.name = $.name;
        this.project = $.project;
        this.requestId = $.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendBucketArgs $;

        public Builder() {
            $ = new BackendBucketArgs();
        }

        public Builder(BackendBucketArgs defaults) {
            $ = new BackendBucketArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder cdnPolicy(@Nullable Output<BackendBucketCdnPolicyArgs> cdnPolicy) {
            $.cdnPolicy = cdnPolicy;
            return this;
        }

        public Builder cdnPolicy(BackendBucketCdnPolicyArgs cdnPolicy) {
            return cdnPolicy(Output.of(cdnPolicy));
        }

        public Builder compressionMode(@Nullable Output<BackendBucketCompressionMode> compressionMode) {
            $.compressionMode = compressionMode;
            return this;
        }

        public Builder compressionMode(BackendBucketCompressionMode compressionMode) {
            return compressionMode(Output.of(compressionMode));
        }

        public Builder customResponseHeaders(@Nullable Output<List<String>> customResponseHeaders) {
            $.customResponseHeaders = customResponseHeaders;
            return this;
        }

        public Builder customResponseHeaders(List<String> customResponseHeaders) {
            return customResponseHeaders(Output.of(customResponseHeaders));
        }

        public Builder customResponseHeaders(String... customResponseHeaders) {
            return customResponseHeaders(List.of(customResponseHeaders));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder enableCdn(@Nullable Output<Boolean> enableCdn) {
            $.enableCdn = enableCdn;
            return this;
        }

        public Builder enableCdn(Boolean enableCdn) {
            return enableCdn(Output.of(enableCdn));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public BackendBucketArgs build() {
            return $;
        }
    }

}
