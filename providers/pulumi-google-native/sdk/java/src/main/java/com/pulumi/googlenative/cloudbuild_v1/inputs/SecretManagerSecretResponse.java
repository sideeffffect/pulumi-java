// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Pairs a secret environment variable with a SecretVersion in Secret Manager.
 * 
 */
public final class SecretManagerSecretResponse extends com.pulumi.resources.InvokeArgs {

    public static final SecretManagerSecretResponse Empty = new SecretManagerSecretResponse();

    /**
     * Environment variable name to associate with the secret. Secret environment variables must be unique across all of a build&#39;s secrets, and must be used by at least one build step.
     * 
     */
    @Import(name="env", required=true)
    private String env;

    public String env() {
        return this.env;
    }

    /**
     * Resource name of the SecretVersion. In format: projects/*{@literal /}secrets/*{@literal /}versions/*
     * 
     */
    @Import(name="versionName", required=true)
    private String versionName;

    public String versionName() {
        return this.versionName;
    }

    private SecretManagerSecretResponse() {}

    private SecretManagerSecretResponse(SecretManagerSecretResponse $) {
        this.env = $.env;
        this.versionName = $.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretManagerSecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretManagerSecretResponse $;

        public Builder() {
            $ = new SecretManagerSecretResponse();
        }

        public Builder(SecretManagerSecretResponse defaults) {
            $ = new SecretManagerSecretResponse(Objects.requireNonNull(defaults));
        }

        public Builder env(String env) {
            $.env = env;
            return this;
        }

        public Builder versionName(String versionName) {
            $.versionName = versionName;
            return this;
        }

        public SecretManagerSecretResponse build() {
            $.env = Objects.requireNonNull($.env, "expected parameter 'env' to be non-null");
            $.versionName = Objects.requireNonNull($.versionName, "expected parameter 'versionName' to be non-null");
            return $;
        }
    }

}
