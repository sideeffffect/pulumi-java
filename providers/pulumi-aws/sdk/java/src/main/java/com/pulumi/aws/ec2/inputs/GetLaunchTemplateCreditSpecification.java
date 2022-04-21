// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLaunchTemplateCreditSpecification extends com.pulumi.resources.InvokeArgs {

    public static final GetLaunchTemplateCreditSpecification Empty = new GetLaunchTemplateCreditSpecification();

    @Import(name="cpuCredits", required=true)
    private String cpuCredits;

    public String cpuCredits() {
        return this.cpuCredits;
    }

    private GetLaunchTemplateCreditSpecification() {}

    private GetLaunchTemplateCreditSpecification(GetLaunchTemplateCreditSpecification $) {
        this.cpuCredits = $.cpuCredits;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLaunchTemplateCreditSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLaunchTemplateCreditSpecification $;

        public Builder() {
            $ = new GetLaunchTemplateCreditSpecification();
        }

        public Builder(GetLaunchTemplateCreditSpecification defaults) {
            $ = new GetLaunchTemplateCreditSpecification(Objects.requireNonNull(defaults));
        }

        public Builder cpuCredits(String cpuCredits) {
            $.cpuCredits = cpuCredits;
            return this;
        }

        public GetLaunchTemplateCreditSpecification build() {
            $.cpuCredits = Objects.requireNonNull($.cpuCredits, "expected parameter 'cpuCredits' to be non-null");
            return $;
        }
    }

}
