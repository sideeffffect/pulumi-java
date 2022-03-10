// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.inputs;

import io.pulumi.awsnative.robomaker.enums.SimulationApplicationSourceConfigArchitecture;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Information about a source configuration.
 * 
 */
public final class SimulationApplicationSourceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SimulationApplicationSourceConfigArgs Empty = new SimulationApplicationSourceConfigArgs();

    /**
     * The target processor architecture for the application.
     * 
     */
    @InputImport(name="architecture", required=true)
      private final Input<SimulationApplicationSourceConfigArchitecture> architecture;

    public Input<SimulationApplicationSourceConfigArchitecture> getArchitecture() {
        return this.architecture;
    }

    /**
     * The Amazon S3 bucket name.
     * 
     */
    @InputImport(name="s3Bucket", required=true)
      private final Input<String> s3Bucket;

    public Input<String> getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * The s3 object key.
     * 
     */
    @InputImport(name="s3Key", required=true)
      private final Input<String> s3Key;

    public Input<String> getS3Key() {
        return this.s3Key;
    }

    public SimulationApplicationSourceConfigArgs(
        Input<SimulationApplicationSourceConfigArchitecture> architecture,
        Input<String> s3Bucket,
        Input<String> s3Key) {
        this.architecture = Objects.requireNonNull(architecture, "expected parameter 'architecture' to be non-null");
        this.s3Bucket = Objects.requireNonNull(s3Bucket, "expected parameter 's3Bucket' to be non-null");
        this.s3Key = Objects.requireNonNull(s3Key, "expected parameter 's3Key' to be non-null");
    }

    private SimulationApplicationSourceConfigArgs() {
        this.architecture = Input.empty();
        this.s3Bucket = Input.empty();
        this.s3Key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimulationApplicationSourceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<SimulationApplicationSourceConfigArchitecture> architecture;
        private Input<String> s3Bucket;
        private Input<String> s3Key;

        public Builder() {
    	      // Empty
        }

        public Builder(SimulationApplicationSourceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Key = defaults.s3Key;
        }

        public Builder architecture(Input<SimulationApplicationSourceConfigArchitecture> architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }

        public Builder architecture(SimulationApplicationSourceConfigArchitecture architecture) {
            this.architecture = Input.of(Objects.requireNonNull(architecture));
            return this;
        }

        public Builder s3Bucket(Input<String> s3Bucket) {
            this.s3Bucket = Objects.requireNonNull(s3Bucket);
            return this;
        }

        public Builder s3Bucket(String s3Bucket) {
            this.s3Bucket = Input.of(Objects.requireNonNull(s3Bucket));
            return this;
        }

        public Builder s3Key(Input<String> s3Key) {
            this.s3Key = Objects.requireNonNull(s3Key);
            return this;
        }

        public Builder s3Key(String s3Key) {
            this.s3Key = Input.of(Objects.requireNonNull(s3Key));
            return this;
        }
        public SimulationApplicationSourceConfigArgs build() {
            return new SimulationApplicationSourceConfigArgs(architecture, s3Bucket, s3Key);
        }
    }
}
