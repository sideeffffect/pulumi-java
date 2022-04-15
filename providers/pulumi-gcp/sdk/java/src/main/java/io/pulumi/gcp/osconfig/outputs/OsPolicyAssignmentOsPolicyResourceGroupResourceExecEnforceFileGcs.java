// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcs {
    /**
     * Required. Bucket of the Cloud Storage object.
     * 
     */
    private final String bucket;
    /**
     * Generation number of the Cloud Storage object.
     * 
     */
    private final @Nullable Integer generation;
    /**
     * Required. Name of the Cloud Storage object.
     * 
     */
    private final String object;

    @CustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcs(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("generation") @Nullable Integer generation,
        @CustomType.Parameter("object") String object) {
        this.bucket = bucket;
        this.generation = generation;
        this.object = object;
    }

    /**
     * Required. Bucket of the Cloud Storage object.
     * 
    */
    public String bucket() {
        return this.bucket;
    }
    /**
     * Generation number of the Cloud Storage object.
     * 
    */
    public Optional<Integer> generation() {
        return Optional.ofNullable(this.generation);
    }
    /**
     * Required. Name of the Cloud Storage object.
     * 
    */
    public String object() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable Integer generation;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder generation(@Nullable Integer generation) {
            this.generation = generation;
            return this;
        }
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }        public OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcs(bucket, generation, object);
        }
    }
}
