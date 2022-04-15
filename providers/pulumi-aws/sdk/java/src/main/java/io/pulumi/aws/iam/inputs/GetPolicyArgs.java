// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPolicyArgs Empty = new GetPolicyArgs();

    /**
     * The ARN of the IAM policy.
     * 
     */
    @Import(name="arn")
      private final @Nullable String arn;

    public Optional<String> arn() {
        return this.arn == null ? Optional.empty() : Optional.ofNullable(this.arn);
    }

    /**
     * The name of the IAM policy.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The prefix of the path to the IAM policy. Defaults to a slash (`/`).
     * 
     */
    @Import(name="pathPrefix")
      private final @Nullable String pathPrefix;

    public Optional<String> pathPrefix() {
        return this.pathPrefix == null ? Optional.empty() : Optional.ofNullable(this.pathPrefix);
    }

    /**
     * Key-value mapping of tags for the IAM Policy.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetPolicyArgs(
        @Nullable String arn,
        @Nullable String name,
        @Nullable String pathPrefix,
        @Nullable Map<String,String> tags) {
        this.arn = arn;
        this.name = name;
        this.pathPrefix = pathPrefix;
        this.tags = tags;
    }

    private GetPolicyArgs() {
        this.arn = null;
        this.name = null;
        this.pathPrefix = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String name;
        private @Nullable String pathPrefix;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.pathPrefix = defaults.pathPrefix;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder pathPrefix(@Nullable String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetPolicyArgs build() {
            return new GetPolicyArgs(arn, name, pathPrefix, tags);
        }
    }
}
