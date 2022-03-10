// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a secret environment variable. It has the information necessary to fetch the secret value from secret manager and expose it as an environment variable. Secret value is not a part of the configuration. Secret values are only fetched when a new clone starts.
 * 
 */
public final class SecretEnvVarArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretEnvVarArgs Empty = new SecretEnvVarArgs();

    /**
     * Name of the environment variable.
     * 
     */
    @InputImport(name="key")
      private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function's project assuming that the secret exists in the same project as of the function.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Name of the secret in secret manager (not the full resource name).
     * 
     */
    @InputImport(name="secret")
      private final @Nullable Input<String> secret;

    public Input<String> getSecret() {
        return this.secret == null ? Input.empty() : this.secret;
    }

    /**
     * Version of the secret (version number or the string 'latest'). It is recommended to use a numeric version for secret environment variables as any updates to the secret value is not reflected until new clones start.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public SecretEnvVarArgs(
        @Nullable Input<String> key,
        @Nullable Input<String> project,
        @Nullable Input<String> secret,
        @Nullable Input<String> version) {
        this.key = key;
        this.project = project;
        this.secret = secret;
        this.version = version;
    }

    private SecretEnvVarArgs() {
        this.key = Input.empty();
        this.project = Input.empty();
        this.secret = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretEnvVarArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> key;
        private @Nullable Input<String> project;
        private @Nullable Input<String> secret;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretEnvVarArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.version = defaults.version;
        }

        public Builder key(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder secret(@Nullable Input<String> secret) {
            this.secret = secret;
            return this;
        }

        public Builder secret(@Nullable String secret) {
            this.secret = Input.ofNullable(secret);
            return this;
        }

        public Builder version(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public SecretEnvVarArgs build() {
            return new SecretEnvVarArgs(key, project, secret, version);
        }
    }
}
