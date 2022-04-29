// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker.inputs;

import com.pulumi.awsnative.robomaker.enums.SimulationApplicationSourceConfigArchitecture;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Information about a source configuration.
 * 
 */
public final class SimulationApplicationSourceConfigArgs extends ResourceArgs {

    public static final SimulationApplicationSourceConfigArgs Empty = new SimulationApplicationSourceConfigArgs();

    /**
     * The target processor architecture for the application.
     * 
     */
    @Import(name="architecture", required=true)
    private Output<SimulationApplicationSourceConfigArchitecture> architecture;

    /**
     * @return The target processor architecture for the application.
     * 
     */
    public Output<SimulationApplicationSourceConfigArchitecture> architecture() {
        return this.architecture;
    }

    /**
     * The Amazon S3 bucket name.
     * 
     */
    @Import(name="s3Bucket", required=true)
    private Output<String> s3Bucket;

    /**
     * @return The Amazon S3 bucket name.
     * 
     */
    public Output<String> s3Bucket() {
        return this.s3Bucket;
    }

    /**
     * The s3 object key.
     * 
     */
    @Import(name="s3Key", required=true)
    private Output<String> s3Key;

    /**
     * @return The s3 object key.
     * 
     */
    public Output<String> s3Key() {
        return this.s3Key;
    }

    private SimulationApplicationSourceConfigArgs() {}

    private SimulationApplicationSourceConfigArgs(SimulationApplicationSourceConfigArgs $) {
        this.architecture = $.architecture;
        this.s3Bucket = $.s3Bucket;
        this.s3Key = $.s3Key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SimulationApplicationSourceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SimulationApplicationSourceConfigArgs $;

        public Builder() {
            $ = new SimulationApplicationSourceConfigArgs();
        }

        public Builder(SimulationApplicationSourceConfigArgs defaults) {
            $ = new SimulationApplicationSourceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param architecture The target processor architecture for the application.
         * 
         * @return builder
         * 
         */
        public Builder architecture(Output<SimulationApplicationSourceConfigArchitecture> architecture) {
            $.architecture = architecture;
            return this;
        }

        /**
         * @param architecture The target processor architecture for the application.
         * 
         * @return builder
         * 
         */
        public Builder architecture(SimulationApplicationSourceConfigArchitecture architecture) {
            return architecture(Output.of(architecture));
        }

        /**
         * @param s3Bucket The Amazon S3 bucket name.
         * 
         * @return builder
         * 
         */
        public Builder s3Bucket(Output<String> s3Bucket) {
            $.s3Bucket = s3Bucket;
            return this;
        }

        /**
         * @param s3Bucket The Amazon S3 bucket name.
         * 
         * @return builder
         * 
         */
        public Builder s3Bucket(String s3Bucket) {
            return s3Bucket(Output.of(s3Bucket));
        }

        /**
         * @param s3Key The s3 object key.
         * 
         * @return builder
         * 
         */
        public Builder s3Key(Output<String> s3Key) {
            $.s3Key = s3Key;
            return this;
        }

        /**
         * @param s3Key The s3 object key.
         * 
         * @return builder
         * 
         */
        public Builder s3Key(String s3Key) {
            return s3Key(Output.of(s3Key));
        }

        public SimulationApplicationSourceConfigArgs build() {
            $.architecture = Objects.requireNonNull($.architecture, "expected parameter 'architecture' to be non-null");
            $.s3Bucket = Objects.requireNonNull($.s3Bucket, "expected parameter 's3Bucket' to be non-null");
            $.s3Key = Objects.requireNonNull($.s3Key, "expected parameter 's3Key' to be non-null");
            return $;
        }
    }

}
