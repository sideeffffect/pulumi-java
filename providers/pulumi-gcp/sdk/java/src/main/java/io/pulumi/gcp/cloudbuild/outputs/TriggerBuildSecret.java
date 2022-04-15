// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class TriggerBuildSecret {
    /**
     * Cloud KMS key name to use to decrypt these envs.
     * 
     */
    private final String kmsKeyName;
    /**
     * A list of global environment variables, which are encrypted using a Cloud Key Management
     * Service crypto key. These values must be specified in the build's Secret. These variables
     * will be available to all build steps in this build.
     * 
     */
    private final @Nullable Map<String,String> secretEnv;

    @CustomType.Constructor
    private TriggerBuildSecret(
        @CustomType.Parameter("kmsKeyName") String kmsKeyName,
        @CustomType.Parameter("secretEnv") @Nullable Map<String,String> secretEnv) {
        this.kmsKeyName = kmsKeyName;
        this.secretEnv = secretEnv;
    }

    /**
     * Cloud KMS key name to use to decrypt these envs.
     * 
    */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * A list of global environment variables, which are encrypted using a Cloud Key Management
     * Service crypto key. These values must be specified in the build's Secret. These variables
     * will be available to all build steps in this build.
     * 
    */
    public Map<String,String> secretEnv() {
        return this.secretEnv == null ? Map.of() : this.secretEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildSecret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;
        private @Nullable Map<String,String> secretEnv;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.secretEnv = defaults.secretEnv;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public Builder secretEnv(@Nullable Map<String,String> secretEnv) {
            this.secretEnv = secretEnv;
            return this;
        }        public TriggerBuildSecret build() {
            return new TriggerBuildSecret(kmsKeyName, secretEnv);
        }
    }
}
