// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLaunchTemplateCreditSpecification {
    private final String cpuCredits;

    @CustomType.Constructor
    private GetLaunchTemplateCreditSpecification(@CustomType.Parameter("cpuCredits") String cpuCredits) {
        this.cpuCredits = cpuCredits;
    }

    public String cpuCredits() {
        return this.cpuCredits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateCreditSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpuCredits;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateCreditSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCredits = defaults.cpuCredits;
        }

        public Builder cpuCredits(String cpuCredits) {
            this.cpuCredits = Objects.requireNonNull(cpuCredits);
            return this;
        }        public GetLaunchTemplateCreditSpecification build() {
            return new GetLaunchTemplateCreditSpecification(cpuCredits);
        }
    }
}
