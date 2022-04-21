// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAgentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAgentArgs Empty = new GetAgentArgs();

    /**
     * The DataSync Agent ARN.
     * 
     */
    @Import(name="agentArn", required=true)
    private String agentArn;

    public String agentArn() {
        return this.agentArn;
    }

    private GetAgentArgs() {}

    private GetAgentArgs(GetAgentArgs $) {
        this.agentArn = $.agentArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAgentArgs $;

        public Builder() {
            $ = new GetAgentArgs();
        }

        public Builder(GetAgentArgs defaults) {
            $ = new GetAgentArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentArn(String agentArn) {
            $.agentArn = agentArn;
            return this;
        }

        public GetAgentArgs build() {
            $.agentArn = Objects.requireNonNull($.agentArn, "expected parameter 'agentArn' to be non-null");
            return $;
        }
    }

}
