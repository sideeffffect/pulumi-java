// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The kinesis to s3 connection configuration
 * 
 */
public final class DefenderForContainersAwsOfferingResponseKinesisToS3 extends com.pulumi.resources.InvokeArgs {

    public static final DefenderForContainersAwsOfferingResponseKinesisToS3 Empty = new DefenderForContainersAwsOfferingResponseKinesisToS3();

    /**
     * The cloud role ARN in AWS for this feature
     * 
     */
    @Import(name="cloudRoleArn")
      private final @Nullable String cloudRoleArn;

    public Optional<String> cloudRoleArn() {
        return this.cloudRoleArn == null ? Optional.empty() : Optional.ofNullable(this.cloudRoleArn);
    }

    public DefenderForContainersAwsOfferingResponseKinesisToS3(@Nullable String cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
    }

    private DefenderForContainersAwsOfferingResponseKinesisToS3() {
        this.cloudRoleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForContainersAwsOfferingResponseKinesisToS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForContainersAwsOfferingResponseKinesisToS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRoleArn = defaults.cloudRoleArn;
        }

        public Builder cloudRoleArn(@Nullable String cloudRoleArn) {
            this.cloudRoleArn = cloudRoleArn;
            return this;
        }        public DefenderForContainersAwsOfferingResponseKinesisToS3 build() {
            return new DefenderForContainersAwsOfferingResponseKinesisToS3(cloudRoleArn);
        }
    }
}
