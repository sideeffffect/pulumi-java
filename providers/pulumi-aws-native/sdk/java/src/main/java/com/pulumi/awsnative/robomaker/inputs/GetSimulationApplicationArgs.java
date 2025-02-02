// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSimulationApplicationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSimulationApplicationArgs Empty = new GetSimulationApplicationArgs();

    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    private GetSimulationApplicationArgs() {}

    private GetSimulationApplicationArgs(GetSimulationApplicationArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSimulationApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSimulationApplicationArgs $;

        public Builder() {
            $ = new GetSimulationApplicationArgs();
        }

        public Builder(GetSimulationApplicationArgs defaults) {
            $ = new GetSimulationApplicationArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetSimulationApplicationArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
