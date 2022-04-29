// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.auditmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An AWS service such as Amazon S3, AWS CloudTrail, and so on.
 * 
 */
public final class AssessmentAWSServiceArgs extends ResourceArgs {

    public static final AssessmentAWSServiceArgs Empty = new AssessmentAWSServiceArgs();

    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    private AssessmentAWSServiceArgs() {}

    private AssessmentAWSServiceArgs(AssessmentAWSServiceArgs $) {
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssessmentAWSServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssessmentAWSServiceArgs $;

        public Builder() {
            $ = new AssessmentAWSServiceArgs();
        }

        public Builder(AssessmentAWSServiceArgs defaults) {
            $ = new AssessmentAWSServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public AssessmentAWSServiceArgs build() {
            return $;
        }
    }

}
