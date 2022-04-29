// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.batch.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetSchedulingPolicyArgs extends InvokeArgs {

    public static final GetSchedulingPolicyArgs Empty = new GetSchedulingPolicyArgs();

    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    private GetSchedulingPolicyArgs() {}

    private GetSchedulingPolicyArgs(GetSchedulingPolicyArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchedulingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchedulingPolicyArgs $;

        public Builder() {
            $ = new GetSchedulingPolicyArgs();
        }

        public Builder(GetSchedulingPolicyArgs defaults) {
            $ = new GetSchedulingPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetSchedulingPolicyArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
