// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendBucketArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendBucketArgs Empty = new BackendBucketArgs();

    /**
     * Cloud Storage bucket name.
     * 
     */
    @Import(name="bucketName", required=true)
      private final Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * Cloud CDN configuration for this Backend Bucket.
     * Structure is documented below.
     * 
     */
    @Import(name="cdnPolicy")
      private final @Nullable Output<BackendBucketCdnPolicyArgs> cdnPolicy;

    public Output<BackendBucketCdnPolicyArgs> cdnPolicy() {
        return this.cdnPolicy == null ? Codegen.empty() : this.cdnPolicy;
    }

    /**
     * Headers that the HTTP/S load balancer should add to proxied responses.
     * 
     */
    @Import(name="customResponseHeaders")
      private final @Nullable Output<List<String>> customResponseHeaders;

    public Output<List<String>> customResponseHeaders() {
        return this.customResponseHeaders == null ? Codegen.empty() : this.customResponseHeaders;
    }

    /**
     * An optional textual description of the resource; provided by the
     * client when the resource is created.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * If true, enable Cloud CDN for this BackendBucket.
     * 
     */
    @Import(name="enableCdn")
      private final @Nullable Output<Boolean> enableCdn;

    public Output<Boolean> enableCdn() {
        return this.enableCdn == null ? Codegen.empty() : this.enableCdn;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public BackendBucketArgs(
        Output<String> bucketName,
        @Nullable Output<BackendBucketCdnPolicyArgs> cdnPolicy,
        @Nullable Output<List<String>> customResponseHeaders,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableCdn,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.cdnPolicy = cdnPolicy;
        this.customResponseHeaders = customResponseHeaders;
        this.description = description;
        this.enableCdn = enableCdn;
        this.name = name;
        this.project = project;
    }

    private BackendBucketArgs() {
        this.bucketName = Codegen.empty();
        this.cdnPolicy = Codegen.empty();
        this.customResponseHeaders = Codegen.empty();
        this.description = Codegen.empty();
        this.enableCdn = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucketName;
        private @Nullable Output<BackendBucketCdnPolicyArgs> cdnPolicy;
        private @Nullable Output<List<String>> customResponseHeaders;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableCdn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.cdnPolicy = defaults.cdnPolicy;
    	      this.customResponseHeaders = defaults.customResponseHeaders;
    	      this.description = defaults.description;
    	      this.enableCdn = defaults.enableCdn;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder bucketName(Output<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder bucketName(String bucketName) {
            this.bucketName = Output.of(Objects.requireNonNull(bucketName));
            return this;
        }
        public Builder cdnPolicy(@Nullable Output<BackendBucketCdnPolicyArgs> cdnPolicy) {
            this.cdnPolicy = cdnPolicy;
            return this;
        }
        public Builder cdnPolicy(@Nullable BackendBucketCdnPolicyArgs cdnPolicy) {
            this.cdnPolicy = Codegen.ofNullable(cdnPolicy);
            return this;
        }
        public Builder customResponseHeaders(@Nullable Output<List<String>> customResponseHeaders) {
            this.customResponseHeaders = customResponseHeaders;
            return this;
        }
        public Builder customResponseHeaders(@Nullable List<String> customResponseHeaders) {
            this.customResponseHeaders = Codegen.ofNullable(customResponseHeaders);
            return this;
        }
        public Builder customResponseHeaders(String... customResponseHeaders) {
            return customResponseHeaders(List.of(customResponseHeaders));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder enableCdn(@Nullable Output<Boolean> enableCdn) {
            this.enableCdn = enableCdn;
            return this;
        }
        public Builder enableCdn(@Nullable Boolean enableCdn) {
            this.enableCdn = Codegen.ofNullable(enableCdn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public BackendBucketArgs build() {
            return new BackendBucketArgs(bucketName, cdnPolicy, customResponseHeaders, description, enableCdn, name, project);
        }
    }
}
