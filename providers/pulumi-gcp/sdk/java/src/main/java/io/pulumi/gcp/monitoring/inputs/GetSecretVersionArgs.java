// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecretVersionArgs Empty = new GetSecretVersionArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="secret", required=true)
      private final String secret;

    public String secret() {
        return this.secret;
    }

    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> version() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public GetSecretVersionArgs(
        @Nullable String project,
        String secret,
        @Nullable String version) {
        this.project = project;
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
        this.version = version;
    }

    private GetSecretVersionArgs() {
        this.project = null;
        this.secret = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String secret;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.version = defaults.version;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public GetSecretVersionArgs build() {
            return new GetSecretVersionArgs(project, secret, version);
        }
    }
}
