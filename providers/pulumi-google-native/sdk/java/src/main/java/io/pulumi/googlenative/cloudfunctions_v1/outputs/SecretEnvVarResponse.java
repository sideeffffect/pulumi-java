// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecretEnvVarResponse {
    /**
     * Name of the environment variable.
     * 
     */
    private final String key;
    /**
     * Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function's project assuming that the secret exists in the same project as of the function.
     * 
     */
    private final String project;
    /**
     * Name of the secret in secret manager (not the full resource name).
     * 
     */
    private final String secret;
    /**
     * Version of the secret (version number or the string 'latest'). It is recommended to use a numeric version for secret environment variables as any updates to the secret value is not reflected until new clones start.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"key","project","secret","version"})
    private SecretEnvVarResponse(
        String key,
        String project,
        String secret,
        String version) {
        this.key = key;
        this.project = project;
        this.secret = secret;
        this.version = version;
    }

    /**
     * Name of the environment variable.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function's project assuming that the secret exists in the same project as of the function.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * Name of the secret in secret manager (not the full resource name).
     * 
    */
    public String getSecret() {
        return this.secret;
    }
    /**
     * Version of the secret (version number or the string 'latest'). It is recommended to use a numeric version for secret environment variables as any updates to the secret value is not reflected until new clones start.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretEnvVarResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String project;
        private String secret;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretEnvVarResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.version = defaults.version;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setSecret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public SecretEnvVarResponse build() {
            return new SecretEnvVarResponse(key, project, secret, version);
        }
    }
}
