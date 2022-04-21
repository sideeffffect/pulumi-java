// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Pairs a secret environment variable with a SecretVersion in Secret Manager.
 * 
 */
public final class SecretManagerSecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretManagerSecretArgs Empty = new SecretManagerSecretArgs();

    /**
     * Environment variable name to associate with the secret. Secret environment variables must be unique across all of a build&#39;s secrets, and must be used by at least one build step.
     * 
     */
    @Import(name="env")
    private @Nullable Output<String> env;

    public Optional<Output<String>> env() {
        return Optional.ofNullable(this.env);
    }

    /**
     * Resource name of the SecretVersion. In format: projects/*{@literal /}secrets/*{@literal /}versions/*
     * 
     */
    @Import(name="versionName")
    private @Nullable Output<String> versionName;

    public Optional<Output<String>> versionName() {
        return Optional.ofNullable(this.versionName);
    }

    private SecretManagerSecretArgs() {}

    private SecretManagerSecretArgs(SecretManagerSecretArgs $) {
        this.env = $.env;
        this.versionName = $.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretManagerSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretManagerSecretArgs $;

        public Builder() {
            $ = new SecretManagerSecretArgs();
        }

        public Builder(SecretManagerSecretArgs defaults) {
            $ = new SecretManagerSecretArgs(Objects.requireNonNull(defaults));
        }

        public Builder env(@Nullable Output<String> env) {
            $.env = env;
            return this;
        }

        public Builder env(String env) {
            return env(Output.of(env));
        }

        public Builder versionName(@Nullable Output<String> versionName) {
            $.versionName = versionName;
            return this;
        }

        public Builder versionName(String versionName) {
            return versionName(Output.of(versionName));
        }

        public SecretManagerSecretArgs build() {
            return $;
        }
    }

}
