// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inspector.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssessmentTargetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssessmentTargetArgs Empty = new GetAssessmentTargetArgs();

    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    private GetAssessmentTargetArgs() {}

    private GetAssessmentTargetArgs(GetAssessmentTargetArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAssessmentTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAssessmentTargetArgs $;

        public Builder() {
            $ = new GetAssessmentTargetArgs();
        }

        public Builder(GetAssessmentTargetArgs defaults) {
            $ = new GetAssessmentTargetArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetAssessmentTargetArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
