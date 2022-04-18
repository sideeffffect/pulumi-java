// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker.outputs;

import com.pulumi.awsnative.robomaker.enums.RobotApplicationSourceConfigArchitecture;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RobotApplicationSourceConfig {
    /**
     * The architecture of robot application.
     * 
     */
    private final RobotApplicationSourceConfigArchitecture architecture;
    /**
     * The Arn of the S3Bucket that stores the robot application source.
     * 
     */
    private final String s3Bucket;
    /**
     * The s3 key of robot application source.
     * 
     */
    private final String s3Key;

    @CustomType.Constructor
    private RobotApplicationSourceConfig(
        @CustomType.Parameter("architecture") RobotApplicationSourceConfigArchitecture architecture,
        @CustomType.Parameter("s3Bucket") String s3Bucket,
        @CustomType.Parameter("s3Key") String s3Key) {
        this.architecture = architecture;
        this.s3Bucket = s3Bucket;
        this.s3Key = s3Key;
    }

    /**
     * The architecture of robot application.
     * 
    */
    public RobotApplicationSourceConfigArchitecture architecture() {
        return this.architecture;
    }
    /**
     * The Arn of the S3Bucket that stores the robot application source.
     * 
    */
    public String s3Bucket() {
        return this.s3Bucket;
    }
    /**
     * The s3 key of robot application source.
     * 
    */
    public String s3Key() {
        return this.s3Key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RobotApplicationSourceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RobotApplicationSourceConfigArchitecture architecture;
        private String s3Bucket;
        private String s3Key;

        public Builder() {
    	      // Empty
        }

        public Builder(RobotApplicationSourceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Key = defaults.s3Key;
        }

        public Builder architecture(RobotApplicationSourceConfigArchitecture architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }
        public Builder s3Bucket(String s3Bucket) {
            this.s3Bucket = Objects.requireNonNull(s3Bucket);
            return this;
        }
        public Builder s3Key(String s3Key) {
            this.s3Key = Objects.requireNonNull(s3Key);
            return this;
        }        public RobotApplicationSourceConfig build() {
            return new RobotApplicationSourceConfig(architecture, s3Bucket, s3Key);
        }
    }
}
