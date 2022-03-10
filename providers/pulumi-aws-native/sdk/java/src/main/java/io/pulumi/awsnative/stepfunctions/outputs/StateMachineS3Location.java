// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StateMachineS3Location {
    private final String bucket;
    private final String key;
    private final @Nullable String version;

    @OutputCustomType.Constructor
    private StateMachineS3Location(
        @OutputCustomType.Parameter("bucket") String bucket,
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("version") @Nullable String version) {
        this.bucket = bucket;
        this.key = key;
        this.version = version;
    }

    public String getBucket() {
        return this.bucket;
    }
    public String getKey() {
        return this.key;
    }
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineS3Location defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String key;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineS3Location defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
    	      this.version = defaults.version;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public StateMachineS3Location build() {
            return new StateMachineS3Location(bucket, key, version);
        }
    }
}
