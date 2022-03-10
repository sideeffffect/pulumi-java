// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Pairs a secret environment variable with a SecretVersion in Secret Manager.
 * 
 */
public final class SecretManagerSecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretManagerSecretArgs Empty = new SecretManagerSecretArgs();

    /**
     * Environment variable name to associate with the secret. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step.
     * 
     */
    @InputImport(name="env")
      private final @Nullable Input<String> env;

    public Input<String> getEnv() {
        return this.env == null ? Input.empty() : this.env;
    }

    /**
     * Resource name of the SecretVersion. In format: projects/*{@literal /}secrets/*{@literal /}versions/*
     * 
     */
    @InputImport(name="versionName")
      private final @Nullable Input<String> versionName;

    public Input<String> getVersionName() {
        return this.versionName == null ? Input.empty() : this.versionName;
    }

    public SecretManagerSecretArgs(
        @Nullable Input<String> env,
        @Nullable Input<String> versionName) {
        this.env = env;
        this.versionName = versionName;
    }

    private SecretManagerSecretArgs() {
        this.env = Input.empty();
        this.versionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretManagerSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> env;
        private @Nullable Input<String> versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretManagerSecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.env = defaults.env;
    	      this.versionName = defaults.versionName;
        }

        public Builder env(@Nullable Input<String> env) {
            this.env = env;
            return this;
        }

        public Builder env(@Nullable String env) {
            this.env = Input.ofNullable(env);
            return this;
        }

        public Builder versionName(@Nullable Input<String> versionName) {
            this.versionName = versionName;
            return this;
        }

        public Builder versionName(@Nullable String versionName) {
            this.versionName = Input.ofNullable(versionName);
            return this;
        }
        public SecretManagerSecretArgs build() {
            return new SecretManagerSecretArgs(env, versionName);
        }
    }
}
